<!-- 221suma110.php: Escribe un programa que sume los números del 1 al 10.
221sumaAB.php: A partir del anterior, refactorizar para que
funcione con inicio y fin -->
<?php
    echo "27_Ej241 Sumar numeros<br>";
    $sum = 1;
    for($i = 0; $i < 10; $i++)
        echo ($i+1) . "º:  $sum + $i = " . ($sum += $i) . "<br>";
    
    function sumar(int $init, int $fin): int{
        $suma = $init;
        for($i = 0; $i < $fin; $i++)
            $suma += $i;
        return $suma;
    }
    echo "<br>Suma: " . sumar(1,5); // output: 11

?>