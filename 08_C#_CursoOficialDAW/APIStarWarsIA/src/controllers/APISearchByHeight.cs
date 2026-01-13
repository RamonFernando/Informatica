namespace APIStarWarsIA
{
    public class APISearchByHeight
    {
        public static async Task SearchByHeight()
        {
            Console.WriteLine(
                string.Format(filterMessage, NTP_ES_CHARACTER.ToUpper(), NTP_ES_ALTURA.ToUpper()));
            
            Console.Write( string.Format(readOnlyMessage, NTP_ES_ALTURA, NTP_ES_CHARACTER) +
                "(172, 167, 202, etc): ");
            string? inputHeight = Console.ReadLine();
            if(!isValidateInputString(inputHeight)) return; // null o "" = Entrada no valida
            
            // Validamos el input como número
            if(!isValidateInputInt(inputHeight, out int inputHeightNum)) return;
            
            var json = await GetItemApiAsync($"{BASE_URL_PEOPLE}"); // no null
            
            if(!isValidateJsonNotNull(json, NTP_ES_ALTURA, inputHeight)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            
            results = FilterByPropertyNumber(results, inputHeightNum, "height");

            if(!isValidateResults(results, NTP_ES_ALTURA, inputHeight)) return; // count 0 = no encontrado
            
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
        }
    }
}