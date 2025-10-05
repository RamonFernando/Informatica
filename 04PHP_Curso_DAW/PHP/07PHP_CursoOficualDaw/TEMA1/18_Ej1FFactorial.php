<!-- 1. Factorial Function

Escribe una función para calcular el factorial de un número
(un número entero no negativo). La función acepta el número como argumento. -->
<?php
    echo "18Ej1_Funciones Factorial<br>";

    // Factorial (4*3*2*1)
    
    function factorial($num){
        
        // Comprobamos que el numero sea un entero y eliminamos espacios
        $num = intval(trim($num));

        $factorial = 1;
        if($num > 0){
            for ($i=0; $i < $num ; $i++) {
                $factorial += $factorial * $i;
            }
        }else{
            return "The number $num can`t have negative value.";
        }
        
        return $factorial;
    }

    echo "<br>Factorial: " . factorial(4);
?>