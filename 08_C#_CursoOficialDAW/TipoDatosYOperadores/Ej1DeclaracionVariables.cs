using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TipoDatosYOperadores
{
    public class Ej1DeclaracionVariables
    {
    /**
    Ejercicio 1: Declara variables de tipo int, double, char, bool y string. Asigna valores
    y muéstralos en consola.
    */

        /**
        * Metodo principal para la declaracion de variables de distintos tipos de datos
        * @return void Muestra por consola las variables declaradas
        */
        public static void DeclaracionVariables()
        {
            // Variables
            int num = 10;
            double numDecimal = 10.5;
            char character = 'a';
            string text = "Hola Mundo";
            bool isTrue = true;

            Console.WriteLine("Numero entero: (int) " + num);
            Console.WriteLine("Numero decimal: (double) " + numDecimal);
            Console.WriteLine("Caracter: (char) " + character);
            Console.WriteLine("Cadena de texto: (string) " + text);
            Console.WriteLine("Variable semaforo: (bool) " + isTrue);
        }
    }
}
