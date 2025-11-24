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
        private const string BaseUrl = "https://pokeapi.co/api/v2/pokemon";

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

        public static async Task GetAllPages()
        {
            string url = $"{BaseUrl}?limit=20&offset=0";

            int page = 1;

            while (!string.IsNullOrWhiteSpace(url))
            {
                HttpResponseMessage response = await GetHttpClient().GetAsync(url);
                if (!ValidatedHttpResponse(response))
                    return;

                string json = await response.Content.ReadAsStringAsync();
                PokemonListRoot data = JsonConvert.DeserializeObject<PokemonListRoot>(json);

                if (data?.Results == null || data.Results.Count == 0)
                    break;

                PrintPokemonListPage(data, page);

                url = data.Next;
                page++;
            }

            PrintWaitForPressKey();
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
