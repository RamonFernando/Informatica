<?php
// Operador Ternario
// Sintaxis: $variable = (condicion) ? valor1 : valor2;
$age = 18;
$resident = true;
$message = ($age >= 18 && $resident) ? "Puedes votar." : "No puedes votar.";
echo $message;

echo "<br>";

// Otro ejemplo con operador ternario anidado
$age = 17;
$message = ($age >= 18) ? "Puedes votar y eres adulto." : (($age >= 16) ?  "Puedes votar pero no eres mayor de edad." : "No puedes votar.");
echo $message;

?>