using System;
using System.IO;
using Newtonsoft.Json;

using static APIPlaceHolderAPI.Program;
using static APIPlaceHolderAPI.APIControllers;

namespace APIPlaceHolderAPI
{
    internal class APISaveJson
    {
        public static void APISaveFavoriteList()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteListHolder.json");

                var json = JsonConvert.SerializeObject(favoriteList, Formatting.Indented);

                File.WriteAllText(filePath, json);
                Console.WriteLine("Operacion realizada con exito");

                Console.WriteLine(json);

            }
            catch (Exception ex)
            {
                HandlerException(ex);
                PrintWaitForPressKey();
            }
        } // APISaveFavoriteList
    } // APISaveJson
}
