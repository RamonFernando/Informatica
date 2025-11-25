using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace APIDogAPI.MODELS
{
    internal class Models
    {
    }
    // Modelo genérico para respuestas de la Dog API con un tipo de mensaje T
    public class DogApiResponse<T>
    {
        [JsonProperty("message")]
        public T Message { get; set; }

        [JsonProperty("status")]
        public string Status { get; set; }
    }

    // Modelo específico para la lista de razas (message es un diccionario raza -> lista de subrazas)
    public class BreedsListResponse
    {
        [JsonProperty("message")]
        public Dictionary<string, List<string>> Breeds { get; set; }

        [JsonProperty("status")]
        public string Status { get; set; }
    }

    // Modelo para respuestas que devuelven una lista de URLs de imágenes
    public class ImagesListResponse
    {
        [JsonProperty("message")]
        public List<string> Images { get; set; }

        [JsonProperty("status")]
        public string Status { get; set; }
    }

    // Modelo para respuestas que devuelven una única URL de imagen
    public class SingleImageResponse
    {
        [JsonProperty("message")]
        public string ImageUrl { get; set; }

        [JsonProperty("status")]
        public string Status { get; set; }
    }

    // Modelo que representa un perro favorito guardado en disco
    public class FavoriteDog
    {
        public string Breed { get; set; }
        public string SubBreed { get; set; }
        public string ImageUrl { get; set; }
    }
}
