/*
 A continuación, se presenta un ejemplo de un CRUD (Crear, Leer, Actualizar, Eliminar) 
utilizando archivos en C#. Este ejemplo emplea archivos de texto para simular las operaciones 
típicas de un CRUD.
Metodos Usados predefinidos:
AppendText(rutaArchivo) Añadir datos al archivo
ReadAllLines(rutaArchivo) Leer los datos del archivo
WriteAllLines(rutaArchivo, lineas) Actualizar los datos del archivo
Exists(rutaArchivo) // Verificar si el archivo existe

// Metodos 
Crear(string dato) Añadir datos al archivo
Leer() Leer los datos del archivo
Actualizar(string datoAntiguo, string datoNuevo) Actualizar los datos del archivo
Eliminar(string datoAEliminar) Eliminar los datos del archivo
 */

using System;
using System.IO;

class CRUDArchivos
{
    private static string rutaArchivo = "datos.txt";

    // Crear o Añadir datos al archivo
    static void Crear(string dato)
    {
        using (StreamWriter escritor = File.AppendText(rutaArchivo))
        {
            escritor.WriteLine(dato);
        }
        Console.WriteLine("Dato añadido correctamente.");
    }

    // Leer los datos del archivo
    static void Leer()
    {
        if (File.Exists(rutaArchivo))
        {
            string contenido = File.ReadAllText(rutaArchivo);
            Console.WriteLine("Contenido del archivo:");
            Console.WriteLine(contenido);
        }
        else
        {
            Console.WriteLine("El archivo no existe.");
        }
    }

    // Actualizar un dato específico del archivo
    static void Actualizar(string datoAntiguo, string datoNuevo)
    {
        if (File.Exists(rutaArchivo))
        {
            string[] lineas = File.ReadAllLines(rutaArchivo);
            bool encontrado = false;

            for (int i = 0; i < lineas.Length; i++)
            {
                if (lineas[i] == datoAntiguo)
                {
                    lineas[i] = datoNuevo;
                    encontrado = true;
                }
            }

            if (encontrado) // Si se encuentra el dato a actualizar (true)
            {
                File.WriteAllLines(rutaArchivo, lineas);
                Console.WriteLine("Dato actualizado correctamente.");
            }
            else
            {
                Console.WriteLine("El dato a actualizar no fue encontrado.");
            }
        }
        else
        {
            Console.WriteLine("El archivo no existe.");
        }
    }

    // Eliminar un dato específico del archivo
    static void Eliminar(string datoAEliminar)
    {
        if (File.Exists(rutaArchivo))
        {
            string[] lineas = File.ReadAllLines(rutaArchivo);
            bool encontrado = false;

            using (StreamWriter escritor = new StreamWriter(rutaArchivo))
            {
                foreach (string linea in lineas)
                {
                    if (linea != datoAEliminar) // Si la linea no coincide con el dato a eliminar
                    {
                        escritor.WriteLine(linea);
                    }
                    else
                    {
                        encontrado = true;
                    }
                }
            }

            if (encontrado) // Si se encuentra el dato a eliminar
            {
                Console.WriteLine("Dato eliminado correctamente.");
            }
            else
            {
                Console.WriteLine("El dato a eliminar no fue encontrado.");
            }
        }
        else
        {
            Console.WriteLine("El archivo no existe.");
        }
    }

    // Programa principal
    static void Main()
    {
        while (true)
        {
            Console.WriteLine("\n--- CRUD de Archivos ---");
            Console.WriteLine("1. Crear/Añadir");
            Console.WriteLine("2. Leer");
            Console.WriteLine("3. Actualizar");
            Console.WriteLine("4. Eliminar");
            Console.WriteLine("5. Salir");
            Console.Write("Selecciona una opción: ");
            string opcion = Console.ReadLine();

            switch (opcion)
            {
                case "1":
                    Console.Write("Introduce el dato a añadir: ");
                    string dato = Console.ReadLine();
                    Crear(dato);
                    break;

                case "2":
                    Leer();
                    break;

                case "3":
                    Console.Write("Introduce el dato a actualizar: ");
                    string datoAntiguo = Console.ReadLine();
                    Console.Write("Introduce el nuevo dato: ");
                    string datoNuevo = Console.ReadLine();
                    Actualizar(datoAntiguo, datoNuevo);
                    break;

                case "4":
                    Console.Write("Introduce el dato a eliminar: ");
                    string datoAEliminar = Console.ReadLine();
                    Eliminar(datoAEliminar);
                    break;

                case "5":
                    Console.WriteLine("Saliendo del programa...");
                    return;

                default:
                    Console.WriteLine("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}
