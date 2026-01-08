namespace APIStarWarsIA
{
    public static class APISearchByLanguages
    {
        public static async Task SearchByGender()
        {/*
            Console.WriteLine(
                string.Format(filterMessage, NTP_ES_CHARACTER.ToUpper(), NTP_ES_LENGUAJE.ToUpper()));
            
            Console.Write( string.Format(readOnlyMessage, NAME_TYPE_PROP_LENGUAJE, NAME_PROP) +
                "(Spa, Eng, Fra, etc): ");
            string? inputLanguage = Console.ReadLine();
            if(!isValidateInputString(inputLanguage)) return; // null o "" = Entrada no valida
            
            var json = await GetItemApiAsync($"{BASE_URL}/lang/{inputLanguage}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_LENGUAJE, inputLanguage)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!isValidateResults(results, NAME_TYPE_PROP_LENGUAJE, inputLanguage)) return; // count 0 = no encontrado
            
            // Recorremos la lista de personajes encontrados
            for (int i = 0; i < results.Count; i++)
            {
                ApiItem item = MapCountryFromElement(results[i]);
                
                PrintCharacter(
                    $"Resultado {i + 1}",
                    item.Name,
                    item.Capital,
                    item.Region,
                    DictionaryToString(item.Languages),
                    item.Population ?? -1
                );
            } // for
            
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            PrintWaitForPressKey();
        */}
    }
}