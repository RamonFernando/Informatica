<?php
/** 
 * 
 */
session_start();
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
    <form action="NotasSc.php" method="post">
        <p>Introduce las 5 notas:</p>
        <?php
        $i = 0;
        while ($i < 5) {
            echo "<p><input type='number' step='0.01' name='notas[]' placeholder='Nota " . ($i+1) ."'  'required'></p>";
            $i++;
        }
        ?>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if (!isset($_SESSION["contador"])) {
            $_SESSION["contador"] = 1;
        } else {
            if(isset($_POST['notas']) && !empty($_POST['notas'])){
                $nota = $_POST['notas'];
                $media = 0;
                    
                    echo "<h3>Notas ingresadas:</h3>";
                    $k = 0;
                    while ($k < count($nota)) {
                        if(($nota[$k] >= 0 && $nota[$k] <= 10)){
                            echo "<p>Nota " . ($k + 1) . ": " . number_format((float)$nota[$k], 2) . "</p>";
                            $media += $nota[$k];
                        }else{
                            echo "<p> La nota introducida no es válida: $nota[$k]</p>";
                            exit();
                        }
                        $k++;
                    }
                $media = $media / count($nota);
                echo "<h3>La media de las notas es: " . number_format($media, 2) . "</h3>";
                
                // $_SESSION = array(); // Destruir todas las variables de sesión
                
            }
            // session_unset(); // Reiniciar la variable de sesión
            echo "<p>Session No: " . $_SESSION['contador']++ . "</p>";
            
        }
    ?>
    <p>FIN</p>
</body>
</html>