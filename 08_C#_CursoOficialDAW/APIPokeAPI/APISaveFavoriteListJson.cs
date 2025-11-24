using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using static APIPokeAPI.Views;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.Helpers;

namespace APIPokeAPI
{
    internal class APISaveFavoriteListJson
    {
        public static void SaveFavoritesToJson()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favorites_pokemon.json");

                string json = FormattedJsonFavoriteList(FavoriteList);

                File.WriteAllText(filePath, json);

                PrintSaveToJson(filePath);
            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        }

        public static void PrintSaveToJson(string filePath) =>
            Console.WriteLine($"Favoritos guardados en: {filePath}");
    }
}

