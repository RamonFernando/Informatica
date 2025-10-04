using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace excepciones_tryCatchFinally_
{
    internal class Program
    {
        static void Main(string[] args)
        {

            // 7.Funciones para manejar excepciones(try-catch)
            // a.Capturar errores
            try
            {   
                Console.WriteLine("Ingrese un numero entero: ");
                int numero = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine($"El numero {numero} ingresado es un entero! ");
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Error de formato: " + ex.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error general: " + ex.Message);
            }
            finally
            {
                Console.WriteLine("Se ejecuta siempre");
                Console.WriteLine("Fin del programa");
            }

            
            Console.ReadKey();
        }
    }
}
