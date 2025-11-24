using System;
using System.IO;

// Importar static
using static APIRickAndMorty.APIControllers;
using static APIRickAndMorty.APIFavoriteList;
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

                if (!File.Exists(filePath)) { // Verificar si el archivo existe
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
