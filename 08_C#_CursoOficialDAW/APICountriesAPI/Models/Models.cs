using System.Collections.Generic;
using Newtonsoft.Json;

namespace APICountriesAPI
{
    internal class Models
    {
        // Nombre de la clase, propiedades de la API

        // 1. Clase Coountrie (objeto modelo)
        public class ClassCountrieName
        {
            [JsonProperty("name")]
            public ClassName Name { get; set; }

        }

        // 2. Name
        public class ClassName
        {
            [JsonProperty("common")]
            public string Common { get; set; }

            [JsonProperty("official")]
            public string Official { get; set; }

        }

        // 4. Lista de favoritos
        public class FavoriteList
        {
            public ClassName Name { get; set; }
        }

        // 5. Modelo de la lista de favoritos
        public class FavoriteItemList // *poner atributos del metodo AddToFavoriteList y ShowFavoriteList*
        {   
            [JsonProperty("name")]
            public ClassName Name { get; set; }

            [JsonProperty("common")]
            public string Common { get; set; }

            [JsonProperty("official")]
            public string Official { get; set; }

        }
    }
}
