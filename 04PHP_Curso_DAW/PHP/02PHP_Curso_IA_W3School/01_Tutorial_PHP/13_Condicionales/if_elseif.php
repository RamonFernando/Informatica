<?php


// if_elseif.php
// Ejemplo 1 de estructura de control if-elseif-else
$edad = 18;
$residente = true;

if ($edad >= 18) {
    if ($estadoCivil) {
        echo "Puedes votar.";
    } else {
        echo "No puedes votar.";
    }
} else {
    echo "No puedes votar.";
}

// Ejemplo 2
// ellse if
$edad = 17;
if ($edad >= 18) {
    echo "Puedes votar.";
    echo "Eres hombre.";
} elseif ($edad >= 16) {
    echo "Puedes votar.";
    echo "Eres adolescente.";
} else {
    echo "No puedes votar.";
    echo "Eres un niño.";
}

// Ejemplo 3
// Introduciendo datos por consola con readline
echo "Introduce tu edad: ";
$edad = intval(readline()); // Convertimos la entrada en un entero
if($edad < 1 || $edad > 130 || $edad == ""){
    echo "Introduce un número válido.";
}else{
    echo ($edad >= 18) ? "Puedes pasar!" : "No puedes pasar!";
}

// Ejemplo 4
// Introduciendo datos por consola y usando validaciones
echo "Introduce tu edad: ";
$entrada = readline();
// ctype_digit: Comprueba si una cadena es un número entero y comprueba el rango de edad especificado
if (!ctype_digit($entrada) || intval($entrada) < 1 || intval($entrada) > 130) {
    echo "Introduce un número válido.";
} else {
    $edad = intval($entrada); // Convertimos la entrada en un entero
    echo ($edad >= 18) ? "Puedes pasar!" : "No puedes pasar!";
}

?>