
namespace APIStarWarsIA
{
    /*internal class APISearchById
    {
        public static async Task SearchById()
        {
            Console.WriteLine(string.Format(filterMessage, NAME_PROP.ToUpper(), NAME_TYPE_PROP_ID.ToUpper()));
            Console.Write(string.Format(readOnlyMessage, NAME_TYPE_PROP_ID, NAME_PROP));
            string? input = Console.ReadLine();
            
            int id = ValidateInput(input);
            if(id == -1) {
                Console.WriteLine(validarInputMsg);
                PrintWaitForPressKey();
                return;
            }
            
            JsonDocument? json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/{id}"); // no null
            
            if(!isValidateJsonNotNull(json, NAME_TYPE_PROP_ID, input)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            List<JsonElement> results = ExtractResults(jsonNotNull);

            // Comprueba que el id exista
            if(!isValidateResults(results, NAME_TYPE_PROP_ID, input)) return; // count 0 = no encontrado
            
            var root = jsonNotNull.RootElement;
            
            int currentId = GetIntProp(root, NTP_ID);
            string currentName = GetStringProp(root, NTP_NAME);
            string currentStatus = GetStringProp(root, NTP_STATUS);
            string currentSpecies = GetStringProp(root, NTP_SPECIES);
            string currentGender = GetStringProp(root, NTP_GENDER);
                
            // Origin es un objeto con name y url
            var origin = GetObjectProps(root, NTP_ORIGIN, "name", "url");
            string currentOrigin = origin["name"].ToString() ?? "unknown";
            string currentOriginUrl = origin["url"].ToString() ?? "unknown";
            

            // Imprimir la información del personaje
            Console.WriteLine(resultSearchMsg);
            Console.WriteLine("-----------------------");
            PrintCharacter(
                $"{NAME_PROP} Detalles",
                currentId,
                currentName,
                currentStatus,
                currentSpecies,
                currentGender,
                new Origin {
                    Name = currentOrigin,
                    Url = currentOriginUrl
                }
            );

            Console.Write(string.Format(confirmationSaveFavoriteMsg, NAME_PROP, currentName));
            string? respuesta = Console.ReadLine();

            respuesta = respuesta?.Trim().ToLower();
            // Validar confirmación para guardar en favoritos
            if(!confirmationSaveFavorite(respuesta)) return;
            
            // Evitar duplicados
            if (!existsFavorite(currentId, currentName, MisFavorites)) return;
            
            // Guardar el item en la lista de favoritos
            MisFavorites.Add(new ApiItem
            {
                Id = currentId,
                Name = currentName,
                Status = currentStatus,
                Species = currentSpecies,
                Gender = currentGender,
                Origin = new Origin {
                    Name = currentOrigin,
                    Url = currentOriginUrl
                }
            });

            Console.WriteLine(string.Format(favoriteSavedMsg, NAME_PROP, currentName));
            APISaveFavoriteList();
            PrintWaitForPressKey();
            return;
        }
    }*/
}