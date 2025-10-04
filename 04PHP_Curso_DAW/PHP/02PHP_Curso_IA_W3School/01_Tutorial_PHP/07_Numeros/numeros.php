<?php
/*
PHP tiene las siguientes constantes predefinidas para números enteros:

PHP_INT_MAX - El entero más grande admitido
PHP_INT_MIN - El número entero más pequeño admitido
PHP_INT_SIZE - El tamaño de un número entero en bytes
PHP tiene las siguientes funciones para comprobar si el tipo de una variable es entero:

is_int() // alias de is_integer para comprobar si el tipo de una variable es entero
is_integer() - alias de is_int()
is_long() - alias de is_int()

PHP tiene las siguientes constantes predefinidas para floats (a partir de PHP 7.2):

PHP_FLOAT_MAX - El número de coma flotante representable más grande
PHP_FLOAT_MIN - El número de coma flotante positivo representable más pequeño
PHP_FLOAT_DIG - El número de dígitos decimales que se pueden redondear a un Float y retroceder sin pérdida de precisión
PHP_FLOAT_EPSILON - El número positivo representable más pequeño x, de modo que x + 1.0 != 1.0
PHP tiene las siguientes funciones para comprobar si el tipo de una variable es float:

is_float()
is_double() - alias de is_float()

PHP tiene las siguientes funciones para verificar si un valor numérico es finito o infinito:

is_finite()
is_infinite()

PHP NaN
NaN significa Not a Number.

NaN se utiliza para operaciones matemáticas imposibles.

PHP tiene las siguientes funciones para comprobar si un valor no es un número:

is_nan()

Verificar si un valor es numérico:
is_numeric()

Funcion que convierte un string en un entero:
(integer)
intval()

Ejemplos:
// Cast float to int
$x = 23465.768; float
$int_cast = (int)$x;
echo $int_cast;

echo "<br>";

// Cast string to int
$x = "23465.768"; string
$int_cast = (int)$x;
echo $int_cast;

is_int() funcion que se utiliza para determinar si una variable es de tipo
entero (integer). Devuelve true si la variable es un número entero, y false
en caso contrario.
*/
?>