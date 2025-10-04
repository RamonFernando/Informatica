using System;

// Combina parámetros y valor de retorno.
class Ejemplo
{
    static int Sumar(int a, int b)
    {
        return a + b;
    }

    static void Main()
    {
        int resultado = Sumar(5, 3);
        Console.WriteLine($"La suma es: {resultado}");
        Console.ReadKey();
    }
}
