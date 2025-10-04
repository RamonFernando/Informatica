<?php
// Ejemplo de funciones

// Funciones sin parámetros
function responder() {
    echo "¡Hola, mundo!\n";
}
responder();

// Funciones con parámetros
function saludar($nombre) {
    return "Hola, $nombre. ¡Bienvenido!\n";
}
echo saludar("Juan");

// Funciones con varios parámetros
function sumar($num1, $num2) {
    return $num1 + $num2;
}
echo sumar(5, 3);

// Funciones con parámetros predefinidos con valores por defecto
function saludarPersonal($nombre = "Desconocido") {
    return "Hola, $nombre. ¡Bienvenido!\n";
}
echo saludarPersonal("Juan");
echo saludarPersonal();

// Funciones con arreglos
function calcularPromedio($notas) {
    $total = 0;
    foreach ($notas as $nota) {
        $total += $nota;
    }
    return $total / count($notas);
}
$notas = [8, 9, 7, 6, 8];
echo "El promedio es: " . calcularPromedio($notas);

// Funciones booleanas
function esPar($numero) {
    return $numero % 2 == 0;
}
echo esPar(10);

// Funciones anonimas
$sumar = function ($num1, $num2) {
    return $num1 + $num2;
};
echo $sumar(5, 3);

// Funciones flecha (arrow functions)
$sumar = fn ($num1, $num2) => $num1 + $num2;
echo $sumar(5, 3);

// Funciones recursivas
function factorial($num) {
    if ($num == 0) {
        return 1;
    } else {
        return $num * factorial($num - 1);
    }
}
echo factorial(5);

// Funciones con parámetros variables
function sumarNumeros(...$numeros) {
    $total = 0;
    foreach ($numeros as $numero) {
        $total += $numero;
    }
    return $total;
}
echo sumarNumeros(1, 2, 3, 4, 5);

// Funciones con parámetros por referencia
// Ejemplo: esta funcion incrementa el valor de la variable
function incrementar($num) {
    $num++;
}
$num = 5;
incrementar($num);
echo $num;

?>