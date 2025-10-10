<!--  222potenciaDoWhile.php: Reescribe el ejercicio anterior haciendo uso
sólo de do-while.-->

<?php
    echo "27_Ej241 Potencias<br>";
    // Devuelve la potencia de $base con una variable acumulador que multiplica
    // tantas veces como diga el $exponente se usa un doWhile
    function potencia($base, $exp): float|int {
        $pot = $base;
        $i = 1;
        if($exp == 0) return 1;
        do{
            $pot *= $base;
            $i++;
        }while ($i < $exp);
        return $pot;
    }
    echo "2^5 = " . potencia(2, 5) . "<br>"; // 32
?>