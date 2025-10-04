using System;

namespace EjemploPolimorfismo
{
    // Clase base o padre
    public class Animal
    {
        // Método virtual que puede ser sobrescrito por clases derivadas
        public virtual void HacerSonido()
        {
            Console.WriteLine("El animal hace un sonido.");
        }
    }

    // Clase derivada: Perro
    public class Perro : Animal
    {
        // Sobrescribe el método HacerSonido
        public override void HacerSonido()
        {
            Console.WriteLine("El perro ladra: ¡Guau guau!");
        }
    }

    // Clase derivada: Gato
    public class Gato : Animal
    {
        // Sobrescribe el método HacerSonido
        public override void HacerSonido()
        {
            Console.WriteLine("El gato maúlla: ¡Miau miau!");
        }
    }

    // Clase derivada: Pájaro
    public class Pajaro : Animal
    {
        // Sobrescribe el método HacerSonido
        public override void HacerSonido()
        {
            Console.WriteLine("El pájaro canta: ¡Pío pío!");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Polimorfismo: Declaramos un arreglo de tipo Animal
            Animal[] animales = new Animal[] {
                new Perro(),
                new Gato(),
                new Pajaro(),
                new Animal() // Clase base directamente
            };

            // Recorremos el arreglo y llamamos al método HacerSonido
            foreach (Animal animal in animales) {
                animal.HacerSonido(); // Se ejecuta el método específico según el objeto
            }
            Console.ReadKey();

            /*
             Console:
            El perro ladra: ¡Guau guau!
            El gato maúlla: ¡Miau miau!
            El pájaro canta: ¡Pío pío!
            El animal hace un sonido.
            */

            /*
             Clase Base (Animal):

            Contiene un método virtual HacerSonido, que puede ser sobrescrito en clases derivadas.
            Clases Derivadas (Perro, Gato, Pajaro):

            Sobrescriben el método HacerSonido utilizando override, proporcionando una implementación específica para cada tipo de animal.
            Uso de Polimorfismo:

            Se crea un arreglo de tipo Animal que contiene objetos de las clases derivadas.
            Al iterar el arreglo, el método HacerSonido llamado depende del tipo real del objeto, no del tipo de referencia.
             */
        }
    }
}
