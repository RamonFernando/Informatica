using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor
    // Un constructor sin parámetros que inicializa valores predeterminados.
    public Persona()
    {
        Nombre = "Sin Nombre";
        Edad = 0;
    }

    public void Presentarse()
    {
        Console.WriteLine($"Hola, soy {Nombre} y tengo {Edad} años.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Persona persona = new Persona();
        persona.Presentarse(); // Salida: Hola, soy Sin Nombre y tengo 0 años.
    }
}

