using System;
using System.IO;
using System.Collections.Generic;
using System.Text;

class Program
{

    static void Main()
    {
        /*
        1. Escriba un programa en C# Sharp para crear un archivo en blanco en el disco.
            Salida esperada :
            Un archivo creado con el nombre mytest.txt
            
            - Añade el texto "Hello World!" en el archivo
            - Lee el contenido del archivo y lo muestra por pantalla
         */
        try
        {
            string fileName = @"mytest.txt";
            
            // Crea el archivo y lo cierra
            using (FileStream fileStr = File.Create(fileName))
            {
                Console.WriteLine("Creando un archivo llamado {0} en el disco", fileName);
                
                byte[] info = Encoding.UTF8.GetBytes("Hello World!"); // Convierte el string en un array de bytes
                // Escribimos en el archivo (array, desde (posicion 0), hasta (longitud del array))
                fileStr.Write(info, 0, info.Length); 
            }
            Console.WriteLine("Mostrando el contenido del archivo {0}", fileName);
            
            // Lee el archivo y lo muestra por pantalla
            using (StreamReader reader = new StreamReader(fileName))
            {
                Console.WriteLine(reader.ReadToEnd());
            }
        }
        catch(Exception e)
        {
            Console.WriteLine(e.Message);
        }


        Console.ReadKey();
        
    }
}
