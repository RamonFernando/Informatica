<?php

// ejercicio 1
$libros = [];

for ($i = 0; $i < 5; $i++) {
    $libro = [];

    $libro['ISBN'] = readline("Introduce el ISBN del libro " . ($i + 1) . ": ");
    $libro['titulo'] = readline("Introduce el título del libro " . ($i + 1) . ": ");
    $libro['autor'] = readline("Introduce el autor del libro " . ($i + 1) . ": ");
    $libro['editorial'] = readline("Introduce la editorial del libro " . ($i + 1) . ": ");

    $libros[] = $libro;
}

echo "Lista de libros:\n";
foreach ($libros as $libro) {
    echo $libro['ISBN'] . " " . $libro['titulo'] . " " . $libro['autor'] . " " . $libro['editorial'] . "\n";
}

// ejercicio 2
$cotizaciones = [47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7];
$minimo = $cotizaciones[0];
$maximo = $cotizaciones[0];

foreach ($cotizaciones as $cotizacion) {
    if ($cotizacion < $minimo) {
        $minimo = $cotizacion;
    }
    if ($cotizacion > $maximo) {
        $maximo = $cotizacion;
    }
}

echo "Cotizaciones de Microsoft:\n";
echo "Mínimo: " . $minimo . "\n";
echo "Máximo: " . $maximo . "\n";

// ejercicio 3
$cotizaciones2 = [47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7];

for ($i = 0; $i < count($cotizaciones2) - 1; $i++) {
    $indiceMinimo = $i;

    for ($j = $i + 1; $j < count($cotizaciones2); $j++) {
        if ($cotizaciones2[$j] < $cotizaciones2[$indiceMinimo]) {
            $indiceMinimo = $j;
        }
    }

    if ($indiceMinimo !== $i) {
        $temp = $cotizaciones2[$i];
        $cotizaciones2[$i] = $cotizaciones2[$indiceMinimo];
        $cotizaciones2[$indiceMinimo] = $temp;
    }
}

echo "Cotizaciones de Microsoft ordenadas de menor a mayor:\n";
print_r($cotizaciones2);

// ejercicio 4
$temperaturas = [3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6];
$posicionPrimeraNegativa = -1;

for ($i = 0; $i < count($temperaturas); $i++) {
    if ($temperaturas[$i] < 0) {
        $posicionPrimeraNegativa = $i;
        break;
    }
}

echo "La posición de la primera temperatura menor que cero es: " . $posicionPrimeraNegativa . "\n";

?>