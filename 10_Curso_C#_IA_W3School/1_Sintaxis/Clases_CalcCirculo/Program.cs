using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clases_CalcCirculo
{
    internal class Program
    {   
        class Circulo
        {   
            // Propiedades
            public double Radio { get; set; }

            // Metodos
            public double CalcularArea()
            {
                return Math.PI * Math.Pow(Radio, 2); // Usamos el metodo Math.pow() para elevar al cuadrado
            }
        }
        static void Main(string[] args)
        {
            Circulo c = new Circulo { Radio = 5 };
            Circulo c2 = new Circulo { Radio = 10 };
            Circulo c3 = new Circulo { Radio = 15 };
            Circulo c4 = new Circulo { Radio = 20 };
            
            // Mostramos el numero completo de decimales
            Console.WriteLine($"El área del círculo 1 es: {c.CalcularArea()}");
            
            // Limitar decimales a 2
            Console.WriteLine($"El área del círculo 2 es: {Math.Round(c2.CalcularArea(), 2)}");
            
            // Usamos Math.Round() para redondear los decimales pero esta vez con decimal
            Console.WriteLine($"El área del círculo 3 es: {Math.Round((decimal)c3.CalcularArea(), 2)}");

            // Usamos F2 para redondear los decimales pero esta vez con decimal
            Console.WriteLine($"El área del círculo 4 es: {((decimal)c4.CalcularArea()):F3}");
            
        }
    }
}
