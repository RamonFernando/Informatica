using APIModel;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System.Net.Http;

namespace APIControler
{
    public class CharacterControler
    {   
        // Crear un objeto HttpClient una sola vez para realizar las peticiones
        private static readonly HttpClient client = new HttpClient();
        /**
         * Realiza una petición asincrona para obtener la lista de personajes
         * @param page Pagina de la API
         * return Llama a la funcion GetCharacters que devuelve la lista de personajes
         **/
        public static async Task<List<Character>> GetCharacters(int page)
        {   
            string url = $"https://rickandmortyapi.com/api/character?page={page}";

            try
            {
                // Realizar la petición (API)
                using HttpResponseMessage response = await client.GetAsync(url); 

                response.EnsureSuccessStatusCode(); // validación
                Console.WriteLine((response.StatusCode == System.Net.HttpStatusCode.OK
                        ? "OK. Peticion exitosa." : "Error " + response.StatusCode));

                // Obtener el contenido del JSON de la peticion (API)
                string content = await response.Content.ReadAsStringAsync(); 

                Console.WriteLine("Lista de personajes.");
                // Llama a la funcion GetListCharacters (obtiene la lista de personajes)
                return GetListCharacters(content);

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                return []; // new List<Character>();
            }

        }
        /**
         * Deserializa el JSON y lo convierte en una lista de personajes
         * return Lista de personajes
         **/
        private static List<Character> GetListCharacters(string content)
        {
            try
            {
                // Parsear el JSON a un objeto JObject para poder acceder a sus propiedades
                var json = JObject.Parse(content); 

                // Crear una lista de personajes o asignar una vacía sino encuentra "results"
                var characters = json["results"]?.ToObject<List<Character>>() ?? [];

                // Devuelve la lista de personajes
                return characters;
            
            } catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                return [];
            }
        }

        public static async Task<List<Character>> SearchById(int id, int page)
        {
             List<Character> idPerson = await GetCharacters(page);

             var result = idPerson.Where(p => p.Id == id).ToList();
             return result; // new List<Character>();
        }
        public static async Task<List<Character>> SearchByName(string name, int page)
        {
            List<Character> idPerson = await GetCharacters(page);
            
            var result = idPerson.Where(p => p.Name.ToLower() == name.ToLower()).ToList();
            
            return result; // new List<Character>();
        }

    }
}
