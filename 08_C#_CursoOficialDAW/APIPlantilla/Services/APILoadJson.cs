using System;
using System.IO;
using System.Collections.Generic;
using Newtonsoft.Json;

using static APIPlantilla.Models;
using static APIPlantilla.Program;
using static APIPlantilla.APIControllers;

/*
 * Metodo de empleo
 * 1. Agregar Newtonsoft.Json
 * 2. Importar Program, APIControllers y Models
 * 3. Agregar el metodo HandlerException
 */

namespace APIPlantilla
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
                PrintWaitForPressKey();
            }
        } // APILoadFavoriteList
    } // APILoadJson
}
