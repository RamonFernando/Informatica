using System;

namespace EjemploHerencia
{
    // Clase base o padre
    public class Persona
    {
        // Propiedades de la clase base
        public string Nombre { get; set; }
        public int Edad { get; set; }

        // Constructor de la clase base
        public Persona(string nombre, int edad)
        {
            Nombre = nombre;
            Edad = edad;
        }

        // Método de la clase base
        public virtual void MostrarInformacion()
        {
            Console.WriteLine($"Soy {Nombre} y tengo {Edad} años.");
        }
    }

    // Clase hija que hereda de Persona
    public class Estudiante : Persona
    {
        // Propiedad específica de la clase hija
        public string Escuela { get; set; }

        // Constructor de la clase hija
        public Estudiante(string nombre, int edad, string escuela)
            : base(nombre, edad) // Llama al constructor de la clase base (padre)
        {
            Escuela = escuela; // Inicializa la propiedad de la clase hija
        }

        // Sobrescribe el método de la clase base
        public override void MostrarInformacion()
        {
            Console.WriteLine($"Soy {Nombre}, tengo {Edad} años y estudio en {Escuela}.");
        }
    }

    // Clase hija adicional
    public class Profesor : Persona
    {
        // Propiedad específica de la clase hija
        public string Materia { get; set; }

        // Constructor de la clase hija
        public Profesor(string nombre, int edad, string materia)
            : base(nombre, edad) // Llama al constructor de la clase base
        {
            Materia = materia;
        }

        // Sobrescribe el método de la clase base
        public override void MostrarInformacion()
        {
            Console.WriteLine($"Soy {Nombre}, tengo {Edad} años y enseño {Materia}.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Crear un objeto de la clase base
            Persona persona = new Persona("Carlos", 40);
            persona.MostrarInformacion();

            // Crear un objeto de la clase hija Estudiante
            Estudiante estudiante = new Estudiante("Ana", 20, "Universidad Nacional");
            estudiante.MostrarInformacion();

            // Crear un objeto de la clase hija Profesor
            Profesor profesor = new Profesor("Laura", 35, "Matemáticas");
            profesor.MostrarInformacion();
            profesor.Nombre = "Laura Perez";
            profesor.Edad = 36;
            profesor.Materia = "Matemáticas y Fisica";
            profesor.MostrarInformacion();
            Console.ReadKey();

            /*
             Consola: 
            Soy Carlos y tengo 40 años.
            Soy Ana, tengo 20 años y estudio en Universidad Nacional.
            Soy Laura, tengo 35 años y enseño Matemáticas.
            Soy Laura Perez, tengo 36 años y enseño Matemáticas y Fisica.
             */
        }
    }
}
