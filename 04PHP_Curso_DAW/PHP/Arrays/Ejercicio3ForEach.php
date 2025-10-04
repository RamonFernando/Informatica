<?php
/** 
 *  3.- Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve) 
 *  planetas del Sistema Solar. Haz que después se muestren todos los valores mediante un bucle for. 
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
        /**
         * El bucle foreach es una estructura de control que permite recorrer los elementos 
         * de un array. Es especialmente útil cuando queremos iterar a través de cada 
         * elemento de un array sin preocuparnos por los índices.
         */
        
        $densidades = [5.43, 5.24, 5.52, 3.93, 1.33, 0.69, 1.27, 1.64, 1.88];
        $i = 1;
        foreach ($densidades as $densidad) {
            echo "<p>" .$i. "º Densidad: " . $densidad . " g/cm3</p>";
            $i++;
        }
            
    ?>
    <p>FIN</p>
</body>
</html>