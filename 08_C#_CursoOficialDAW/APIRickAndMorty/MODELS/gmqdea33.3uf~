using Newtonsoft.Json;
using System.Collections.Generic;
using System.Net.Http;

namespace APIRickAndMorty
{
    internal class Models
    {
        // Nombre de la clase, propiedades de la API (personaje)
        public class ClassCharacter
        {
            [JsonProperty("id")]
            public int Id { get; set; }

            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("status")]
            public string Status { get; set; }

            [JsonProperty("species")]
            public string Species { get; set; }

            [JsonProperty("type")]
            public string Type { get; set; }

            [JsonProperty("gender")]
            public string Gender { get; set; }

            [JsonProperty("origin")]
            public Origin Origin { get; set; }

            [JsonProperty("location")]
            public Location Location { get; set; }

            [JsonProperty("image")]
            public string Image { get; set; }
        }

        // Info de la API (count, pages, next, prev)
        public class Info
        {
            [JsonProperty("count")]
            public int Count { get; set; }

            [JsonProperty("pages")]
            public int Pages { get; set; }

            [JsonProperty("next")]
            public string Next { get; set; }

            [JsonProperty("prev")]
            public string Prev { get; set; }
        }

        // Raíz del JSON que devuelve la API: info + results
        public class ClassRoot
        {
            [JsonProperty("info")]
            public Info Info { get; set; }

            [JsonProperty("results")]
            public List<ClassCharacter> ResultsList { get; set; } = new List<ClassCharacter>();
        }

        public class Origin
        {
            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("url")]
            public string Url { get; set; }
        }

        public class Location
        {
            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("url")]
            public string Url { get; set; }
        }

        // HttpClient
        public static class GetHttpClient
        {
            private static readonly HttpClient client = new HttpClient();
            public static HttpClient CreateHttpClient() => client;
        }

        // Modelo de la lista de favoritos
        public class FavoriteItemList
        {
            public int Id { get; set; }

            public string Name { get; set; }

            public string Status { get; set; }

            public string Species { get; set; }

            public string Type { get; set; }

            public string Gender { get; set; }

            public Origin Origin { get; set; }

            public Location Location { get; set; }

            public string Image { get; set; }
        }
    }
}
