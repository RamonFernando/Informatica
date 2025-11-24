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
    internal class APILoadFavoriteListFromJson
    {
        public static void LoadFavoritesFromJson()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favorites_pokemon.json");

                if (!File.Exists(filePath))
                {
                    PrintNoFile();
                    return;
                }

                string json = File.ReadAllText(filePath);

                FavoriteList = DeserializedJsonFavoriteList(json);
            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        }

        public static void PrintNoFile() =>
            Console.WriteLine("El archivo de favoritos aún no existe.");
    }
}
