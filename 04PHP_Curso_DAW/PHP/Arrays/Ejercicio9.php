<?php
/** 
 *  9.- Escribe un programa que lea desde la consola el enunciado de una pregunta y las cuatro posibles 
 *  respuestas, guardando los cinco valores en un array llamado test. A continuación los mostrará cómo 
 *  si fuera una pregunta de tipo test. Por ejemplo: 
 * ¿Quién creó el Altair 8800, el primer ordenador personal?
 *   a) Bill Gates
 *   b) Steve Jobs
 *   c) Ed Roberts
 *   d) Gary Kildall
 */
session_start();
if (!isset($_SESSION["pregunta"]) && !empty($_SESSION["pregunta"])) {
    $_SESSION['pregunta'];
    $_SESSION['respuesta']; // respuesta correcta
}
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
    <p>Juego de preguntas</p>
    <p>El texto debe de quedar asi, Ejemplo: </p>
    <p>¿Quién creó el Altair 8800, el primer ordenador personal?</p>
    <p>a) Bill Gates</p>
    <p>b) Steve Jobs</p>
    <p>c) Ed Roberts</p>
    <p>d) Gary Kildall</p>
    <p>----------------------------------------------------------</p>
    <form action="Ejercicio9.php" method="post">
    <label for="pregunta"><p>Preguntas?</p></label>
    <input type="text" name="pregunta[]" placeholder="Pregunta" required><br>
    <?php
        $i = 0;
        while($i < 2){
            echo "<p><input type='text' name='pregunta[]' placeholder='Respuesta " . ($i+1) . "'></p>";
            $i++;
        }
    ?>
        <label for="respuesta">Respuesta Correcta:</label><br>
        <input type="text" name="respuesta" placeholder="Respuesta" required><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form><br><br>
    <?php
        if(isset($_POST['pregunta']) && !empty($_POST['pregunta'])) {
            if(isset($_POST['respuesta']) && !empty($_POST['respuesta'])) {
            
            // Obtenemos los datos y los agregamos a la variable global sesion
            $preguntas = $_POST['pregunta'];
            // $_SESSION['pregunta'] = $preguntas; // Agregamos la variable a la sesion

            $respuesta = $_POST['respuesta'];
            $_SESSION['respuesta'] = $respuesta; // Agregamos la variable a la sesion
            
            // Mostramos las preguntas
            for($i = 0; $i < count($preguntas); $i++){
                if($i == '0'){
                    echo '<p>Pregunta: '. $preguntas[$i] .'</p>';
                }else if($i == '1'){
                    echo '<p>a) '. $preguntas[$i] .'</p>';
                }else if($i == '2'){
                    echo '<p>b) '. $preguntas[$i] .'</p>';
                }else if($i == '3'){
                    echo '<p>c) '. $preguntas[$i] .'</p>';
                }else if($i == '4'){
                    echo '<p>d) '. $preguntas[$i] .'</p>';
                }
                // Comparamos la respuesta con la correcta y la guardamos en la variable global
                if($respuesta == $preguntas[$i]){
                    $respuesta == $preguntas[$i];
                }
            }
        }
    }
    ?>
    <p>----------------------------------------------------------</p>
    <form action="Ejercicio9.php" method="post">
        <label for="respuestaUsuario">Respuesta del Usuario:</label><br>
        <input type="text" name="respuestaUsuario" placeholder="Respuesta"><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(isset($_POST['respuestaUsuario']) && !empty($_POST['respuestaUsuario'])){
            $respuestaUsuario = $_POST['respuestaUsuario']; // Respuesta del usuario
            $respuesta = $_SESSION['respuesta']; // Obtenemos la respuesta correcta de la variable global
            
            if($respuesta == $respuestaUsuario){ // Comparamos la respuesta para ver si son correctas
                echo '<p>Respuesta Correcta, '.  $respuestaUsuario  .'</p>';
            }else{
                echo '<p>Respuesta Incorrecta, la respuesta correcta es '. $respuesta . '</p>';
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>