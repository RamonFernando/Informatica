<?php

// 31. Escribe un programa PHP para intercambiar dos variables.
echo "·Ejercicio 31 <br>";
$a = 10;
$b = 20;
$aux = 0;
echo "El valor de a es $a y el de b es $b <br>";
echo "Cambio de las variables con aux: <br>";
$aux = $a; // aux = 10
$a = $b; // a = 20
$b = $aux; // b = 10

echo "aux = $aux <br>";
echo "a = $a <br>";
echo "b = $b <br>";

echo "El valor de a es $a y el de b es $b <br>";

echo "Cambio de las variables sin aux: <br>";
$a = $a + $b; // a = 10 + 20 = 30
$b = $a - $b; // b = 30 - 20 = 10
$a = $a - $b; // a = 30 - 10 = 20
echo "a = $a <br>";
echo "b = $b <br>";

echo "Cambio de variables con listas y arrays: <br>";
$a = 10;
$b = 20;
echo "a = $a <br>";
echo "b = $b <br>";
list($a, $b) = array($b, $a); // intercambia los valores de a y b creando una nueva lista con los valores intercambiados
echo "a = $a <br>";
echo "b = $b <br>";
echo "<br><br>";
// 32. Escriba un programa PHP para verificar si un número es un número de Armstrong o no. Devuelve true si el número es Armstrong, de lo contrario devuelve false.
// Nota: Un número de Armstrong de tres dígitos es un número entero de modo que la suma de los cubos de sus dígitos es igual al número mismo. Por ejemplo, 153 es un número de Armstrong desde 1**3 + 5**3 + 3**3 = 153

echo "Ejercicio 32 <br>";
echo "Introduce un numero: <br>";
$num = 153;
$result = 0;
$len = strlen($num); // longitud del numero
for ($i = 0; $i < $len; $i++) {
    $result += pow(intval(substr($num, $i, 1)), $len); // crea un array con la longitud del numero
}
if ($result == $num) {
    echo "El numero $num es un numero de Armstrong";
} else {
    echo "El numero $num no es un numero de Armstrong";
}

// 33. Escribe un programa PHP para convertir palabra en dígito.
// Entrada: cero; tres; cinco; seis; ocho; uno
// Salida: 035681

// 34. Escriba un programa PHP para comprobar que los bits de las dos posiciones dadas de un número son iguales o no.
// 112 - > 01110000
/*Prueba 2a y 3a posición
Resultado: Verdadero
Prueba 4a y 5a posición
Resultado: Falso*/

// 35. Escriba un programa PHP para eliminar duplicados de una lista ordenada.
// Entrada: (1,1,2,2,3,4,5,5)
// Salida: (1,2,3,4,5)

// 36. Escriba un programa PHP para probar si una cadena dada ocurre al final de otra cadena dada.

// 37. Escriba un programa PHP para calcular la suma de los números primos menores de 100.
// Nota: Hay 25 números primos en menos de 100.
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 y la suma de todos estos números es 1060.

// 38. Escribe un programa PHP para validar una dirección de correo electrónico.

// 39. Escribe un programa PHP para obtener el tamaño de un archivo.

// 40. Escriba un programa PHP para calcular el mod de dos enteros dados sin usar ningún operador de módulo incorporado.

?>