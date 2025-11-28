using System;
using System.IO;
using System.Collections.Generic;
using Newtonsoft.Json;

using static APIPlaceHolderAPI.Models;
using static APIPlaceHolderAPI.Program;
using static APIPlaceHolderAPI.APIControllers;

namespace APIPlaceHolderAPI
{
    internal class APILoadJson
    {
        public static void APILoadFavoriteList()
        {
            try
            {
                string filePth = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteListHolder.json");

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
                PrintWaitForPressKey();
            }
        } // APILoadFavoriteList
    } // APILoadJson
}
