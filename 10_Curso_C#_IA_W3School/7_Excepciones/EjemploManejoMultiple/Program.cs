using System;

class EjemploManejoMultiple
{
    static void Main()
    {
        try
        {
            Console.WriteLine("Introduce un número para dividir: ");
            int numerador = int.Parse(Console.ReadLine());
            Console.WriteLine("Introduce el divisor: ");
            int divisor = int.Parse(Console.ReadLine());

            int resultado = numerador / divisor; // Puede lanzar DivideByZeroException
            Console.WriteLine($"Resultado: {resultado}");
        }
        catch (FormatException ex)
        {
            Console.WriteLine("Error: Entrada inválida, no es un número.");
        }
        catch (DivideByZeroException ex)
        {
            Console.WriteLine("Error: No se puede dividir entre cero.");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Ocurrió un error inesperado: {ex.Message}");
        }
            finally
        {
            Console.WriteLine("Fin del programa.");
        }

    }
}
