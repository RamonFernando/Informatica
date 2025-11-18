using System;
using System.Collections.Generic;
using System.Linq;


namespace Listas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Ejercicio 1 practicando listas antes de hacer las peticiones a la API
            List<string> ciudades = new List<string>()
                {
                "Madrid",
                "Barcelona",
                "Valencia",
                "Sevilla",
                "Palma de Mallorca"
            };
            foreach (var c in ciudades)
            {
                Console.WriteLine(c);
            }

            List<Alumno> alumnos = new List<Alumno>()
            {
                new Alumno() { Nombre = "Ramon", Nota = 9.5 },
                new Alumno() { Nombre = "Blas", Nota = 3.7 },
                new Alumno() { Nombre = "Maite", Nota = 7},
                new Alumno() { Nombre = "Nick", Nota = 4.8 },
                new Alumno() { Nombre = "Eva", Nota = 9 }
                
            };

            // Usando metodo ToString
            Console.WriteLine("\nAlumnos");
            foreach (var alumno in alumnos)
            {
                Console.WriteLine(alumno.ToString());
            }
         
            Console.Write("\nNotas: ");
            foreach (var alumno in alumnos)
            {
                if(alumno.Nota > 5)
                {
                    Console.Write(alumno.Nota + " ");
                }
            }

            // Usando LINQ y mostrando manualmente ordenando de mayor a menor
            Console.WriteLine("\nAlumnos con notas superiores a 5");
            foreach (var alumno in alumnos.Where(n => n.Nota > 5).OrderByDescending(n => n.Nota))
            {
                Console.WriteLine($"Alumno: {alumno.Nombre} Nota: {alumno.Nota}");
            };
        }
        
        public class Alumno
        {
            public string Nombre { get; set; }
            public double Nota { get; set; }

            // List<Alumno> alumnos = new List<Alumno>();
            public override string ToString()
            {
                return $"Alumno: {this.Nombre} Nota: {this.Nota}";
            }
            
        }
    }
}
