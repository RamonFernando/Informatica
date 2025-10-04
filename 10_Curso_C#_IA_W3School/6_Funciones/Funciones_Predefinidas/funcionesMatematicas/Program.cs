using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace funcionesMatematicas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 2.Funciones matemáticas(Math)
            
            // a.Redondeo y valores absolutos
            Console.WriteLine(Math.Round(3.14159, 2)); // 3.14
            Console.WriteLine(Math.Abs(-10)); // 10
            
            // b.Potencias y raíces
            Console.WriteLine(Math.Pow(2, 3)); // 8
            Console.WriteLine(Math.Sqrt(16)); // 4
            
            // c.Máximo y mínimo
            Console.WriteLine(Math.Max(10, 20)); // 20
            Console.WriteLine(Math.Min(10, 20)); // 10
            
            // d.Funciones trigonométricas (sin, cos, etc.)
            // sin, cos, tan, asin, acos, atan
            // Sirven para calcular valores trigonometricos en radianes como angulos, grados, etc.
            Console.WriteLine(Math.Sin(Math.PI / 2)); // 1
            Console.WriteLine(Math.Cos(0)); // 1
            Console.WriteLine(Math.Tan(Math.PI / 4)); // 1
            Console.WriteLine(Math.Atan(1)); // 0.7853981633974483
            
            Console.ReadKey();
        }
    }
}
