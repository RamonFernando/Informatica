using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static APIPokeAPI.Views;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.Helpers;

namespace APIPokeAPI
{
    internal class Models
    {
        public class PokemonListRoot
        {
            [JsonProperty("count")]
            public int Count { get; set; }

            [JsonProperty("next")]
            public string Next { get; set; }

            [JsonProperty("previous")]
            public string Previous { get; set; }

            [JsonProperty("results")]
            public List<PokemonListItem> Results { get; set; } = new List<PokemonListItem>();
        }

        public class PokemonListItem
        {
            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("url")]
            public string Url { get; set; }
        }

        public class Pokemon
        {
            [JsonProperty("id")]
            public int Id { get; set; }

            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("height")]
            public int Height { get; set; }

            [JsonProperty("weight")]
            public int Weight { get; set; }

            [JsonProperty("types")]
            public List<PokemonTypeSlot> Types { get; set; } = new List<PokemonTypeSlot>();

            [JsonProperty("sprites")]
            public PokemonSprites Sprites { get; set; }
        }

        public class PokemonTypeSlot
        {
            [JsonProperty("slot")]
            public int Slot { get; set; }

            [JsonProperty("type")]
            public PokemonType Type { get; set; }
        }

        public class PokemonType
        {
            [JsonProperty("name")]
            public string Name { get; set; }

            [JsonProperty("url")]
            public string Url { get; set; }
        }

        public class PokemonSprites
        {
            [JsonProperty("front_default")]
            public string FrontDefault { get; set; }
        }

        public class FavoriteItem
        {
            public int Id { get; set; }

            public string Name { get; set; }

            public int Height { get; set; }

            public int Weight { get; set; }

            public string Types { get; set; }

            public string SpriteUrl { get; set; }
        }
    }
}
