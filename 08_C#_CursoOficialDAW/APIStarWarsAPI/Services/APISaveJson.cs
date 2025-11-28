using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using static APIStarWarsAPI.Program;
using static APIStarWarsAPI.APIControllers;

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
