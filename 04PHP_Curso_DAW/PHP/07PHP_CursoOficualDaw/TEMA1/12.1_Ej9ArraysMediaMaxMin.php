<!-- 9.Temperatura media y extremos

Escriba un script PHP para calcular y mostrar la temperatura promedio,
cinco temperaturas más bajas y más altas.
Temperaturas registradas: 78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63,
75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73
Salida esperada:
La temperatura media es: 70,6
Lista de siete temperaturas más bajas: 60, 62, 63, 63, 64,
Lista de las siete temperaturas más altas: 76, 78, 79, 81, 85 -->
<?php
// Promedio
// 5 temperaturas mas bajas
// 5 temperaturas mas altas

use function PHPSTORM_META\map;

$temp = array(78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63, 75, 76,
73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73);

$media = 0;
$sum = 0;
    // var_dump($temp);
    $sum = array_sum($temp);
    $media = $sum / count($temp);

    echo "Media: $media <br>";

    // mostramos el array original
    for($i = 0; $i < count($temp); $i++){
        echo $temp[$i] . " ";
    }
    // print_r($temp);
    echo "<hr>";
    echo "5 temperaturas menores<br>";
    sort($temp);
    for($i = 0; $i < 5; $i++){
        echo $temp[$i] . " ";
    }

    echo "<hr>";
    echo "5 temperaturas mayores<br>";
    $tempTot = count($temp);
    for($i = $tempTot - 5; $i < $tempTot; $i++){
        echo $temp[$i] . " ";
    }

    /*
    for($i = 0; $i < 5; $i++){
        echo $temp[(count($temp)-1) - $i] . " ";
    }*/
?>