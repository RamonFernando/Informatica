using System;

namespace ModificadoresAcceso
{
    // Clase Persona con diferentes modificadores de acceso
    public class Persona
    {
        // Propiedades y campos con diferentes modificadores
        // Los modificadores private, protected, y internal controlan cómo y
        // dónde se pueden acceder los miembros de una clase.
        public string Nombre { get; set; } // Acceso público 
        private int Edad { get; set; } // Acceso privado (solo dentro de la misma clase)
        protected string Nacionalidad { get; set; } // Acceso protegido (solo dentro de la misma clase o clases derivadas)
        internal string Ocupacion { get; set; } // Acceso interno (solo dentro del mismo ensamblado)

        // Constructor
        public Persona(string nombre, int edad, string nacionalidad, string ocupacion)
        {
            Nombre = nombre;
            Edad = edad;
            Nacionalidad = nacionalidad;
            Ocupacion = ocupacion;
        }

        // Método público
        public void MostrarInformacion()
        {
            Console.WriteLine($"Soy {Nombre}, tengo {Edad} años, soy {Nacionalidad} y trabajo como {Ocupacion}.");
        }

        // Método protegido: Solo accesible desde esta clase o clases derivadas
        protected void MostrarNacionalidad()
        {
            Console.WriteLine($"Mi nacionalidad es {Nacionalidad}.");
        }
    }

    // Clase derivada de Persona
    public class Estudiante : Persona
    {
        public string Escuela { get; set; }

        public Estudiante(string nombre, int edad, string nacionalidad, string ocupacion, string escuela)
            : base(nombre, edad, nacionalidad, ocupacion)
        {
            Escuela = escuela;
        }

        // Método público que accede a un miembro protegido
        public void MostrarInformacionCompleta()
        {
            MostrarInformacion(); // Llama al método público de la clase base
            MostrarNacionalidad(); // Llama al método protegido de la clase base
            Console.WriteLine($"Estudio en {Escuela}.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Crear un objeto de Persona
            Persona persona = new Persona("Carlos", 30, "Mexicano", "Ingeniero");
            persona.MostrarInformacion();

            // Crear un objeto de Estudiante
            Estudiante estudiante = new Estudiante("Ana", 20, "Argentina", "Estudiante", "Universidad Nacional");
            estudiante.MostrarInformacionCompleta();

            // Acceso a propiedades con diferentes modificadores
            Console.WriteLine($"Nombre (público): {persona.Nombre}");
            // Console.WriteLine($"Edad (privado): {persona.Edad}"); // Esto generará un error porque Edad es privado
            // Console.WriteLine($"Nacionalidad (protegido): {persona.Nacionalidad}"); // Esto también generará un error
            Console.WriteLine($"Ocupación (interno): {persona.Ocupacion}");
            Console.ReadKey();

            /*
             Consola:
            Soy Carlos, tengo 30 años, soy Mexicano y trabajo como Ingeniero.
            Soy Ana, tengo 20 años, soy Argentina y trabajo como Estudiante.
            Mi nacionalidad es Argentina.
            Estudio en Universidad Nacional.
            Nombre (público): Carlos
            Ocupación (interno): Ingeniero
             */

            /*
             Explicacion: 
            public:
            Es accesible desde cualquier lugar.
            Ejemplo: La propiedad Nombre se puede acceder desde cualquier clase.
            
            private:
            Es accesible solo dentro de la misma clase.
            Ejemplo: La propiedad Edad no es accesible fuera de la clase Persona.
            
            protected:
            Es accesible solo dentro de la misma clase o desde clases derivadas.
            Ejemplo: La propiedad Nacionalidad y el método MostrarNacionalidad son accesibles desde Estudiante porque hereda de Persona.

            internal:
            Es accesible dentro del mismo ensamblado/proyecto.
            Ejemplo: La propiedad Ocupacion puede ser accedida dentro del proyecto actual.
             */
        }
    }
}
