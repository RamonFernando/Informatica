using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;
using static APICatAPI.Models;
using static APICatAPI.Controllers;
using static APICatAPI.Program;

namespace APICatAPI
{
    internal class APILoadJson
    {
        public static void APILoadFavoriteList()
        {
            try
            {
                string filePth = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteList.json");

                // Comprobamos si el archivo existe
                if (!File.Exists(filePth))
                {
                    Console.WriteLine("No se ha encontrado el archivo de favoriteList.json, se creara uno nuevo.");
                    PrintWaitForPressKey();
                    return;
                }

                // Leemos el archivo
                string json = File.ReadAllText(filePth);

                favoriteList = JsonConvert.DeserializeObject<List<FavoriteItemList>>(json); // Convierte el JSON en una lista

            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        } // APILoadFavoriteList
    }
}
