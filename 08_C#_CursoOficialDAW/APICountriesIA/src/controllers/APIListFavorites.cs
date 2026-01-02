
namespace APICountriesIA
{
    public static class APIListFavorites
    {
        public static void ListFavorites()
        {
            emptyList(MisFavorites);
            if (MisFavorites.Count == 0) return;

            // * Imprimir la lista de personajes guardados */
            Console.WriteLine($"\n  === MIS {NAME_PROP.ToUpper()}ES ===");
            Console.WriteLine("--------------------------\n");
            for (int i= 0; i < MisFavorites.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("--------------------------");
                Console.WriteLine(
                    $"{NAME_TYPE_PROP_NOMBRE}: " +
                        $"\n Nombre Común: {MisFavorites[i].Name?.Common ?? "unknown"} \n" +
                        $" Nombre Oficial: {MisFavorites[i].Name?.Official ?? "unknown"}\n" +
                    $"{NAME_TYPE_PROP_CAPITAL}: {ListToString(MisFavorites[i]?.Capital)}\n" +
                    $"{NAME_TYPE_PROP_LENGUAJE}: {DictionaryToString(MisFavorites[i]?.Languages)}\n" +
                    $"{NAME_TYPE_PROP_REGION}: {MisFavorites[i].Region ?? "unknown"}\n" +
                    $"{NAME_TYPE_PROP_POBLACION}: {MisFavorites[i].Population}\n"
                );
            }
            
            PrintCountCharacter();
            PrintWaitForPressKey();
            return;
        }
    }
}
