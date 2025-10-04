<?php

// ejercicio 1
$edades = [20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19, 2];
$edadEncontrada = false;

foreach ($edades as $edad) {
    if ($edad === 35) {
        $edadEncontrada = true;
        break;
    }
}

if ($edadEncontrada) {
    echo "Localizada persona de 35 años.\n";
} else {
    echo "No se ha encontrado ninguna persona de 35 años.\n";
}

// ejercicio 2
$estaturas = [];

for ($i = 0; $i < 10; $i++) {
    $estatura = (float)readline("Introduce la estatura de la persona " . ($i + 1) . " en metros: ");
    $estaturas[] = $estatura;
}

$estaturaMayor = false;

foreach ($estaturas as $estatura) {
    if ($estatura > 1.90) {
        $estaturaMayor = true;
        break;
    }
}

if ($estaturaMayor) {
    echo "Hay al menos una persona con estatura mayor de 1.90 m.\n";
} else {
    echo "No hay ninguna persona con estatura mayor de 1.90 m.\n";
}

// ejercicio 3
$nombres = [];
$nombreEncontrado = false;

for ($i = 0; $i < 10; $i++) {
    $nombre = readline("Introduce un nombre (escribe 'nadie' para terminar): ");
    
    if (strtolower($nombre) === "nadie") {
        break;
    }
    
    $nombres[] = $nombre;
}

foreach ($nombres as $nombre) {
    if ($nombre === "Calderón") {
        $nombreEncontrado = true;
        break;
    }
}

if ($nombreEncontrado) {
    echo "Calderón de la Barca\n";
} else {
    echo "Nombre no encontrado\n";
}

// ejercicio 4
$productos = [];
$preciosCorrectos = true;
$sumaTotal = 0;

for ($i = 0; $i < 10; $i++) {
    $precio = (float)readline("Introduce el precio del producto " . ($i + 1) . ": ");
    $productos[$i] = $precio;
    
    if ($precio < 0) {
        $preciosCorrectos = false;
        echo "Se ha encontrado un valor no válido en la posición " . $i . ". El programa terminará.\n";
        break;
    }
}

if ($preciosCorrectos) {
    foreach ($productos as $precio) {
        $sumaTotal += $precio;
    }
    echo "La suma total de los precios es: " . $sumaTotal . " euros.\n";
}

// ejercicio 5
$temperaturas = [15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6];

$maximo = $temperaturas[0];
$minimo = $temperaturas[0];
$posicionMaximo = 0;
$posicionMinimo = 0;

for ($i = 1; $i < count($temperaturas); $i++) {
    if ($temperaturas[$i] > $maximo) {
        $maximo = $temperaturas[$i];
        $posicionMaximo = $i;
    }
    if ($temperaturas[$i] < $minimo) {
        $minimo = $temperaturas[$i];
        $posicionMinimo = $i;
    }
}

echo "La temperatura máxima es: " . $maximo . " ºC, en la posición " . $posicionMaximo . "\n";
echo "La temperatura mínima es: " . $minimo . " ºC, en la posición " . $posicionMinimo . "\n";

// ejercicio 6
$votos = [];
for ($i = 0; $i < 6; $i++) {
    $votos[$i] = (int)readline("Introduce los votos del partido " . ($i + 1) . ": ");
}

$maximo2 = $votos[0];
$minimo2 = $votos[0];
$posicionMaximo2 = 0;
$posicionMinimo2 = 0;

for ($i = 1; $i < count($votos); $i++) {
    if ($votos[$i] > $maximo2) {
        $maximo2 = $votos[$i];
        $posicionMaximo2 = $i;
    }
    if ($votos[$i] < $minimo2) { // Cambiado de "minimo" a "minimo2"
        $minimo2 = $votos[$i];
        $posicionMinimo2 = $i;
    }
}

echo "El partido con más votos tiene: " . $maximo2 . " votos, en la posición " . $posicionMaximo2 . "\n";
echo "El partido con menos votos tiene: " . $minimo2 . " votos, en la posición " . $posicionMinimo2 . "\n";

