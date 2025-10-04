<?php
// Definimos una función para calcular el área de un círculo
function calcularAreaCirculo($radio) {
    /*
    La fórmula para el área de un círculo es:
    A = π * r^2
    Donde:
    - π es una constante (3.14159)
    - r es el radio del círculo
    */
    $pi = 3.14159; # Definimos el valor de π
    return $pi * $radio * $radio; // Retornamos el área
}

// Llamamos a la función y mostramos el resultado
echo calcularAreaCirculo(5); // Radio de 5 unidades

# Este es otro estilo de comentario válido
$saludo = "Hola Mundo";
?>
