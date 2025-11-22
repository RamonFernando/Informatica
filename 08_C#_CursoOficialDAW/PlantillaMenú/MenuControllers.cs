using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace PlantillaMenú
{
    internal class MenuControllers
    {   
        // Metodos
        public static string ApiName() => "API NOMBRE_API";
        public static void ShowMenu()
        {   
            Console.Clear();
            Console.WriteLine("**=============================**");
            Console.WriteLine("         API NOMBRE_API");
            Console.WriteLine("=================================");
            Console.WriteLine("         MENU PRINCIPAL");
            Console.WriteLine("=================================");
            Console.WriteLine("1. Mostrar API");
            Console.WriteLine("2. Filtrar API (Id)");
            Console.WriteLine("3. Agregar a Lista API");
            Console.WriteLine("4. Eliminar de Lista API");
            Console.WriteLine("0. Salir");
            Console.WriteLine("**=============================**");
            Console.Write("Seleccione una opcion: ");
        }
        public static void ExitMenu()
        {
            Console.WriteLine("=================================");
            Console.WriteLine($"Gracias por usar la {ApiName()}");
            Console.WriteLine("=================================");
            return;
        }
        public static int? ValidateInput(string input)
        {
            if (!int.TryParse(input, out int opc) || (opc < 0 || opc > 4))
            {
                Console.WriteLine("El valor ingresado no es valido");
                WaitForPressKey();
                return null;
            }
            return opc;
        }
        public static void WaitForPressKey()
        {
            Console.WriteLine("Presione cualquier tecla para continuar...");
            Console.ReadKey();
        }
    }
}
