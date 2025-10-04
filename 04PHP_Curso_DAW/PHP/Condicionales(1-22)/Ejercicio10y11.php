<?php
/** 
 *  10.- Diseña un programa que pida una nota entera entre 0 y 10 y la convierta a la calificación 
 *  correspondiente (Insuficiente, Suficiente, Bien, Notable y Sobresaliente).
 *  11.- Modifica el programa anterior para que acepte una nota con decimales (por ejemplo, si la nota 
 *  es menor que 5, la calificación será de Insuficiente).
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
    <p>Nota</p>
        <form action="Ejercicio10y11.php" method="post">
            <input type="number" step="0.01" name="nota" placeholder="Introduce la nota" required><br><br>
            <input type="submit" class="boton" value="Enviar">
        </form>
    <?php
    if(isset($_POST['nota']) || !empty($_POST['unidades'])) {
        $nota = floatval($_POST['nota']); // Convertimos la entrada a float
        
        if($nota >= 0 && $nota <= 10) {
            if($nota < 5){
                echo '<p style="color:red;">Nota: '.$nota.' - Insuficiente</p>';
            }else if($nota >= 5 && $nota < 6){
                echo '<p style="color:orange;">Nota: '.$nota.' - Suficiente</p>';
            }else if($nota >= 6 && $nota < 7){
                echo '<p style="color:yellow;">Nota: '.$nota.' - Bien</p>';
            }else if($nota >= 7 && $nota < 9){
                echo '<p style="color:green;">Nota: '.$nota.' - Notable</p>';
            }else{
                echo '<p style="color:blue;">Nota: '.$nota.' - Sobresaliente</p>';
            }
        }else{
            echo '<p>La nota ('.$nota.') introducida no es valida, debe estar entre 0 y 10 </p>';
        }
    }
    ?>
    <p>FIN</p>
</body>
</html>