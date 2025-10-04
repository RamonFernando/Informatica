using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_IndexOf
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            El método Array.IndexOf() se utiliza para buscar el índice de la primera aparición de un
            elemento específico dentro de una matriz. Si el elemento no se encuentra, devuelve -1.

            Ejemplo:
            int indice = Array.IndexOf(array, valorBuscado);

            Parametros:
            array: La matriz donde se realizará la búsqueda.
            valorBuscado: El elemento que se desea encontrar.
            indice: Un entero que almacenará el índice del elemento encontrado, o -1 si no se encuentra.
             */
            // Ejemplo 1
            string[] nombres = { "Ana", "Juan", "Mario", "Ana" };
            foreach (string nombre in nombres) { Console.Write(nombre + " "); }
            int indice = Array.IndexOf(nombres, "Ana");
            
            Console.WriteLine();
            // Salida: Ana Juan Mario Ana con guiones
            for (int i = 0; i < nombres.Length; i++) {
                Console.Write(nombres[i]);
                if (i != nombres.Length - 1){
                    Console.Write(" - ");
            }}

            Console.WriteLine("\nPrimer índice de 'Ana': " + indice);
            // Salida: Primer índice de 'Ana': 0

            Console.WriteLine("Índice de 'Pedro': " + Array.IndexOf(nombres, "Pedro"));
            // Salida: Índice de 'Pedro': -1

            // Ejemplo 2
            int[] numeros = { 2, 5, 8, 1, 9 };
            int numeroBuscado = 8;
            int indice1 = Array.IndexOf(numeros, numeroBuscado);

            if (indice1 != -1){
                Console.WriteLine("El número {0} se encuentra en el índice {1}", numeroBuscado, indice1);
            }else{
                Console.WriteLine("El número {0} no se encontró en la matriz.", numeroBuscado);
            }
            
            // Ejemplo 3
            string[] arrayNombres = { "Ana", "Carlos", "Sofía", "David" };
            string nombreBuscado = "Carlos";
            int iBuscador = Array.IndexOf(arrayNombres, nombreBuscado);

            if (iBuscador != -1){
                Console.WriteLine("El nombre {0} se encuentra en el índice {1}", nombreBuscado, iBuscador);
            }else{
                Console.WriteLine("El nombre {0} no se encontró en la matriz.", nombreBuscado);
            };
            
            /*
            // Ejemplo 4
            public class Persona {
                public string Nombre { get; set; }
                public int Edad { get; set; }
            }

        Persona[] personas = {
            new Persona { Nombre = "Juan", Edad = 30 },
            new Persona { Nombre = "María", Edad = 25 }
        };

        Persona personaBuscada = new Persona { Nombre = "María" };

        // Para buscar objetos personalizados, se debe sobrecargar el método Equals
        // en la clase Persona para comparar los objetos de la forma deseada.
        int indicePersona = Array.IndexOf(personas, personaBuscada);

        if (indice != -1){
            Console.WriteLine("La persona {0} se encontró en el índice {1}", personaBuscada.Nombre, indicePersona);
        }else{
            Console.WriteLine("La persona no se encontró en la matriz.");
        }
        */
        Console.ReadKey();
        }
    }
}
