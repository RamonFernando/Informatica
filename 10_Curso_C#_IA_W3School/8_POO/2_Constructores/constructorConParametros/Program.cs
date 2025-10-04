using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor con parámetros
    // Permite inicializar la clase con valores específicos al momento de crear la instancia.
    public Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
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
        Persona persona = new Persona("Juan", 30);
        persona.Presentarse(); // Salida: Hola, soy Juan y tengo 30 años.
    }
}
