<!-- 2.Mostrar colores en un formato específico

$color = array('blanco', 'verde', 'rojo'')
Escriba un script PHP que muestre los colores de la siguiente manera:
Salida:
blanco, verde, rojo,

verde
rojo
blanco
Salida:
blanco, verde, rojo, -->

<?php
echo "<h1>2.Ejercicio 6</h1><br>";
$color = array('blanco', 'verde', 'rojo');

// Mostrar los colores en un formato específico
echo implode (", ", $color);
?>