namespace APICountriesIA
{
    public class APISearchByRegion
    {
        public static async Task SearchByRegion()
        {
            Console.WriteLine(
                string.Format(filterMessage, NAME_PROP.ToUpper(), NAME_TYPE_PROP_REGION.ToUpper()));
            
            Console.Write( string.Format(readOnlyMessage, NAME_TYPE_PROP_REGION, NAME_PROP) +
                "(Europe, Asia, etc): ");
            string? inputRegion = Console.ReadLine();

            ValidateInputString(inputRegion); // null o "" = Entrada no valida
            var json = await GetItemApiAsync($"{BASE_URL}/region/{inputRegion}"); // no null
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_REGION, inputRegion)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!isValidateResults(results, NAME_TYPE_PROP_REGION, inputRegion)) return; // count 0 = no encontrado

            // Recorremos la lista de personajes encontrados
            for (int i = 0; i < results.Count; i++)
            {
                var nameObj = GetObjectProps(results[i], $"{NTP_NAME}.{NTP_COMMON}", $"{NTP_NAME}.{NTP_OFFICIAL}");
                string currentCommon = nameObj[$"{NTP_NAME}.{NTP_COMMON}"]?.ToString() ?? "unknown";
                string currentOfficial = nameObj[$"{NTP_NAME}.{NTP_OFFICIAL}"]?.ToString() ?? "unknown";

                string currentCapital = GetFirstStringFromArray(results[i], NTP_CAPITAL);
                string currentRegion = GetStringProp(results[i], NTP_REGION);
                
                // Diccionario de lenguajes a string
                string currentLanguageStr = GetObjectPropAsString(results[i], NTP_LANGUAGE); // Para mostrar
                Dictionary<string, string> currentLanguagesDict =
                    GetObjectPropAsDictionary(results[i], NTP_LANGUAGE); // Para guardar
                
                int currentPopulation = GetIntProp(results[i], NTP_POPULATION);
                
                PrintCharacter(
                    $"Resultado {i + 1}",
                    new CountryName {
                        Common = currentCommon,
                        Official = currentOfficial
                    },
                    currentCapital,
                    currentRegion,
                    currentLanguageStr,
                    currentPopulation
                );
            } // for
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            PrintWaitForPressKey();
        }
    }
}