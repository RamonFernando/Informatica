using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Variables
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero = 10;          // Entero
            double precio = 19.99;    // Decimal
            char letra = 'A';         // Carácter
            string mensaje = "Hola"; // Cadena de texto
            bool esCierto = true;     // Booleano

            Console.WriteLine($"Número: {numero}, Precio: {precio}, Mensaje: {mensaje}");
            Console.ReadKey();
        }
    }
}
