using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesafioMetodos
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Nombre de los amigos: ");
            string nombre1 = "Nicolas";
            string nombre2 = "Genesis";
            string nombre3 = "Jorge";

            SaludarAmigo(nombre1);
            SaludarAmigo(nombre2);
            SaludarAmigo(nombre3);

            Console.WriteLine();

            Console.WriteLine("Nombre de los amigos en el mismo metodo: ");
            SaludarAmigo(nombre1, nombre2, nombre3);

            Console.WriteLine();

            Console.WriteLine("Ingresa el nombre de un amigo: ");
            string amigo = Console.ReadLine();
            SaludarAmigo1(amigo);

            Console.ReadKey();
            
        }
        public static void SaludarAmigo(string nombre){
            Console.WriteLine("Hola \"{0}\", que tengas un buen dia!", nombre);
        }
        public static void SaludarAmigo(string nombre1, string nombre2, string nombre3){
            Console.WriteLine("Hola \"{0}\", que tengas un buen dia!", nombre1);
            Console.WriteLine("Hola \"{0}\", que tengas un buen dia!", nombre2);
            Console.WriteLine("Hola \"{0}\", que tengas un buen dia!", nombre3);
        }

        public static void SaludarAmigo1(string nombre) { 
            Console.WriteLine("Hola \"{0}\", que tengas un buen dia!", nombre);
        }
    }
}
