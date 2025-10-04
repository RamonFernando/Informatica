<!-- 7.Cuente los caracteres "r" en una cadena

Escriba un programa que cuente los caracteres "r" en el texto "w3resource". -->

<?php

    echo "13_Ej7Loops contar letrads en un String<br>";
    $str = "w3resource";

    // Contar caracteres en un string con la funcion substr_count
    // substr_count(string, character): sirve para contar cuántas veces aparece una subcadena dentro de otra
    $strlen = substr_count($str, 'r');

    echo "Texto: $str <br>";
    echo "Cantidad de r en el texto: $strlen";

    echo "<hr>";
    // Ejemplo mas complejo
    $texto = "abcabcabc";
    $strlen1 = substr_count($texto, "abc", 3, 3);
    // output: abc

    echo "Cantidad de letras (abc) dentro del texto: $strlen1";

?>