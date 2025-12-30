namespace APISimpleIA
{
    public class APISearchByOrigin
    {
        public static async Task SearchByOrigin()
        {
            Console.WriteLine(string.Format(filterMessage, NAME_PROP, NAME_TYPE_PROP_ORIGEN));
            Console.Write(
                string.Format(readOnlyMessage, NAME_TYPE_PROP_ORIGEN, NAME_PROP) +
                "(Earth, Gazorpazorp, Abadango): ");
            string? inputOrigin = Console.ReadLine();

            ValidateInputString(inputOrigin); // null o "" = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?origin={inputOrigin}"); // no null

            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_ORIGEN, inputOrigin)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!isValidateResults(results, NAME_TYPE_PROP_ORIGEN, inputOrigin)) return; // count 0 = no encontrado
            
            for (int i = 0; i < results.Count; i++)
            {
                int currentId = GetIntProp(results[i], NTP_ID);
                string currentName = GetStringProp(results[i], NTP_NAME);
                string currentStatus = GetStringProp(results[i], NTP_STATUS);
                string currentSpecies = GetStringProp(results[i], NTP_SPECIES);
                string currentGender = GetStringProp(results[i], NTP_GENDER);
                
                // Origin es un objeto con name y url
                var origin = GetObjectProps(results[i], NTP_ORIGIN, "name", "url");
                string currentOriginName = origin["name"]?.ToString() ?? "unknown";
                string currentOriginUrl = origin["url"]?.ToString() ?? "unknown";

                PrintCharacter(
                    $"Resultado {i + 1}",
                    currentId,
                    currentName,
                    currentStatus,
                    currentSpecies,
                    currentGender,
                    new Origin {
                        Name = currentOriginName,
                        Url = currentOriginUrl
                    }
                );
            }
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            PrintWaitForPressKey();
        }
    }
}