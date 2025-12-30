namespace APIRickAndMortyIA
{
    public class APISearchByGender
    {
        public static async Task SearchByGender()
        {
            Console.WriteLine(string.Format(filterMessage, NAME_PROP, NAME_TYPE_PROP_GENERO));
            Console.Write(
                string.Format(readOnlyMessage, NAME_TYPE_PROP_GENERO, NAME_PROP) +
                "(Male, Female, Genderless, unknown): ");
            string? inputGender = Console.ReadLine();

            ValidateInputString(inputGender); // null o "" = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?gender={inputGender}"); // no null

            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_GENERO, inputGender)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!isValidateResults(results, NAME_TYPE_PROP_GENERO, inputGender)) return; // count 0 = no encontrado
            
            string currentOrigin = "unknown";
            string currentOriginUrl = "unknown";

            Console.WriteLine(resultSearchMsg);
            for (int i = 0; i < results.Count; i++)
            {
                int currentId = results[i].TryGetProperty(NTP_ID, out var IdProp)
                    ? IdProp.GetInt32()
                    : -1;

                string currentName = results[i].TryGetProperty(NTP_NAME, out var NameProp)
                    ? NameProp.GetString() ?? "unknown"
                    : "unknown";

                string currentStatus = results[i].TryGetProperty(NTP_STATUS, out var StatusProp)
                    ? StatusProp.GetString() ?? "unknown"
                    : "unknown";

                string currentSpecies = results[i].TryGetProperty(NTP_SPECIES, out var SpeciesProp)
                    ? SpeciesProp.GetString() ?? "unknown"
                    : "unknown";

                string currentGender = results[i].TryGetProperty(NTP_GENDER, out var GenderProp)
                    ? GenderProp.GetString() ?? "unknown"
                    : "unknown";
                
                // Origin es un objeto con name y url
                if (results[i].TryGetProperty(NTP_ORIGIN, out var originProp))
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
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            PrintWaitForPressKey();
        }
    }
}