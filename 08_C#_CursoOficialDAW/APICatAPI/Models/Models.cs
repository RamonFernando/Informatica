using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

// Models
// 1. Cat
// 2. Weight
// 3. Root Lista de favoritos
// 4. Modelo de la lista de favoritos

namespace APICatAPI
{
    internal class Models
    {   
        // 1. Cat
        public class ClassDigimon
        {

            [JsonProperty("Id")]
            public string Id { get; set; }

            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("origin")]
            public string Origin { get; set; }

            [JsonProperty("description")]
            public string Description { get; set; }

        }

        // 2. Weight
        public class Weight
        {
            [JsonProperty("imperial")]
            public static int Imperial { get; set; }

            [JsonProperty("metric")]
            public static int Metric { get; set; }

        }

        // 3. Root Lista de favoritos
        public class ClassRoot
        {
            public static List<FavoriteItemList> FavoriteList { get; set; } = new List<FavoriteItemList>();
        }

        // 4. Modelo de la lista de favoritos
        public class FavoriteItemList // *poner atributos del metodo AddToFavoriteList y ShowFavoriteList*
        {
            [JsonProperty("Id")]
            public string Id { get; set; }

            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("origin")]
            public string Origin { get; set; }

            [JsonProperty("description")]
            public string Description { get; set; }

        }
    } // Models
}
