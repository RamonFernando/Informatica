
using static APISimpleIA.APIGetItemAsync;
using static APISimpleIA.Services;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.APISaveJson;
using static APISimpleIA.App;
using System.Text.Json;

namespace APISimpleIA
{
    public static class APIBuscar
    {
        public static async Task Buscar()
        {
            Console.WriteLine($"\n=== {NAME_PROP.ToUpper()} POR NOMBRE ===");
            Console.Write($"Escribe el nombre del {NAME_PROP}: ");
            string? name = Console.ReadLine();

            ValidarInputString(name); // null o "" = Entrada no valida
            
            // Buscamos el Digimon en la API
            var json = await GetItemApiAsync(name!); // no null

            if (json == null)
            {
                Console.WriteLine($"{NAME_PROP} '{name}' no encontrado.\n");
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
                Console.WriteLine($"{NAME_PROP} '{name}' no encontrado.\n");
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
            string itemName = "";
            string prop = "";
            

            for (int i = 0; i < results.Count; i++)
            {
                // Validar que el JSON tenga los campos requeridos
            string currentName = results[i].TryGetProperty("name", out var nameProp)
                ? nameProp.GetString() ?? "unknown"
                : "unknown";
            string currentProp = results[i].TryGetProperty($"{NAME_TYPE_PROP}", out var itemProp)
                ? itemProp.GetString() ?? "unknown"
                : "unknown";

                if (i == 0) // Guardamos el primero para luego ofrecer guardarlo
                {
                    itemName = currentName;
                    prop = currentProp;
                }
                Console.WriteLine($"\nResultado {i + 1}:");
                Console.WriteLine("-----------------------");
                Console.WriteLine($"Nombre: {currentName}");
                Console.WriteLine($"{NAME_TYPE_PROP_ES}: {currentProp}");
            }

            Console.Write($"\n¿Quieres guardar al {NAME_PROP} '{itemName}'? (s/n): ");
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if (respuesta != "s")
            {
                Console.WriteLine($"{NAME_PROP} '{itemName}' no guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Evitar duplicados
            if (MisFavorites.Any(d => d.Name == itemName))
            {
                Console.WriteLine($"El {NAME_PROP} '{itemName}' ya esta guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Guardar SOLO uno
            MisFavorites.Add(new ApiItem
            {
                Id = MisFavorites.Count,
                Name = itemName,
                Prop = prop
            });

            Console.WriteLine($"{NAME_PROP} '{itemName}' Guardado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}
