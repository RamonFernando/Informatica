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
    internal class APISaveFavoriteListJson
    {
        public static void SaveFavoritesToJson()
        {
            try
            {
                // Ruta del archivo
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favorites.json");

                // Serializar la lista completa
                string json = FormattedJsonFavoriteList(FavoriteList);

                File.WriteAllText(filePath, json); // Escribir en el archivo

                PrintSaveToJson(filePath);
            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        }
    }
}
