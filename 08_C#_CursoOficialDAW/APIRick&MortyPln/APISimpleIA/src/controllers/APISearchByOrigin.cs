namespace APISimpleIA
{
    public class APISearchByOrigin
    {
        public static async Task SearchByOrigin()
        {
            Console.WriteLine($"\n=== BUSCAR {NAME_PROP.ToUpper()} POR ORIGEN ===");
            Console.Write($"Ingrese el origen del {NAME_PROP} a buscar: (Earth, Gazorpazorp, Abadango): ");
            string? inputOrigin = Console.ReadLine();

            ValidarInputString(inputOrigin); // null o "" = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?origin={inputOrigin}"); // no null

            if(!ValidatorJsonNotNull(json, "Origen", inputOrigin)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!ValidatorResults(results, "Origen", inputOrigin)) return; // count 0 = no encontrado
            
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