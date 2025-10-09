<!-- 240arrayPar.php: Crea las siguientes funciones:
Una función que averigüe si un número es par: esPar(int $num): bool
Una función que devuelva un array de tamaño $tam con números aleatorios
comprendido entre $min y $max : arrayAleatorio(int $tam, int $min, int $max) : array
Una función que reciba un $array por referencia y devuelva la cantidad de
números pares que hay almacenados: arrayPares(array &$array): int -->
<?php
    echo "27_Ej240 Funciones numAleatorio, numPares, contarPares<br>";

    // Funcion que comprueba si un número es par
    function esPar($n): bool{
        return $n % 2 === 0;
    }
    echo esPar(5);

    echo "<br>";

    // Funcion que crea números aleatorios (tamaño, numInicio, numFin)
    function arrayAleatorio(int $tam, $min, $max) : array{
        $num = array();
        for($i = 1; $i <= $tam; $i++){
            $numAl = rand($min, $max);
            $num[$i] = $numAl;
        }
        return $num;
    }
    print_r(arrayAleatorio(10, 0, 10));

    // Funcion que cuenta los números pares de un array reutilizando la funcion esPar(bool)
    function arrayPares(array $array): int {
        $count = 0;
        foreach($array as $num){
            if(esPar($num)){
                $count++;
            }
        }
        return $count;
    }
    // Funcion que cuenta los números pares de la funcion arrayAleatorio()
    $numPars = arrayAleatorio(10,0,10);
    echo "<br>No. Pares: " . arrayPares($numPars);
?>