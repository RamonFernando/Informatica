using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Newtonsoft.Json;


using static APIPokeAPI.Views;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.APILoadFavoriteListFromJson;
using static APIPokeAPI.APISaveFavoriteListJson;
using static APIPokeAPI.Helpers;
using static APIPokeAPI.Program;
using static APIPokeAPI.Models;

namespace APIPokeAPI
{
    internal class APIFavoriteListController
    {
        public static List<FavoriteItem> FavoriteList { get; set; } = new List<FavoriteItem>();

        public static async Task RequestAddToFavoriteList()
        {
            PrintAskId();
            string input = ReadInput();

            int num = ValidateIsNumberId(input);
            if (num == -1)
            {
                PrintInvalidOption();
                PrintWaitForPressKey();
                return;
            }

            var response = await GetRequestById(input);
            if (!ValidatedHttpResponse(response))
                return;

            string json = await GetJson(response);
            var pokemon = DeserializedPokemon(json);

            if (!ValidatePokemon(pokemon))
                return;

            PrintAskAddToFavoriteList();
            var confirm = ConfirmOperationFavoriteList(ReadInputUpper());
            if (!confirm)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            Add(num, pokemon);
            PrintSuccessOperation();
            SaveFavoritesToJson();
            PrintWaitForPressKey();
        }

        public static void RequestRemoveToFavoriteList()
        {
            PrintAskIdToRemove();
            string input = ReadInput();

            int num = ValidateIsNumberId(input);
            if (num == -1)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            PrintAskRemoveToFavoriteList();
            var confirm = ConfirmOperationFavoriteList(ReadInputUpper());
            if (!confirm)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            Remove(num);
            SaveFavoritesToJson();
            PrintSuccessOperation();
            PrintWaitForPressKey();
        }

        public static bool Add(int id, Pokemon pokemon)
        {
            if (FavoriteList.Any(f => f.Id == id))
            {
                PrintDuplicateId(id);
                return false;
            }

            FavoriteList.Add(new FavoriteItem
            {
                Id = pokemon.Id,
                Name = pokemon.Name,
                Height = pokemon.Height,
                Weight = pokemon.Weight,
                Types = string.Join(", ", pokemon.Types?.Select(t => t.Type.Name) ?? Array.Empty<string>()),
                SpriteUrl = pokemon.Sprites?.FrontDefault
            });

            SaveFavoritesToJson();
            return true;
        }

        public static void Remove(int id)
        {
            var item = FavoriteList.FirstOrDefault(f => f.Id == id);
            if (item == null)
            {
                PrintNotFoundIdInList(id);
                return;
            }

            FavoriteList.Remove(item);
        }

        public static string FormattedJsonFavoriteList(List<FavoriteItem> favoriteList) =>
            JsonConvert.SerializeObject(favoriteList ?? new List<FavoriteItem>(), Formatting.Indented);

        public static List<FavoriteItem> DeserializedJsonFavoriteList(string json) =>
            JsonConvert.DeserializeObject<List<FavoriteItem>>(json) ?? new List<FavoriteItem>();

        public static void RequestClearFavoriteList()
        {
            PrintAskClearFavoriteList();
            string input = ReadInputUpper();

            if (string.IsNullOrWhiteSpace(input))
            {
                PrintResponseInvalidInput();
                return;
            }

            if (input != "S")
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            FavoriteList.Clear();
            SaveFavoritesToJson();
            PrintSuccessOperation();
            PrintWaitForPressKey();
        }
    }
}
