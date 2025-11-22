using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


// Importar static
using static PlantillaMenú.Models;
using static PlantillaMenú.APIFavoriteList;
using static PlantillaMenú.APIControllers;

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
                    Console.WriteLine("El archivo no existe.");
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