// ejercicio 7
$espectadores = [2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000];
$maximo3 = $espectadores[0];
$minimo3 = $espectadores[0];
$diaMaximo = 0;
$diaMinimo = 0;

for ($i = 1; $i < count($espectadores); $i++) {
    if ($espectadores[$i] > $maximo3) {
        $maximo3 = $espectadores[$i];
        $diaMaximo = $i;
    }
    if ($espectadores[$i] < $minimo3) {
        $minimo3 = $espectadores[$i];
        $diaMinimo = $i;
    }
}

$dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
echo "Máximo de audiencia: " . $maximo3 . " espectadores el " . $dias[$diaMaximo] . "\n";
echo "Mínimo de audiencia: " . $minimo3 . " espectadores el " . $dias[$diaMinimo] . "\n";

// ejercicio 8
$humedades = [45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45];
$maximo4 = $humedades[0];
$minimo4 = $humedades[0];
$horaMaximo = 0;
$horaMinimo = 0;

for ($i = 1; $i < count($humedades); $i++) {
    if ($humedades[$i] > $maximo4) {
        $maximo4 = $humedades[$i];
        $horaMaximo = $i;
    }
    if ($humedades[$i] < $minimo4) {
        $minimo4 = $humedades[$i];
        $horaMinimo = $i;
    }
}

echo "Máxima humedad: " . $maximo4 . "% a las " . $horaMaximo . ":00 horas\n";
echo "Mínima humedad: " . $minimo4 . "% a las " . $horaMinimo . ":00 horas\n";

// ejercicio 9
$precios = [43, 58, 44, 62, 80, 15, 15, 10, 90, 56];

for ($i = 0; $i < count($precios) - 1; $i++) {
    $minIndex = $i;
    
    for ($j = $i + 1; $j < count($precios); $j++) {
        if ($precios[$j] < $precios[$minIndex]) {
            $minIndex = $j;
        }
    }

    if ($minIndex !== $i) {
        $temp = $precios[$i];
        $precios[$i] = $precios[$minIndex];
        $precios[$minIndex] = $temp;
    }
}

echo "Precios ordenados de menor a mayor:\n";
print_r($precios);

// ejercicio 10
$temperaturas2 = [];

for ($i = 0; $i < 8; $i++) {
    $temp = (float)readline("Introduce la temperatura de la hora " . ($i + 1) . ": ");
    $temperaturas2[] = $temp;
}

for ($i = 0; $i < count($temperaturas2) - 1; $i++) {
    $minIndex = $i;
    
    for ($j = $i + 1; $j < count($temperaturas2); $j++) {
        if ($temperaturas2[$j] < $temperaturas2[$minIndex]) {
            $minIndex = $j;
        }
    }

    if ($minIndex !== $i) {
        $temp = $temperaturas2[$i];
        $temperaturas2[$i] = $temperaturas2[$minIndex];
        $temperaturas2[$minIndex] = $temp;
    }
}

echo "Temperaturas ordenadas de menor a mayor:\n";
print_r($temperaturas2);

// ejercicio 11
$edades2 = [];

for ($i = 0; $i < 10; $i++) {
    $edad = (int)readline("Introduce la edad de la persona " . ($i + 1) . ": ");
    $edades2[] = $edad;
}

for ($i = 0; $i < count($edades2) - 1; $i++) {
    $minIndex = $i;
    
    for ($j = $i + 1; $j < count($edades2); $j++) {
        if ($edades2[$j] < $edades2[$minIndex]) {
            $minIndex = $j;
        }
    }

    if ($minIndex !== $i) {
        $temp = $edades2[$i];
        $edades2[$i] = $edades2[$minIndex];
        $edades2[$minIndex] = $temp;
    }
}

echo "Edades ordenadas de menor a mayor:\n";
print_r($edades2);

