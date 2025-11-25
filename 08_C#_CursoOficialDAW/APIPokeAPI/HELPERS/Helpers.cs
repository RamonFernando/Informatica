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
    internal class Helpers
    {
        public static int? ValidateInput(string input)
        {
            if (!int.TryParse(input, out int opc) || opc < 0 || opc > 8)
            {
                Console.WriteLine("Opción no válida.");
                Console.WriteLine("Presione cualquier tecla para continuar...");
                Console.ReadKey();
                return null;
            }
            return opc;
        }

        public static int ValidateIsNumberId(string input)
        {
            if (!int.TryParse(input, out int num))
            {
                Console.WriteLine("El valor ingresado no es válido.");
                return -1;
            }
            return num;
        }

        public static string ReadInput() => Console.ReadLine();

        public static string ReadInputUpper() => Console.ReadLine().Trim().ToUpper();

        public static bool ConfirmOperationFavoriteList(string input)
        {
            if (string.IsNullOrWhiteSpace(input))
                return false;

            return input.Trim().ToUpper() == "S";
        }

        // Paginado
        public static void PaginateIndex(int totalItems, int pageSize, Action<int> LoadPageAction)
        {
            int currentPage = 0;
            int totalPages = (int)Math.Ceiling(totalItems / (double)pageSize);

            while (true)
            {
                Console.Clear();
                PrintCountPagesAll(currentPage + 1, totalPages);

                // carga la página actual (20 Pokémon completos)
                LoadPageAction(currentPage);

                PrintSelectOption();
                string key = Console.ReadKey(true).Key.ToString().ToUpper();

                if (key == "N" && currentPage < totalPages - 1)
                    currentPage++;
                else if (key == "B" && currentPage > 0)
                    currentPage--;
                else if (key == "Q")
                    break;
            }
        }

        // Metodo de busqueda avanzada por nombre 
        public static int LevenshteinDistance(string a, string b)
        {
            int[,] dp = new int[a.Length + 1, b.Length + 1];

            for (int i = 0; i <= a.Length; i++)
                dp[i, 0] = i;

            for (int j = 0; j <= b.Length; j++)
                dp[0, j] = j;

            for (int i = 1; i < dp.GetLength(0); i++)
            {
                for (int j = 1; j < dp.GetLength(1); j++)
                {
                    int cost = (a[i - 1] == b[j - 1]) ? 0 : 1;

                    dp[i, j] = Math.Min(
                        Math.Min(dp[i - 1, j] + 1, dp[i, j - 1] + 1),
                        dp[i - 1, j - 1] + cost
                    );
                }
            }

            return dp[a.Length, b.Length];
        }

    }
}
