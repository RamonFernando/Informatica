using System;
/*
En C#, los métodos abstractos son miembros de una clase abstracta que no tienen implementación en la clase 
base y que deben ser implementados por cualquier clase derivada no abstracta. Se utilizan para forzar a las 
clases derivadas a proporcionar una implementación específica para el método.
 */

abstract class Animal
{
    // Método abstracto (sin cuerpo)
    public abstract void HacerSonido();

    // Método concreto con implementación
    public void Dormir()
    {
        Console.WriteLine("El animal está durmiendo.");
    }
}

// Clase derivada que implementa el método abstracto
class Perro : Animal
{
    public override void HacerSonido()
    {
        Console.WriteLine("El perro hace: ¡Guau!");
    }
}

class Gato : Animal
{
    public override void HacerSonido()
    {
        Console.WriteLine("El gato hace: ¡Miau!");
    }
}
class Program
{
    static void Main()
    {
        // Instanciando las clases derivadas
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamando a los métodos
        perro.HacerSonido(); // Salida: El perro hace: ¡Guau!
        gato.HacerSonido();  // Salida: El gato hace: ¡Miau!

        perro.Dormir();      // Salida: El animal está durmiendo.
    }
}

