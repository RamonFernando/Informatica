<?php
/*
En PHP, tenemos los siguientes tipos de bucles:

while - recorre un bloque de código siempre que la condición especificada sea verdadera
do...while - recorre un bloque de código una vez y luego repite el bucle siempre y cuando la condición especificada sea verdadera
for - recorre un bloque de código un número especificado de veces
foreach - recorre un bloque de código para cada elemento de un arreglo
*/
// Ejemplos
// while
$i = 0;
while ($i < 10) {
    echo "El valor de i es: $i <br>";
    $i++;
}


// do...while
$i = 0;
do {
    echo "El valor de i es: $i <br>";
    $i++;
} while ($i < 10);



// for
for ($i = 0; $i < 10; $i++) {
    echo "El valor de i es: $i <br>";
}

// Ejemplos con arrays

// while con array
$meses = ["enero", "febrero", "marzo", ];
$i = 0;
while ($i < count($meses)) {
    echo "El mes es: $meses[$i] <br>";
    $i++;
}
// do...while con array
$i = 0;
do {
    echo "El mes es: $meses[$i] <br>";
    $i++;
} while ($i < count($meses));

// for con array
for ($i = 0; $i < count($meses); $i++) {
    echo "El mes es: $meses[$i] <br>";
}

// foreach
$frutas = ["manzana", "banana", "pera"];
foreach ($frutas as $fruta) {
    echo "La fruta es: $fruta <br>";
}
?>