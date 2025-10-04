<!-- 1. Factorial Function

Escribe una función para calcular el factorial de un número
(un número entero no negativo). La función acepta el número como argumento. -->
<?php
    echo "16_Funciones Factorial";

    // Factorial (4*3*2*1)

    function facrotial($n){
        $n = 4;
        for ($i=0; $i < $n ; $i++) {
            $n += $n * $i;
        }
        return $n;
    }

    echo "Factorial: " . factorial(5);
?>