using System;

class Persona
{
    // Propiedades
    public string Nombre { get; set; }
    public int Edad { get; set; }

    // Constructor
    public Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }

    // Método para mostrar información
    public void MostrarInformacion()
    {
        Console.WriteLine($"Nombre: {Nombre}, Edad: {Edad} años.");
    }
    // Metodo para cambiar la edad
    public void CambiarEdad(int nuevaEdad)
    {
        Edad = nuevaEdad;
    }
    // Metodo ToString
    public override string ToString()
    {
        return $"Nombre: {Nombre}, Edad: {Edad} años.";
    }

    // Método para verificar si es mayor de edad
    public bool EsMayorDeEdad()
    {
        return Edad >= 18;
    }
}

// Clase principal para probar el ejemplo
class Program
{
    static void Main(string[] args)
    {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        persona1.CambiarEdad(30); // Cambiar la edad

        // Llamar a los métodos de la clase
        persona1.MostrarInformacion();
        Console.WriteLine($"¿Es mayor de edad? {persona1.EsMayorDeEdad()}");

        // Crear otra instancia con datos diferentes
        Persona persona2 = new Persona("Ana", 16);
        persona2.MostrarInformacion();
        Console.WriteLine($"¿Es mayor de edad? {persona2.EsMayorDeEdad()}");

        Persona persona3 = new Persona("Pedro", 17);
        // Llamar al ToString
        Console.WriteLine(persona3.ToString());

        Console.ReadKey();
        
        /*
        Salida Consola: 
        Nombre: Juan, Edad: 25 años. (30)
        ¿Es mayor de edad? True
        Nombre: Ana, Edad: 16 años.
        ¿Es mayor de edad? False
        Nombre: Pedro, Edad: 17 años.
        */
    }
}

