<!-- 11.Implementación de FizzBuzz

Escriba un programa PHP que itere los números enteros del 1 al 50.
Para múltiplos de tres imprima "Fizz" en lugar del número y para múltiplos de
cinco imprima "Buzz". Para números que son múltiplos de tres y cinco, imprima
"FizzBuzz". -->
<?php
echo "13_Ej11Loops <br>";

// Variables
$f = "Fizz"; // multiplos de 3
$b = "Buzz"; // multiplos de 5
$fb = "FizzBuzz"; // multiplos de 3 y 5

echo "Multiplos de 3 $f, 5 $b y (5 y 3) $fb  <br>";

// Logica
// multiplos
for ($i = 1; $i <= 50; $i++) {

    if ($i % 3 == 0 &&  $i % 5 == 0)
        echo "$i $fb<br>";

    else if ($i % 3 == 0)
        echo "$i $f <br>";

    else if ($i % 5 == 0)
        echo "$i $b <br>";

    else if ($i % 5 != 0 && $i % 3 != 0)
        echo "$i<br>";
}
?>