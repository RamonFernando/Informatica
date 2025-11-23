using Newtonsoft.Json;
using System.Net.Http;

namespace PlantillaMenú
{
    internal class Models
    {
        // Nombre de la clase, propiedades de la API
        public class NameClassAtributes
        {
            [JsonProperty("id")]
            public int Id { get; set; }
            [JsonProperty("advice")]
            public string Advice { get; set; }
        }
        public class NameClassContent
        {   
            [JsonProperty("slip")]
            public NameClassAtributes Slip { get; set; }
        }

        public static class GetHttpClient
        {
            private static readonly HttpClient client = new HttpClient();
            public static HttpClient CreateHttpClient() => client;
        }

        public class FavoriteItemList
        {
            public int Id { get; set; }
            public NameClassContent Content { get; set; }
        }           
    }
}
