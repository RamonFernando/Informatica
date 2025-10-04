<?php
/** 
 * 13.- Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2. 
 * Haz que después se muestren todos los valores mediante un bucle while.
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
            color: #ffffff;
        }
        .boton{
            color: #7b7b7a;
            border-radius: 0.3em;
            padding: .5em 1em;
            border: none;
            background-color: #ffffff;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>...</p>
    <?php
        $potencias = array();
        $i = 0;
        // mostramos el array sin que se muestre la posicion 1
        while ($i < 20) {
            $potencias[$i] = pow(2, ($i+1)); // no muestra la potencia de 1 porque es 2^0
            echo ($i+1) . ": ". $potencias[$i] . "<br>";
            $i++;
        }
    ?>
    <p>FIN</p>
</body>
</html>