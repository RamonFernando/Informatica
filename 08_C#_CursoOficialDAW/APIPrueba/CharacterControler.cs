using APIModel;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System.Net.Http;

namespace APIControler
{
    public class CharacterControler
    {
        // HttpClient estático para toda la aplicación
        private static readonly HttpClient client = new HttpClient();

        /// <summary>
        /// Obtiene todos los personajes de la API de Rick and Morty recorriendo 
        /// automáticamente todas las páginas disponibles.
        /// </summary>
        /// <remarks>
        /// Este método utiliza la propiedad "info.next" del JSON para detectar 
        /// si existe una página adicional. Mientras "next" no sea null, 
        /// continuará realizando peticiones secuenciales.
        /// </remarks>
        /// <returns>
        /// Lista completa de personajes extraída de todas las páginas de la API.
        /// En caso de error, devuelve una lista vacía.
        /// </returns>
        public static async Task<List<Character>> GetAllCharacters()
        {
            List<Character> allCharacters = new();
            string? nextUrl = "https://rickandmortyapi.com/api/character";

            try
            {
                while (nextUrl != null)
                {
                    HttpResponseMessage response = await client.GetAsync(nextUrl);

                    if (!response.IsSuccessStatusCode)
                        throw new HttpRequestException($"Código HTTP: {response.StatusCode}");

                    string content = await response.Content.ReadAsStringAsync();

                    // Intentamos obtener lista de personajes
                    var pageCharacters = GetListCharacters(content);

                    // Si falla "results", devolvemos lo recopilado hasta ahora
                    if (pageCharacters.Count == 0)
                    {
                        Console.WriteLine("Advertencia: Se recibió una página sin personajes válidos.");
                        break;
                    }

                    allCharacters.AddRange(pageCharacters);

                    // Obtener siguiente página
                    JObject json = JObject.Parse(content);
                    nextUrl = json["info"]?["next"]?.ToString();

                    Console.WriteLine(nextUrl is null
                        ? "No hay más páginas. Se han obtenido todos los personajes."
                        : $"Cargando siguiente página: {nextUrl}");
                }

                return allCharacters;
            }
            catch (Exception ex)
            {
                HandleCharacterError(ex);
                return allCharacters; // devolvemos lo que se haya podido cargar
            }
        }

        /// <summary>
        /// Convierte el contenido JSON de la API a una lista de personajes.
        /// Valida que el JSON contenga la propiedad "results".
        /// </summary>
        /// <param name="content">JSON sin formato devuelto por la API</param>
        /// <returns>Lista de personajes o una lista vacía si el JSON es inválido o está incompleto</returns>
        private static List<Character> GetListCharacters(string content)
        {
            try
            {
                if (string.IsNullOrWhiteSpace(content))
                {
                    Console.WriteLine("El contenido JSON está vacío o es nulo.");
                    return [];
                }

                // Parsear el JSON
                JObject json = JObject.Parse(content);

                // Validar que "results" exista y sea un array
                var resultsToken = json["results"];
                if (resultsToken == null || resultsToken.Type != JTokenType.Array)
                {
                    Console.WriteLine("El JSON no contiene un array 'results'.");
                    return [];
                }

                // Convertir a List<Character>
                return resultsToken.ToObject<List<Character>>() ?? [];
            }
            catch (Exception ex)
            {
                HandleCharacterError(ex);
                return [];
            }            
        }

        public static async Task<List<Character>> SearchById(int id)
        {
            List<Character> idPerson = await GetAllCharacters();

            var result = idPerson.Where(p => p.Id == id).ToList();
            return result; // new List<Character>();
        }
        public static async Task<List<Character>> SearchByName(string name)
        {
            List<Character> idPerson = await GetAllCharacters();
            
            var result = idPerson.Where(p => p.Name.ToLower() == name.ToLower()).ToList();
            
            return result; // new List<Character>();
        }

        public static List<Character> GetCharactersByPage(List<Character> allCharacters, int pageNumber, int pageSize = 20)
        {
            try
            {
                ValidatePagination(allCharacters, pageNumber, pageSize);

                int totalItems = allCharacters.Count;
                int totalPages = (int)Math.Ceiling(totalItems / (double)pageSize);

                if (pageNumber > totalPages)
                    throw new ArgumentOutOfRangeException(nameof(pageNumber),
                        $"La página {pageNumber} excede el total de páginas disponibles ({totalPages}).");

                return allCharacters
                    .Skip((pageNumber - 1) * pageSize)
                    .Take(pageSize)
                    .ToList();
            }
            catch (Exception ex)
            {
                HandleCharacterError(ex);
                return [];
            }
        }

        private static void ValidatePagination(List<Character> allCharacters, int pageNumber, int pageSize)
        {
            if (allCharacters is null)
                throw new ArgumentNullException(nameof(allCharacters), "La lista no puede ser null.");

            if (pageNumber <= 0)
                throw new ArgumentException("El número de página debe ser mayor que 0.");

            if (pageSize <= 0)
                throw new ArgumentException("El tamaño de página debe ser mayor que 0.");
        }


        /// <summary>
        /// Maneja todas las excepciones comunes de la API (HTTP, JSON y generales).
        /// Imprime un mensaje claro y devuelve una lista vacía.
        /// </summary>
        private static List<Character> HandleCharacterError(Exception ex)
        {
            switch (ex)
            {
                // Error cuando la petición HTTP falla (404, conexión, DNS, etc.)
                case HttpRequestException httpEx:
                    Console.WriteLine($"Error en la petición HTTP: {httpEx.Message}");
                    break;

                // Error cuando la deserialización JSON falla
                case JsonException jsonEx:
                    Console.WriteLine($"Error al procesar JSON: {jsonEx.Message}");
                    break;

                // Error típico cuando una tarea se cancela por timeout
                case TaskCanceledException timeoutEx:
                    Console.WriteLine($"La petición tardó demasiado y fue cancelada: {timeoutEx.Message}");
                    break;

                // Error cuando se pasan argumentos inválidos a otros métodos (paginación, etc.)
                case ArgumentException argEx:
                    Console.WriteLine($"Argumento inválido: {argEx.Message}");
                    break;

                // Error típico cuando se produce una operación inválida de uso de API
                case InvalidOperationException invOpEx:
                    Console.WriteLine($"Operación inválida: {invOpEx.Message}");
                    break;

                // Cualquier otro error que no esté previsto
                default:
                    Console.WriteLine($"Error inesperado: {ex.Message}");
                    break;
            }

            // Siempre devolvemos lista vacía para no romper el programa
            return [];
        }




    }
}
