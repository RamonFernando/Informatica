using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor por defecto
    // Se usa para inicializar datos estáticos de la clase. Solo se ejecuta una vez.
    public Persona()
    {
        Nombre = "Desconocido";
        Edad = 0;
    }

    // Constructor con un parámetro
    public Persona(string nombre)
    {
        Nombre = nombre;
        Edad = 0; // Valor predeterminado
    }

    // Constructor con dos parámetros
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
        Persona p1 = new Persona();
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Carlos", 40);

        p1.Presentarse(); // Salida: Hola, soy Desconocido y tengo 0 años.
        p2.Presentarse(); // Salida: Hola, soy Ana y tengo 0 años.
        p3.Presentarse(); // Salida: Hola, soy Carlos y tengo 40 años.
    }
}
