using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using APIDogAPI.HELPERS;
using APIDogAPI.VIEWS;
using APIDogAPI.MODELS;

namespace APIDogAPI.CONTROLLERS
{
    internal static class SearchController
    {
        // Busca razas por nombre aproximado usando Levenshtein y muestra coincidencias
        public static async Task SearchBreedByApproximateName()
        {
            Views.Views.PrintAskBreed();
            string input = Helpers.Helpers.ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(input))
            {
                Views.Views.PrintInvalidOption();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            var data = await DogApiController.GetAllBreedsAsync();
            if (data?.Breeds == null || data.Breeds.Count == 0)
            {
                Views.Views.PrintNoData();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            List<(string Name, int Score)> matches = new List<(string Name, int Score)>();

            foreach (var breed in data.Breeds.Keys)
            {
                int score = Helpers.Helpers.LevenshteinDistance(input, breed.ToLower());
                if (score <= 3) // Umbral de similitud (cuanto menor, más parecido)
                    matches.Add((breed, score));
            }

            if (matches.Count == 0)
            {
                Views.Views.PrintNotFoundBreed();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            var ordered = matches.OrderBy(m => m.Score).ToList();

            Console.Clear();
            Console.WriteLine($"Resultados aproximados para '{input}':");
            Views.Views.PrintApproximateMatches(ordered);
            Views.Views.PrintWaitForPressKey();
        }
    }
}