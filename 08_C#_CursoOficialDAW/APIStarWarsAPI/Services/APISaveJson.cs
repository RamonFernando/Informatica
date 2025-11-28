using System;
using System.IO;
using Newtonsoft.Json;

using static APIStarWarsAPI.Program;
using static APIStarWarsAPI.APIControllers;

/*
 * Metodo de empleo
 * 1. Agregar Newtonsoft.Json
 * 2. Importar Program y APIControllers
 * 3. Agregar el metodo HandlerException
 */

namespace APIStarWarsAPI
{
    internal class APISaveJson
    {
        public static void APISaveFavoriteList()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteList.json");

                var json = JsonConvert.SerializeObject(favoriteList, Formatting.Indented);

                File.WriteAllText(filePath, json);
                Console.WriteLine("Operacion realizada con exito");

                Console.WriteLine(json);

            }
            catch (Exception ex)
            {
                HandlerException(ex);
            }
        } // APISaveFavoriteList
    }
}
