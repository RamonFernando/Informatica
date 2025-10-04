<?php
// Ejemplo: transformar líneas "Nombre;Nota" en un array seguro
$lineas = [
    "Ana;7.5",
    "Luis;4",
    "Marta;9,2",   // coma decimal
    "Paco;no-num"  // mal formado
];

$alumnos = []; // resultado: nombre => nota (float)
foreach ($lineas as $linea) {
    $linea = trim($linea);
    if ($linea === '') continue;

    $partes = explode(';', $linea, 2);
    if (count($partes) < 2) continue; // línea malformada, la ignoramos

    $nombre = trim($partes[0]);
    $nota_bruta = trim($partes[1]);

    // aceptar coma decimal y validar
    $nota_bruta = str_replace(',', '.', $nota_bruta);
    if (!is_numeric($nota_bruta)) continue; // ignorar si no es número

    $nota = (float)$nota_bruta; // conservar decimales
    $alumnos[$nombre] = $nota;  // si hay duplicados, la última nota sobrescribe
}

// Mostrar resultado de forma legible en HTML
echo '<pre>';
print_r($alumnos);
echo '</pre>';
