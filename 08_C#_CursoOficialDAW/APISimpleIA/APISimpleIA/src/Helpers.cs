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
        public static bool ValidarString(string? input){
            input = input?.Trim();
            return !string.IsNullOrWhiteSpace(input);
        }
    }
}
