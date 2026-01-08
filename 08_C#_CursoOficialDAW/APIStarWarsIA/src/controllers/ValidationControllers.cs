/*
emptyList                   // Valida si la lista está vacia
PrintValidateInput          // Imprime el mensaje de entrada no valida
confirmationSaveFavorite    // Valida la confirmación para guardar en favoritos
existsFavorite              // Valida si el favorito ya existe en la lista
isValidateJsonNotNull       // Valida que el JsonDocument no sea null
isValidateResults           // Valida que la lista de resultados no esté vacia
TryAddFavorite              // Agrega un favorito a la lista si no es null
*/
namespace APIStarWarsIA
{
    public class ValidationControllers
    {
        // Valida si la lista está vacia y muestra mensaje
        public static void emptyList(List<ApiItem> MisFavorites)
        {
            if (MisFavorites.Count == 0)
            {
                Console.WriteLine(string.Format(emptyListMessage, NTP_ES_CHARACTER));
                PrintWaitForPressKey();
                return;
            }
        }
        
        // Imprime el mensaje de entrada no valida
        public static void PrintValidateInput(int num,int min, int max)
        {
            if(num == -1)
                {
                    Console.WriteLine(string.Format(validarOpcionMsg, min, max));
                    PrintWaitForPressKey();
                    return;
                }
        }

        // Valida la confirmación para guardar en favoritos
        public static bool confirmationSaveFavorite(string? input)
        {
            if (input?.ToLower() != "s")
            {
                Console.WriteLine(cancelOperationMsg);
                // PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida si el favorito ya existe en la lista ignorando mayusculas/minusculas y espacios
        public static bool existsFavorite(string? prop, List<ApiItem> MisFavorites)
        {
            if(!ValidateString(prop)) return false;

            bool exists = MisFavorites.Any(fav =>
                fav.Name != null &&
                fav.Name.Trim().
                    Equals(prop!.Trim(), StringComparison.OrdinalIgnoreCase)
            );

            if (exists)
            {
                Console.WriteLine(string.Format(saveFavoriteExistsMsg, NTP_ES_CHARACTER, prop?.Trim()));
                // PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida que el JsonDocument no sea null y muestra mensaje
        public static bool isValidateJsonNotNull(JsonDocument? json, string propName, string? input)
        {
            if(!ValidateString(input)) {
                // Console.WriteLine("Entrada no valida.\n");
                // PrintWaitForPressKey();
                return false;
            }
            if (json == null)
            {
                Console.WriteLine(string.Format(notFoundMsg, NTP_ES_CHARACTER, propName, input));
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }
        
        // Valida que la lista de resultados no esté vacia y muestra mensaje
        public static bool isValidateResults(List<JsonElement> results, string propName, string? input){
            if(results.Count == 0)
            {
                Console.WriteLine(string.Format(notFoundMsg, NTP_ES_CHARACTER, propName, input));
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Agrega un favorito a la lista si no es null
        public static bool TryAddFavorite(ApiItem firstResultToSave)
        {
            // if(!existsFavorite(firstResultToSave.Name?.Common, MisFavorites)) return false;
            if (firstResultToSave != null)
            {
                MisFavorites.Add(firstResultToSave);
                return true;
            }
            
            return false;
        }
    }
}