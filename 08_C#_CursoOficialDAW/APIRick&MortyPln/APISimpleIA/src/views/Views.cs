
namespace APISimpleIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.WriteLine($"\n  === MENU {NAME_PROP_API.ToUpper()} ===");
            Console.WriteLine("--------------------------");
            Console.WriteLine($"1. Buscar {NAME_PROP} (Nombre)");
            Console.WriteLine("2. Mostrar guardados");
            Console.WriteLine("3. Eliminar guardados");
            Console.WriteLine("0. Salir");
            Console.WriteLine("--------------------------");
            Console.Write("Seleccione una Opción: ");
        }
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("\nPresiona cualquier tecla para continuar...");
            Console.ReadKey();
        }
    }
}