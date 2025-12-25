namespace APISimpleIA
{
    public class APISearchBySpecies
    {
        public static async Task SearchBySpecies()
        {
            Console.WriteLine($"\n=== BUSCAR {NAME_PROP.ToUpper()} POR ESPECIE ===");
            Console.Write($"Ingrese la especie del {NAME_PROP} a buscar: (e.g., Human, Alien, Robot): ");
            string? inputSpecies = Console.ReadLine();

            ValidarInputString(inputSpecies); // null o "" = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?species={inputSpecies}"); // no null
            

            if(!ValidatorJsonNotNull(json, "Especie", inputSpecies)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            
            if(results.Count == 0)
            {
                Console.WriteLine($"{NAME_PROP} con Especie '{inputSpecies}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            Console.WriteLine(resultSearch);
            for (int i = 0; i < results.Count; i++)
            {
                int currentId = results[i].TryGetProperty("id", out var IdProp)
                    ? IdProp.GetInt32()
                    : -1;
                string currentName = results[i].TryGetProperty("name", out var NameProp)
                    ? NameProp.GetString() ?? "unknown"
                    : "unknown";
                string currentStatus = results[i].TryGetProperty("status", out var StatusProp)
                    ? StatusProp.GetString() ?? "unknown"
                    : "unknown";
                string currentSpecies = results[i].TryGetProperty("species", out var SpeciesProp)
                    ? SpeciesProp.GetString() ?? "unknown"
                    : "unknown";
                string currentGender = results[i].TryGetProperty("gender", out var GenderProp)
                    ? GenderProp.GetString() ?? "unknown"
                    : "unknown";
                
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
            PrintWaitForPressKey();
            
        }
    }
}