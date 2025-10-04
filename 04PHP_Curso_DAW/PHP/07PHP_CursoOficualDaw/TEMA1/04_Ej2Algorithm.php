<!-- 2.Diferencia absoluta con Triple
Escriba un programa PHP para obtener la diferencia absoluta entre n y 51.
Si n es mayor que 51 devuelve el triple de la diferencia absoluta.
Entrada de muestra:
53 30 51
Salida de muestra:
6 21 0 -->
<?php
    echo "Ejercicio 4 Algoritmos<br>";

    // Entrada
    $n = 54;
    $num1 = 53;
    $num2 = 30;
    $num3 = 51;

    // Diferencia absoluta $n y $num3 si n es mayor que $num3 devuelve el triple de la diferencia absoluta
    if ($n > $num3)
        echo "Triple diferencia absoluta: " . $n . " y " . $num3 . " es (" . abs($n - $num3) . ") * 3 = " . 3 * abs($n - $num3) . "<br>";
    else
        echo "Triple diferencia absoluta: " . $n . " y " . $num3 . " es (" . abs($n - $num3) . ") = " . abs($n - $num3) . "<br>";
    
    // Diferencia absoluta $n1 y $num2
    if($n > $num1)
        echo "Triple diferencia absoluta: " . $n . " y " . $num1 . " es " . 3 * abs($n - $num1) . "<br>";
    else
        echo "Diferencia absoluta: " . $n . " y " . $num1 . " es " . abs($n - $num1) . "<br>";
    

    // Diferencia absoluta $num1 y $num2
    if($n > $num2)
        echo "Triple diferencia absoluta: " . $num1 . " y " . $num2 . " es " . 3 * abs($num1 - $num2) . "<br>";
    else
        echo "Diferencia absoluta: " . $num1 . " y " . $num2 . " es " . abs($num1 - $num2) . "<br>";

    // Diferencia absoluta $num2 y $num3
    if($num2 > $num3)
        echo "Triple diferencia absoluta: " . $num2 . " y " . $num3 . " es " . 3 * abs($num2 - $num3) . "<br>";
    else
        echo "Diferencia absoluta: " . $num2 . " y " . $num3 . " es " . abs($num2 - $num3) . "<br>";
?>
