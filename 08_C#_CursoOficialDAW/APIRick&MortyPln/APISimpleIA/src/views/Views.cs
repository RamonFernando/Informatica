
namespace APISimpleIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.Clear();
            Console.WriteLine($"\n  === MENU {NAME_PROP_API.ToUpper()} ===");
            Console.WriteLine("--------------------------");
            Console.WriteLine($"1. Buscar {NAME_PROP} (Nombre)");
            Console.WriteLine($"2. Buscar {NAME_PROP} (Id)");
            Console.WriteLine($"3. Buscar {NAME_PROP} (Status)");
            Console.WriteLine("4. Mostrar guardados");
            Console.WriteLine("5. Eliminar guardados");
            Console.WriteLine("0. Salir");
            Console.WriteLine("--------------------------");
            Console.Write("Seleccione una Opción: ");
        }
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("\nPresiona cualquier tecla para continuar...");
            Console.ReadKey();
        }
        public static void PrintCharacter(
            string title,
            int? id,
            string name,
            string status,
            string species,
            string gender
        )
        {
            // * Imprimir detalles del personaje */;
            Console.WriteLine($"\n{title}");
            Console.WriteLine("-----------------------");

            if (id != null)
                Console.WriteLine($"{NAME_TYPE_PROP_ID}: {id}");
                Console.WriteLine($"{NAME_TYPE_PROP_NOMBRE}: {name}");
                Console.WriteLine($"{NAME_TYPE_PROP_ESTADO}: {status}");
                Console.WriteLine($"{NAME_TYPE_PROP_ESPECIE}: {species}");
                Console.WriteLine($"{NAME_TYPE_PROP_GENERO}: {gender}");
                Console.WriteLine("-----------------------");
        }

        public static void PrintCountCharacter()
        {
            Console.WriteLine(
                MisFavorites.Count == 0
                ? $"No tienes ningun {NAME_PROP} guardado.\n"
                : MisFavorites.Count == 1
                    ? $"Tienes {MisFavorites.Count} {NAME_PROP} guardado.\n"
                    : $"Tienes {MisFavorites.Count} {NAME_PROP}s guardados.\n"
            );
        }
    }
}