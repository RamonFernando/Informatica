
namespace APISimpleIA
{
    public static class APIListFavorites
    {
        public static void ListFavorites()
        {
            emptyList(MisFavorites);
            if (MisFavorites.Count == 0) return;

            // * Imprimir la lista de personajes guardados */
            Console.WriteLine($"\n  === MIS {NAME_PROP.ToUpper()}S ===");
            Console.WriteLine("--------------------------\n");
            for (int i= 0; i < MisFavorites.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("--------------------------");
                Console.WriteLine(
                    $"{NAME_TYPE_PROP_ID}: {MisFavorites[i].Id}\n" +
                    $"{NAME_TYPE_PROP_NOMBRE}: {MisFavorites[i].Name}\n" +
                    $"{NAME_TYPE_PROP_ESTADO}: {MisFavorites[i].Status}\n"+
                    $"{NAME_TYPE_PROP_ESPECIE}: {MisFavorites[i].Species}\n"+
                    $"{NAME_TYPE_PROP_GENERO}: {MisFavorites[i].Gender}\n"
                    + $"{NAME_TYPE_PROP_ORIGEN}: " +
                        $"\n Nombre: {MisFavorites[i].Origin?.Name ?? "unknown"} \n" +
                        $" Url: {MisFavorites[i].Origin?.Url ?? "unknown"}\n"
                );
            }
            
            PrintCountCharacter();
            PrintWaitForPressKey();
            return;
        }
    }
}
