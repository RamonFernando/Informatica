
namespace APISimpleIA
{
    public static class APIBuscar
    {
        
        public static async Task Buscar()
        {
            Console.WriteLine($"\n=== {NAME_PROP.ToUpper()} POR NOMBRE ===");
            Console.Write($"Escribe el nombre del {NAME_PROP}: ");
            string? inputName = Console.ReadLine();

            ValidarInputString(inputName); // null o "" = Entrada no valida
            
            // Buscamos el Digimon en la API
            // /?name={name} /?status={status} /?species={species}&type={type}
            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?name={inputName}"); // no null
            if (json == null)
            {
                Console.WriteLine($"{NAME_PROP} '{inputName}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            List<JsonElement> results = ExtractResults(json);

            if (results.Count == 0)
            {
                Console.WriteLine($"{NAME_PROP} '{inputName}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            
            Console.WriteLine($"\n === RESULTADOS DE LA BUSQUEDA ===");
            string name = "";
            string status = "";
            string species = "";
            string gender = "";
            

            for (int i = 0; i < results.Count; i++)
            {
                // Validar que el JSON tenga los campos requeridos
            string currentName = results[i].TryGetProperty(NTP_NAME, out var nameProp)
                ? nameProp.GetString() ?? "unknown"
                : "unknown";
            string currentStatus = results[i].TryGetProperty(NTP_STATUS, out var statusProp)
                ? statusProp.GetString() ?? "unknown"
                : "unknown";
            string currentSpecies = results[i].TryGetProperty(NTP_SPECIES, out var speciesProp)
                ? speciesProp.GetString() ?? "unknown"
                : "unknown";
            string currentGender = results[i].TryGetProperty(NTP_GENDER, out var genderProp)
                ? genderProp.GetString() ?? "unknown"
                : "unknown";

                if (i == 0) // Guardamos el primero para luego ofrecer guardarlo
                {
                    name = currentName;
                    status = currentStatus;
                    species = currentSpecies;
                    gender = currentGender;
                }
                Console.WriteLine($"\nResultado {i + 1}:");
                Console.WriteLine("-----------------------");
                Console.WriteLine($"{NAME_TYPE_PROP_NOMBRE}: {currentName}");
                Console.WriteLine($"{NAME_TYPE_PROP_ESTADO}: {currentStatus}");
                Console.WriteLine($"{NAME_TYPE_PROP_ESPECIE}: {currentSpecies}");
                Console.WriteLine($"{NAME_TYPE_PROP_GENERO}: {currentGender}");
                Console.WriteLine("-----------------------\n");
            }
            Console.WriteLine($"Resultados encontrados: {results.Count}\n");
            if (results.Count > 1)
                Console.WriteLine("Se guardará solo el primero de los resultados.\n");
            
            Console.Write($"\n¿Quieres guardar al {NAME_PROP} '{name}'? (s/n): ");
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if (respuesta != "s")
            {
                Console.WriteLine($"{NAME_PROP} '{name}' no guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Evitar duplicados
            if (MisFavorites.Any(d => d.Name == name))
            {
                Console.WriteLine($"El {NAME_PROP} '{name}' ya esta guardado.\n");
                PrintWaitForPressKey();
                return;
            }

            // Guardar SOLO uno
            MisFavorites.Add(new ApiItem
            {
                Id = MisFavorites.Count,
                Name = name,
                Status = status,
                Species = species,
                Gender = gender
                
            });

            Console.WriteLine($"{NAME_PROP} '{name}' Guardado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}
