using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.Helpers;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.Models;
using static APIPokeAPI.Views;

namespace APIPokeAPI
{
    internal class APIFiltersControllers
    {
        public static async Task SearchById()
        {
            PrintSearchById();
            string id = ReadInput();

            if (ValidateIsNumberId(id) == -1)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            var response = await GetRequestById(id);
            if (!ValidatedHttpResponse(response))
                return;

            string json = await GetJson(response);
            var pokemon = DeserializedPokemon(json);

            if (!ValidatePokemon(pokemon))
                return;

            PrintPokemon(pokemon);

            PrintAskAddToFavoriteList();
            var confirm = ConfirmOperationFavoriteList(ReadInputUpper());
            if (!confirm)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            if (!Add(pokemon.Id, pokemon)) {   
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }
            PrintSuccessOperation();
            PrintWaitForPressKey();
        }

        public static async Task SearchByName()
        {
            PrintSearchByName();
            string name = ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(name))
            {
                PrintInvalidOption();
                PrintWaitForPressKey();
                return;
            }

            string url = $"{BaseUrl}/{name}";
            HttpResponseMessage response = await GetHttpClient().GetAsync(url);

            if (!response.IsSuccessStatusCode)
            {
                PrintNotFound();
                PrintWaitForPressKey();
                return;
            }

            string json = await response.Content.ReadAsStringAsync();
            Pokemon pokemon = JsonConvert.DeserializeObject<Pokemon>(json);

            if (pokemon == null || pokemon.Id <= 0)
            {
                PrintNotFound();
                PrintWaitForPressKey();
                return;
            }

            PrintPokemon(pokemon);

            PrintAskAddToFavoriteList();
            if (!ConfirmOperationFavoriteList(ReadInputUpper()))
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            Add(pokemon.Id, pokemon);
            PrintSuccessOperation();
            PrintWaitForPressKey();
        }

        public static async Task<HttpResponseMessage> GetRequestById(string id) =>
            await GetHttpClient().GetAsync($"{GetUrl()}/{id}");

        public static async Task<HttpResponseMessage> GetRequestByName(string name) =>
            await GetHttpClient().GetAsync($"{GetUrl()}/{name.ToLower()}");

        public static bool ValidatePokemon(Pokemon pokemon)
        {
            if (pokemon == null || pokemon.Id <= 0)
            {
                PrintNotFound();
                PrintWaitForPressKey();
                return false;
            }

            return true;
        }

        public static async Task SearchByApproximateName()
        {
            PrintSearchByName();
            string input = ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(input))
            {
                PrintInvalidOption();
                PrintWaitForPressKey();
                return;
            }

            var listItems = await GetAllPokemonListFull();
            var matches = new List<(string Name, int Score)>();

            foreach (var item in listItems)
            {
                int score = LevenshteinDistance(input, item.Name.ToLower());
                if (score <= 3)
                    matches.Add((item.Name, score));
            }

            if (matches.Count == 0)
            {
                PrintNotFound();
                PrintWaitForPressKey();
                return;
            }

            var ordered = matches.OrderBy(m => m.Score).ToList();

            PrintResultSearch(input);           
            PrintApproximateMatches(ordered);   // Muestra los resultados aproximados

            PrintWaitForPressKey();
        }



    }
}
