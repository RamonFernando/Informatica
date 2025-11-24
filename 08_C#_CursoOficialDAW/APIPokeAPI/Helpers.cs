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
    }
}
