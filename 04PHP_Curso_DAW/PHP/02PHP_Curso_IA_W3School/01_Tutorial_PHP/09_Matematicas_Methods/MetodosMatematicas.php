<?php

// creamos un nuevo array
$numeros = array(5, 10, 15, 30, 12, 3, 9, 25);

echo max($numeros); // devuelve el mayor
echo min($numeros); // devuelve el menor
echo pow(2, 3); // 2 elevado a la 3
echo sqrt(64); // raiz cuadrada
echo abs(-10); // valor absoluto(positivo) de -10 es 10
echo pi(); // devuelve el valor de pi (3.1415926535898)
echo rand(1, 100); // devuelve un numero aleatorio entre 1 y 100

// redondear
echo round(2.5); // 3 redondea al numero entero mas cercano
echo round(2.4); // 2 redondea hacia al numero entero mas cercano
echo ceil(2.1); // 3 redondea hacia arriba
echo floor(2.9); // 2 redondea hacia abajo

?>