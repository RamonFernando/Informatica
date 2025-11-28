using System;
using System.IO;
using System.Collections.Generic;
using Newtonsoft.Json;

using static APICountriesAPI.Models;
using static APICountriesAPI.Program;
using static APICountriesAPI.APIControllers;

/*
 * Metodo de empleo
 * 1. Agregar Newtonsoft.Json
 * 2. Importar Program, APIControllers y Models
 * 3. Agregar el metodo HandlerException
 */

namespace APICountriesAPI
{
    internal class APILoadJson
    {
        public static void APILoadFavoriteList()
        {
            try
            {
                string filePth = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteListCountries.json");

                // Comprobamos si el archivo existe
                if (!File.Exists(filePth))
                {
                    Console.WriteLine("No se ha encontrado el archivo de favoriteListCountries.json, se creara uno nuevo.");
                    PrintWaitForPressKey();
                    return;
                }

                // Leemos el archivo
                string json = File.ReadAllText(filePth);

                try
                {
                    // Intentamos cargar el JSON de forma normal
                    favoriteList = JsonConvert.DeserializeObject<List<FavoriteItemList>>(json);

                    // Si favoriteList es null, regeneramos archivo vacío
                    if (favoriteList == null)
                    {
                        favoriteList = new List<FavoriteItemList>();
                        File.WriteAllText(filePth, "[]");
                    }
                }
                catch
                {
                    // AUTO-REPARACIÓN:
                    // Si da error de conversión -> el archivo es viejo o corrupto
                    Console.WriteLine("\nEl archivo de favoritos no coincide con el nuevo formato.");
                    Console.WriteLine("Se regenerará automáticamente.\n");

                    favoriteList = new List<FavoriteItemList>();
                    File.WriteAllText(filePth, "[]");
                }

            }
            catch (Exception ex)
            {
                HandlerException(ex);
                PrintWaitForPressKey();
            }
        } // APILoadFavoriteList
    } // APILoadJson 
}
