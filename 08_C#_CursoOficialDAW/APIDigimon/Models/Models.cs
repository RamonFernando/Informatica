using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

// Modelo de la API
// 1. (20) ClaseDigimon (id, name)
// 2. (30) Levels (id, level)
// 3. (38) Types (id, type)
// 4. (45) ClassRoot (Lista de favoritos: favoriteList)
// 5. (52) FavoriteItemList (id, name, type, level)

namespace APIDigimon
{
    // Nombre de la clase, propiedades de la API (Digimon)
    public static class Models
    {
        // 1. Clase Digimon
        public class ClassDigimon
        {

            public int Id { get; set; }

            public string Name { get; set; }

        }

        // 2. Level
        public class Levels
        {
            public static int Id { get; set; }
            public static int Level { get; set; }

        }

        // 3. Type
        public class Types
        {
            public static int Id { get; set; }
            public static string Type { get; set; }
        }

        // 4. Root Lista de favoritos
        public class ClassRoot
        {
            public static List<FavoriteItemList> FavoriteList { get; set; } = new List<FavoriteItemList>();
        }

        // 5. Modelo de la lista de favoritos
        public class FavoriteItemList // *poner atributos del metodo AddToFavoriteList y ShowFavoriteList*
        {
            public int Id { get; set; }

            public string Name { get; set; }

            public string Type { get; set; }

            public string Level { get; set; }

        }
    } // Fin de la clase
}
