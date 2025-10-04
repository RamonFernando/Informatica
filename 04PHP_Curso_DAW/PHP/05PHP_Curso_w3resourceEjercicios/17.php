<?php
// 18. Escriba un script PHP para retrasar la ejecución del programa durante el número dado de segundos.
echo "Ejercicio 18 <br>";
// Retrasa la ejecución del programa durante el número dado de segundos
sleep(3);

// Imprime un mensaje despues de retrasar la ejecución del programa
echo "Programa retrasado<br>";

// Imprime la fecha actual
echo date("l, dS F, Y, h:ia");
echo "<br><br>";

// 19. Operaciones aritméticas en variables de caracteres : $d = 'A00'. Usando esta variable imprima los siguientes números.
echo "Ejercicio 19 <br>";
// Initialize variable $d with value 'A00'
$d = 'A00';

// Loop through 5 iterations
for ($n = 0; $n < 5; $n++) {
    // Increment $d and echo the result
    echo ++$d . "\n";
}
?>
