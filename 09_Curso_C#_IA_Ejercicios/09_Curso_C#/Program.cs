using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09_Curso_C_
{
    internal class Program
    {
        static void Main(string[] args) {
            // Variables y Operadores
            Console.WriteLine("Variables y Operadores en C#");
            int a = 10;
            int b = 5;
            int c = a + b;
            Console.WriteLine("El resultado es: " + c);

            // Tipos de Datos
            Console.WriteLine("Tipos de Datos");
            short corto = 1;
            int entero = 10;
            decimal pi = 3.14m;
            double doble = 3.14;
            float flotante = 3.14f;
            char caracter = 'A';
            string texto = "Hola Mundo";
            bool verdadero = true;
            bool falso = false;

            Console.WriteLine("Corto: " + corto);
            Console.WriteLine("Entero: " + entero);
            Console.WriteLine("Decimal: " + pi);
            Console.WriteLine("Double: " + doble);
            Console.WriteLine("Float: " + flotante);
            Console.WriteLine("Caracter: " + caracter);
            Console.WriteLine("Texto: " + texto);
            Console.WriteLine("Verdadero: " + verdadero);
            Console.WriteLine("Falso: " + falso);

            // Condicionales
            Console.WriteLine("Condicionales");
            int edad = 18;
            if (edad >= 18) {
                Console.WriteLine("Eres mayor de edad");
            }else{
                Console.WriteLine("Eres menor de edad");
            }
            // Switch con dias de la semana
            Console.WriteLine("Switch con dias de la semana");
            int dia = 1;
            switch (dia) {
                case 1:
                    Console.WriteLine("Lunes");
                    break;
                case 2:
                    Console.WriteLine("Martes");
                    break;
                case 3:
                    Console.WriteLine("Miercoles");
                    break;
                case 4:
                    Console.WriteLine("Jueves");
                    break;
                case 5:
                    Console.WriteLine("Viernes");
                    break;
                case 6:
                    Console.WriteLine("Sabado");
                    break;
                case 7:
                    Console.WriteLine("Domingo");
                    break;
                default:
                    Console.WriteLine("Dia no valido");
                    break;
            }

            // Operador Ternario
            Console.WriteLine("Operador Ternario");
            int numPar = 10;
            Console.WriteLine((numPar % 2 == 0) ? "Es par" : "Es impar");

            // Operador ternario en una funcion 
            Console.WriteLine("Operador ternario en una funcion");
            string esPar(int numero) {
                return (numero % 2 == 0) ? ("El " + numero + " es par") : ("El " + numero + " es impar");
            }
            Console.WriteLine(esPar(11));

            // Bucles
            Console.WriteLine("Bucles");
            Console.WriteLine("For");
            for (int indice = 0; indice < 10; indice++) {
                Console.Write(indice + " ");
            }
            int index = 0;
            Console.WriteLine("\nWhile");
            while (index < 10) {
                Console.Write(index + " ");
                index++;
            }
            Console.WriteLine("\nDo While");
            do {
                Console.Write("index: " + index + " ");
                index++;
            } while (index < 10);
            int numeroPositivo = 0;

            // Introduciendo un numero positivo por consola
            do {
                Console.Write("Introduce un numero positivo: ");
                numeroPositivo = int.Parse(Console.ReadLine());
                if(numeroPositivo > 0) {
                    Console.WriteLine("El numero es: " + numeroPositivo);
                }else{
                    Console.WriteLine("El numero no es valido");
                }
            }while (numeroPositivo != 0);

            Console.WriteLine();
            // Funciones
            Console.WriteLine("Funciones");
            int sumar(int numero1, int numero2) {
                return numero1 + numero2;
            }
            Console.WriteLine("La suma es: " +  sumar(1, 2));

            int restar(int numero1, int numero2) {
                int resultado = numero1 - numero2;
                Console.WriteLine("La resta es: " + resultado);
                return resultado;
            }
            restar(1, 2);

            // Arrays
            Console.WriteLine("Arrays");
            int[] numeros = { 1, 2, 3, 4, 5, 11, 31, 14, 9 };
            int[] numeros1 = { 1, 2, 3, 4, 5, 11, 31, 14, 9, 12 };
            string[] nombres = { "Juan", "Pedro", "Maria" };
            
            Console.WriteLine("El tamaño del array es: " + numeros.Length);
            Console.WriteLine("El valor en la posicion 2 es: " + numeros[2]);
            numeros[2] = 10;
            Console.WriteLine("El valor en la posicion 2 es: " + numeros[2]);

            // Metodos de Arrays
            Console.WriteLine("Metodos de Arrays");
            // Invertir el orden de los elementos del array
            Array.Reverse(numeros); // [9, 14, 31, 11, 5, 4, 3, 2, 1]
            
            // Ordenar el array
            Array.Sort(numeros); // [1, 2, 3, 4, 5, 9, 11, 14, 31]
            
            // Eliminar elementos del array (nombre del array, posicion, cantidad de elementos)
            Array.Clear(numeros1, 0, numeros.Length); // mostraria [0, 0, 0, 0, 0, 0, 0, 0, 0]

            // Copiar arrays y clonarlos en un nuevo array
            int[] numeros2 = new int[numeros.Length];
            Array.Copy(numeros, numeros2, numeros.Length);

            // Metodo filter
            int[] numeros3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] numeros4 = numeros3.Where(x => x % 2 == 0).ToArray();

            // Metodo join
            int[] numeros13 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            string numeros14 = string.Join(",", numeros13);

            // Metodo select
            int[] numeros15 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] numeros16 = numeros15.Select(x => x * 2).ToArray();

            // Metodo skip
            int[] numeros17 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] numeros18 = numeros17.Skip(3).ToArray();

            // Metodo take
            int[] numeros19 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] numeros20 = numeros19.Take(3).ToArray();

            // Metodo reduce
            int[] numeros23 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int numeros24 = numeros23.Aggregate((x, y) => x + y);

            // Recorrer arrays
            foreach (var numero in numeros) {
                Console.Write(numero + " ");
            }
            Console.WriteLine();
            foreach (var nombre in nombres) {
                Console.Write(nombre + " ");
            }

            Console.WriteLine("\nEl valor en la posicion 2 es: " + numeros[2]);
            Array.Reverse(numeros);
            Console.WriteLine("El valor en la posicion 2 es: " + numeros[2]);
            Array.Clear(numeros, 0, numeros.Length);
            Console.WriteLine("El valor en la posicion 2 es: " + numeros[2]);


            // Matrices o Arrays Bidimensionales
            Console.WriteLine("Matrices o Arrays Bidimensionales");
            int[,] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            string[,] matriz2 = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
            Console.WriteLine("El valor en la posicion 1, 2 es: " + matriz[1, 2]);
            Console.WriteLine("El valor en la posicion 2, 2 es: " + matriz[2, 2]);

            Console.WriteLine("\nMetodos para recorrer arrays bidimensionales");
            // Metodo para recorrer arrays bidimensionales
            for (int i = 0; i < matriz.GetLength(0); i++) {
                for (int j = 0; j < matriz.GetLength(1); j++) {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }

            // Metodo para recorrer arrays bidimensionales con foreach
            foreach (var item in matriz2) {
                Console.Write(item + " ");
            }
            Console.WriteLine();

            // Listas
            Console.WriteLine("Listas");
            List<int> lista = new List<int>();
            lista.Add(1);
            lista.Add(2);
            lista.Add(3);
            Console.WriteLine("El tamaño de la lista es: " + lista.Count);

            // Metodos de String o Cadenas de Texto
            string cadena = "Monitor 20\" Pulgadas";
            Console.WriteLine("La longitud de la cadena es: " + cadena.Length);
            Console.WriteLine("La cadena en mayusculas es: " + cadena.ToUpper());
            Console.WriteLine("La cadena en minusculas es: " + cadena.ToLower());

            Console.ReadKey();
            }
    }
}
