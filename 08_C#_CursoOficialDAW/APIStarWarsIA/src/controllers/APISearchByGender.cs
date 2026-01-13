namespace APIStarWarsIA
{
    public static class APISearchByGender
    {
        public static async Task SearchByGender()
        {
            Console.WriteLine(
                string.Format(filterMessage, NTP_ES_CHARACTER.ToUpper(), NTP_ES_GENERO.ToUpper()));
            
            Console.Write( string.Format(readOnlyMessage, NTP_ES_GENERO, NTP_ES_CHARACTER) +
                "(male, female, etc): ");
            string? inputGender = Console.ReadLine();
            if(!isValidateInputString(inputGender)) return; // null o "" = Entrada no valida
            
            var json = await GetItemApiAsync($"{BASE_URL_PEOPLE}?search="); // no null
            
            if(!isValidateJsonNotNull(json, NTP_ES_GENERO, inputGender)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            
            results = FilterByPropertyContains(results, inputGender!, "gender");
            
            if(!isValidateResults(results, NTP_ES_GENERO, inputGender)) return; // count 0 = no encontrado
            
            // Recorremos la lista de personajes encontrados
            for (int i = 0; i < results.Count; i++)
            {
                ApiItem item = MapCharacterFromElement(results[i]);
                
                PrintCharacter(
                    $"Resultado {i + 1}",
                    item.Name,
                    item.Height,
                    item.Mass,
                    item.Gender,
                    item.Species,
                    item.Vehicles,
                    item.Starships
                );
            } // for
            
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            PrintWaitForPressKey();
            return;
        }
    }
}