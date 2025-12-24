
namespace APISimpleIA
{
    public static class APISearchByName
    {
        
        public static async Task SearchByName()
        {
            Console.WriteLine($"\n=== BUSCAR {NAME_PROP.ToUpper()} POR NOMBRE ===");
            Console.Write($"Escribe el nombre del {NAME_PROP}: ");
            string? inputName = Console.ReadLine();

            ValidarInputString(inputName); // null o "" = Entrada no valida
            
            // Buscamos el Digimon en la API
            // /?name={name} /?status={status} /?species={species}&type={type}
            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?name={inputName}"); // no null
            
            if(!ValidatorJsonNotNull(json, "Nombre", inputName)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el name exista
            if (results.Count == 0)
            {
                Console.WriteLine($"{NAME_PROP} '{inputName}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            
            Console.WriteLine(resultSearch);
            int id = -1;
            string name = "";
            string status = "";
            string species = "";
            string gender = "";
            
            // Recorremos la lista de personajes encontrados
            for (int i = 0; i < results.Count; i++)
            {
                int currentId = results[i].TryGetProperty($"{NTP_ID}", out var idProp)
                ? idProp.GetInt32()
                : -1;

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

                if (i == 0) // Guardamos el primer personaje para luego ofrecer guardarlo
                {
                    id = currentId;
                    name = currentName;
                    status = currentStatus;
                    species = currentSpecies;
                    gender = currentGender;
                }

                PrintCharacter(
                    $"Resultado {i + 1}",
                    currentId,
                    currentName,
                    currentStatus,
                    currentSpecies,
                    currentGender
                );
            }
            Console.WriteLine($"Resultados encontrados: {results.Count}\n");
            if (results.Count > 1)
                Console.WriteLine("Se guardará solo el primer resultado de la lista.\n");
            
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
