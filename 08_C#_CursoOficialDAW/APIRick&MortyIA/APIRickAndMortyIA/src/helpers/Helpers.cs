
namespace APIRickAndMortyIA
{
    public static class Helpers
    {
        // Valida que el input sea un entero
        public static int ValidateInput(string? input)
        {
            if(string.IsNullOrWhiteSpace(input))
                return -1;
            if (!int.TryParse(input, out int num))
                return -1;
            
            return num;
        }

        // Valida que la opción esté dentro del rango min-max
        public static int ValidateOption(string? num, int min, int max){
            int validatedNum = ValidateInput(num);
            
            if(validatedNum == -1)
                return -1;
            
            return (validatedNum >= min && validatedNum <= max)
                ? validatedNum : -1;
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

        // Valida que el string no sea null o vacío
        public static bool ValidateString(string? input){
            input = input?.Trim();
            return !string.IsNullOrWhiteSpace(input);
        }

        // Valida el input string y muestra mensaje si no es valido
        public static bool ValidateInputString(string? input)
        {
            if(!ValidateString(input))
            {
                Console.WriteLine(inputStringInvalidMsg);
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida si la lista está vacia y muestra mensaje
        public static void emptyList(List<ApiItem> MisFavorites)
        {
            if (MisFavorites.Count == 0)
            {
                Console.WriteLine(string.Format(emptyListMessage, NAME_PROP));
                PrintWaitForPressKey();
                return;
            }
        }

        // Valida si el index está fuera de rango y muestra mensaje
        public static int OutOfRange(List<ApiItem> MisFavorites, int index)
        {
            if (index < 1 || index > MisFavorites.Count)
            {
                if(MisFavorites.Count == 0) return -1;
                Console.WriteLine(string.Format(outOfRangeMsg, index));
                PrintWaitForPressKey();
                return -1;
            }
            return index;
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
                Console.WriteLine(string.Format(notFoundMsg, NAME_PROP, propName, input));
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida que la lista de resultados no esté vacia y muestra mensaje
        public static bool isValidateResults(List<JsonElement> results, string propName, string? input){
            if(results.Count == 0)
            {
                Console.WriteLine(string.Format(notFoundMsg, NAME_PROP, propName, input));
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida la confirmación para guardar en favoritos
        public static bool confirmationSaveFavorite(string? input)
        {
            if (input?.ToLower() != "s")
            {
                Console.WriteLine(cancelOperationMsg);
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        // Valida si el favorito ya existe en la lista
        public static bool existsFavorite(int id, string? name, List<ApiItem> MisFavorites)
        {
            if (MisFavorites.Any(fav => fav.Id == id && fav.Name == name))
            {
                Console.WriteLine(string.Format(saveFavoriteExistsMsg, NAME_PROP, name));
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }

        public static int GetIntProp(JsonElement element, string propName)
        {
            return element.TryGetProperty(propName, out var prop)
                ? prop.GetInt32()
                : -1;
        }
        public static string GetStringProp(JsonElement element, string propName)
        {
            return element.TryGetProperty(propName, out var prop)
                ? prop.GetString() ?? "unknown"
                : "unknown";
        }

        public static Dictionary<string, object> GetObjectProps(JsonElement obj, params string[] props)
        {
            var result = new Dictionary<string, object>();

            // Valores por defecto
            foreach (var prop in props)
                result[prop] = "unknown";

            foreach (var prop in props)
            {
                if (!obj.TryGetProperty(prop, out var value))
                    continue;

                if(value.ValueKind == JsonValueKind.Object)
                {
                    var subProps = value.EnumerateObject().Select(p => p.Name).ToArray();
                    result[prop] = GetObjectProps(value, subProps);
                    continue;
                }

                result[prop] = value.ValueKind switch
                {
                    JsonValueKind.String  => value.GetString() ?? "unknown",
                    JsonValueKind.Number  => value.TryGetInt32(out var num) ? num : value.GetDouble(), // int, double, etc
                    JsonValueKind.True    => true,
                    JsonValueKind.False   => false,
                    JsonValueKind.Null    => null!,
                    _ => "unknown"
                };
            }
            return result;
        }
    }
}
