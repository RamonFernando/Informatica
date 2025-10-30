using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_Ej2FileHandlingEliminar
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
             2. Escriba un programa en C# Sharp para eliminar un archivo del disco.
            Salida esperada :

            Eliminar un archivo del disco (primero crear el archivo):                                                    
            ----------------------------------------------                                                
            El archivo mytest.txt se eliminó correctamente.
 
            Eliminar un archivo del disco (primero crear el archivo):                                                    
            ----------------------------------------------                                                
            El archivo no existe
             */
            string fileName1 = @"mytest.txt";
            File.Create(fileName1).Close();

            //Escribimos en el archivo
            using (StreamWriter sw = File.CreateText(fileName1))
            {
                sw.WriteLine("G2 Winner!");
            }
            
            try
            {
                if (File.Exists(fileName1)) // comprobamos si el archivo existe
                {
                    File.Delete(fileName1);
                    Console.WriteLine("El archivo {0} se elimino correctamente", fileName1);
                }
                else
                {
                    Console.WriteLine("El archivo {0} no existe", fileName1);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex.Message);
            }

        }
    }
}
