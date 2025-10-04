using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosBasicos_13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 13. Patrón Rectángulo con Número
            // Escribe un programa C# que tome un número como entrada y muestre un rectángulo de 3 columnas de ancho y 5 filas de alto usando ese dígito.
            int n = 5;
            Console.WriteLine("{0} {0} {0}", n);
            Console.WriteLine("{0}   {0}", n);
            Console.WriteLine("{0}   {0}", n);
            Console.WriteLine("{0}   {0}", n);
            Console.WriteLine("{0} {0} {0}", n);

            // 14. Celsius a Kelvin y Fahrenheit
            // Escribe un programa C# para convertir grados Celsius a Kelvin y Fahrenheit.
            // Console.WriteLine("Ingrese grados Celsius: ");
            // double celsius = double.Parse(Console.ReadLine());
            double celsius = 25;
            double kelvin = celsius + 273.15;
            double fahrenheit = (celsius * 1.8) + 32;
            Console.WriteLine("Grados Kelvin: " + kelvin);
            Console.WriteLine("Grados Fahrenheit: " + fahrenheit);

            // 15. Eliminar Carácter por Índice
            // Escriba un programa C# que elimine un carácter especificado de una cadena no vacía utilizando el índice de un carácter.
            /*Console.WriteLine("Ingrese una cadena de texto: ");
            string cadena = Console.ReadLine();
            Console.WriteLine("Ingrese el indice del caracter que desea eliminar: ");
            int indice = int.Parse(Console.ReadLine());
            string nuevaCadena = cadena.Remove(indice, 1);
            Console.WriteLine("La cadena sin el caracter en el indice {0} es: {1}", indice, nuevaCadena);*/

            // 15.1 
            /*string cadena = "hola mundo";
            Console.WriteLine("Ingrese el indice del caracter que desea eliminar: ");
            int numero = int.Parse(Console.ReadLine());
            string nuevaCadena = cadena.Remove(numero, 1);
            Console.WriteLine("La cadena en el indice especificado {0} es: {1}", numero, nuevaCadena);*/

            // 15.2 Obteniendo el caracter en un indice a partir de la la funcion creada remover_caracter()
            string cadena = "Hola mundo";
            Console.WriteLine("La cadena 'Hola Mundo' sin el caracter en el indice 5 es: " + remover_caracter(cadena, 5));
            string remover_caracter(string parCadena, int indice){
            return parCadena.Remove(indice, 1);
            }

            // 16. Intercambiar Primero y Últimos Personajes
            // Escribe un programa C# para crear una nueva cadena a partir de una cadena determinada donde el primer y el último carácter cambian de posición.
            string cadenaTexto = "w3resource";
            Console.WriteLine("La cadena 'w3resource' con el primer y el ultimo caracter intercambiados es: " + intercambiar_caracteres(cadenaTexto));

            // extrae el ultimo caracter, extrae todos los caracteres menos el primero y el ultimo, extrae el primer caracter
            string intercambiar_caracteres(string parCadena) {
                return parCadena.Substring(parCadena.Length - 1) + parCadena.Substring(1, parCadena.Length - 2) + parCadena.Substring(0, 1);
            }
            // 17. Añadir Primer Carácter al Frente y a la Espalda
            // Escriba un programa C# para crear una cadena a partir de una cadena dada (longitud 1 o más) con el primer carácter agregado en la parte delantera y trasera.

            string stringText = "W3resourcE";
            // Console.WriteLine("La cadena 'w3resource' con el primer y el ultimo caracter intercambiados es: " + intercambiar_caracteres(cadenaTexto));
            Console.WriteLine("Cadena: " + stringText + " con el primer y el ultimo caracter intercambiados es: " + change_chars(stringText));

            string change_chars(string parCadena) {
                if (parCadena.Length < 1) { return parCadena; };
                return parCadena.Substring(0, 1) + " - " + parCadena + " - " + parCadena.Substring(0, 1);
            }

            // 18. Compruebe el Par Positivo y Negativo
            // Escriba un programa C# para verificar un par de enteros y devolver verdadero si uno es negativo y uno es positivo.

            int num1 = 1;
            int num2 = -2;
            Console.WriteLine("Hay un numero positivo y un numero negativo? " + esPositivo(num1, num2));
            
            Boolean esPositivo(int numero1, int numero2){
                if (numero1 > 0 && numero2 < 0 || numero1 < 0 && numero2 > 0){
                    return true;
                } else {
                    return false;
                }
            }

            // 19. Suma o Triple Suma de Integers
            // Escriba un programa C# para calcular la suma de dos enteros dados. Si dos valores son iguales, devuelva el triple de su suma.

            int num3 = 2;
            int num4 = 2;
            if (num3 == num4)
                Console.WriteLine("La suma de (2 numeros iguales * 3) {0} y {1} es: {2}", num3, num4, sumarNumeros(num3, num4));
             else 
                Console.WriteLine("La suma de {0} y {1} es: {2}", num3, num4, sumarNumeros(num3, num4));
            
            int sumarNumeros(int numero1, int numero2) {
                int result  = (numero1 == numero2) ? (3 * (numero1 + numero2)) : (numero1 + numero2);
                return result;
            }

            // 20.Diferencia Absoluta o Doble
            // Escribe un programa C# para obtener el valor absoluto de la diferencia entre dos números dados.
            // Devuelve el doble del valor absoluto de la diferencia si el primer número es mayor que el segundo número.
            int num5 = 5;
            int num6 = 10;
            if(num5 > num6) 
                Console.WriteLine("La diferencia absoluta de {0} y {1} es: {2} (Si el primer numero es mayor se multiplica por 2)", num5, num6, diferenciaAbsoluta(num5, num6));
            else
                Console.WriteLine("La diferencia absoluta de {0} y {1} es: {2}", num5, num6, diferenciaAbsoluta(num5, num6));
         
            int diferenciaAbsoluta(int numeroAbs, int numeroAbs2){
                int resultado = 0;
                if (numeroAbs > numeroAbs2) 
                    resultado = 2 * Math.Abs(numeroAbs - numeroAbs2);
                else 
                    resultado = Math.Abs(numeroAbs - numeroAbs2);
                
                return resultado;
            }


            Console.ReadKey();
        }
    }
}
