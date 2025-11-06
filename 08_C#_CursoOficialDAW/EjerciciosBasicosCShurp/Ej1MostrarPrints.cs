using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosBasicosCShurp
{
    public class Ej1MostrarPrints
    {
        // Ejercicio 1: Crea un programa que muestre tu nombre, edad y ciudad en líneas separadas.
        // Salida esperada:
        // Nombre: Ana
        // Edad: 20
        // Ciudad: Madrid
        public static void MostrarDatos()
        {
            string[] nombre = { "Ramon", "37", "Palma" };
            Console.WriteLine("Nombre: " + nombre[0]);
            Console.WriteLine("Edad: " + nombre[1]);
            Console.WriteLine("Ciudad: " + nombre[2]);
        }

    }
}
