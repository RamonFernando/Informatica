using System;

// El uso de throw permite relanzar una excepción que fue capturada.
class EjemploRelanzar
{
    static void ProcesarDato(string dato)
    {
        try
        {
            int numero = int.Parse(dato);
            Console.WriteLine($"Número procesado: {numero}");
        }
        catch (FormatException)
        {
            Console.WriteLine("Error interno al procesar el dato.");
            throw; // Relanzar la excepción
        }
    }

    static void Main()
    {
        try
        {
            ProcesarDato("abc");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Excepción capturada en Main: {ex.Message}");
        }
    }
}
