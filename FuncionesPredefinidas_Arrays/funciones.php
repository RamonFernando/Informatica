<?php

var_dump($nombre); // Muestra la información de $nombre. (Debuguear)
print_r($nombre); // Muestra la información de $nombre en un formato legible.

// Funciones de cadenas (Strings)
strlen($string); // Devuelve la longitud de una cadena.
strtoupper($string); // Convierte una cadena a mayúsculas.
strtolower($string); // Convierte una cadena a minúsculas.
substr($string, $start, $length); // Devuelve un segmento de la cadena desde $start y de longitud $length.
strpos($haystack, $needle); // Devuelve la posición de la primera aparición de $needle en $haystack.
str_replace($search, $replace, $subject); // Reemplaza todas las apariciones de $search por $replace en $subject.
trim($string); // Elimina espacios (u otros caracteres) al inicio y al final de la cadena.

// Funciones de arrays
count($array); // Devuelve el número de elementos en un array.
array_merge($array1, $array2); // Combina dos o más arrays.
array_push($array, $value); // Agrega uno o más elementos al final de un array.
array_pop($array); // Elimina el último elemento de un array y lo devuelve.
array_shift($array); // Elimina el primer elemento de un array y lo devuelve.
array_unshift($array, $value); // Agrega uno o más elementos al inicio de un array.
in_array($needle, $haystack); // Comprueba si un valor existe en un array.
array_keys($array); // Devuelve todas las claves de un array.
array_values($array); // Devuelve todos los valores de un array.

// Funciones de matemáticas
abs($number); // Devuelve el valor absoluto de un número.
round($number, $precision); // Redondea un número a un número específico de decimales.
ceil($number); // Redondea un número hacia arriba al entero más cercano.
floor($number); // Redondea un número hacia abajo al entero más cercano.
max($array); // Devuelve el valor máximo de un array o lista de números.
min($array); // Devuelve el valor mínimo de un array o lista de números.
rand($min, $max); // Genera un número aleatorio entre $min y $max.


// Funciones de fechas y hora
time(); // Devuelve el timestamp actual (número de segundos desde el 1 de enero de 1970).
date($format, $timestamp); // Devuelve una fecha formateada de acuerdo con $format.
strtotime($time, $now); // Convierte una descripción de fecha/hora en un timestamp.
mktime($hour, $minute, $second, $month, $day, $year); // Devuelve un timestamp para una fecha y hora específicos.


// Funciones de manipulación de archivos
file_get_contents($filename); // Lee el contenido de un archivo en una cadena.
file_put_contents($filename, $data); // Escribe datos en un archivo.
fopen($filename, $mode); // Abre un archivo con el modo especificado ('r', 'w', etc.).
fread($handle, $length); // Lee un número de bytes del archivo abierto.
fwrite($handle, $string); // Escribe datos en el archivo abierto.
fclose($handle); // Cierra un archivo abierto.
unlink($filename); // Elimina un archivo.
mkdir($dirname); // Crea un directorio.
rmdir($dirname); // Elimina un directorio.
rename($oldname, $newname); // Renombra un archivo o directorio.

// Funciones de manejo de variables
isset($var); // Comprueba si una variable está definida y no es null.
empty($var); // Comprueba si una variable está vacía (0, '', null, false, etc.).
is_array($var); // Comprueba si una variable es un array.
is_string($var); // Comprueba si una variable es una cadena.
is_numeric($var); // Comprueba si una variable es numérica.
unset($var); // Elimina una variable.

// Funciones de manejo de errores
error_reporting($level); // Establece el nivel de notificación de errores.
trigger_error($message, $type); // Genera un error de usuario.

// Funciones de base de datos (MySQLi)
mysqli_connect($host, $username, $password, $dbname); // Establece una conexión a la base de datos MySQL.
mysqli_query($connection, $query); // Ejecuta una consulta SQL en la base de datos.
mysqli_fetch_assoc($result); // Devuelve una fila como un array asociativo.
mysqli_close($connection); // Cierra la conexión a la base de datos.

// Funciones de sesiones
session_start(); // Inicia una nueva sesión o reanuda una existente.
$_SESSION['key'] = 'value'; // Establece una variable de sesión.
session_destroy(); // Elimina toda la información de la sesión.
session_unset(); // Limpia todas las variables de la sesión.
session_write_close(); // Cierra la sesión y escribe los datos de sesión en el disco.

// Funciones de cookies
setcookie($name, $value, $expire, $path, $domain, $secure, $httponly); // Establece una cookie.
// getcookie($name); // Obtiene el valor de una cookie.
// deletecookie($name); // Elimina una cookie.

// Funciones de redirección
header('Location: url'); // Redirige al navegador a la URL especificada.
exit(); // Termina el script actual.

?>