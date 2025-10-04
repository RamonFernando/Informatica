using System;
using System.Collections.Generic;
using System.IO;
using System.Text.Json;

class CRUDJson
{
    private static string rutaArchivo = "datos.json";

    // Clase para los datos (puedes adaptarla según tus necesidades)
    public class Dato
    {
        public int Id { get; set; }
        public string Nombre { get; set; }
    }

    // Crear o Añadir un nuevo dato al archivo JSON
    static void Crear(Dato nuevoDato)
    {
        List<Dato> datos = LeerTodos();
        datos.Add(nuevoDato);

        Guardar(datos);
        Console.WriteLine("Dato añadido correctamente.");
    }

    // Leer todos los datos del archivo JSON
    static List<Dato> LeerTodos()
    {
        if (!File.Exists(rutaArchivo))
        {
            return new List<Dato>();
        }

        string contenido = File.ReadAllText(rutaArchivo);
        return JsonSerializer.Deserialize<List<Dato>>(contenido) ?? new List<Dato>();
    }

    // Mostrar los datos en la consola
    static void Leer()
    {
        List<Dato> datos = LeerTodos();

        if (datos.Count == 0)
        {
            Console.WriteLine("No hay datos disponibles.");
            return;
        }

        Console.WriteLine("Datos en el archivo:");
        foreach (var dato in datos)
        {
            Console.WriteLine($"ID: {dato.Id}, Nombre: {dato.Nombre}");
        }
    }

    // Actualizar un dato existente
    static void Actualizar(int id, string nuevoNombre)
    {
        List<Dato> datos = LeerTodos();
        bool encontrado = false;

        foreach (var dato in datos)
        {
            if (dato.Id == id)
            {
                dato.Nombre = nuevoNombre;
                encontrado = true;
                break;
            }
        }

        if (encontrado)
        {
            Guardar(datos);
            Console.WriteLine("Dato actualizado correctamente.");
        }
        else
        {
            Console.WriteLine("No se encontró un dato con el ID especificado.");
        }
    }

    // Eliminar un dato por su ID
    static void Eliminar(int id)
    {
        List<Dato> datos = LeerTodos();
        int inicial = datos.Count;

        datos.RemoveAll(d => d.Id == id);

        if (datos.Count < inicial)
        {
            Guardar(datos);
            Console.WriteLine("Dato eliminado correctamente.");
        }
        else
        {
            Console.WriteLine("No se encontró un dato con el ID especificado.");
        }
    }

    // Guardar la lista de datos en el archivo JSON
    static void Guardar(List<Dato> datos)
    {
        string contenido = JsonSerializer.Serialize(datos, new JsonSerializerOptions { WriteIndented = true });
        File.WriteAllText(rutaArchivo, contenido);
    }

    // Programa principal
    static void Main()
    {
        while (true)
        {
            Console.WriteLine("\n--- CRUD con JSON ---");
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
                    Console.Write("Introduce el ID: ");
                    int id = int.Parse(Console.ReadLine());
                    Console.Write("Introduce el Nombre: ");
                    string nombre = Console.ReadLine();
                    Crear(new Dato { Id = id, Nombre = nombre });
                    break;

                case "2":
                    Leer();
                    break;

                case "3":
                    Console.Write("Introduce el ID del dato a actualizar: ");
                    int idActualizar = int.Parse(Console.ReadLine());
                    Console.Write("Introduce el nuevo Nombre: ");
                    string nuevoNombre = Console.ReadLine();
                    Actualizar(idActualizar, nuevoNombre);
                    break;

                case "4":
                    Console.Write("Introduce el ID del dato a eliminar: ");
                    int idEliminar = int.Parse(Console.ReadLine());
                    Eliminar(idEliminar);
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

