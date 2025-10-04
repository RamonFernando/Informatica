using System;

namespace Array_length
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            Length es una propiedad que devuelve el número de elementos en un array, o el número de caracteres cuando se aplica a una cadena (string).
            Length en un array siempre te dará un valor entero, representando la cantidad exacta de posiciones asignadas en ese array.
            Para cadenas, el valor de Length corresponde al conteo de todos los caracteres, incluyendo espacios en blanco.
             */
            // 1. Ejemplo con un array de enteros
            int[] numeros = { 10, 20, 30, 40, 50 };
            Console.WriteLine("Longitud del array 'numeros': " + numeros.Length);
            // Salida: 5

            // 2. Ejemplo con una cadena (string)
            string mensaje = "Hola mundo";
            Console.WriteLine("Longitud de la cadena 'mensaje': " + mensaje.Length);
            // Salida: 10 (cuenta cada carácter, incluyendo espacios)

            // 3. Ejemplo con un array de strings
            string[] frutas = { "Manzana", "Pera", "Banana" };
            Console.WriteLine("Longitud del array 'frutas': " + frutas.Length);
            // Salida: 3

            // 4. Ejemplo con un array vacío
            int[] sinElementos = { };
            Console.WriteLine("Longitud de 'sinElementos': " + sinElementos.Length);
            // Salida: 0
            Console.ReadLine();
        }
    }
}
