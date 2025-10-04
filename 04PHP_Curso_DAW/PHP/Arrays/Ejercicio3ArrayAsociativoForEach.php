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
        $densidades = [
            "Mercurio" => 5.43,
            "Venus" => 5.24,
            "Tierra" => 5.52,
            "Marte" => 3.93,
            "Júpiter" => 1.33,
            "Saturno" => 0.69,
            "Urano" => 1.27,
            "Neptuno" => 1.64,
            "Plutón" => 1.88 // Aunque Plutón es un planeta enano, lo incluimos en este caso.
        ];

        // Mostrar cada densidad con un bucle foreach
        foreach ($densidades as $planeta => $densidad) {
            echo "La densidad de $planeta es $densidad g/cm^3<br>";
        }
        
    ?>
    <p>FIN</p>
</body>
</html>