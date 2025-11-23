using System;
using System.IO;

// Importar static
using static APIRickAndMorty.Program;
using static APIRickAndMorty.Models;
using static APIRickAndMorty.APIControllers;
using static APIRickAndMorty.APIFavoriteList;
using static APIRickAndMorty.APIFiltersControllers;
using static APIRickAndMorty.APILoadFavoriteListFromJson;
using static APIRickAndMorty.APISaveFavoriteListJson;
using static APIRickAndMorty.Helpers;
using static APIRickAndMorty.Views;

namespace APIRickAndMorty
{
    internal class APILoadFavoriteListFromJson
    {
        public static void LoadFavoritesFromJson()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favorites.json");

                if (!File.Exists(filePath))
                {
                    PrintNoFile();
                    return;
                }

                // Leer el archivo
                string json = File.ReadAllText(filePath);

                FavoriteList = DeserializedJsonFavoriteList(json); // APIFavoriteList
            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        }
    }
}
