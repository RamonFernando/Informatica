<!-- 220pares050.php: Escribe un programa que muestre los números pares
del 0 al 50 (dentro de una lista desordenada). -->

<?php
    // Creamos un array del 0 al 50
    $numeros = range(0, 50);
    $pares = []; // Array donde pondremos solo los numeros pares
    
    // Mostramos el array original
    echo "Array Original: " . implode(" - ", $numeros) . "<br><br>";

    // Filtramos solo los números pares
    foreach ($numeros as $num) {
        if ($num % 2 == 0) {
            $pares[] = $num;
        }
    }

    // Desordenamos el array de pares
    shuffle($pares);

    // Mostramos los pares en una lista desordenada
    foreach ($pares as $num) {
        echo $num . "  ";
    }
    
?>

