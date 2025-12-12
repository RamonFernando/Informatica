namespace APISimpleIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.WriteLine("\n=== MENU DIGIMON ===");
            Console.WriteLine("1. Buscar Digimon");
            Console.WriteLine("2. Mostrar guardados");
            Console.WriteLine("3. Eliminar guardados");
            Console.WriteLine("0. Salir");
            Console.Write("Opción: ");
        }
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("\nPresiona cualquier tecla para continuar...");
            Console.ReadKey();
        }
    }
}