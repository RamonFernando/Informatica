<!-- 5.- Escribe un programa en PHP que muestre los primeros $n términos de la serie de
Fibonacci, usando bucles (por ejemplo, for).
Donde $n será una variable entera con el número de términos a mostrar.
El resultado debe imprimirse en el navegador separado por espacios.
Ejemplo de salida para $n = 10 seria: 0 1 1 2 3 5 8 13 21 34 55
0 + 1 = 1 (1)
1 + 1 = 2 (2)
--------------
1 + 2 = 3 (3)
2 + 3 = 5 (4)
3 + 5 = 8 (5)
-->

<?php
    $n = 10;
    $num1 = 0;
    $num2 = 1;
    $resultado = 0;
    
    // secuencia de fibonacci: 1(resultado = num1 + num2) 2(num1 = num2) 3(num2 = resultado)
    // 0 1 1 2 3 5 8 13 21 34 55 89
    for ($i = 1; $i <= $n; $i++) {
            $resultado = $num1 + $num2; // r = 1 y 1(0 + 1)  2(1 + 1)  3(1 + 2)
            $num1 = $num2; // n2 = 1 (n2 = n1)
            $num2 = $resultado; // n1 = r1 (n1 = 1)
            echo $resultado . " ";
        }
        
        // ejemplo de secuencia de fibonacci
        $a = 0; $b = 1; $r = 0;
        echo "<br><br>";
        echo "Secuencia de fibonacci: <br>";
        for ($i = 1; $i <= $n; $i++) {
            $r = $a + $b;
            echo  "num1 (" . $a . ") + num2 (" . $b . ") = " . $r . "<br>";
            $a = $b;
            $b = $r;
        }
        
        // ejemplo de secuencia de fibonacci
        // pasada 1
        // n1 = 0 y n2 = 1 (r1 = 1) // n1(0) + n2(1) = r1
        // pasada 2
        // n1 = 1 y n2 = 1 (r1 = 2) // n1(1) + n2(1) = r2
        // pasada 3
        // n1 = 1 y n2 = 2 (r1 = 3) // n1(1) + n2(2) = r3
        // pasada 4
        // n1 = 2 y n2 = 3 (r1 = 5) // n1(2) + n2(3) = r5
        // pasada 5
        // n1 = 3 y n2 = 5 (r1 = 8) // n1(3) + n2(5) = r8
        
        // echo $num1 . " ";
        // echo $num2 . " ";
        // echo $resultado . " ";
?>
