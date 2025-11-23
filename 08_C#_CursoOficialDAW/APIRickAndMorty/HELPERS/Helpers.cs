using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Importar static
using static APIRickAndMorty.Program;
using static APIRickAndMorty.Models;
using static APIRickAndMorty.APIControllers;
using static APIRickAndMorty.APIFavoriteList;
using static APIRickAndMorty.APIFiltersControllers;
using static APIRickAndMorty.APILoadFavoriteListFromJson;
using static APIRickAndMorty.APISaveFavoriteListJson;
using static APIRickAndMorty.Helpers;
using static APIRickAndMorty.Views;

namespace APIRickAndMorty
{
    internal class Helpers
    {
        // Utilidades (Helpers)
        public static string ApiName() => "Rick & Morty";

        public static int? ValidateInput(string input)
        {
            if (!int.TryParse(input, out int opc) || (opc < 0 || opc > 8))
            {
                PrintInvalidOption();
                PrintWaitForPressKey();
                return null;
            }
            return opc;
        }
        // Valida que la entrada sea un número entero; si no lo es, devuelve null
        public static int ValidateIsNumberId(string input)
        {
            if (!int.TryParse(input, out int num))
            {
                Console.WriteLine("El valor ingresado no es valido");
                return -1;
            }
            return num;
        }

        public static string ReadInput() => Console.ReadLine();

        public static string ReadInputUpper() => Console.ReadLine().Trim().ToUpper();

        // Pide confirmación al usuario y, si acepta, agrega el elemento
        // a la lista de favoritos usando el ID y el objeto JSON ya deserializado.
        public static bool ConfirmOperationFavoriteList(string input)
        {
            if (string.IsNullOrWhiteSpace(input)) return false;
            return input.Trim().ToUpper() == "S";
        }
    }
}
