using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosConsola
{
    internal class Program
    {
        static void Main(string[] args) {
            // Ejercicios de programación en C# Entrada y salida de datos
            // Pide los datos de nombre y edad y los muestra mediante una funcion mostrarDatos()

            // Llamamos a la función
            // Console.WriteLine(MostrarDatos());
            
            // Llamamos a la segunda funcion
            MostrarDatos("Maite", 25);

            // Llamamos a la tercera funcion asignandole un valor
            bool mayor = esMayorDeEdad(17);
            Console.WriteLine("Eres mayor de edad? " + mayor);

            // Llamamos a la cuarta funcion
            int numero = numeroSecreto();

            // Llamamos a la quinta funcion
            NumeroSecreto2();
            
            Console.ReadKey();
        }
        
        // Funcion que pide los datos por consola y devuelve un string
        public static string MostrarDatos() {
        
            // Función para leer los datos
        Console.WriteLine("Introduce tu nombre");
        string nombre = Console.ReadLine(); // Leemos el nombre
        
        Console.WriteLine("Introduce tu edad");
        int edad = Convert.ToInt32(Console.ReadLine()); // Convertimos la edad a entero
        
        string datos = "Tu nombre es " + nombre + " y tienes " + edad + " años";
        return datos;
        }
        
        // Funcion con los datos pasados como argumentos 
        public static void MostrarDatos(string nombre, int edad) {
            Console.WriteLine("Tu nombre es " + nombre + " y tienes " + edad + " años");
        }

        // Funcion booleana que devuelve true si la edad es mayor o igual a 18
        public static bool esMayorDeEdad(int edad) {
            // Si la edad es mayor o igual a 18, devuelve true
            return edad >= 18; 
        }

        // Funcion que adivina el numero secreto
        public static int numeroSecreto() {
            
            // Definimos las variables
            int NUMERO_SECRETO = new Random().Next(1, 5); // Generamos un numero aleatorio entre 1 y 5
            int numero = 0;
            int contador = 0;

            Console.WriteLine("Adivina el numero secreto");
            Console.WriteLine($"Introduce un numero: {3 - contador} intento/intentos");
            try{
            
            while (contador < 3) {
                numero = Convert.ToInt32(Console.ReadLine()); // Convertimos la entrada a entero
                // Comprobamos que el numero no sea negativo ni un decimal o un caracter
                if (numero > 0) {
                    contador++;
                    
                    if (numero == NUMERO_SECRETO) {
                    Console.WriteLine("Has acertado el numero al " + contador + "º intento/intentos");
                    
                    } else if (contador < 3) {
                        Console.WriteLine("Has fallado, introduce otro numero " + (3 - contador) + " intento/intentos");
                    }else {
                        Console.WriteLine("Has perdido ! El numero era " + NUMERO_SECRETO);
                    }
                    
                }else{
                    Console.WriteLine("Introduce un numero valido: " + (3 - contador) + " intento/intentos");
                }
            
            }
            }
            catch (System.Exception e) {
                Console.WriteLine("Error! " + e.Message);
            }
            
            return numero;
        }

        public static int NumeroSecreto2()
{
    // Definimos las constantes y variables
    const int NUMERO_SECRETO = 5;
    int numero = -1; // Inicializamos con un valor fuera del rango permitido
    int contador = 0;
    const int maxIntentos = 3;

    Console.WriteLine("¡Adivina el número secreto!");

    while (contador < maxIntentos)
    {
        Console.WriteLine($"Introduce un número entero válido (Intento {contador + 1} de {maxIntentos}):");

        // Leer entrada del usuario y validar
        string input = Console.ReadLine();

        // Convertimos la entrada a un número entero y lo almacenamos en la variable "numero"
        if (int.TryParse(input, out numero) && numero >= 0) // Validar que sea un número entero no negativo
        {
            contador++;
            // Comprobamos si el número es el secreto
            if (numero == NUMERO_SECRETO) {
                Console.WriteLine($"¡Has acertado el número secreto al {contador}º intento!");
                return numero;
            }
            else if (contador < maxIntentos) {
                Console.WriteLine($"Has fallado, te quedan {maxIntentos - contador} intentos.");
            } else {
                Console.WriteLine($"¡Has perdido! El número secreto era {NUMERO_SECRETO}.");
            }

        } else {
            Console.WriteLine("Entrada no válida. Por favor, introduce un número entero no negativo.");
        }
    }

    // Devolvemos el último valor ingresado (aunque no sea correcto) como resultado
    return numero;
}

    }
}




