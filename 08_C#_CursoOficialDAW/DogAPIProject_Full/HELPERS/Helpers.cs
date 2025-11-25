using System;
using System.Collections.Generic;
using APIDogAPI.VIEWS;

namespace APIDogAPI.HELPERS
{
    internal static class Helpers
    {
        // Valida que la opción del menú sea un entero dentro del rango permitido
        public static int? ValidateInput(string input)
        {
            if (!int.TryParse(input, out int opc) || opc < 0 || opc > 8)
            {
                Views.Views.PrintInvalidOption();
                Views.Views.PrintWaitForPressKey();
                return null;
            }
            return opc;
        }

        // Lee una línea desde la consola tal cual la escribe el usuario
        public static string ReadInput() => Console.ReadLine();

        // Lee una línea desde la consola y la devuelve en mayúsculas y recortada
        public static string ReadInputUpper() => Console.ReadLine()?.Trim().ToUpper();

        // Confirma una operación tipo S/N devolviendo true solo si es "S"
        public static bool Confirm(string input)
        {
            if (string.IsNullOrWhiteSpace(input))
                return false;

            return input.Trim().ToUpper() == "S";
        }

        // Valida que un índice elegido por el usuario esté dentro de un rango 1..max
        public static int ValidateIndexSelection(string input, int max)
        {
            if (!int.TryParse(input, out int num))
                return -1;

            if (num < 1 || num > max)
                return -1;

            return num;
        }

        // Calcula la distancia de Levenshtein entre dos cadenas (para búsqueda aproximada)
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

        // Pagina una lista de strings mostrando un número fijo de elementos por página
        public static void PaginateList(List<string> list, int pageSize, Action<string> PrintItem)
        {
            if (list == null || list.Count == 0)
            {
                Views.Views.PrintNoData();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            int currentPage = 0;
            int totalPages = (int)Math.Ceiling(list.Count / (double)pageSize);

            while (true)
            {
                Console.Clear();
                Views.Views.PrintCountPagesAll(currentPage + 1, totalPages);

                int start = currentPage * pageSize;
                int end = Math.Min(start + pageSize, list.Count);

                for (int i = start; i < end; i++)
                    PrintItem(list[i]);

                Views.Views.PrintSelectOption();
                string key = Console.ReadKey(true).Key.ToString().ToUpper();

                if (key == "N" && currentPage < totalPages - 1)
                    currentPage++;
                else if (key == "B" && currentPage > 0)
                    currentPage--;
                else if (key == "Q")
                    break;
            }
        }
    }
}