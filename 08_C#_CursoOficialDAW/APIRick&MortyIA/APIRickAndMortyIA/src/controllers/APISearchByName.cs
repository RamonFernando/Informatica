
namespace APIRickAndMortyIA
{
    public static class APISearchByName
    {
        
        public static async Task SearchByName()
        {
            Console.WriteLine(
                String.Format(filterMessage, NAME_PROP.ToUpper(), NAME_TYPE_PROP_NOMBRE.ToUpper()));
            
            Console.Write(string.Format(readOnlyMessage, NAME_TYPE_PROP_NOMBRE, NAME_PROP));
            string? inputName = Console.ReadLine();

            if(!ValidateInputString(inputName)) return; // null o "" = Entrada no valida
            
            // Hacemos la peticion
            // /?name={name} /?status={status} /?species={species}&type={type}
            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?name={inputName}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_NOMBRE, inputName)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null
            
            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el name exista
            if(!isValidateResults(results, NAME_TYPE_PROP_NOMBRE, inputName)) return; // count 0 = no encontrado
            
            Console.WriteLine(resultSearchMsg);
            int id = -1;
            string name = "";
            string status = "";
            string species = "";
            string gender = "";
            string originName = "";
            string originUrl = "";
            
            // Recorremos la lista de personajes encontrados
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

                if (i == 0) // Guardamos el primer personaje para luego ofrecer guardarlo
                {
                    id = currentId;
                    name = currentName;
                    status = currentStatus;
                    species = currentSpecies;
                    gender = currentGender;
                    originName = currentOriginName;
                    originUrl = currentOriginUrl;
                    
                }

                PrintCharacter(
                    $"Resultado {i + 1}",
                    currentId,
                    currentName,
                    currentStatus,
                    currentSpecies,
                    currentGender,
                    new Origin {
                        Name = currentOriginName,
                        Url = currentOriginName
                    }
                );
            }
            Console.WriteLine(string.Format(resultSearchCountMsg, results.Count));
            if (results.Count > 1)
                Console.WriteLine(saveFirstResultMsg);
            
            Console.Write(string.Format(confirmationSaveFavoriteMsg, NAME_PROP, name));
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();

            if(!confirmationSaveFavorite(respuesta)) return;

            // Evitar duplicados
            if(!existsFavorite(id, name, MisFavorites)) return;

            // Guardar SOLO uno
            MisFavorites.Add(new ApiItem
            {
                Id = id,
                Name = name,
                Status = status,
                Species = species,
                Gender = gender,

                Origin = new Origin {
                    Name = originName,
                    Url = originUrl
                }
            });

            Console.WriteLine(string.Format(favoriteSavedMsg, NAME_PROP, name));
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }
}
