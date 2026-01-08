
namespace APIStarWarsIA
{
    internal class APIDelete
    {
        public static void Delete()
        {
            Console.WriteLine(string.Format(removeFavoriteMsg, NTP_ES_CHARACTER.ToUpper()));
            
            Console.Write(string.Format(removeToIndexMsg, NTP_ES_CHARACTER));
            string? input = Console.ReadLine();
            int index = ValidateInput(input);
            if(!isValidateInputString(input)) return; // -1 = Entrada no valida

            emptyList(MisFavorites); // Lista vacia
            index = OutOfRange(MisFavorites, index); // < 1 o > count
            if(index == -1) return;

            int indexList = index -1; // Igualamos el index a la posicion en la lista
            var itemFavorite = MisFavorites[indexList];
            
            Console.Write(string.Format(confirmationRemoveFavoriteMsg, NTP_ES_CHARACTER, itemFavorite.Name ?? "unknown"));
            string? confirmation = Console.ReadLine();
            if(!isValidateInputString(confirmation)) return;
            
            if(!confirmationSaveFavorite(confirmation)) return;
            
            MisFavorites.RemoveAt(indexList); // Esto es un metodo
            Console.WriteLine(string.Format(favoriteRemovedMsg, NTP_ES_CHARACTER, itemFavorite.Name ?? "unknown"));
            APISaveFavoriteList();
            PrintWaitForPressKey();
        }
    }
}