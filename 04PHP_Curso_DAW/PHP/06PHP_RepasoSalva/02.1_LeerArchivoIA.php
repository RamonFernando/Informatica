// index.php
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notas</title>
    <style>
        body { text-align:center; font-family:'Gill Sans MT'; background:#7b7b7a; padding:20px; color:#fff; }
        ul { text-align:left; display:inline-block; }
    </style>
</head>
<body>
<h1>Notas</h1>
<?php
// Comprobaciones iniciales
$archivo_notas = __DIR__ . '/Notas.txt'; // ruta relativa
if (!file_exists($archivo_notas) || !is_readable($archivo_notas)) {
    echo '<p>Error: el archivo no existe o no es legible.</p>';
    exit;
}

// Lectura segura línea a línea
$alumnos = [];
$manejador = fopen($archivo_notas, 'r'); // abrir en modo lectura ('r')
if ($manejador === false) {
    echo '<p>Error al abrir el archivo.</p>';
    exit;
}

while (($linea = fgets($manejador)) !== false) { // fgets devuelve false si no hay más líneas
    $linea = trim($linea);          // eliminar espacios al principio y al final
    if ($linea === '') continue;            // saltar líneas vacías

    // Separar en 2 partes como máximo (nombre;nota)
    $partes = explode(';', $linea, 2);
    if (count($partes) < 2) continue; // saltar si la línea no tiene 2 caracteres o más

    // Eliminar espacios trim
    $nombre = trim($partes[0]);
    $nota_bruta = trim($partes[1]);

    // Manejar coma decimal (ej. "6,5") y validar
    $nota_bruta = str_replace(',', '.', $nota_bruta); // reemplazar comas por puntos
    if (!is_numeric($nota_bruta)) continue; // saltar si no es número

    $nota = floatval($nota_bruta);          // convertir a float
    $alumnos[] = ['nombre' => $nombre, 'nota' => $nota]; // guardar en array
}
fclose($manejador);

// Mostrar resultados
$total_alumnos = count($alumnos);
echo '<p>Total de alumnos: ' . $total_alumnos . '</p>';
if ($total_alumnos === 0) {
    echo '<p>No hay datos válidos en el archivo.</p>';
    exit;
}

$suma_notas = 0;
echo '<ul>';
foreach ($alumnos as $alumno) {
    $suma_notas += $alumno['nota'];

    // Escapar y usar mayúsculas con soporte UTF-8
    $nombre_seguro = htmlspecialchars($alumno['nombre'], ENT_QUOTES, 'UTF-8');   // evitar ataque XSS (inyección de codigo HTML)
    $nombre_mayus = mb_strtoupper($nombre_seguro, 'UTF-8');                             // pasar a mayúsculas
    $nota_formateada = number_format($alumno['nota'], 2);                                  // formatear con 2 decimales

    if ($alumno['nota'] > 5) {
        echo "<li>El alumno {$nombre_mayus} ha superado el 5 con una nota de {$nota_formateada}</li>";
    } else {
        echo "<li>El alumno {$nombre_mayus} <strong>no</strong> ha superado el 5 con una nota de {$nota_formateada}</li>";
    }
}
echo '</ul>';

$media_notas = $suma_notas / $total_alumnos;
echo '<p>La media de notas del curso es: ' . number_format($media_notas, 2) . '</p>';  // formatear con 2 decimales
?>
</body>
</html>

<!--
📂 MANEJO DE ARCHIVOS

- file_exists($ruta)
Comprueba si el archivo indicado en $ruta existe. Devuelve true o false.

- is_readable($ruta)
Comprueba si el archivo se puede leer. Devuelve true o false.

- fopen($ruta, 'r')
Abre un archivo.

- El segundo parámetro 'r' significa modo lectura.

Si falla, devuelve false.

- fgets($manejador)
Lee una línea completa desde un archivo abierto con fopen().
Cada vez que se llama avanza a la siguiente línea.

- fclose($manejador)
Cierra el archivo abierto, liberando recursos.

🧹 LIMPIEZA Y MANIPULACION DE CADENAS

- trim($cadena)
Elimina los espacios en blanco (y saltos de línea) al inicio y al final de la cadena.

- explode($separador, $cadena, $limite)
Divide una cadena en un array usando un separador.

Ejemplo: explode(";", "Ana;7.5", 2) → ["Ana", "7.5"].

- str_replace($buscar, $reemplazar, $cadena)
Sustituye todas las apariciones de un texto por otro.

Aquí se usa para cambiar , por . en las notas.

- htmlspecialchars($cadena, ENT_QUOTES, 'UTF-8')
Convierte caracteres especiales en entidades HTML.

Ejemplo: < se convierte en &lt;.

Se usa para evitar inyección de HTML o XSS al mostrar nombres.

- mb_strtoupper($cadena, 'UTF-8')
Convierte la cadena a mayúsculas respetando acentos y caracteres especiales.

Ejemplo: José → JOSÉ.

🔢 CONVERSION Y VALIDACION DE NUMEROS

- is_numeric($valor)
Comprueba si un valor es un número (entero o decimal).
Devuelve true o false.

- floatval($valor)
Convierte un valor a número decimal (float).

Ejemplo: "7.5" → 7.5.

- number_format($numero, $decimales)
Da formato a un número con una cantidad fija de decimales.

Ejemplo: number_format(7.5, 2) → 7.50.

📊 Arrays y conteo

- count($array)
Devuelve la cantidad de elementos que tiene un array.

Ejemplo: count([1,2,3]) → 3.

🚪 CONTROL DE EJECUCION

- exit
Finaliza inmediatamente la ejecución del script.

Se usa para salir si ocurre un error (archivo no existe, no hay datos, etc.).
-->
