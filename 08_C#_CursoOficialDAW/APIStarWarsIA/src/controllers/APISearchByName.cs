
namespace APIStarWarsIA
{
    public static class APISearchByName
    {
        public static async Task SearchByName()
        {
            Console.WriteLine(
                String.Format(filterMessage, NTP_ES_CHARACTER.ToUpper(), NTP_ES_NOMBRE.ToUpper()));
            
            Console.Write(string.Format(readOnlyMessage, NTP_ES_NOMBRE, NTP_ES_CHARACTER) +
            "(Luke Skywalker, R2-D2, C-3PO, etc): ");
            string? inputName = Console.ReadLine();

            if(!isValidateInputString(inputName)) return; // null o "" = Entrada no valida
            
            // *Hacemos la peticion* //https://swapi.info/api/people/?search={inputName}
            var json = await GetItemApiAsync($"{BASE_URL_PEOPLE}?search={inputName}"); // no null
            
            if(!isValidateJsonNotNull(json, NTP_NAME, inputName)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);
            
            results = FilterByNameContains(results, inputName!); // Filtramos por nombre (busqueda parcial)
            
            // Comprueba que el name exista
            if(!isValidateResults(results, NTP_ES_NOMBRE, inputName!)) return; // count 0 = no encontrado
            
            ApiItem? firstResultToSave = null;
            
            // Recorremos la lista de personajes encontrados (posible metodo aparte)
            for (int i = 0; i < results.Count; i++)
            {
                ApiItem item = MapCountryFromElement(results[i]);
                
                if (i == 0) // Guardamos el primer personaje para luego ofrecer guardarlo
                {
                    firstResultToSave = item;
                }

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
            if (results.Count > 1)
                Console.WriteLine(saveFirstResultMsg);
            
            TrySaveFirstResult(firstResultToSave);
            PrintWaitForPressKey();
            return;
        }
    }
}
