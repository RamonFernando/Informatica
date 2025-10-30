using System;
using System.IO;
using System.Collections.Generic;

class Program
{
    static string rutaArchivo = "datos.txt";

    static void Main()
    {
        int opcion;
        do
        {
            Console.WriteLine("\n--- MENÚ CRUD CON ARCHIVO ---");
            Console.WriteLine("1. Crear (Agregar registro)");
            Console.WriteLine("2. Leer (Mostrar registros)");
            Console.WriteLine("3. Actualizar (Modificar registro)");
            Console.WriteLine("4. Eliminar registro");
            Console.WriteLine("0. Salir");
            Console.Write("Elige una opción: ");

            if (!int.TryParse(Console.ReadLine(), out opcion))
                opcion = -1;

            switch (opcion)
            {
                case 1: Crear(); break;
                case 2: Leer(); break;
                case 3: Actualizar(); break;
                case 4: Eliminar(); break;
                case 0: Console.WriteLine("Saliendo..."); break;
                default: Console.WriteLine("Opción no válida."); break;
            }

        } while (opcion != 0);
    }

    // 🟢 CREATE → Agrega un nuevo registro al archivo
    static void Crear()
    {
        Console.Write("Introduce un nuevo nombre: ");
        string nombre = Console.ReadLine() ?? "";  // evita null

        if (string.IsNullOrWhiteSpace(nombre)) return;

        // StreamWriter con append:true → añade sin borrar el contenido existente
        using (StreamWriter writer = new StreamWriter(rutaArchivo, append: true))
        {
            writer.WriteLine(nombre);
        }

        Console.WriteLine("Registro guardado correctamente.");
    }

    // 🔵 READ → Muestra todos los registros del archivo línea por línea
    static void Leer()
    {
        if (!File.Exists(rutaArchivo))
        {
            Console.WriteLine("No hay registros.");
            return;
        }

        // StreamReader lee el archivo línea a línea
        using (StreamReader reader = new StreamReader(rutaArchivo))
        {
            Console.WriteLine("\n--- LISTA DE REGISTROS ---");
            string linea;
            int num = 1;

            while ((linea = reader.ReadLine()) != null)
            {
                Console.WriteLine($"{num,2}: {linea}");
                num++;
            }
        }
    }

    // 🟡 UPDATE → Modifica un registro existente
    static void Actualizar()
    {
        if (!File.Exists(rutaArchivo))
        {
            Console.WriteLine("No hay registros para actualizar.");
            return;
        }

        // Carga todas las líneas del archivo en una lista
        List<string> lineas = new List<string>(File.ReadAllLines(rutaArchivo));

        Leer(); // Mostramos las líneas actuales
        Console.Write("\nNúmero de línea a modificar: ");

        // Comprobamos que el número sea válido
        if (int.TryParse(Console.ReadLine(), out int indice) && indice > 0 && indice <= lineas.Count)
        {
            Console.Write("Nuevo valor: ");
            string nuevo = Console.ReadLine() ?? "";  // evita null

            if (!string.IsNullOrWhiteSpace(nuevo))
            {
                // Sustituimos la línea elegida
                lineas[indice - 1] = nuevo;

                // Reescribimos el archivo completo con los nuevos datos
                using (StreamWriter writer = new StreamWriter(rutaArchivo, append: false))
                {
                    foreach (var linea in lineas)
                        writer.WriteLine(linea);
                }

                Console.WriteLine("Registro actualizado correctamente.");
            }
        }
        else
        {
            Console.WriteLine("Número no válido.");
        }
    }

    // 🔴 DELETE → Elimina un registro según su número de línea
    static void Eliminar()
    {
        if (!File.Exists(rutaArchivo))
        {
            Console.WriteLine("No hay registros para eliminar.");
            return;
        }

        // Carga todas las líneas en una lista
        List<string> lineas = new List<string>(File.ReadAllLines(rutaArchivo));

        Leer(); // Mostramos el contenido actual
        Console.Write("\nNúmero de línea a eliminar: ");

        if (int.TryParse(Console.ReadLine(), out int indice) && indice > 0 && indice <= lineas.Count)
        {
            // Elimina la línea seleccionada
            lineas.RemoveAt(indice - 1);

            // Reescribe el archivo con los datos restantes
            using (StreamWriter writer = new StreamWriter(rutaArchivo, append: false))
            {
                foreach (var linea in lineas)
                    writer.WriteLine(linea);
            }

            Console.WriteLine("Registro eliminado correctamente.");
        }
        else
        {
            Console.WriteLine("Número no válido.");
        }
    }
}
