using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_Ej7StrContarDigitos
{
    internal class Program
    {
        static void Main(string[] args)
        /*
         7. Escriba un programa en C# Sharp para contar la cantidad de alfabetos, dígitos y caracteres especiales en una cadena.
            Datos de prueba:
            Ingrese la cadena: Bienvenido a w3resource.com
            Salida esperada :

            El número de alfabetos en la cadena es: 21 
            El número de dígitos en la cadena es: 1 
            El número de caracteres especiales en la cadena es: 4 
         */
        {
            // Contar difgitos
            string cadena = "Bienvenido a w3resource.com";
            int numDigitos ,alfabetos, specialChar;
            numDigitos = alfabetos = specialChar = 0;
            

            foreach (char c in cadena)
            {
                if (char.IsLetter(c)) // Comprobar si el caracter es una letra
                {
                    alfabetos++;
                }
                else if (!char.IsLetterOrDigit(c)) // Comprobar si el caracter no es una letra ni un dígito
                {
                    specialChar++;
                }
                if (char.IsDigit(c)) // Comprobar si el caracter es un dígito
                {
                    numDigitos++;
                }

            }
            Console.WriteLine(cadena);
            Console.WriteLine("El numero de digitos en la cadena es: " + numDigitos);
            Console.WriteLine("El numero de alfabetos en la cadena es: " + alfabetos);
            Console.WriteLine("El numero de caracteres especiales en la cadena es: " + specialChar);
            
            Console.WriteLine("Introduce una cadena: ");
            string str = Console.ReadLine();
            int i = 0;
            int numDigitos1, alfabetos1, specialChar1;
            numDigitos1 = alfabetos1 = specialChar1 = 0;
            int length = str.Length;
            
            while (i < length) // Comprueba que i sea menor que la longitud de la cadena
            {
                // Comprueba si el caracter es un dígito
                if (str[i] >= '0' && str[i] <= '9')
                {
                    numDigitos1++;
                }
                // Comprueba si el caracter es una letra
                else if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z')
                {
                    alfabetos1++;
                }
                else
                {
                    specialChar1++;
                }
                i++;
            }
            
            Console.WriteLine("El numero de digitos en la cadena es: " + numDigitos1);
            Console.WriteLine("El numero de alfabetos en la cadena es: " + alfabetos1);
            Console.WriteLine("El numero de caracteres especiales en la cadena es: " + specialChar1);
            Console.ReadKey();
        }
    }
}
