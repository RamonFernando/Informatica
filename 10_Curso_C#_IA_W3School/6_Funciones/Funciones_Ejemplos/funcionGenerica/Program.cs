using System;
// Una función que trabaja con tipos genéricos.
class Ejemplo
{
    static T ObtenerMayor<T>(T a, T b) where T : IComparable
    {
        return a.CompareTo(b) > 0 ? a : b;
    }

    static void Main()
    {
        Console.WriteLine(ObtenerMayor(10, 20));       // Trabaja con int
        Console.WriteLine(ObtenerMayor(3.14, 2.71));   // Trabaja con double
        Console.WriteLine(ObtenerMayor("Hola", "Mundo")); // Trabaja con string
        Console.ReadKey();
    }
}
