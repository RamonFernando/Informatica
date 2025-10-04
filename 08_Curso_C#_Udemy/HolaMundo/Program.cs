using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {   // dotnet run // Ejecutar el proyecto
        static void Main(string[] args)
        {
            Console.WriteLine("De hellow World nada");
            
            int num1 = 5;
            int num2 = 7;
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            double division = num1 / num2;
            double potencia = Math.Pow(num1, num2);

            // Mostramos por la consola
            Console.WriteLine("Suma: " + suma);
            Console.WriteLine("Resta: " + resta);
            Console.WriteLine("multiplicacion: " + multiplicacion);
            Console.WriteLine((num2 == 0) ? "No se puede dividir por cero" : "Division: " + division);
            Console.WriteLine("Potencia: " + potencia);

            Console.ReadLine(); // Mostramos la consola

            
        }
    }
}
