using System;

// Múltiples funciones con el mismo nombre pero diferentes parámetros.
class Ejemplo
{
    // Sobrecarga de funciones cambiando el tipo de parámetro
    static int Sumar(int a, int b)
    {
        return a + b;
    }

    static double Sumar(double a, double b)
    {
        return a + b;
    }

    static void Main()
    {
        Console.WriteLine(Sumar(5, 3));        // Llama a la versión int
        Console.WriteLine(Sumar(4.5, 2.3));   // Llama a la versión double
        Console.ReadKey();
    }
}
