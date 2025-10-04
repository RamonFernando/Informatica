<?php
// forEach

$personas = [
    ['nombre' => 'Juan', 'edad' => 20],
    ['nombre' => 'Pedro', 'edad' => 30],
    ['nombre' => 'Maria', 'edad' => 25],
];

foreach ($personas as $persona) {
    echo "Nombre: " . $persona['nombre'] . ", Edad: " . $persona['edad'] . "<br>";
}

?>