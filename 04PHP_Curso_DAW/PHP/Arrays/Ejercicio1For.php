<?php
/**
 * 1.- Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro 
* estaciones del año. Haz que después se muestren todos los valores mediante un bucle for. 
 */
?>
<?php
/** 
 * 
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
        // Creamos el array de String llamado estaciones
        $estaciones = ["primavera", "verano", "otonio", "invierno"];
        for ($i = 0; $i < count($estaciones); $i++) {
            echo $estaciones[$i] . "<br>";
        }
    ?>
    <p>FIN</p>
</body>
</html>