
namespace APIStarWarsIA
{
    public static class APIListFavorites
    {
        public static void ListFavorites()
        {
            emptyList(MisFavorites);
            if (MisFavorites.Count == 0) return;

            // * Imprimir la lista de personajes guardados */
            Console.WriteLine($"\n  === MIS {NTP_ES_CHARACTER.ToUpper()}ES ===");
            Console.WriteLine("--------------------------\n");
            for (int i= 0; i < MisFavorites.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("--------------------------");
                Console.WriteLine(
                    $"{NTP_ES_NOMBRE}: {MisFavorites[i].Name ?? "unknown"}:" +
                    $"{NTP_ES_ALTURA}: {MisFavorites[i].Height ?? 0}\n" +
                    $"{NTP_ES_MASA}: {MisFavorites[i].Mass ?? 0}\n" +
                    $"{NTP_ES_GENERO}: {MisFavorites[i].Gender ?? "unknown"}\n" +
                    $"{NTP_ES_ESPECIE}: {MisFavorites[i].Species ?? "unknown"}\n" +
                    $"{NTP_ES_HOGAR}: {MisFavorites[i].Homeworld ?? "unknown"}\n" +
                    $"{NTP_ES_VEHICULO}: {ListToString(MisFavorites[i]?.Vehicles)}\n" +
                    $"{NTP_ES_NAVE_ESPACIAL}: {ListToString(MisFavorites[i]?.Starships)}\n"
                );
            }
            
            PrintCountCharacter();
            PrintWaitForPressKey();
            return;
        }
    }
}
