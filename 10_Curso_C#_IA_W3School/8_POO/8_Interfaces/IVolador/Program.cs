/*  En C#, una interfaz es un contrato que define un conjunto de métodos, propiedades, eventos o 
indexadores que una clase o estructura debe implementar. A diferencia de una clase abstracta, 
las interfaces no contienen implementación de métodos (excepto métodos predeterminados en C# 8.0 o superior) 
y no tienen campos.
    Declaración: Se utiliza la palabra clave interface para definir una interfaz.
Herencia múltiple: Una clase o estructura puede implementar múltiples interfaces, lo que permite simular una forma de herencia múltiple.
Sin implementación: Los miembros de la interfaz no tienen cuerpo (excepto los métodos predeterminados en versiones recientes).
Polimorfismo: Permiten que diferentes clases implementen la misma interfaz y se traten de forma uniforme

    Ventajas de usar interfaces:
Flexibilidad: Permiten herencia múltiple.
Polimorfismo: Facilitan tratar diferentes clases que comparten una interfaz de manera uniforme.
Diseño modular: Ayudan a diseñar sistemas desacoplados y fáciles de extender.
Compatibilidad: Se pueden usar para definir contratos entre diferentes partes de un sistema.
¿Te gustaría algún ejemplo más detallado o relacionado con un caso específico? 
*/


using System;
// Definición de interfaces
interface IVolador
{
    void Volar();
}

interface INadador
{
    void Nadar();
}

// Clase que implementa múltiples interfaces
class Pato : IVolador, INadador
{
    public void Volar()
    {
        Console.WriteLine("El pato está volando.");
    }

    public void Nadar()
    {
        Console.WriteLine("El pato está nadando.");
    }
}

class Program
{
    static void Main()
    {
        Pato pato = new Pato();

        pato.Volar(); // Salida: El pato está volando.
        pato.Nadar(); // Salida: El pato está nadando.
    }
}



