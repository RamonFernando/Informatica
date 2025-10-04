using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor con `this` para diferenciar
    // Usa this para referenciar propiedades de la instancia cuando los parámetros tienen el mismo nombre.
    public Persona(string Nombre, int Edad)
    {
        this.Nombre = Nombre; // `this.Nombre` se refiere a la propiedad de la instancia
        this.Edad = Edad;     // `Edad` se refiere al parámetro
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
        Persona persona = new Persona("Juan", 25);
        persona.Presentarse(); // Salida: Hola, soy Juan y tengo 25 años.
    }
}
