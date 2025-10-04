using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace funcionesPredefinidas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // En C#, las funciones predefinidas son métodos incluidos en las bibliotecas estándar que proporcionan
            // funcionalidades comunes. Estas se agrupan en clases del espacio de nombres como System, Math, String, y DateTime.
            // Aquí tienes ejemplos de funciones predefinidas clasificadas por propósito:

            // 1.Funciones de manipulación de cadenas(String)
            
            // a.Convertir a mayúsculas o minúsculas
            string texto = "Hola Mundo";
            Console.WriteLine(texto.ToUpper()); // "HOLA MUNDO"
            Console.WriteLine(texto.ToLower()); // "hola mundo"
            
            // b.Reemplazar texto
            string texto1 = "Hola Mundo";
            Console.WriteLine(texto1.Replace("Mundo", "C#")); // "Hola C#"
            
            // c.Dividir y unir cadenas
            string texto2 = "manzana,plátano,naranja";
            string[] frutas = texto2.Split(',');
            Console.WriteLine(string.Join(" y ", frutas)); // "manzana y plátano y naranja"
            
            // d.Buscar texto
            string texto3 = "Hola Mundo";
            Console.WriteLine(texto3.Contains("Mundo")); // True
            Console.WriteLine(texto3.IndexOf("Mundo")); // 5
            
            
        }
    }
}
