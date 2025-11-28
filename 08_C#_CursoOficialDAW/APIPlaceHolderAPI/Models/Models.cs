using Newtonsoft.Json;

namespace APIPlaceHolderAPI
{
    public class Models
    {

        // Nombre de la clase, propiedades de la API

        // 1. Clase Digimon (objeto modelo)
        public class ClassTask
        {
            [JsonProperty("userId")]
            public int UserId { get; set; }

            [JsonProperty("id")]
            public int Id { get; set; }

            [JsonProperty("title")]
            public string Title { get; set; }

            [JsonProperty("completed")]
            public bool Completed { get; set; }

        }

        // 2. Modelo de la lista de favoritos
        public class FavoriteItemList // *poner atributos del metodo AddToFavoriteList y ShowFavoriteList*
        {
            [JsonProperty("userId")]
            public int UserId { get; set; }

            [JsonProperty("id")]
            public int Id { get; set; }

            [JsonProperty("title")]
            public string Title { get; set; }

            [JsonProperty("completed")]
            public bool Completed { get; set; }

        }
    } // Fin de la clase
}

