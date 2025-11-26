using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace APIDigimon
{
    // Nombre de la clase, propiedades de la API (Digimon)
    public static class Models
    {
        public class ClassDigimon
        {

            public int Id { get; set; }

            public string Name { get; set; }

        }
        public class Levels
        {
            public static int Id { get; set; }
            public static int Level { get; set; }

        }
        public class Types
        {
            public static int Id { get; set; }
            public static string Type { get; set; }
        }

        // Raíz del JSON que devuelve la API: info + results
        public class ClassRoot
        {
            public List<FavoriteItemList> FavoriteList { get; set; } = new List<FavoriteItemList>();
        }


        // Modelo de la lista de favoritos
        public class FavoriteItemList
        {
            public int Id { get; set; }

            public string Name { get; set; }

            public string Type { get; set; }

            public string Level { get; set; }

        }
    }
}
