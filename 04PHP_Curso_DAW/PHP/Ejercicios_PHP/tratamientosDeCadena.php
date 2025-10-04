<?php
// Ejemplo 1: strlen()
$texto1 = "Hola, mundo!";
$longitud = strlen($texto1);
echo "1. Longitud de la cadena: " . $longitud . "\n";

// Ejemplo 2: substr()
$caracter = substr($texto1, 5, 1);
echo "2. Carácter en la posición 5: " . $caracter . "\n";

// Ejemplo 3: str_replace()
$textoReemplazado = str_replace('o', 'a', $texto1);
echo "3. Cadena después de reemplazar 'o' por 'a': " . $textoReemplazado . "\n";

// Ejemplo 4: strpos()
$posicion = strpos($texto1, "mundo");
echo "4. Posición de 'mundo': " . $posicion . "\n";

// Ejemplo 5: strrpos()
$texto2 = "Hola, mundo! ¿Mundo?";
$ultimaPosicion = strrpos($texto2, "mundo");
echo "5. Última posición de 'mundo': " . $ultimaPosicion . "\n";

// Ejemplo 6: strcmp()
$texto3 = "Hola";
$texto4 = "Hola";
$comparacion = strcmp($texto3, $texto4);
echo "6. Comparación de 'Hola' con 'Hola': " . $comparacion . "\n";

// Ejemplo 7: substr()
$subcadena = substr($texto1, 0, 5);
echo "7. Subcadena de 'Hola, mundo!': " . $subcadena . "\n";

// Ejemplo 8: explode()
$texto5 = "Uno,Dos,Tres";
$partes = explode(",", $texto5);
echo "8. Cadena separada: \n";
foreach ($partes as $parte) {
    echo $parte . "\n";
}

// Ejemplo 9: strval()
$numero = 123;
$textoNumero = strval($numero);
echo "9. Número como cadena: " . $textoNumero . "\n";

// Ejemplo 10: intval()
$textoNumero2 = "456";
$numeroConvertido = intval($textoNumero2);
echo "10. Cadena convertida a número: " . $numeroConvertido . "\n";
?>