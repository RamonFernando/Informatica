using System;

class EjemploExcepciones
{
    static void Main()
    {
        try
        {
            Console.WriteLine("Introduce un número: ");
            int numero = int.Parse(Console.ReadLine()); // Puede lanzar una excepción si la entrada no es válida
            Console.WriteLine($"El número introducido es: {numero}");
        }
        catch (FormatException ex)
        {
            Console.WriteLine("Error: La entrada no es un número válido.");
            Console.WriteLine($"Detalles: {ex.Message}");
        }
        catch (Exception ex) // Captura cualquier otra excepción
        {
            Console.WriteLine("Ocurrió un error inesperado.");
            Console.WriteLine($"Detalles: {ex.Message}");
        }
        finally
        {
            Console.WriteLine("Finalizando el programa, gracias por intentarlo.");
        }
    }
}
