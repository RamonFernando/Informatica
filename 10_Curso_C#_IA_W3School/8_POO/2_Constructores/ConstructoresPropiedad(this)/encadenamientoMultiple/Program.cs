using System;

class Persona
{
    public string Nombre;
    public int Edad;
    public string Ciudad;

    // Constructor principal
    public Persona(string nombre, int edad, string ciudad)
    {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Ciudad = ciudad;
    }

    // Constructor que llama al principal (solo nombre y edad) y agrega el parametro desconocido a ciudad
    public Persona(string nombre, int edad) : this(nombre, edad, "Desconocida")
    {
    }

    // Constructor que llama al segundo (solo nombre), 0 para edad y agrega el parametro desconocido a ciudad
    public Persona(string nombre) : this(nombre, 0)
    {
    }

    public void Presentarse()
    {
        Console.WriteLine($"Hola, soy {Nombre}, tengo {Edad} años y vivo en {Ciudad}.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Persona p1 = new Persona("Laura", 28, "Madrid");
        Persona p2 = new Persona("Carlos", 35);
        Persona p3 = new Persona("Ana");

        p1.Presentarse(); // Salida: Hola, soy Laura, tengo 28 años y vivo en Madrid.
        p2.Presentarse(); // Salida: Hola, soy Carlos, tengo 35 años y vivo en Desconocida.
        p3.Presentarse(); // Salida: Hola, soy Ana, tengo 0 años y vivo en Desconocida.
    }
}

