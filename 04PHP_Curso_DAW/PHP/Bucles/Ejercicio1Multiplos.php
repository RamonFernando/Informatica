<?php
/**
 *  1.- Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle while y haz que la variable 
* contador se incremente de 5 en 5.
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 1</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT'; 
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio 1</h2>
    <p>Todos los múltiplos de 5 entre 1 y 1000</p>
    <?php
        $i = 5;
        $j = 1;
        while ($i <= 1000){
            if($i % 5 == 0){
            echo "$i <br>";
            }
            $i+=5;
        }
    ?>
</body>
</html>