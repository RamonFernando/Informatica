using System;


namespace MetodosString_Ejemplos
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* // Metodos String // 

            // Manipulación de Cadenas //
            1. ToUpper()
            2. ToLower()
            3. Trim()
            4. TrimStart()
            5. TrimEnd()
            6. Replace(string oldValue, string newValue)

            // Busqueda //
            7. Contains(string value)
            8. IndexOf(string value)
            9. StartsWith(string value)
            10. EndsWith(string value)

            // División y Unión //
            11. Split(char[] separator)
            12. Join(string separator, string[] values)

            // Subcadenas //
            13. Substring(int startIndex, int length)
            14. Remove(int startIndex, int count)

            // Comparación //
            15. Equals(string value)
            16. Compare(string strA, string strB)

            // Información de la Cadena //
            17. Length (propiedad)
            18. IsNullOrEmpty(string value)
            19. IsNullOrWhiteSpace(string value)

            // Formatos y Transformaciones //
            20. PadLeft(int totalWidth, char paddingChar)
            21. PadRight(int totalWidth, char paddingChar)
            22. Format(string format, object args)
            23. ToCharArray()
            */
            
            // 1. ToUpper: Convierte todos los caracteres de una cadena a mayúsculas.
            string texto = "hola mundo";
            Console.WriteLine(texto.ToUpper()); // HOLA MUNDO

            // 2. ToLower: Convierte todos los caracteres de una cadena a minúsculas.
            string texto1 = "Esto es un texto";
            Console.WriteLine(texto1.ToUpper()); // esto es un texto

            // 3. Trim: Elimina los espacios en blanco iniciales y finales de una cadena.
            string texto2 = "   hola mundo   ";
            Console.WriteLine(texto2.Trim()); // "hola mundo"

            // 4. TrimStart: Elimina los espacios solo al principio(TrimStart)
            string texto4 = "   hola mundo   ";
            Console.WriteLine(texto4.TrimStart()); // "hola mundo   "

            // 5. TrimEnd: Elimina los espacios solo al final(TrimEnd).
            Console.WriteLine(texto4.TrimEnd());   // "   hola mundo"

            // 6. Replace(string oldValue, string newValue)
            // Replace: Reemplaza todas las apariciones de una subcadena por otra.
            string texto5 = "Esto es un texto";
            Console.WriteLine(texto5.Replace("es", "so")); // Esto so un texto
            
            // Busqueda

            // 7. Contains: Devuelve true si la cadena contiene la subcadena especificada. Contains(subcadena)
            string texto7 = "Esto es un texto";
            Console.WriteLine(texto7.Contains("es")); // true

            // 8. IndexOf(string value)
            // Devuelve la posición de la primera aparición de una subcadena, o -1 si no la encuentra.
            string texto8 = "hola mundo";
            Console.WriteLine(texto8.IndexOf("mundo")); // 5
            
            // 9. StartsWith(string value)
            // Comprueba si la cadena comienza con la subcadena especificada.
            string texto9 = "hola mundo";
            Console.WriteLine(texto9.StartsWith("hola")); // true
            
            // 10. EndsWith(string value)
            // Comprueba si la cadena termina con la subcadena especificada.
            Console.WriteLine(texto9.EndsWith("mundo")); // true
            
            // División y Unión
            
            // 11. Split(char[] separator)
            // Divide una cadena en un array de subcadenas usando un separador.
            string texto10 = "manzana,pera,platano";
            string[] frutas = texto10.Split(',');
            foreach (var fruta in frutas) {
                Console.WriteLine(fruta); // manzana, pera, platano
            }
            
            // 12. Join(string separator, string[] values)
            // Une un array de cadenas en una sola cadena, separadas por el separador especificado.
            string[] frutas1 = { "manzana", "pera", "platano" };
            string resultado = string.Join(", ", frutas1);
            Console.WriteLine(resultado); // manzana, pera, platano
            
            // Subcadenas
            
            // 13. Substring(int startIndex, int length)
            // Extrae una subcadena que comienza en el índice especificado y tiene la longitud indicada.
            string texto11 = "hola mundo";
            Console.WriteLine(texto11.Substring(0, 4)); // hola
            // Substring: Devuelve una subcadena de una cadena. Substring(Posicion y longitud.)
            string texto3 = "Esto es un texto";
            Console.WriteLine(texto3.Substring(0, 3)); // Est

            // 14. Remove(int startIndex, int count)
            // Elimina una parte de la cadena a partir del índice especificado.
            string texto12 = "hola mundo";
            Console.WriteLine(texto12.Remove(4, 6)); // hola

            // Comparación
            
            // 15. Equals(string value)
            // Comprueba si dos cadenas son iguales.
            string texto13 = "hola";
            string texto14 = "hola";
            Console.WriteLine(texto13.Equals(texto14)); // true
            
            // 16. Compare(string strA, string strB)
            // Compara dos cadenas.Devuelve un valor negativo, cero o positivo
            // dependiendo de si strA es menor, igual o mayor que strB.
            string texto15 = "hola";
            string texto16 = "mundo";
            Console.WriteLine(string.Compare(texto15, texto16)); // -1
            
            // Información de la Cadena
            
            // 17. Length(propiedad)
            // Devuelve la longitud de la cadena.
            string texto17 = "hola mundo";
            Console.WriteLine(texto17.Length); // 10
            
            // Length: Devuelve la longitud de una cadena.
            string texto6 = "Esto es un texto";
            Console.WriteLine(texto6.Length); // 18

            // 18. IsNullOrEmpty(string value) 
            // Comprueba si la cadena es null, está vacía o contiene solo espacios en blanco.
            string texto18 = " ";
            Console.WriteLine(string.IsNullOrEmpty(texto18)); // false
            
            // 19.IsNullOrWhiteSpace(string value)
            // Comprueba si la cadena es null, está vacía o contiene solo espacios en blanco.
            Console.WriteLine(string.IsNullOrWhiteSpace(texto18)); // true
            
            // Formatos y Transformaciones
            
            // 20. PadLeft(int totalWidth, char paddingChar)
            // Rellena la cadena con un carácter a la izquierda o derecha hasta alcanzar un ancho total.
            string texto19 = "hola";
            // Rellena a la Izquierda
            Console.WriteLine(texto19.PadLeft(10, '-')); // ------hola
            
            // 21. PadRight(int totalWidth, char paddingChar)
            // Rellena a la Derecha
            Console.WriteLine(texto19.PadRight(10, '-')); // hola------
            
            // 22. Format(string format, object args)
            // Formatea una cadena con valores específicos.
            string formato = "Hola {0}, tienes {1} mensajes.";
            Console.WriteLine(string.Format(formato, "Juan", 5)); // Hola Juan, tienes 5 mensajes.
            
            // 23. ToCharArray()
            // Convierte la cadena en un array de caracteres.
            string texto20 = "hola";
            char[] caracteres = texto20.ToCharArray();
            foreach (var caracter in caracteres) {
                Console.WriteLine(caracter); // h o l a
            }
        }
    }
}
