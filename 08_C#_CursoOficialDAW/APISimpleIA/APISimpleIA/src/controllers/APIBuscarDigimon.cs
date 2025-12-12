
using static APISimpleIA.APIGetDigimonAsync;
using static APISimpleIA.Services;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.APISaveJson;
using System.Text.Json;

namespace APISimpleIA
{
    public static class APIBuscarDigimon
    {
        public static async Task BuscarDigimon()
        {
            Console.WriteLine("\n=== BUSCAR DIGIMON NOMBRE ===");
            Console.Write("Escribe el nombre del Digimon: ");
            string? name = Console.ReadLine();

            ValidarInputString(name); // null o "" = Entrada no valida
            
            // Buscamos el Digimon en la API
            var json = await GetDigimonAsync(name!); // no null

            if (json == null)
            {
                Console.WriteLine($"Digimon '{name}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }

            List<JsonElement> results = new List<JsonElement>();
            
            // En caso de que la API devolviera un array dentro de "results"
            /*if (!json.RootElement.TryGetProperty("results", out var resultsArray) ||
                resultsArray.GetArrayLength() == 0)*/

            // Comprueba si el JSON es un array y si lo es, comprueba si está vacío
            if(json.RootElement.ValueKind == JsonValueKind.Array && json.RootElement.GetArrayLength() == 0)
            {
                Console.WriteLine($"Digimon '{name}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            
            // Si es un array, añadimos todos los elementos a la lista de resultados y si no, añadimos el unico elemento
            if(json.RootElement.ValueKind == JsonValueKind.Array)
                foreach (var item in json.RootElement.EnumerateArray())
                    results.Add(item);
            else
                results.Add(json.RootElement);
                        
            Console.WriteLine($"\n === RESULTADOS DE LA BUSQUEDA ===");
            string digimonName = "";
            string level = "";
            

            for (int i = 0; i < results.Count; i++)
            {
                // Validar que el Digimon tenga los campos requeridos
            string currentName = results[i].TryGetProperty("name", out var nameProp)
                ? nameProp.GetString() ?? "unknown"
                : "unknown";
            string currentLevel = results[i].TryGetProperty("level", out var digimonLevel)
                ? digimonLevel.GetString() ?? "unknown"
                : "unknown";

                if (i == 0) // Guardamos el primero para luego ofrecer guardarlo
                {
                    digimonName = currentName;
                    level = currentLevel;
                }
                Console.WriteLine($"\nResultado {i + 1}:");
                Console.WriteLine("-----------------------");
                Console.WriteLine($"Nombre: {currentName}");
                Console.WriteLine($"Nivel: {currentLevel}");
            }

            Console.Write($"\n¿Quieres guardar al Digimon '{digimonName}'? (s/n): ");
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if (respuesta != "s")
            {
                Console.WriteLine($"Digimon '{digimonName}' no guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Evitar duplicados
            if (MisDigimons.Any(d => d.Name == digimonName))
            {
                Console.WriteLine($"El Digimon '{digimonName}' ya esta guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Guardar SOLO uno
            MisDigimons.Add(new Digimon
            {
                Id = MisDigimons.Count,
                Name = digimonName,
                Level = level
            });

            Console.WriteLine($"Digimon '{digimonName}' Guardado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}
