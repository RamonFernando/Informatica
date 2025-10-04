<?php
/**
 * Escribe un programa en PHP que dibuje un triángulo de asteriscos. 
 * El programa debe pedir al usuario que introduzca la altura del triángulo (x) y 
 * luego mostrar el triángulo correspondiente en la pantalla (falta eje y). 
 * Por ejemplo, si el usuario introduce una altura de 5, el programa debe mostrar:
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
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio Triangulo</h2>
    <p>Escribe un numero para dibujar un triangulo </p>
    <form action="triangulo.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero" min="1" max="10" required placeholder="Numero">
        <input type="submit" value="Enviar">
    </form>
    <?php
        if(!empty($_POST["numero"])) {
            $numero = $_POST["numero"];// Introducimos el numero
            $contador = 0;
            echo"<br>";
            while($contador < $numero){
                $i = 0;
                while($i <= $contador){
                    echo " * ";
                    $i++;
                }
                echo "<br>";
                $contador++;
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>