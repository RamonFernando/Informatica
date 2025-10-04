using System;
/*
En C#, una interfaz es un contrato que define un conjunto de métodos, propiedades, eventos o indexadores 
que una clase o estructura debe implementar. A diferencia de una clase abstracta, las interfaces no 
contienen implementación de métodos (excepto métodos predeterminados en C# 8.0 o superior) y no tienen campos.
*/

// Definición de la interfaz
interface IAnimal
{
    void HacerSonido(); // Método
}

// Clases que implementan la interfaz
class Perro : IAnimal
{
    public void HacerSonido()
    {
        Console.WriteLine("El perro hace: ¡Guau!");
    }
}

class Gato : IAnimal
{
    public void HacerSonido()
    {
        Console.WriteLine("El gato hace: ¡Miau!");
    }
}

class Program
{
    static void Main()
    {
        IAnimal perro = new Perro();
        IAnimal gato = new Gato();

        perro.HacerSonido(); // Salida: El perro hace: ¡Guau!
        gato.HacerSonido();  // Salida: El gato hace: ¡Miau!

        Console.ReadLine();
    }
}

