<?php
/**
 *  7.- Juego de adivinar el número secreto. El ordenador nos preguntará un número del 1 al 10. Si 
 *  coincide con el número secreto (que habrás codificado como una constante entera) nos felicitará. Si 
 *  no, nos dirá que hemos fallado.
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
    <p>Adivina el numero</p>
    <form action="Ejercicio7Ss.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero" placeholder="Introduce un número" min="1" max="10" required><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(!isset($_SESSION["contador"])){ // Hace que se reinicie la sesion y se sume el contador si es la primera vez que se ejecuta el scrip
            $_SESSION['contador'] = 1;
        }
        if(!empty($_POST['numero'])){
        $numero = $_POST['numero'];
        define('NUMERO_SECRETO', 5);
            if($numero > 0 && $numero < 10){
                if($_SESSION['contador'] < 3){
                    if($numero == NUMERO_SECRETO){
                        echo "<p>Has acertado al ". $_SESSION['contador'] ."º intento</p>";
                        session_unset();
                    }else{
                        echo "<p>Has fallado, intento ". $_SESSION['contador'] ." de 3 </p>";
                        $_SESSION['contador']++;
                    }
                }else{
                    echo "<p>Has perdido, el número era ". NUMERO_SECRETO ."</p>";
                    session_unset();
                    session_destroy();
                }
            }else{
                echo "<p>El número debe estar entre 1 y 10</p>";
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>