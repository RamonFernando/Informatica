
namespace APISimpleIA
{
    public static class APIListFavorites
    {
        public static void ListFavorites()
        {
            ListaVacia(MisFavorites);
            if (MisFavorites.Count == 0) return;

            // * Imprimir la lista de personajes guardados */
            Console.WriteLine($"\n  === MIS {NAME_PROP.ToUpper()} ===");
            Console.WriteLine("--------------------------\n");
            for (int i= 0; i < MisFavorites.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("--------------------------");
                Console.WriteLine(
                    $"{NAME_TYPE_PROP_NOMBRE}: {MisFavorites[i].Name}\n" +
                    $"{NAME_TYPE_PROP_ESTADO}: {MisFavorites[i].Status}\n"+
                    $"{NAME_TYPE_PROP_ESPECIE}: {MisFavorites[i].Species}\n"+
                    $"{NAME_TYPE_PROP_GENERO}: {MisFavorites[i].Gender}\n"
                );
            }
            
            PrintCountCharacter();
            PrintWaitForPressKey();
            return;
        }
    }
}
