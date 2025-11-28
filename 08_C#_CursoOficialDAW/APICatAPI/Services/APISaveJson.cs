using System;
using System.IO;
using Newtonsoft.Json;
using static APICatAPI.Controllers;
using static APICatAPI.Models;
using static APICatAPI.Program;

namespace APICatAPI
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
        }
    }
}
