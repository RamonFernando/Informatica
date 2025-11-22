using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Importar static
using static PlantillaMenú.APIFavoriteList;
using static PlantillaMenú.MenuControllers;
using static PlantillaMenú.APIControllers;
using static PlantillaMenú.APIFiltersControllers;
using static PlantillaMenú.Models;

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

                Console.WriteLine($"Favoritos guardados en: {filePath}");
            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        }

    }
}
