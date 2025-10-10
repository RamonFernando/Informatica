<!--  222potencia.php: A partir de una base y exponente, mediante la acumulación
de productos, calcula la potencia utilizando la instrucción for.-->

<?php
    echo "27_Ej241 Potencias<br>";

    // Devuelve la potencia de $base con una variable acumulador que multiplica
    // tantas veces como diga el $exponente Ej: 2^4=16 1º(2*2)=4, 2º(4*2)=8, 3º(8*2)=16
    function potencia($base, $exp): float|int{
        $pot = $base;
        if($exp == 0) return 1;
        for($i = 1; $i < $exp; $i++)
            $pot *= $base;
        return $pot;
    }
    echo "2^4 = " . potencia(2, 4) . "<br>"; // output: 16
    function potencia1($base, $exp): float|int{
        $pot = 1;
        if($exp == 0) return 1;
        for($i=$exp; $i > 0; $i--){
            $pot*=$base;
        }
        return $pot;
    }
    echo "2^4 = " . potencia1(2, 4) . "<br>"; // output: 16
    
?>