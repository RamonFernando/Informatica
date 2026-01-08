namespace APIStarWarsIA
{
    public class APISearchByRegion
    {
        public static async Task SearchByHeight()
        {
            /*Console.WriteLine(
                string.Format(filterMessage, NAME_PROP.ToUpper(), NAME_TYPE_PROP_REGION.ToUpper()));
            
            Console.Write( string.Format(readOnlyMessage, NAME_TYPE_PROP_REGION, NAME_PROP) +
                "(Europe, Asia, etc): ");
            string? inputRegion = Console.ReadLine();
            if(!isValidateInputString(inputRegion)) return; // null o "" = Entrada no valida
            
            var json = await GetItemApiAsync($"{BASE_URL}/region/{inputRegion}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_REGION, inputRegion)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            if(!isValidateResults(results, NAME_TYPE_PROP_REGION, inputRegion)) return; // count 0 = no encontrado

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