
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

            if(!ValidateInputString(inputName)) return; // null o "" = Entrada no valida
            
            // *Hacemos la peticion*
            // /?name={name} /?status={status} /?species={species}&type={type}
            var json = await GetItemApiAsync($"{BASE_URL}/name/{inputName}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_NOMBRE, inputName)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el name exista
            if(!isValidateResults(results, NAME_TYPE_PROP_NOMBRE, inputName)) return; // count 0 = no encontrado
            
            Console.WriteLine(resultSearchMsg);
            string common = "";
            string capital = "";
            string region = "";
            string languages = "";
            int population = 0;
            ApiItem? firstResultToSave = null;
            
            // Recorremos la lista de personajes encontrados (posible metodo aparte)
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
                
                if (i == 0) // Guardamos el primer personaje para luego ofrecer guardarlo
                {
                    firstResultToSave = new ApiItem
                    {
                        Name = new CountryName { // Objeto
                            Common = currentCommon,
                            Official = currentOfficial
                        },
                        Capital = new List<string> { // Lista
                            currentCapital
                        },
                        Region = currentRegion,
                        Languages = currentLanguagesDict, // Diccionario
                        Population = currentPopulation
                    };
                }

                PrintCharacter(
                    $"Resultado {i + 1}",
                    new CountryName {
                        Common = currentCommon,
                        Official = currentOfficial
                    },
                    capital = currentCapital,
                    region = currentRegion,
                    languages = currentLanguageStr,
                    population = currentPopulation
                );
            } // for // fin del metodo

            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            if (results.Count > 1)
                Console.WriteLine(saveFirstResultMsg);
            
            // Guardar favorito (posible metodo aparte)
            common = firstResultToSave?.Name?.Common ?? "unknown";
            Console.Write(string.Format(confirmationSaveFavoriteMsg, NAME_PROP, common));
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if(!confirmationSaveFavorite(respuesta)) return;

            // Evitar duplicados
            if(!existsFavorite(common, MisFavorites)) return;

            // Guardar SOLO uno
            if(firstResultToSave == null) return; // seguridad null
            MisFavorites.Add(firstResultToSave);

            if(TryAddFavorite(firstResultToSave))
                Console.WriteLine(string.Format(favoriteSavedMsg, NAME_PROP, common));
            // fin del metodo

            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}
