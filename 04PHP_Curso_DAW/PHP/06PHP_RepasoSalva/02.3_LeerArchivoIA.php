<?php
$nombre_archivo = 'Notas.txt';

// --- Lectura inicial del archivo ---
$datos_txt = [];
if (file_exists($nombre_archivo)) {
    $manejador = fopen($nombre_archivo, 'r');

    while (($linea = fgets($manejador)) !== false) {
        $linea = trim($linea);
        if ($linea !== "") {
            $partes = explode(";", $linea);
            if (count($partes) == 2) {
                $datos_txt[] = [
                    'nombre' => $partes[0],
                    'nota'   => (float)$partes[1]
                ];
            }
        }
    }
    fclose($manejador);
}

// --- Variables para mensajes de usuario ---
$mensaje = "";

// --- Procesar formulario ---
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $alumno = trim($_POST['alumno']);
    $nota   = trim($_POST['nota']);

    if ($alumno !== "" && is_numeric($nota)) { // Comprobamos que el alumno y la nota sean correctos
        $alumnoExiste = false;

        // Buscar alumno strcasecmp (compara sin importar mayúsculas o minúsculas)
        foreach ($datos_txt as $dato) {
            if (strcasecmp($dato['nombre'], $alumno) === 0) {
                $alumnoExiste = true;
                break;
            }
        }

        if ($alumnoExiste) {
            // El alumno ya existe → NO se agrega
            $mensaje = "⚠️ El alumno <strong>" . strtoupper($alumno) . "</strong> ya existe en la lista.";
        } else {
            // Nuevo alumno → se agrega
            $datos_txt[] = ['nombre' => $alumno, 'nota' => (float)$nota];

            // Reescribir archivo con el nuevo alumno
            $manejador = fopen($nombre_archivo, 'w');
            foreach ($datos_txt as $dato) {
                fwrite($manejador, $dato['nombre'] . ";" . $dato['nota'] . "\n");
            }
            fclose($manejador);

            $mensaje = "✅ Alumno <strong>" . strtoupper($alumno) . "</strong> agregado correctamente.";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Notas</title>
    <style>
        body { text-align: center; font-family: 'Gill Sans MT'; background-color: #7b7b7a; padding: 20px; }
        .aprobado { color: green; }
        .suspenso { color: red; }
        .info { color: blue; font-weight: bold; }
        .error { color: red; font-weight: bold; }
        .ok { color: green; font-weight: bold; }
    </style>
</head>
<body>
    <h1>Notas</h1>

    <!-- Formulario -->
    <form action="" method="post">
        <input type="text" name="alumno" placeholder="Introduce el nombre del alumno" required><br><br>
        <input type="number" step="0.1" name="nota" placeholder="Introduce la nota" required><br><br>
        <input type="submit" value="Añadir Alumno"><br><br>
    </form>

    <!-- Mostrar mensaje -->
    <?php if ($mensaje !== ""): ?>
        <p class="info"><?= $mensaje ?></p>
    <?php endif; ?>

    <?php
    if (!empty($datos_txt)) {
        echo "El total de alumnos es: " . count($datos_txt) . "<br><br>";

        $sumaNotas = 0;
        $mejorAlumno = $datos_txt[0];
        $peorAlumno = $datos_txt[0];

        foreach ($datos_txt as $dato) {
            $nombre = strtoupper($dato['nombre']);
            $nota   = $dato['nota'];

            if ($nota >= 5) {
                echo "<span class='aprobado'>El alumno $nombre ha aprobado con $nota</span><br>";
            } else {
                echo "<span class='suspenso'>El alumno $nombre ha suspendido con $nota</span><br>";
            }

            $sumaNotas += $nota;

            if ($nota > $mejorAlumno['nota']) {
                $mejorAlumno = $dato;
            }
            if ($nota < $peorAlumno['nota']) {
                $peorAlumno = $dato;
            }
        }

        $media = $sumaNotas / count($datos_txt);
        echo "<br><strong>La media de notas del curso es: " . number_format($media, 2) . "</strong><br><br>";
        echo "🎓 El mejor alumno es " . strtoupper($mejorAlumno['nombre']) . " con " . $mejorAlumno['nota'] . "<br>";
        echo "📉 El peor alumno es " . strtoupper($peorAlumno['nombre']) . " con " . $peorAlumno['nota'] . "<br>";
    } else {
        echo "No hay datos en el archivo.";
    }
    ?>
</body>
</html>
