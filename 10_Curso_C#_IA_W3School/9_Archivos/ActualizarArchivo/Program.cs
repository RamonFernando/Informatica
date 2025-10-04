/*
 En C#, se pueden manejar archivos utilizando el espacio de nombres System.IO. Este incluye clases como 
File, FileInfo, StreamWriter, StreamReader, entre otras, que permiten trabajar con la 
creación, lectura, escritura y eliminación de archivos.
 */
using System;
using System.IO;

class Program
{
    static void Main()
    {
        string rutaArchivo = "archivoTexto.txt";

        // Escribir en el archivo (crearlo si no existe)
        File.WriteAllText(rutaArchivo, "Línea 1: Este es el inicio del archivo.\n");

        // Añadir más contenido al archivo
        using (StreamWriter escritor = File.AppendText(rutaArchivo)) // Abre el archivo en modo de escritura
        {
            escritor.WriteLine("Línea 2: Este texto se agregó después.");
            escritor.WriteLine("Línea 3: Y este también.");
        }

        // Leer el contenido actualizado del archivo
        string contenido = File.ReadAllText(rutaArchivo); // Abre el archivo en modo lectura
        Console.WriteLine("Contenido actualizado del archivo:");
        Console.WriteLine(contenido);

        Console.ReadKey();

        /*
         Contenido actualizado del archivo:
        Línea 1: Este es el inicio del archivo.
        Línea 2: Este texto se agregó después.
        Línea 3: Y este también.
         */
    }
}
