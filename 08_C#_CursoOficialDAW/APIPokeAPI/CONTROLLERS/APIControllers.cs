using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using Newtonsoft.Json;
using System.Threading.Tasks;
using static APIPokeAPI.Views;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.Helpers;
using static APIPokeAPI.Models;

namespace APIPokeAPI
{
    internal class APIControllers
    {
        public const string BaseUrl = "https://pokeapi.co/api/v2/pokemon";

        public static string GetUrl() => BaseUrl;

        public static async Task ExecuteHttpRequest()
        {
            string url = $"{BaseUrl}?limit=20&offset=0";

            HttpResponseMessage response = await GetHttpClient().GetAsync(url);
            if (!ValidatedHttpResponse(response))
                return;

            string json = await response.Content.ReadAsStringAsync();
            PokemonListRoot data = JsonConvert.DeserializeObject<PokemonListRoot>(json);

            if (data?.Results == null || data.Results.Count == 0)
            {
                PrintNoData();
                PrintWaitForPressKey();
                return;
            }

            PrintPokemonListPage(data);
            PrintWaitForPressKey();
        }

        public static async Task<List<Pokemon>> GetAllPokemonFullList()
        {
            List<Pokemon> fullList = new List<Pokemon>();
            List<PokemonListItem> listItems = await GetAllPokemonList();

            foreach (var item in listItems)
            {
                var pokemon = await GetPokemonFull(item.Url);
                if (pokemon != null)
                    fullList.Add(pokemon);
            }

            return fullList;
        }

        public static async Task<List<PokemonListItem>> GetAllPokemonListFull()
        {
            string url = $"{BaseUrl}?limit=2000&offset=0";

            HttpResponseMessage response = await GetHttpClient().GetAsync(url);

            if (!response.IsSuccessStatusCode)
                return new List<PokemonListItem>();

            string json = await response.Content.ReadAsStringAsync();
            PokemonListRoot data = JsonConvert.DeserializeObject<PokemonListRoot>(json);

            return data?.Results ?? new List<PokemonListItem>();
        }


        public static async Task GetAllPages()
        {
            var listItems = await GetAllPokemonList();

            if (listItems.Count == 0)
            {
                PrintNoData();
                PrintWaitForPressKey();
                return;
            }

            PaginateIndex(listItems.Count, 20, pageIndex =>
            {
                LoadPokemonPage(pageIndex, 20).Wait();
            });

            PrintWaitForPressKey();
        }

        public static async Task<List<PokemonListItem>> GetAllPokemonList()
        {
            List<PokemonListItem> all = new List<PokemonListItem>();

            string url = $"{GetUrl()}?limit=20&offset=0";

            while (!string.IsNullOrWhiteSpace(url))
            {
                HttpResponseMessage response = await GetHttpClient().GetAsync(url);
                if (!ValidatedHttpResponse(response))
                    break;

                string json = await response.Content.ReadAsStringAsync();
                PokemonListRoot data = JsonConvert.DeserializeObject<PokemonListRoot>(json);

                if (data?.Results == null)
                    break;

                all.AddRange(data.Results);

                url = data.Next;
            }

            return all;
        }
        public static async Task<Pokemon> GetPokemonFull(string url)
        {
            HttpResponseMessage response = await GetHttpClient().GetAsync(url);
            if (!ValidatedHttpResponse(response))
                return null;

            string json = await response.Content.ReadAsStringAsync();
            return JsonConvert.DeserializeObject<Pokemon>(json);
        }
        public static async Task LoadPokemonPage(int pageIndex, int pageSize)
        {
            int start = pageIndex * pageSize;

            var listItems = await GetAllPokemonList();

            var page = listItems
                .Skip(start)
                .Take(pageSize)
                .ToList();

            foreach (var item in page)
            {
                var pokemon = await GetPokemonFull(item.Url);
                if (pokemon != null)
                {
                    PrintPokemon(pokemon);
                    PrintOnlyLane();
                }
            }
        }

        public static bool ValidatedHttpResponse(HttpResponseMessage response)
        {
            if (!response.IsSuccessStatusCode)
            {
                Console.WriteLine(
                    $"Error en la petición HTTP:" +
                    $"\nCódigo: {response.StatusCode}" +
                    $"\nInfo: {response.ReasonPhrase}");
                return false;
            }
            return true;
        }

        public static async Task<string> GetJson(HttpResponseMessage response) =>
            await response.Content.ReadAsStringAsync();

        public static Pokemon DeserializedPokemon(string json) =>
            JsonConvert.DeserializeObject<Pokemon>(json);

        // Manejo de excepciones
        public static void HandlerException(Exception ex)
        {
            if (ex is HttpRequestException httpEx)
            {
                Console.WriteLine($"Error en la petición HTTP:\n{httpEx.Message}\n{httpEx.HResult}");
                return;
            }

            if (ex is JsonException jsonEx)
            {
                Console.WriteLine($"Error al procesar JSON:\n{jsonEx.Message}\n{jsonEx.HResult}");
                return;
            }

            if (ex is TaskCanceledException taskEx)
            {
                Console.WriteLine($"Petición cancelada (timeout):\n{taskEx.Message}\n{taskEx.HResult}");
                return;
            }

            if (ex is FormatException formatEx)
            {
                Console.WriteLine($"Error de formato:\n{formatEx.Message}\n{formatEx.HResult}");
                return;
            }

            if (ex is ArgumentException argEx)
            {
                Console.WriteLine($"Argumento inválido:\n{argEx.Message}\n{argEx.HResult}");
                return;
            }

            if (ex is NullReferenceException nullEx)
            {
                Console.WriteLine($"Referencia nula:\n{nullEx.Message}\n{nullEx.HResult}");
                return;
            }

            Console.WriteLine($"Error desconocido:\n{ex.Message}\n{ex.HResult}");
        }
    }
}
