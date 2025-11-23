using System;
using System.IO;

// Importar static
using static PlantillaMenú.APIFavoriteList;
using static PlantillaMenú.APIControllers;
using static PlantillaMenú.Helpers;
using static PlantillaMenú.Views;

namespace PlantillaMenú
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
