
namespace APICountriesIA
{
    public class Views
    {
        public static void PrintMenu()
        {
            Console.Clear();
            Console.WriteLine($"\n  === MENU {NAME_PROP_API.ToUpper()} ===");
            Console.WriteLine("--------------------------");
            // Console.WriteLine($"1. Buscar {NAME_PROP} ({NAME_TYPE_PROP_ID})");
            Console.WriteLine($"1. Buscar {NAME_PROP} ({NAME_TYPE_PROP_NOMBRE})");
            Console.WriteLine($"2. Buscar {NAME_PROP} ({NAME_TYPE_PROP_CAPITAL})");
            Console.WriteLine($"3. Buscar {NAME_PROP} ({NAME_TYPE_PROP_REGION})");
            Console.WriteLine($"4. Buscar {NAME_PROP} ({NAME_TYPE_PROP_LENGUAJE})");
            Console.WriteLine($"5. Buscar {NAME_PROP} ({NAME_TYPE_PROP_POBLACION})");
            Console.WriteLine("6. Mostrar guardados");
            Console.WriteLine("7. Eliminar guardados");
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
            CountryName? name,
            string capital,
            string region,
            string languages,
            int population
        )
        {
            // * Imprimir detalles del personaje */;
            Console.WriteLine($"\n{title}");
            Console.WriteLine("-----------------------");

            if (name != null)
                // Console.WriteLine($"{NAME_TYPE_PROP_ID}: {id}");
                Console.WriteLine($"{NAME_TYPE_PROP_NOMBRE}: " +
                    $"\n Nombre: {name.Common} \n Oficial: {name.Official}");
                Console.WriteLine($"{NAME_TYPE_PROP_CAPITAL}: {capital}");
                Console.WriteLine($"{NAME_TYPE_PROP_REGION}: {region}");
                Console.WriteLine($"{NAME_TYPE_PROP_LENGUAJE}: {languages}");
                Console.WriteLine($"{NAME_TYPE_PROP_POBLACION}: {population}");
                Console.WriteLine("-----------------------");
        }

        public static void PrintCountCharacter()
        {
            Console.WriteLine(
                MisFavorites.Count == 0
                ? emptyListMessage
                : MisFavorites.Count == 1
                    ? $"Tienes {MisFavorites.Count} {NAME_PROP} guardado.\n"
                    : $"Tienes {MisFavorites.Count} {NAME_PROP}es guardados.\n"
            );
        }
    }
}