// ejercicio 12
$numerosAtomicos = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for ($i = 0; $i < count($numerosAtomicos) - 1; $i++) {
    $minIndex = $i;
    
    for ($j = $i + 1; $j < count($numerosAtomicos); $j++) {
        if ($numerosAtomicos[$j] < $numerosAtomicos[$minIndex]) {
            $minIndex = $j;
        }
    }

    if ($minIndex !== $i) {
        $temp = $numerosAtomicos[$i];
        $numerosAtomicos[$i] = $numerosAtomicos[$minIndex];
        $numerosAtomicos[$minIndex] = $temp;
    }
}

echo "Números atómicos ordenados de menor a mayor:\n";
print_r($numerosAtomicos);

// ejercicio 13
$mediciones = [];

for ($i = 0; $i < 10; $i++) {
    $medicion = (float)readline("Introduce la medición " . ($i + 1) . ": ");
    $mediciones[] = $medicion;
}

echo "Mediciones:\n";
print_r($mediciones);

// ejercicio 14
$productos2 = [];
$totalPrecio = 0;

for ($i = 0; $i < 5; $i++) {
    $producto = readline("Introduce el nombre del producto " . ($i + 1) . ": ");
    $precio = (float)readline("Introduce el precio del producto " . ($i + 1) . ": ");
    $productos2[$i] = ["nombre" => $producto, "precio" => $precio];
    $totalPrecio += $precio;
}

echo "Lista de productos:\n";
foreach ($productos2 as $producto) {
    echo "Producto: " . $producto["nombre"] . ", Precio: " . $producto["precio"] . " euros\n";
}

echo "Precio total: " . $totalPrecio . " euros\n";

// ejercicio 15
$productos3 = [];
$totalPrecio3 = 0;

for ($i = 0; $i < 5; $i++) {
    $producto = readline("Introduce el nombre del producto " . ($i + 1) . ": ");
    $precio = (float)readline("Introduce el precio del producto " . ($i + 1) . ": ");
    $productos3[$i] = ["nombre" => $producto, "precio" => $precio];
    $totalPrecio3 += $precio;
}

$precioMenor = min(array_column($productos3, 'precio'));
$precioMayor = max(array_column($productos3, 'precio'));

echo "Lista de productos:\n";
foreach ($productos3 as $producto) {
    echo "Producto: " . $producto["nombre"] . ", Precio: " . $producto["precio"] . " euros\n";
}

echo "Precio total: " . $totalPrecio3 . " euros\n";
echo "Precio menor: " . $precioMenor . " euros\n";
echo "Precio mayor: " . $precioMayor . " euros\n";

// ejercicio 16
$notas = [];
$numeroAlumnos = 5;

for ($i = 0; $i < $numeroAlumnos; $i++) {
    $nota = (float)readline("Introduce la nota del alumno " . ($i + 1) . ": ");
    $notas[] = $nota;
}

$sumaNotas = array_sum($notas);
$media = $sumaNotas / $numeroAlumnos;

echo "La media de las notas es: " . $media . "\n";

// ejercicio 17
$temperaturas3D = [];

for ($i = 0; $i < 3; $i++) {
    $temperaturas3D[$i] = [];
    for ($j = 0; $j < 3; $j++) {
        for ($k = 0; $k < 3; $k++) {
            $temperaturas3D[$i][$j][$k] = rand(10, 30); // Generando temperaturas aleatorias
        }
    }
}

echo "Matriz de temperaturas tridimensional:\n";
print_r($temperaturas3D);

// ejercicio 18
$bolas = [];
$colores = ["rojo", "verde"];
$cantidadBolas = 100;

for ($i = 0; $i < $cantidadBolas; $i++) {
    $colorAleatorio = $colores[array_rand($colores)];
    $bolas[] = $colorAleatorio;
}

$cantidadRojas = count(array_filter($bolas, fn($color) => $color === "rojo"));
$cantidadVerdes = count(array_filter($bolas, fn($color) => $color === "verde"));

echo "Cantidad de bolas rojas: " . $cantidadRojas . "\n";
echo "Cantidad de bolas verdes: " . $cantidadVerdes . "\n";

?>