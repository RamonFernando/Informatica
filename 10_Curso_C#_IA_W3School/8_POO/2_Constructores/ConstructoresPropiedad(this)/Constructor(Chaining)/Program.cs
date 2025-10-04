using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor principal
    // Llamar a otro constructor dentro de la misma clase
    // Usa this para invocar otro constructor de la clase (constructor chaining).
    public Persona(string nombre, int edad)
    {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    // Constructor que llama al principal usando `this`
    public Persona(string nombre) : this(nombre, 0)
    {
        // Edad predeterminada es 0
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
        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona("Carlos");

        p1.Presentarse(); // Salida: Hola, soy Ana y tengo 30 años.
        p2.Presentarse(); // Salida: Hola, soy Carlos y tengo 0 años.
    }
}
