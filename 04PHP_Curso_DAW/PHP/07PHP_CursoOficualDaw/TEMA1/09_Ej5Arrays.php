<!-- 5.Obtener el primer elemento de una matriz asociativa

$color = array(4 => 'blanco', 6 => 'verde', 11=> 'rojo');
Escriba un script PHP para obtener el primer elemento de la matriz anterior.
Resultado esperado: blanco  -->

<?php
echo "<h1>09_Ej5.Obtener el primer elemento de una matriz asociativa</h1>";
$color = array(4 => 'blanco', 6 => 'verde', 11=> 'rojo');

// Ejemplo 1
echo $color[4] . "<br>";

// Ejemplo 2
// array_value: coge el valor de un array asociativo
array_values($color)[0]; // Recoge el valor 0 del array

// Ejemplo 3
// reset: devuelve la posicion 0 del array
echo reset($color);

?>
