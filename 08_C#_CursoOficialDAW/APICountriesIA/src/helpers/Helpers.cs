/*
ValidateInput                   // Valida que el input sea un entero
ValidateOption                  // Valida que la opción esté dentro del rango min-max
ValidateString                  // Valida que el string no sea null o vacío
isValidateInputString           // Valida el input string y muestra mensaje si no es valido
OutOfRange                      // Valida si el index está fuera de rango y muestra mensaje
GetIntProp                      // Obtiene propiedades de un JsonElement (int o -1 si no existe)
GetStringProp                   // Obtiene propiedades de un JsonElement (string o "unknown" si no existe)
GetFirstStringFromArray         // Obtiene el primer string de un array en un JsonElement (string o "unknown" si no existe)
GetElementByPath                // Obtiene un JsonElement anidado por una ruta de propiedades separadas por puntos
GetObjectAsString               // Convierte un JsonElement de tipo objeto a una cadena de texto
GetObjectPropAsString           // Convierte una propiedad de un JsonElement de tipo objeto a una cadena de texto
GetObjectPropAsDictionary       // Convierte una propiedad de un JsonElement de tipo objeto a un diccionario
ListToString                    // Mostrar listas como strings
DictionaryToString              // Mostrar diccionarios como strings
*/

namespace APICountriesIA
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

        // Valida que el string no sea null o vacío
        public static bool ValidateString(string? input){
            input = input?.Trim();
            return !string.IsNullOrWhiteSpace(input);
        }

        // Valida el input string y muestra mensaje si no es valido
        public static bool isValidateInputString(string? input)
        {
            if(!ValidateString(input))
            {
                Console.WriteLine(inputStringInvalidMsg);
                PrintWaitForPressKey();
                return false;
            }
            return true;
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
        
        // Int
        // Obtiene propiedades de un JsonElement (int o -1 si no existe)
        public static long GetIntProp(JsonElement element, string propName)
        {
            return element.TryGetProperty(propName, out var prop)
                ? prop.GetInt64()
                : -1;
        }

        // String
        // Obtiene propiedades de un JsonElement (string o "unknown" si no existe)
        public static string GetStringProp(JsonElement element, string propName)
        {
            return element.TryGetProperty(propName, out var prop)
                ? prop.GetString() ?? "unknown"
                : "unknown";
        }

        // Array 1er String
        // Obtiene el primer string de un array en un JsonElement (string o "unknown" si no existe)
        public static string GetFirstStringFromArray(JsonElement element, string propName)
        {
            if (!element.TryGetProperty(propName, out var prop))
                return "unknown";

            if (prop.ValueKind != JsonValueKind.Array || prop.GetArrayLength() == 0)
                return "unknown";

            return prop[0].GetString() ?? "unknown";
        }

        // Object (diccionario)
        // Obtiene un diccionario con las propiedades especificadas de un JsonElement
        // (string o "unknown" si no existe)
        // Soporta propiedades anidadas (objetos)
        // return Dictionary<string, object>
        public static Dictionary<string, object> GetObjectProps(JsonElement obj, params string[] props)
        {
            var result = new Dictionary<string, object>();

            foreach (var prop in props)
                result[prop] = "unknown";

            foreach (var prop in props)
            {
                var element = GetElementByPath(obj, prop);
                if (element == null)
                    continue;

                var value = element.Value;

                result[prop] = value.ValueKind switch
                {
                    JsonValueKind.String  => value.GetString() ?? "unknown",
                    JsonValueKind.Number  => value.TryGetInt32(out var num) ? num : value.GetDouble(),
                    JsonValueKind.True    => true,
                    JsonValueKind.False   => false,
                    JsonValueKind.Null    => null!,
                    JsonValueKind.Object  => value.ToString(), // o Dictionary si quieres
                    _ => "unknown"
                };
            }

            return result;
        }

        // Object (ruta)
        // Obtiene un JsonElement anidado por una ruta de propiedades separadas por puntos
        public static JsonElement? GetElementByPath(JsonElement obj, string path)
        {
            var parts = path.Split('.');
            JsonElement current = obj;

            foreach (var part in parts)
            {
                if (current.ValueKind != JsonValueKind.Object ||
                    !current.TryGetProperty(part, out var next))
                    return null;

                current = next;
            }

            return current;
        }

        // Object to String
        // Convierte un JsonElement de tipo objeto a una cadena de texto
        public static string GetObjectAsString(
            JsonElement element,
            Func<JsonProperty, string>? selector = null,
            string separator = ", ")
        {
            if (element.ValueKind != JsonValueKind.Object)
                return "unknown";

            var values = new List<string>();

            foreach (var prop in element.EnumerateObject())
            {
                string value = selector != null
                    ? selector(prop)
                    : prop.Value.GetString() ?? "";

                if (!string.IsNullOrWhiteSpace(value))
                    values.Add(value);
            }

            return values.Count > 0
                ? string.Join(separator, values)
                : "unknown";
        }

        // Object Propiedad a String
        // Convierte una propiedad de un JsonElement de tipo objeto a una cadena de texto
        public static string GetObjectPropAsString(
            JsonElement element,
            string propName,
            Func<JsonProperty, string>? selector = null,
            string separator = ", ")
        {
            if (!element.TryGetProperty(propName, out var prop))
                return "unknown";

            return GetObjectAsString(prop, selector, separator);
        }

        // Object (Propiedad a Diccionario)
        // Convierte una propiedad de un JsonElement de tipo objeto a un diccionario
        public static Dictionary<string, string> GetObjectPropAsDictionary(
            JsonElement element,
            string propName)
        {
            var result = new Dictionary<string, string>();

            if (!element.TryGetProperty(propName, out var prop) ||
                prop.ValueKind != JsonValueKind.Object)
                return result;

            foreach (var item in prop.EnumerateObject())
            {
                var value = item.Value.GetString();
                if (!string.IsNullOrWhiteSpace(value))
                    result[item.Name] = value;
            }

            return result;
        }

        // Mostrar
        // Mostrar listas y diccionarios como strings
        public static string ListToString(List<string>? list)
        {
            return list != null && list.Any()
                ? string.Join(", ", list)
                : "unknown";
        }

        public static string DictionaryToString(Dictionary<string, string>? dict)
        {
            return dict != null && dict.Any()
                ? string.Join(", ", dict.Values)
                : "unknown";
        }
    
    }
}
