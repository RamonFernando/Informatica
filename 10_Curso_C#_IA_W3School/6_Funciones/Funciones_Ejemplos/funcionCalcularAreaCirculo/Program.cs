using System;

class Ejemplo
{
    static double CalcularAreaCirculo(double radio)
    {
        return Math.PI * radio * radio;
    }

    static void Main()
    {
        double area = CalcularAreaCirculo(4.5);
        Console.WriteLine($"El área del círculo es: {area:0.00}");
        Console.WriteLine($"El área del círculo es: {area:F3}");

        Console.ReadKey();
    }
}
