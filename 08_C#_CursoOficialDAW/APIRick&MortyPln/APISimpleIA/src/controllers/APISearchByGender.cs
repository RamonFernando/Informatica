namespace APISimpleIA
{
    public class APISearchByGender
    {
        public static async Task SearchByGender()
        {
            Console.WriteLine($"\n=== BUSCAR {NAME_PROP.ToUpper()} POR GÉNERO ===");
            Console.Write($"Ingrese el género del {NAME_PROP} a buscar: (Male, Female, Genderless, unknown): ");
            string? inputGender = Console.ReadLine();

            ValidarInputString(inputGender); // null o "" = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?gender={inputGender}"); // no null

            if(!ValidatorJsonNotNull(json, "Género", inputGender)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!ValidatorResults(results, "Género", inputGender)) return; // count 0 = no encontrado
            
            string currentOrigin = "unknown";
            string currentOriginUrl = "unknown";

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
                
                // Origin es un objeto con name y url
                if (results[i].TryGetProperty("origin", out var originProp))
                {
                    if (originProp.TryGetProperty("name", out var originNameProp))
                        currentOrigin = originNameProp.GetString() ?? "unknown";

                    if (originProp.TryGetProperty("url", out var originUrlProp))
                        currentOriginUrl = originUrlProp.GetString() ?? "unknown";
                }

                PrintCharacter(
                    $"Resultado {i + 1}",
                    currentId,
                    currentName,
                    currentStatus,
                    currentSpecies,
                    currentGender,
                    new Origin { Name = currentOrigin, Url = currentOriginUrl }
                );
            }
            Console.WriteLine($"Resultados encontrados: {results.Count}\n");
            PrintWaitForPressKey();
        }
    }
}