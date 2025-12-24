
namespace APISimpleIA
{
    public static class Helpers
    {
        // Valida que el input sea un entero
        public static int ValidarInput(string? input)
        {
            if(string.IsNullOrWhiteSpace(input))
                return -1;
            if (!int.TryParse(input, out int num))
                return -1;
            
            return num;
        }

        // Valida que la opción esté dentro del rango min-max
        public static int ValidarOpcion(string? num, int min, int max){
            int validatedNum = ValidarInput(num);
            
            if(validatedNum == -1)
                return -1;
            
            return (validatedNum >= min && validatedNum <= max)
                ? validatedNum : -1;
        }

        // Imprime el mensaje de entrada no valida
        public static void PrintEntradaNoValida(int num)
        {
            if(num == -1)
                {
                    Console.WriteLine("Entrada no valida o fuera de rango");
                    PrintWaitForPressKey();
                    return;
                }
        }

        // Valida que el string no sea null o vacío
        public static bool ValidarString(string? input){
            input = input?.Trim();
            return !string.IsNullOrWhiteSpace(input);
        }

        // Valida el input string y muestra mensaje si no es valido
        public static void ValidarInputString(string? input)
        {
            if(!ValidarString(input))
            {
                Console.WriteLine("Entrada no valida.\n");
                PrintWaitForPressKey();
                return;
            }
        }

        // Valida si la lista está vacia y muestra mensaje
        public static void ListaVacia(List<ApiItem> MisFavorites)
        {
            if (MisFavorites.Count == 0)
            {
                Console.WriteLine($"\nNo tienes {NAME_PROP}s guardados.\n");
                PrintWaitForPressKey();
                return;
            }
        }

        // Valida si el index está fuera de rango y muestra mensaje
        public static int FueraDeRango(List<ApiItem> MisFavorites, int index)
        {
            if (index < 1 || index > MisFavorites.Count)
            {
                if(MisFavorites.Count == 0) return -1;
                Console.WriteLine($"El Id '{index}' esta fuera de rango.\n");
                PrintWaitForPressKey();
                return -1;
            }
            return index;
        }
        
        public static bool ValidatorJsonNotNull(JsonDocument? json, string propName, string? input)
        {
            if(!ValidarString(input)) {
                // Console.WriteLine("Entrada no valida.\n");
                // PrintWaitForPressKey();
                return false;
            }
            if (json == null)
            {
                Console.WriteLine($"No se ha encontrado el {NAME_PROP} con el " +
                $"el {propName}: '{input}' en la API.\n");
                PrintWaitForPressKey();
                return false;
            }
            return true;
        }
    }
}
