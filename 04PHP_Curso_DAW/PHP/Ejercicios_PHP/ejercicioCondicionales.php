<?php

// ej1 y ej2

define("NOMBRE_REQUERIDO", "usuario");
define("PASSWORD_REQUERIDO", "java8");

$nombreUsuario = readline("Introduce tu nombre de usuario: ");
$passwordUsuario = readline("Introduce tu contraseña: ");

if ($nombreUsuario === NOMBRE_REQUERIDO && $passwordUsuario === PASSWORD_REQUERIDO) {
    echo "Acceso permitido\n";
} else {
    echo "Acceso denegado\n";
}

// ej3

$numero = (int)readline("Introduce un número: ");

$resultado = ($numero % 2 !== 0) ? "Es impar" : "No es impar";

echo $resultado . "\n";

// ej4

$nota = (float)readline("Introduce la nota del examen: ");

if ($nota < 4) {
    $color = "Rojo";
} elseif ($nota >= 4 && $nota < 5) {
    $color = "Verde";
} elseif ($nota >= 5) {
    $color = "Azul";
} else {
    $color = "Nota inválida";
}

echo "Color para la nota: $color\n";

// ej5

$opcion = (int)readline("Elige un idioma:\n(1) Francés\n(2) Inglés\n(3) Alemán\n(4) Italiano\n");

switch ($opcion) {
    case 1:
        $saludo = "Bonjour";
        break;
    case 2:
        $saludo = "Good morning";
        break;
    case 3:
        $saludo = "Guten Morgen";
        break;
    case 4:
        $saludo = "Buongiorno";
        break;
    default:
        $saludo = "Buenos días";
}

echo $saludo . "\n";

?>