using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace _08_Ej4FHAgregarTexto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*  CRUD
            4. Escriba un programa en C# Sharp para crear un archivo y agregar algo de texto.
                Salida esperada:
                Un archivo creado con el nombre de contenido mytest.txt*/
            
            string fileName = @"archivo.txt";

            // DELETE
            // Comprobamos que el archivo no existe
            if (File.Exists(fileName))
            {
                File.Delete(fileName);
                Console.WriteLine("El archivo {0} ha sido borrado", fileName);
            }

            File.Create(fileName).Close();
            Console.WriteLine("El archivo {0} ha sido creado con exito", fileName);

            // Agregando texto al archivo con StreamWriter
            Console.WriteLine("Agregando texto al archivo con StreamWriter");
            using (StreamWriter sw = new StreamWriter(fileName))
            {
                sw.WriteLine("G2 1 vs 3 TES");
                sw.WriteLine("Jugador MVP: Ruler");
            }

            // READ 
            Console.WriteLine("Leyendo el archivo con StreamReader");
            using (StreamReader sr = new StreamReader(fileName))
            {
                string linea;
                while ((linea = sr.ReadLine()) != null)
                {
                    Console.WriteLine(linea);
                }
            }

            string []info = { "AL 3 vs 2 T1", "GEN 3 vs 1 HLE", "KT 3 vs 0 CFO" };

            // UPDATE
            // Agregando texto al archivo con append
            Console.WriteLine("Agregando texto al archivo con AppendAllText");
            File.AppendAllText(fileName, "Campeon: GEN (GEN 3 vs 2 AL), Jugador MVP: Ruler" + Environment.NewLine);

            // Agregando texto con AppendAllLines
            Console.WriteLine("Agregando texto al archivo con AppendAllLines");
            File.AppendAllLines(fileName, info);

            // READ
            // Foreach
            Console.WriteLine("Leyendo el archivo con Foreach");
            foreach (string linea in File.ReadLines(fileName))
            {
                Console.WriteLine(linea);
            }
        }
    }
}
