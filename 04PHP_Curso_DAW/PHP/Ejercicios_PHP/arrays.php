<?php

// Ejercicio 1
$estaciones = ["Primavera", "Verano", "Otoño", "Invierno"];
foreach ($estaciones as $estacion) {
    echo $estacion . PHP_EOL;
}

// Ejercicio 2
$meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
];
$i = 0;
while ($i < count($meses)) {
    echo $meses[$i] . PHP_EOL;
    $i++;
}

// Ejercicio 3
$densidades = [0.69, 5.43, 5.97, 0.69, 24.79, 14.53, 1.23, 0.87, 1.50];
for ($i = 0; $i < count($densidades); $i++) {
    echo "Densidad del planeta " . ($i + 1) . ": " . $densidades[$i] . " g/cm³" . PHP_EOL;
}

// Ejercicio 4
$companeros = ["Juan", "María", "Pedro", "Ana"];
for ($i = 0; $i < count($companeros); $i++) {
    echo "Compañero " . ($i + 1) . ": " . $companeros[$i] . PHP_EOL;
}

// Ejercicio 5
$notas = [7.5, 8.0, 6.5, 9.0, 8.5];
$init = 0;
while ($init < count($notas)) {
    echo "Nota del examen " . ($init + 1) . ": " . $notas[$init] . PHP_EOL;
    $init++;
}

// Ejercicio 6
$precios = [];
for ($i = 0; $i < 10; $i++) {
    $precio = readline("Introduce el precio del producto " . ($i + 1) . ": ");
    $precios[] = (float) $precio;
}
echo "Precios de los productos:" . PHP_EOL;
for ($i = 0; $i < count($precios); $i++) {
    echo "Precio del producto " . ($i + 1) . ": " . $precios[$i] . " €" . PHP_EOL;
}

// Ejercicio 7 y 8
$notas2 = [];
$i = 0;
while ($i < 10) {
    $nota = readline("Introduce la nota " . ($i + 1) . " (o un número negativo para terminar): ");
    $nota = (float) $nota;
    if ($nota < 0) {
        echo "Se ha introducido un número negativo. Termina la entrada de notas." . PHP_EOL;
        break;
    }
    $notas2[] = $nota;
    $i++;
}
echo "Notas introducidas:" . PHP_EOL;
for ($j = 0; $j < count($notas2); $j++) {
    echo "Nota " . ($j + 1) . ": " . $notas2[$j] . PHP_EOL;
}

// Ejercicio 9
$test = [
    readline("Introduce la pregunta: "),
    readline("Introduce la respuesta a): "),
    readline("Introduce la respuesta b): "),
    readline("Introduce la respuesta c): "),
    readline("Introduce la respuesta d): ")
];
echo $test[0] . PHP_EOL;
echo "a) " . $test[1] . PHP_EOL;
echo "b) " . $test[2] . PHP_EOL;
echo "c) " . $test[3] . PHP_EOL;
echo "d) " . $test[4] . PHP_EOL;

// Ejercicio 10
$compra = [];
$contador = 0;
while ($contador < 100) {
    $precio = readline("Introduce el precio del producto (o 0 para terminar): ");
    $precio = (float) $precio;
    if ($precio === 0) {
        break;
    }
    $compra[] = $precio;
    $contador++;
}
echo "Precios introducidos:" . PHP_EOL;
for ($i = 0; $i < count($compra); $i++) {
    echo "Producto " . ($i + 1) . ": " . $compra[$i] . " €" . PHP_EOL;
}

// Ejercicio 11
$ordenes = [];
$contador2 = 0;
while ($contador2 < 1000) {
    $orden = readline("Introduce una orden (izquierda, derecha, arriba, abajo, matar) o 'ejecutar' para finalizar: ");
    if (strtolower($orden) === "ejecutar") {
        break;
    }
    $ordenes[] = $orden;
    $contador2++;
}
echo "Órdenes para el robot:" . PHP_EOL;
for ($i = 0; $i < count($ordenes); $i++) {
    echo "Orden " . ($i + 1) . ": " . $ordenes[$i] . PHP_EOL;
}

// Ejercicio 12
$matriculas = array_fill(0, 100, "sinmatricula");
echo "Matrículas:" . PHP_EOL;
for ($i = 0; $i < count($matriculas); $i++) {
    echo "Posición " . $i . ": " . $matriculas[$i] . PHP_EOL;
}

// Ejercicio 13
$potencias = [];
for ($i = 0; $i < 20; $i++) {
    $potencias[] = pow(2, $i);
}
echo "Las primeras 20 potencias de 2 son:" . PHP_EOL;
for ($i = 0; $i < count($potencias); $i++) {
    echo "2^" . $i . " = " . $potencias[$i] . PHP_EOL;
}

// Ejercicio 14
$primos = [];
$contador3 = 0;
$numero = 2;
while ($contador3 < 100) {
    $esPrimo = true;
    for ($i = 2; $i <= sqrt($numero); $i++) {
        if ($numero % $i == 0) {
            $esPrimo = false;
            break;
        }
    }
    if ($esPrimo) {
        $primos[] = $numero;
        $contador3++;
    }
    $numero++;
}
echo "Los primeros 100 números primos son:" . PHP_EOL;
echo implode(", ", $primos) . PHP_EOL;

// Ejercicio 15 y 16
$temperaturas = [15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6];
$sumaTemperaturas = 0;
$contadorTemperaturasAltas = 0;
for ($i = 0; $i < count($temperaturas); $i++) {
    $sumaTemperaturas += $temperaturas[$i];
    if ($temperaturas[$i] > 12) {
        $contadorTemperaturasAltas++;
    }
}
$temperaturaMedia = $sumaTemperaturas / count($temperaturas);
echo "La temperatura media es: " . round($temperaturaMedia, 2) . " ºC" . PHP_EOL;
echo "Número de temperaturas por encima de 12 ºC: " . $contadorTemperaturasAltas . PHP_EOL;

// Ejercicio 17
$precios2 = [];
$sumaTotal = 0;
$contadorMayor10 = 0;
for ($i = 1; $i <= 10; $i++) {
    $precio = readline("Introduce el precio del producto $i: ");
    $precio = (float) $precio;
    if ($precio >= 0) {
        $precios2[] = $precio;
        $sumaTotal += $precio;
        if ($precio > 10) {
            $contadorMayor10++;
        }
    } else {
        echo "Por favor, introduce un número válido." . PHP_EOL;
        $i--;
    }
}
echo "Precio total a pagar: " . round($sumaTotal, 2) . " euros" . PHP_EOL;
echo "Número de productos cuyo precio es mayor de 10 euros: " . $contadorMayor10 . PHP_EOL;

?>