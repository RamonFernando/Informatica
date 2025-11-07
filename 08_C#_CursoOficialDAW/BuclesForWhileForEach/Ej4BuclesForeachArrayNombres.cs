using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BuclesForWhileForEach
{
    public class Ej4BuclesForeachArrayNombres
    {
        /**
         * Ejercicio 4: Crea un array con 5 nombres y usa un foreach para mostrarlos en consola.
         * */
        /**
         * Ejercicio 4: Crea un array con 5 nombres y usa un foreach para mostrarlos en consola.
         * return void: Muestra los nombres introducidos en consola mediante un bucle foreach.
        */
        public static void MostrarNombres()
        {
            while (true)
            {
                string[] nombres = new string[5];

                Console.Clear();
                Console.WriteLine("=========================================");
                Console.WriteLine("  Ejercicio 4 Foreach - Mostrar Nombres");
                Console.WriteLine("=========================================");
                Console.WriteLine("Introduce 5 nombres: o (0) para salir: ");
                
                bool salir = false;
                for (int i = 0; i < 5; i++)
                {
                    Console.Write((i + 1) + "º Nombre: ");
                    nombres[i] = Console.ReadLine();

                    if (nombres[i] == "0")
                    {
                        Console.WriteLine("Saliendo del ejercicio...");
                        salir = true;
                        break;
                    }
                }

                if (nombres[0] != null && nombres[0] != "0")
                    Console.WriteLine("Nombres introducidos:");
                
                // Comprobamos que el nombre no sea nulo o 0 y mostramos los nombres
                foreach (var nombre in nombres)
                {
                    if (nombre == "0") break;
                    
                    // (nombre != null)
                    if (!string.IsNullOrEmpty(nombre)) // mostramos mientras el nombre no sea nulo
                    {
                        Console.WriteLine($"Nombre: {nombre}");
                    }
                }
                if (salir) return;

                Console.WriteLine("Presiona cualquier tecla para continuar...");
                Console.ReadKey();
            }
        }
    }
}
