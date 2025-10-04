<?php
/** 
 * 5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de 
 * un examen que hayas hecho este curso (no sólo de programación). 
 * Haz que después se muestren *   todos los valores mediante un bucle while. 
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
        $notas = [8, 10, 5, 7, 6, ];
        foreach ($notas as $v) {
            echo "<p>La nota es: $v</p>";
        }
    ?>
    <p>FIN</p>
</body>
</html>