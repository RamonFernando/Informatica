<?php
/** 
 *  8.- Crea un programa que pregunte al usuario cómo se dice en inglés "ordenador". Si el usuario 
 *  responde "computer" entonces recibirá una felicitación. Si no, recibirá un mensaje de consolación. 
 */
session_start(); // Iniciamos la sesion
// Creamos las variable globales
$GLOBALS['pregunta'] = "Como se dice en ingles 'Ordenador' ?";
$GLOBALS['g_respuesta'] = "computer";
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
    <h3>Responde a la siguiente pregunta:</h3>
    <?php
    // Mostramos la pregunta y accedemos a la variable global
    echo "<p>$pregunta</p>";
    ?>
    
    <form action="Ejercicio8Ss_vGlobal_trim().php" method="post">
        <label for="respuesta">Respuesta: </label>
        <input type="text" name="respuesta" placeholder="Introduce la respuesta" required><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        // Iniciamos el contador si no existe y lo incrementamos en 1
        if(!isset($_SESSION['intentos'])){
            $_SESSION['intentos'] = 3; // Iniciamos el contador de intentos en 1
        }
        if(!empty($_POST['respuesta'])){ // Si la respuesta no esta vacia
            $intentos = $_SESSION['intentos'];
            $respuesta = trim($_POST['respuesta']); // Limpiamos los espacios trim()
            if($respuesta == $g_respuesta){ // Si la respuesta es la correcta
                echo "<p>Correcto, Felicidades!</p>"; // Mostramos el mensaje de correcto
                session_unset(); // Limpiamos la sesion
                session_destroy(); // Destruimos la sesion
            }else{
                if($intentos == 0 && $respuesta != $g_respuesta && $intentos > -1){
                    echo "<p>Has perdido la respuesta es '$g_respuesta'</p>";
                    session_unset();
                    session_destroy();
                }else{
                    // Si la respuesta es incorrecta
                echo "<p>Incorrecto, te quedan ". $intentos ." intentos</p>"; // Mostramos el mensaje de incorrecto
                $_SESSION['intentos']--; // Decrementamos el contador de intentos en 1
                }
        }
    }
    ?>
    <p>FIN</p>
</body>
</html>