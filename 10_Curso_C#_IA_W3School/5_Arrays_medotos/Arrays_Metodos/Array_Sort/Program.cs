using System;
using System.Collections.Generic;
using System.Linq;


namespace Array_Sort
{
    internal class Program
    {
        public class Persona
        {
            public string Nombre { get; set; }
            public int Edad { get; set; }
        }
        static void Main(string[] args)
        {
            /*
            Array.Sort(): Ordena in-place el contenido del array (modifica el array original).
            List<T>.Sort(): Similar a Array.Sort(), pero para Listas. Se puede pasar un delegado (o lambda) para definir cómo comparar los elementos.
            LINQ (OrderBy, OrderByDescending, etc.): Crea una nueva secuencia ordenada, sin modificar la colección original, por lo que suele usarse con ToList() o ToArray() para materializar el resultado.
             */
            int[] numeros = { 5, 2, 9, 1, 7 };
            Array.Sort(numeros);

            Console.WriteLine("Array ordenado ascendentemente:");
            foreach (int num in numeros)
            {
                Console.Write(num + " ");
            }
            // Salida: 1 2 5 7 9

            // 1. Ordenar un array de enteros con Array.Sort
            int[] numeros1 = { 5, 2, 8, 1, 9 };
            Array.Sort(numeros1);
            Console.WriteLine("Array de enteros ordenado: " + string.Join(", ", numeros1));
            // Salida: 1, 2, 5, 8, 9

            // 2. Ordenar un array de strings con Array.Sort
            string[] frutas = { "Banana", "Manzana", "Pera", "Naranja" };
            Array.Sort(frutas);
            Console.WriteLine("Array de frutas ordenado: " + string.Join(", ", frutas));
            // Salida: Banana, Manzana, Naranja, Pera
            // (La forma de ordenar depende de la cultura/regionalización, pero en general será alfabético)

            // 3. Ordenar una lista de objetos con List.Sort y un comparador lambda
            List<Persona> personas = new List<Persona>
        {
            new Persona { Nombre = "Pedro", Edad = 25 },
            new Persona { Nombre = "Maria", Edad = 35 },
            new Persona { Nombre = "Juan",  Edad = 30 },
            new Persona { Nombre = "Ana",   Edad = 20 }
            
        };

            // Ordenamos por la propiedad Edad de menor a mayor
            personas.Sort((p1, p2) => p1.Edad.CompareTo(p2.Edad));

            Console.WriteLine("\nLista de personas ordenadas por edad:");
            foreach (var p in personas)
            {
                Console.WriteLine($"Nombre: {p.Nombre}, Edad: {p.Edad}");
            }
            // Salida:
            //   Ana,  20
            //   Pedro,25
            //   Juan, 30
            //   Maria,35

            // 4. Ordenar usando LINQ
            var frutasOrdenadas = frutas.OrderBy(f => f).ToList();
            Console.WriteLine("\nArray de frutas ordenado con LINQ: " + string.Join(", ", frutasOrdenadas));
            // Salida (mismo resultado que con Array.Sort):
            // Banana, Manzana, Naranja, Pera

            Console.ReadKey();
        }
    }
}
