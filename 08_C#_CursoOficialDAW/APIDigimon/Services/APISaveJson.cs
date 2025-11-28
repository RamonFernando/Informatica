using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static APIDigimon.Models;
using static APIDigimon.Controllers;

using static APIDigimon.Program;


namespace APIDigimon
{
    internal class APISaveJson
    {
        public static void APISaveFavoriteList() {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteList.json");

                var json = JsonConvert.SerializeObject(favoriteLists, Formatting.Indented);

                File.WriteAllText(filePath, json);
                Console.WriteLine("Operacion realizada con exito");

                Console.WriteLine(json);
            
            }catch(Exception ex) {
                HandlerException(ex);
            }
        } // APISaveFavoriteList
    }
}
