using System;
using System.IO;

// Importar static
using static PlantillaMenú.APIFavoriteList;
using static PlantillaMenú.APIControllers;
using static PlantillaMenú.Helpers;
using static PlantillaMenú.Views;

namespace PlantillaMenú
{
    internal class APILoadFavoriteListFromJson
    {
        public static void LoadFavoritesFromJson()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favorites.json");

                if (!File.Exists(filePath)) {   
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
