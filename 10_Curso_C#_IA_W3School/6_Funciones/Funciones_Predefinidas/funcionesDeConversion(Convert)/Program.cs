using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace funcionesDeConversion_Convert_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 4.Funciones de conversión(Convert)
            
            // a.Convertir a entero
            string numeroComoTexto = "123";
            int numero = Convert.ToInt32(numeroComoTexto);
            Console.WriteLine($"Entero: {numero} + 10 = " + (numero + 10)); // 133

            // Convertir a entero alternativa
            string numeroComoTexto2 = "123";
            int numero2 = int.Parse(numeroComoTexto2);
            Console.WriteLine("Número: " + (numero2 + 10)); // 133

            // b.Convertir a decimal
            string numeroComoTexto3 = "123,45";
            decimal numero3 = Convert.ToDecimal(numeroComoTexto3);
            Console.WriteLine($"Decimal: {numero3} + 10 = " + (numero3 + 10)); // 133,45


            // Convertir a decimal alternativa
            string numeroComoTexto4 = "123,45";
            decimal numero4 = decimal.Parse(numeroComoTexto4);
            Console.WriteLine("Número: " + (numero4 + 10)); // 133,45

            // c.Convertir a cadena
            int numero1 = 42;
            string texto = Convert.ToString(numero1);
            Console.WriteLine("Numero como entero: " + numero1); // 42
            Console.WriteLine($"Numero como texto: \"{texto}\" "); // "42"
            Console.WriteLine($"Suma entero: {numero1} + 10 = " + (numero1 + 10)); // 52
            Console.WriteLine($"Suma texto: {texto} + 10 = " + (texto + 10)); // 52

            // Convertir a cadena alternativa
            int numero5 = 42;
            string texto2 = numero5.ToString();
            Console.WriteLine("Número como texto: " + texto2); // "42"

            Console.ReadKey();
        }
    }
}
