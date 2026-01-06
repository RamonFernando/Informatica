
namespace APICountriesIA
{
    public static class APISearchByName
    {
        
        public static async Task SearchByName()
        {
            Console.WriteLine(
                String.Format(filterMessage, NAME_PROP.ToUpper(), NAME_TYPE_PROP_NOMBRE.ToUpper()));
            
            Console.Write(string.Format(readOnlyMessage, NAME_TYPE_PROP_NOMBRE, NAME_PROP) +
            "(Spain, Italy, etc): ");
            string? inputName = Console.ReadLine();

            if(!isValidateInputString(inputName)) return; // null o "" = Entrada no valida
            
            // *Hacemos la peticion*
            // /?name={name} /?status={status} /?species={species}&type={type}
            var json = await GetItemApiAsync($"{BASE_URL}/name/{inputName}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_NOMBRE, inputName)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el name exista
            if(!isValidateResults(results, NAME_TYPE_PROP_NOMBRE, inputName)) return; // count 0 = no encontrado
            
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
                    item.Capital,
                    item.Region,
                    DictionaryToString(item.Languages),
                    item.Population ?? -1
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
