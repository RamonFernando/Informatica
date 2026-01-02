
namespace APICountriesIA
{
    internal class APIDelete
    {
        public static void Delete()
        {
            Console.WriteLine(string.Format(removeFavoriteMsg, NAME_PROP.ToUpper()));
            
            Console.Write(string.Format(removeToIndexMsg, NAME_PROP));
            string? input = Console.ReadLine();
            int index = ValidateInput(input);
            ValidateInputString(input); // -1 = Entrada no valida

            emptyList(MisFavorites); // Lista vacia
            index = OutOfRange(MisFavorites, index); // < 1 o > count
            if(index == -1) return;

            int indexList = index -1; // Igualamos el index a la posicion en la lista
            var itemFavorite = MisFavorites[indexList];
            
            Console.Write(string.Format(confirmationRemoveFavoriteMsg, NAME_PROP, itemFavorite.Name?.Common ?? "unknown"));
            string? confirmation = Console.ReadLine();
            ValidateInputString(confirmation);
            
            if(!confirmationSaveFavorite(confirmation)) return;
            
            MisFavorites.RemoveAt(indexList);
            Console.WriteLine(string.Format(favoriteRemovedMsg, NAME_PROP, itemFavorite.Name?.Common ?? "unknown"));
            APISaveFavoriteList();
            PrintWaitForPressKey();
        }
    }
}