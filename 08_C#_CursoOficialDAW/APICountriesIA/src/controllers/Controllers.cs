/*
MapCountryFromElement:  Mapea un JsonElement a un ApiItem
TrySaveFirstResult:     Intenta guardar el primer ApiItem en favoritos
 */
namespace APICountriesIA
{
    public class Controllers
    {
        // *Mapeo de un JsonElement a un ApiItem*
        public static ApiItem MapCountryFromElement(JsonElement element)
        {
            var nameObj = GetObjectProps(element, $"{NTP_NAME}.{NTP_COMMON}", $"{NTP_NAME}.{NTP_OFFICIAL}");

            string common = nameObj[$"{NTP_NAME}.{NTP_COMMON}"]?.ToString() ?? "unknown";
            string official = nameObj[$"{NTP_NAME}.{NTP_OFFICIAL}"]?.ToString() ?? "unknown";

            string capital = GetFirstStringFromArray(element, NTP_CAPITAL);
            string region = GetStringProp(element, NTP_REGION);

            Dictionary<string, string> languagesDict = GetObjectPropAsDictionary(element, NTP_LANGUAGE);

            long population = GetIntProp(element, NTP_POPULATION);

            return new ApiItem
            {
                Name = new CountryName
                {
                    Common = common,
                    Official = official
                },
                Capital = new List<string> { capital },
                Region = region,
                Languages = languagesDict,
                Population = population
            };
        }

        // *Intentar añadir un ApiItem a favoritos*
        public static void TrySaveFirstResult(ApiItem? first)
        {
            if (first?.Name?.Common == null)
            {
                Console.WriteLine(cancelOperationMsg);
                PrintWaitForPressKey();
                return;
            }

            string common = first.Name.Common;

            Console.Write(string.Format(confirmationSaveFavoriteMsg, NAME_PROP, common));
            string? respuesta = Console.ReadLine()?.Trim().ToLower();

            if (!confirmationSaveFavorite(respuesta)) return;

            if (!existsFavorite(common, MisFavorites)) return;

            MisFavorites.Add(first);
            APISaveFavoriteList();

            Console.WriteLine(string.Format(favoriteSavedMsg, NAME_PROP, common));
            PrintWaitForPressKey();
        }
        
    }
}