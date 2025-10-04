using System;
/*
En C#, los métodos abstractos son miembros de una clase abstracta que no tienen implementación en la clase 
base y que deben ser implementados por cualquier clase derivada no abstracta. Se utilizan para forzar a las 
clases derivadas a proporcionar una implementación específica para el método.
 */

abstract class Figura
{
    // Propiedad abstracta
    public abstract double Area { get; }

    // Método abstracto
    public abstract void Dibujar();

    // Método concreto
    public void Mostrar()
    {
        Console.WriteLine("Mostrando la figura.");
    }
}
class Circulo : Figura
{
    private double radio;

    // Constructor
    public Circulo(double radio)
    {
        this.radio = radio;
    }

    // Implementación de la propiedad abstracta
    public override double Area => Math.PI * radio * radio;

    // Implementación del método abstracto
    public override void Dibujar()
    {
        Console.WriteLine("Dibujando un círculo.");
    }
}
class Rectangulo : Figura
{
    private double ancho; // Propiedad o campo
    private double alto;

    public Rectangulo(double ancho, double alto)
    {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación de la propiedad abstracta
    public override double Area => ancho * alto;

    // Implementación del método abstracto
    public override void Dibujar()
    {
        Console.WriteLine("Dibujando un rectángulo.");
    }
}

class Program
{
    static void Main()
    {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 7);

        // Uso de polimorfismo
        circulo.Dibujar();                                 // Salida: Dibujando un círculo.
        Console.WriteLine($"Área: {circulo.Area:F2}");     // Área del círculo

        rectangulo.Dibujar();                              // Salida: Dibujando un rectángulo.
        Console.WriteLine($"Área: {rectangulo.Area:F2}");  // Área del rectángulo

        /*
        Ventajas de los métodos abstractos en C#:
        Forzar implementación: Obligan a las clases derivadas a proporcionar una implementación específica.
        Diseño limpio: Facilitan un diseño estructurado y predecible en jerarquías de clases.
        Polimorfismo: Permiten utilizar clases base abstractas para manejar instancias de diferentes clases derivadas.
         */

        Console.ReadKey();

    }
}

