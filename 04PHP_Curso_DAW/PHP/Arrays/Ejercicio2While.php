<?php
/** 
 *  2.- Crea un array de Strings llamado meses cuyos valores sean los nombres de los doce meses del 
 *  año. Haz que después se muestren todos los valores mediante un bucle while. 
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>...</p>
    <?php
        $meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
        $i = 0;
        echo "Meses del año: <br>";
        while ($i < count($meses)){
            echo "<p>" . ($i + 1) . ": " . $meses[$i] . "</p>";
            $i++;
        }
    ?>
    <p>FIN</p>
</body>
</html>