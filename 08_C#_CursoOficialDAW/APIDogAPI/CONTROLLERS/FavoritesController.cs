using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using APIDogAPI.MODELS;
using APIDogAPI.SERVICES;
using APIDogAPI.VIEWS;
using APIDogAPI.HELPERS;

namespace APIDogAPI.CONTROLLERS
{
    internal static class FavoritesController
    {
        // Lista de favoritos mantenida en memoria
        private static List<FavoriteDog> _favorites = new List<FavoriteDog>();

        // Devuelve la lista de favoritos actual
        public static List<FavoriteDog> GetFavorites() => _favorites;

        // Carga los favoritos desde el archivo JSON al iniciar el programa
        public static void LoadFavoritesFromJson()
        {
            _favorites = FavoriteStorageService.LoadFavorites();
        }

        // Guarda los favoritos actuales en el archivo JSON
        public static void SaveFavoritesToJson()
        {
            FavoriteStorageService.SaveFavorites(_favorites);
        }

        // Agrega un nuevo favorito recibiendo raza, subraza e imagen
        public static void AddFavorite(string breed, string subBreed, string imageUrl)
        {
            _favorites.Add(new FavoriteDog
            {
                Breed = breed,
                SubBreed = subBreed,
                ImageUrl = imageUrl
            });
            SaveFavoritesToJson();
        }

        // Muestra la lista de favoritos en consola
        public static void ShowFavorites()
        {
            Views.PrintFavoritesList(_favorites);
            Views.PrintWaitForPressKey();
        }

        // Permite eliminar un favorito eligiéndolo por índice
        public static void RemoveFavorite()
        {
            if (_favorites.Count == 0)
            {
                Views.PrintNotFoundFavorite();
                Views.PrintWaitForPressKey();
                return;
            }

            Views.PrintFavoritesList(_favorites);
            Console.Write("Seleccione el número del favorito a eliminar: ");
            string input = Helpers.ReadInput();

            int index = Helpers.ValidateIndexSelection(input, _favorites.Count);
            if (index == -1)
            {
                Views.PrintInvalidOption();
                Views.PrintWaitForPressKey();
                return;
            }

            var fav = _favorites[index - 1];

            Views.PrintAskRemoveFavorite();
            if (!Helpers.Confirm(Helpers.ReadInputUpper()))
            {
                Views.PrintCancelOperation();
                Views.PrintWaitForPressKey();
                return;
            }

            _favorites.Remove(fav);
            SaveFavoritesToJson();
            Views.PrintSuccessOperation();
            Views.PrintWaitForPressKey();
        }

        // Elimina todos los favoritos tras confirmación del usuario
        public static void ClearFavorites()
        {
            if (_favorites.Count == 0)
            {
                Views.PrintNotFoundFavorite();
                Views.PrintWaitForPressKey();
                return;
            }

            Views.PrintAskClearFavorites();
            if (!Helpers.Confirm(Helpers.ReadInputUpper()))
            {
                Views.PrintCancelOperation();
                Views.PrintWaitForPressKey();
                return;
            }

            _favorites.Clear();
            SaveFavoritesToJson();
            Views.PrintSuccessOperation();
            Views.PrintWaitForPressKey();
        }

        // Solicita una raza, obtiene una imagen aleatoria y permite guardarla como favorito
        public static async Task AddFavoriteFromRandomImage()
        {
            Views.PrintAskBreed();
            string breed = Helpers.ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(breed))
            {
                Views.PrintInvalidOption();
                Views.PrintWaitForPressKey();
                return;
            }

            string imageUrl = await DogApiController.GetSingleRandomImageByBreedAsync(breed);
            if (string.IsNullOrWhiteSpace(imageUrl))
            {
                Views.PrintNoData();
                Views.PrintWaitForPressKey();
                return;
            }

            Console.Clear();
            Console.WriteLine($"Imagen obtenida para la raza '{breed}':");
            Views.PrintImageUrl(imageUrl);

            Views.PrintAskAddFavorite();
            if (!Helpers.Confirm(Helpers.ReadInputUpper()))
            {
                Views.PrintCancelOperation();
                Views.PrintWaitForPressKey();
                return;
            }

            AddFavorite(breed, null, imageUrl);
            Views.PrintSuccessOperation();
            Views.PrintWaitForPressKey();
        }
    }
}
