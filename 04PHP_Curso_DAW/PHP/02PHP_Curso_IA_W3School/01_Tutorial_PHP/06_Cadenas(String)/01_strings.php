<?php
/*
Resumen de cadenas
Longitud de cadena	strlen()	strlen("Hola") -> 4
Reemplazar texto	str_replace()	str_replace("a", "o", "Hola") -> Holo
Convertir a mayúsculas	strtoupper()	strtoupper("hola") -> HOLA
Buscar subcadena	strpos()	strpos("Hola", "o") -> 1
Cortar cadena	substr()	substr("Hola", 1, 2) -> ol

1. Formas de definir cadenas
a. Comillas dobles (")
Permiten interpolación de variables y caracteres de escape.*/

$nombre = "Juan";
echo "Hola, $nombre\n"; // Interpolación de la variable
echo "Esto incluye un salto de línea\n";

/*
b. Comillas simples (')
Más rápidas y simples, pero no permiten interpolación.
*/

$nombre = "Juan";
echo 'Hola, $nombre\n'; // Salida: Hola, $nombre\n (literal)

/*
c. Heredoc (<<<)
Útil para manejar cadenas largas con formato.*/

$nombre = "Juan";
$mensaje = <<<EOD
Hola, $nombre. 
Este es un mensaje largo
con múltiples líneas.
EOD; // No se requiere el salto de línea
echo $mensaje;

/*d. Nowdoc (<<<')
Como heredoc, pero no permite interpolación.*/
// EOD: No se requiere el salto de línea
$mensaje = <<<'EOD'
Hola, $nombre.
Esto se mostrará de forma literal.
EOD;
echo $mensaje;

/*2. Operaciones con cadenas
a. Concatenación
Se usa el operador . para unir cadenas.*/

$saludo = "Hola";
$nombre = "Mundo";
echo $saludo . " " . $nombre; // Salida: Hola Mundo

/*
b. Interpolación de variables
Solo con comillas dobles o heredoc.*/

$nombre = "PHP";
echo "Me encanta $nombre\n"; // Salida: Me encanta PHP


// Ejemplo práctico
$nombre = "Juan";
$saludo = "Hola";
echo strtoupper("$saludo, $nombre.\n"); // Salida: HOLA, JUAN.
echo "Tu nombre tiene " . strlen($nombre) . " letras.\n"; // Salida: 4 letras

?>


