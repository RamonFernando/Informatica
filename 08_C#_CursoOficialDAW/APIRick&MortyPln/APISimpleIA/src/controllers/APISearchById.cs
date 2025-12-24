
namespace APISimpleIA
{
    internal class APISearchById
    {
        public static async Task SearchById()
        {
            Console.WriteLine($"\n=== BUSQUEDA DE {NAME_PROP.ToUpper()} POR ID ===");
            Console.Write($"Ingrese el Id del {NAME_PROP} que desea buscar: ");
            string? input = Console.ReadLine();
            
            int id = ValidarInput(input);
            if(id == -1) {
                Console.WriteLine("\nEntrada no valida o caracteres no numéricos.\n");
                PrintWaitForPressKey();
                return;
            }
            
            JsonDocument? json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/{id}"); // no null
            
            if(!ValidatorJsonNotNull(json, "Id", input)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el id exista
            if(results.Count == 0)
            {
                Console.WriteLine($"{NAME_PROP} con Id '{id}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            
            var root = jsonNotNull.RootElement;
            
            int currentId = root.TryGetProperty($"{NTP_ID}", out var idProp)
                ? idProp.GetInt32() : -1;
            
            string currentName = root.TryGetProperty($"{NTP_NAME}", out var nameProp)
                ? nameProp.GetString() ?? "unknown"
                : "unknown";

            string currentStatus = root.TryGetProperty($"{NTP_STATUS}", out var statusProp)
                ? statusProp.GetString() ?? "unknown"
                : "unknown";

            string currentSpecies = root.TryGetProperty($"{NTP_SPECIES}", out var speciesProp)
                ? speciesProp.GetString() ?? "unknown"
                : "unknown";

            string currentGender = root.TryGetProperty($"{NTP_GENDER}", out var genderProp)
                ? genderProp.GetString() ?? "unknown"
                : "unknown";

            Console.WriteLine(resultSearch);
            Console.WriteLine("-----------------------");
            PrintCharacter(
                $"{NAME_PROP} Detalles",
                currentId,
                currentName,
                currentStatus,
                currentSpecies,
                currentGender
            );

            Console.Write($"\n¿Quieres guardar al {NAME_PROP} '{currentName}'? (s/n): ");
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if (respuesta != "s")
            {
                Console.WriteLine($"{NAME_PROP} '{currentName}' no guardado.\n");
                PrintWaitForPressKey();
                return;
            }
            // Evitar duplicados
            if (MisFavorites.Any(d => d.Id == currentId))
            {
                Console.WriteLine($"El {NAME_PROP} '{currentName}' ya esta guardado.\n");
                PrintWaitForPressKey();
                return;
            }
            // Guardar el item en la lista de favoritos
            MisFavorites.Add(new ApiItem
            {
                Id = currentId,
                Name = currentName,
                Status = currentStatus,
                Species = currentSpecies,
                Gender = currentGender
            });

            Console.WriteLine($"{NAME_PROP} '{currentName}' Guardado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}