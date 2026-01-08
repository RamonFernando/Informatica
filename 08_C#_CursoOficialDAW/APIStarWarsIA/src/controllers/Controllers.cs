/*
MapCountryFromElement:  Mapea un JsonElement a un ApiItem
TrySaveFirstResult:     Intenta guardar el primer ApiItem en favoritos
 */
namespace APIStarWarsIA
{
    public class Controllers
    {
        // *Mapeo de un JsonElement a un ApiItem*
        public static ApiItem MapCountryFromElement(JsonElement element)
        {
            string name = GetStringProp(element, NTP_NAME);
            int height = GetIntProp(element, NTP_HEIGHT);
            int mass = GetIntProp(element,NTP_MASS);
            string gender = GetStringProp(element,NTP_GENDER);
            string species = GetStringFromArray(element,NTP_SPECIES);
            string homeworld = GetFirstStringFromArray(element,NTP_HOMEWORLD);
            List<string> vehicles = GetListFromArray(element,NTP_VEHICLES);
            List<string> starships = GetListFromArray(element,NTP_STARSHIPS);

            
            return new ApiItem
            {
                Name = name,
                Height = height,
                Mass = mass,
                Gender = gender,
                Species = species,
                Homeworld = homeworld,
                Vehicles = vehicles,
                Starships = starships
                
            };
        }

        // *Intentar añadir un ApiItem a favoritos*
        public static void TrySaveFirstResult(ApiItem? first)
        {
            if (first?.Name == null)
            {
                Console.WriteLine(cancelOperationMsg);
                PrintWaitForPressKey();
                return;
            }

            string name = first.Name;

            Console.Write(string.Format(confirmationSaveFavoriteMsg, NTP_ES_CHARACTER, name));
            string? respuesta = Console.ReadLine()?.Trim().ToLower();

            if (!confirmationSaveFavorite(respuesta)) return;

            if (!existsFavorite(name, MisFavorites)) return;

            MisFavorites.Add(first);
            APISaveFavoriteList();

            Console.WriteLine(string.Format(favoriteSavedMsg, NTP_ES_CHARACTER, name));
            // PrintWaitForPressKey();
        }
        
    }
}