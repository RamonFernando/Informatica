using System;
using System.Collections.Generic;

// Un ejemplo que muestra cómo interactuar con listas.
class Ejemplo
{
    static void MostrarLista(List<string> elementos)
    {
        foreach (string elemento in elementos)
        {
            Console.WriteLine(elemento);
        }
    }

    static void Main()
    {
        List<string> frutas = new List<string> { "Manzana", "Banana", "Naranja" };
        MostrarLista(frutas);

        Console.ReadKey();
    }
}
