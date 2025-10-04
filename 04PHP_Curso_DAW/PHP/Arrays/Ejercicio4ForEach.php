<?php
/** 
 *  4.- Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una de ellas el 
 *  nombre de uno de los cuatro companeros más cercanos a tu sitio. 
 * Haz que después se muestren todos los valores mediante un bucle for. 
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
        $companyeros = array("Luis","Maite","Nicolas","Iosmany");
        foreach($companyeros as $company) {
            echo "<p>" .$company . " </p>";
        }
    ?>
    <p>FIN</p>
</body>
</html>