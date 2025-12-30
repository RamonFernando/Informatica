
namespace APISimpleIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.Clear();
            Console.WriteLine($"\n  === MENU {NAME_PROP_API.ToUpper()} ===");
            Console.WriteLine("--------------------------");
            Console.WriteLine($"1. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ID})");
            Console.WriteLine($"2. Buscar {NAME_PROP} ({NAME_TYPE_PROP_NOMBRE})");
            Console.WriteLine($"3. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ESTADO})");
            Console.WriteLine($"4. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ESPECIE})");
            Console.WriteLine($"5. Buscar {NAME_PROP} ({NAME_TYPE_PROP_GENERO})");
            Console.WriteLine($"6. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ORIGEN})");
            Console.WriteLine("7. Mostrar guardados");
            Console.WriteLine("8. Eliminar guardados");
            Console.WriteLine("0. Salir");
            Console.WriteLine("--------------------------");
            Console.Write("Seleccione una Opción: ");
        }
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine(pressToContinueMsg);
            Console.ReadKey();
        }
        public static void PrintCharacter(
            string title,
            int? id,
            string name,
            string status,
            string species,
            string gender,
            Origin origin
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
                Console.WriteLine($"{NAME_TYPE_PROP_ORIGEN}: " +
                    $"\n Nombre: {origin.Name} \n Url: {origin.Url}");
                Console.WriteLine("-----------------------");
        }

        public static void PrintCountCharacter()
        {
            Console.WriteLine(
                MisFavorites.Count == 0
                ? emptyListMessage
                : MisFavorites.Count == 1
                    ? $"Tienes {MisFavorites.Count} {NAME_PROP} guardado.\n"
                    : $"Tienes {MisFavorites.Count} {NAME_PROP}s guardados.\n"
            );
        }
    }
}