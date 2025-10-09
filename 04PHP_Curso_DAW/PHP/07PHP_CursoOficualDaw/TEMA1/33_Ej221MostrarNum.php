<!-- 221suma110.php: Escribe un programa que sume los números del 1 al 10.
221sumaAB.php: A partir del anterior, refactorizar para que
funcione con inicio y fin -->
<?php
    echo "27_Ej241 Sumar numeros<br>";
    $sum = 0;
    for($i = 1; $i <= 10; $i++)
        echo $i . "º:  $sum + $i = " . ($sum += $i) . "<br>"; // output: 55
    
    function sumar(int $init, int $fin): int{
        $suma = 0;
        for($i = $init; $i <= $fin; $i++)
            $suma += $i;
        return $suma;
    }
    echo "<br>Suma: " . sumar(1,5); // output: 15

?>