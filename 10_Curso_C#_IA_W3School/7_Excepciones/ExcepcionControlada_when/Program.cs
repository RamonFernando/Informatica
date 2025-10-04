// Puedes filtrar excepciones con la cláusula when.

using System;

class EjemploFiltro
{
    static void Main()
    {
        try
        {
            Console.WriteLine("Introduce un número: ");
            int numero = int.Parse(Console.ReadLine());

            if (numero < 0)
                throw new ArgumentException("El número no puede ser negativo.");

            Console.WriteLine($"Número válido: {numero}");
        }
        // Si la excepción es de tipo ArgumentException y contiene la palabra "negativo"
        catch (ArgumentException ex) when (ex.Message.Contains("negativo"))
        {
            Console.WriteLine("Error: El número ingresado es negativo.");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Error general: {ex.Message}");
        }
        finally
        {
            Console.WriteLine("Fin del programa.");
        }
    }
}
