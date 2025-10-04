<?php
/** 
 * 3.- Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en 
 * cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while.
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
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>Potencias de 3 menores a 12000</p>
    <?php
    $base = 3;
    $exponente = 1;
    do{
        $potencia = $base ** $exponente; // Se calcula la potencia de 3 menores que 12000
        echo "$potencia <br>";
        $exponente++;
    }while($potencia < 12000);
    echo "<br>FIN";
    ?>
</body>
</html>