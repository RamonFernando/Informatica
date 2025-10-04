using System;

namespace EjemploObjetos
{
    // Definición de la clase Persona
    public class Persona
    {
        // Propiedades de la clase
        public string Nombre { get; set; }
        public int Edad { get; set; }

        // Constructor de la clase
        public Persona(string nombre, int edad)
        {
            Nombre = nombre;
            Edad = edad;
        }

        // Método de la clase
        public void Saludar()
        {
            Console.WriteLine($"Hola, mi nombre es {Nombre} y tengo {Edad} años.");
        }
    }

    // Clase principal para ejecutar el ejemplo
    class Program
    {
        static void Main(string[] args)
        {
            // Crear objetos de la clase Persona
            Persona persona1 = new Persona("Carlos", 30);
            Persona persona2 = new Persona("Ana", 25);

            // Usar el método Saludar de los objetos
            persona1.Saludar();
            persona2.Saludar();

            // Modificar propiedades de los objetos
            persona1.Nombre = "Carlos Pérez";
            persona1.Edad = 31;

            // Mostrar los cambios
            Console.WriteLine($"Actualizado: {persona1.Nombre}, {persona1.Edad} años.");
            persona1.Saludar();
            Console.ReadKey();

            /*
             * Consola:
                Hola, mi nombre es Carlos y tengo 30 años.
                Hola, mi nombre es Ana y tengo 25 años.
                Actualizado: Carlos Pérez, 31 años.
                Hola, mi nombre es Carlos Pérez y tengo 31 años.
             */
        }
    }
}

