<?php
/** 
 * 14.- Escribe un programa que rellene un array llamado primos con los 100 primeros números 
 * primos. Recuerda que un número entero es primo si no puede dividirse por ninguno que no sea 1 o 
 * él mismo. Los primeros números primos son:  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
            color: #ffffff;
        }
        .boton{
            color: #7b7b7a;
            border-radius: 0.3em;
            padding: .5em 1em;
            border: none;
            background-color: #ffffff;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h2>Ejercicios 14</h2>
    <p>Ejercicios Arrays U3 PDF 5 Ejercicios de array 1</p>
    <?php
    // 100 primeros numeros primos
    $primos = obtenerPrimos(100);

    echo "<p>Los 100 primeros numeros primos son: </p>";
    echo implode(", ", $primos); // Muestra los primos separados por comas
    
    echo "<hr>";

    // Otra manera de mostrarlos
    foreach($primos as $i => $primo){
            echo ($i+1) . ": " . $primo . "<br>";
    }


    // Función para saber si un número es primo
    function esPrimo($numero) {
        if($numero <= 1){
            return false; // Numeros menores o iguales a 1 no son primos
        }
        // Comprobar si el numero es primo dividiendo por 2
        for($i = 2; $i < sqrt($numero); $i++){ // Comprobar si el numero es primo dividiendo por 2 hasta la raiz del numero
            
            if($numero % $i == 0) // Si el resto de la division es 0 el numero no es primo
                return false;
        }
    return true;
    }

    // Función para obtener la $cantidad de numeros primos deseados
    function obtenerPrimos($cantidad){
        $primos = [];
        $numero = 2;
        while(count($primos) < $cantidad){

            if(esPrimo($numero)){ // Si el numero es primo se añade al array
                $primos[] = $numero;
            }
            $numero++; // Incrementamos desde el numero 2
        }
        return $primos;
    }

    ?>
    <p>FIN</p>
</body>
</html>