<?php
/**
 * 7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la 
 * consola, mediante un bucle while, y guardándolas en el array. A continuación, muestra las diez 
 *notas. 
 *8.- Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor 
 * negativo. 
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body {
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
            color: #ffffff;
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <form action="" method="post">
        <p>Introduce las 5 notas:</p>
        <?php
        // Generamos 5 campos de entrada para las notas usando un bucle while
        $i = 0;
        while ($i < 5) {
            echo "<input type='number' step='0.01' name='notas[]' placeholder='Nota " . ($i + 1) . "'  required><br><br>";
            $i++;
        }
        ?>
        <input type="submit" value="Enviar">
    </form>

    <?php
        if (isset($_POST['notas']) && !empty($_POST['notas'])) {
            $notas = $_POST['notas'];
            echo "<h3>Notas ingresadas:</h3>";
            $j = 0;
            $media = 0;

            // Iteramos a través de las notas ingresadas con un bucle while
            while ($j < count($notas)) {
                $nota = $notas[$j];
                // Verificamos que cada nota esté en el rango de 0 a 10
                if ($nota >= 0 && $nota <= 10) {
                    echo "<p>Nota " . ($j + 1) . ": " . number_format((float)$nota, 2) . "</p>";
                    $media += $nota;
                } else {
                    echo "<p>La nota " . ($j + 1) . " no es válida (debe estar entre 0 y 10).</p>";
                    exit(); // Detenemos la ejecución si alguna nota es inválida
                }
                $j++;
            }

            // Calculamos y mostramos la media
            $media = $media / count($notas);
            echo "<h3>La media de las notas es: " . number_format($media, 2) . "</h3>";
        }
    ?>

    <p>FIN</p>
</body>
</html>
