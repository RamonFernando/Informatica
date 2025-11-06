using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace TipoDatosYOperadores
{
    public class Ej2EntradaConsola
    {
        /**
        Ejercicio 2: Crea un programa que pida al usuario dos números por consola
        y muestre la suma, resta, multiplicación y división de ambos.
        */
        public static void OperacionesMatematicas()
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("===================================");
                Console.WriteLine("  Operaciones matematicas basicas");
                Console.WriteLine("===================================");
                Console.WriteLine("1. Sumar");
                Console.WriteLine("2. Restar");
                Console.WriteLine("3. Multiplicar");
                Console.WriteLine("4. Dividir");
                Console.WriteLine("0. Salir");

                // Variables
                double num1, num2, result;

                // Validaciones de entrada
                if (!int.TryParse(Console.ReadLine(), out int opc) || opc < 0 || opc > 4)
                {
                    Console.WriteLine("Numero ingresado no valido, introduce un numero entero.");
                    Console.ReadLine();
                    continue;
                }
                if (opc == 0)
                {
                    Console.WriteLine("Saliendo del ejercicio...");
                    return;
                }

                Console.WriteLine("Ingresa el primer numero: ");
                num1 = ValidarNumero();
                Console.WriteLine("Ingresa el segundo numero: ");
                num2 = ValidarNumero();

                switch (opc)
                {
                    case 1:
                        result = num1 + num2;
                        Console.WriteLine("El resultado de la suma es: {0:0.00}", result);
                        Console.WriteLine("Presiona cualquier tecla para volver al menu...");

                        break;
                    case 2:
                        result = num1 - num2;
                        Console.WriteLine("El resultado de la resta es: {0:0.00}", result);
                        Console.WriteLine("Presiona cualquier tecla para volver al menu...");

                        break;
                    case 3:
                        result = num1 * num2;
                        Console.WriteLine("El resultado de la multiplicacion es: {0:0.00}", result);
                        Console.WriteLine("Presiona cualquier tecla para volver al menu...");

                        break;
                    case 4:
                        if(num2 == 0)
                        {
                            Console.WriteLine("No se puede dividir por 0.");
                            break;
                        }
                        result = num1 / num2;
                        Console.WriteLine("El resultado de la division es: {0:0.00}", result);
                        Console.WriteLine("Presiona cualquier tecla para volver al menu...");

                        break;
                    default:
                        Console.WriteLine("Opcion no valida, vuelve a introducir un numero.");
                        break;
                }
                Console.ReadKey();
            }
        }
        public static double ValidarNumero()
        {
            double num;
            while (!double.TryParse(Console.ReadLine(), out num))
                Console.WriteLine("Numero ingresado no valido, introduce un numero entero.");

            return num;
        }
    }
}
