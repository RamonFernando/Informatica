<?php
/** 
 * 18.- Crea un programa que pida un número entero por teclado, entre 1 y 10. Si el usuario escribe un 
 * número entero, se escribirá su valor en pantalla. Si lo que escribe no es un entero, se mostará un 
 * mensaje de error. 
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
    <p>...</p>
    <form action="Ejercicio18y19.php" method="post">
        <label for="inputTexto">Número:</label><br>
        <input type="number" step="0.01" name="num" id="inputTexto" placeholder="Introduce un número"><br><br>
        <input class="boton" type="submit" value="Enviar">
    </form>
    <?php
        echo"<p>Introduce un número entre 1 y 10</p>";
        if(isset($_POST['num']) && !empty($_POST['num'])) {
            $numero = floatval($_POST['num']);
            
            // Comprueba si es un valor numerico y es un entero
            if(is_numeric($numero) && intval($numero) == $numero){
                echo ($numero == 3)? "Has acertado el # {$numero}" : "";
                print("<p>El número {$numero} es un entero</p>");
            }else{
                print("<p>El número {$numero} no es un entero</p>");
            }
        }

    ?>
    <p>FIN</p>
</body>
</html>