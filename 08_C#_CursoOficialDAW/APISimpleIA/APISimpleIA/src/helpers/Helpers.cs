using static APISimpleIA.Views;

namespace APISimpleIA
{
    public static class Helpers
    {
        public static int ValidarInput(string? input)
        {
            if(string.IsNullOrWhiteSpace(input))
                return -1;
            if (!int.TryParse(input, out int num))
                return -1;
            
            return num;
        }
        public static int ValidarOpcion(string? num, int min, int max){
            int validatedNum = ValidarInput(num);
            
            if(validatedNum == -1)
                return -1;
            
            return (validatedNum >= min && validatedNum <= max)
                ? validatedNum : -1;
        }
        public static void PrintEntradaNoValida(int num)
        {
            if(num == -1)
                {
                    Console.WriteLine("Entrada no valida o fuera de rango");
                    PrintWaitForPressKey();
                    return;
                }
        }
        public static bool ValidarString(string? input){
            input = input?.Trim();
            return !string.IsNullOrWhiteSpace(input);
        }
        public static void ValidarInputString(string? input)
        {
            if(!ValidarString(input))
            {
                Console.WriteLine("Entrada no valida.\n");
                PrintWaitForPressKey();
                return;
            }
        }
        public static void ListaVacia(List<Digimon> MisDigimons)
        {
            if (MisDigimons.Count == 0)
            {
                Console.WriteLine("\nNo tienes Digimon guardados.\n");
                PrintWaitForPressKey();
                return;
            }
        }
        public static int FueraDeRango(List<Digimon> MisDigimons, int index)
        {
            if (index < 1 || index > MisDigimons.Count)
            {
                Console.WriteLine($"El Id '{index}' esta fuera de rango.\n");
                PrintWaitForPressKey();
                return -1;
            }
            return index;
        }
    }
}
