
namespace APIStarWarsIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.Clear();
            Console.WriteLine($"\n  === MENU {NTP_API.ToUpper()} ===");
            Console.WriteLine("--------------------------");
            // Console.WriteLine($"1. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ID})");
            Console.WriteLine($"1. Buscar {NTP_ES_CHARACTER} ({NTP_ES_NOMBRE})");
            Console.WriteLine($"2. Buscar {NTP_ES_CHARACTER} ({NTP_ES_ALTURA})");
            Console.WriteLine($"3. Buscar {NTP_ES_CHARACTER} ({NTP_ES_MASA})");
            Console.WriteLine($"4. Buscar {NTP_ES_CHARACTER} ({NTP_ES_GENERO})");
            Console.WriteLine("5. Mostrar guardados");
            Console.WriteLine("6. Eliminar guardados");
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
            string? name = null,
            int? height = 0,
            int? mass = 0,
            string? gender = "unknown",
            string? species = "unknown",
            List<string>? vehicles = null,
            List<string>? starships = null
        )
        {
            // * Imprimir detalles del personaje */;
            Console.WriteLine($"\n{title}");
            Console.WriteLine("-----------------------");

            if (name != null){
                // Console.WriteLine($"{NAME_TYPE_PROP_ID}: {id}");
                Console.WriteLine($"{NTP_ES_NOMBRE}: {name}");
                Console.WriteLine($"{NTP_ES_ALTURA}: {height} cm");
                Console.WriteLine($"{NTP_ES_MASA}: {mass} kg");
                Console.WriteLine($"{NTP_ES_GENERO}: {gender}");
                Console.WriteLine($"{NTP_ES_ESPECIE}: {species}");
                Console.WriteLine($"{NTP_ES_VEHICULO}: {ListToString(vehicles)}");
                Console.WriteLine($"{NTP_ES_NAVE_ESPACIAL}: {ListToString(starships)}");
                Console.WriteLine("-----------------------");
            }
        }
        public static void PrintCountCharacter()
        {
            Console.WriteLine(
                MisFavorites.Count == 0
                ? emptyListMessage
                : MisFavorites.Count == 1
                    ? $"Tienes {MisFavorites.Count} {NTP_ES_CHARACTER} guardado.\n"
                    : $"Tienes {MisFavorites.Count} {NTP_ES_CHARACTER}es guardados.\n"
            );
        }
    }
}