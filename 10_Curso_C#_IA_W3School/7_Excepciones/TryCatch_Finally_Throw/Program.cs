using System;

class MiExcepcion : Exception
{
    public MiExcepcion(string mensaje) : base(mensaje) { }
}

class EjemploExcepcionPersonalizada
{
    static void VerificarEdad(int edad)
    {
        if (edad < 18)
        {
            throw new MiExcepcion("La edad debe ser mayor o igual a 18.");
        }
    }

    static void Main()
    {
        try
        {
            Console.WriteLine("Introduce tu edad: ");
            int edad = int.Parse(Console.ReadLine());
            VerificarEdad(edad);
            Console.WriteLine("Acceso permitido.");
        }
        catch (MiExcepcion ex)
        {
            Console.WriteLine($"Error: {ex.Message}");
        }
        finally
        {
            Console.WriteLine("Gracias por utilizar el sistema.");
        }
    }
}
