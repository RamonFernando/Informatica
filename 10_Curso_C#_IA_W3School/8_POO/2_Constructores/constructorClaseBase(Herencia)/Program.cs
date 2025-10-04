using System;

class Persona
{
    public string Nombre;
    public int Edad;

    // Constructor
    // Puedes pasar un objeto para inicializar otra clase.
    public Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }
}

class Empleado : Persona
{
    public string Cargo;

    // Constructor que usa el de la clase base
    public Empleado(string nombre, int edad, string cargo) : base(nombre, edad)
    {
        Cargo = cargo;
    }

    public void MostrarInformacion()
    {
        Console.WriteLine($"Hola, soy {Nombre}, tengo {Edad} años y trabajo como {Cargo}.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Empleado empleado = new Empleado("Laura", 28, "Ingeniera");
        empleado.MostrarInformacion(); // Salida: Hola, soy Laura, tengo 28 años y trabajo como Ingeniera.
    }
}
