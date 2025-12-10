
using static APISimpleIA.APIGetDigimonAsync;
using static APISimpleIA.Services;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;

namespace APISimpleIA
{
    public static class APIBuscarDigimon
    {
        public static async Task BuscarDigimon()
        {
            Console.Write("Escribe el nombre del Digimon: ");
            string? name = Console.ReadLine();

            if (!ValidarString(name))
            {
                Console.WriteLine("Entrada no valida.\n");
                Console.ReadKey();
                return;
            }
            
            // Buscamos el Digimon en la API
            var json = await GetDigimonAsync(name!); // no null

            if (json == null)
            {
                Console.WriteLine($"Digimon '{name}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }

            var root = json.RootElement[0];

            // string digimonName = root.GetProperty("name").GetString()!;
            // string level = root.GetProperty("levels")[0].GetProperty("level").GetString()!;
            

            // Validar que el Digimon tenga los campos requeridos
            string digimonName = root.GetProperty("name").GetString()!;
            string level = root.TryGetProperty("level", out var digimonLevel)
                ? digimonLevel.GetString() ?? "unknown"
                : "unknown";
            
            // Mostramos y pedimos confirmacion para guardar
            Console.WriteLine($"\nNombre: {digimonName}");
            Console.WriteLine($"Nivel: {level}");
            
            Console.Write($"\n¿Quieres guardar al Digimon '{digimonName}'? (s/n): ");
            string? respuesta = Console.ReadLine();

            if (string.IsNullOrWhiteSpace(respuesta))
            {
                Console.WriteLine("Respuesta no valida.\n");
                PrintWaitForPressKey();
                return;
            }
            respuesta = respuesta.Trim().ToLower();

            // Comprobamos que no exista y agregamos a la lista
            if (respuesta == "s")
            {
                if (MisDigimons.Any(d => d.Name == digimonName))
                {
                    Console.WriteLine($"El Digimon '{digimonName}' ya esta guardado.\n");
                    PrintWaitForPressKey();
                    return;
                }
                MisDigimons.Add(new Digimon
                {
                    Name = digimonName,
                    Level = level,
                });

                Console.WriteLine($"Digimon '{digimonName}' Guardado.\n");
                PrintWaitForPressKey();
                return;
            }
            Console.WriteLine($"Digimon '{digimonName}' no guardado.\n");
            PrintWaitForPressKey();
            return;
        }
    }
}
