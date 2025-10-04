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
// Contador de sesiones
if(!isset($_SESSION['sesion']) && !empty($_SESSION['sesion'])) {
    $_SESSION['usuario'] = "Ramon";
    $_SESSION['session'] = 1;
    $respuestaProfesor = $_SESSION['respuestaProfesor'];
    $_SESSION['pregunta'] = [];
}else{
    
    $_SESSION['session']++;
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
    <p>Adivina la pregunta del profesor: </p>
    <p>¿Quién creó el Altair 8800, el primer ordenador personal?</p>
    <p>a) Bill Gates</p>
    <p>b) Steve Jobs</p>
    <p>c) Ed Roberts</p>
    <p>d) Gary Kildall</p>
    <p>----------------------------------------------------------</p>
    <form action="JuegoPreguntas.php" method="post">
    <label for="pregunta"><p>Preguntas?</p></label>
    <input type="text" name="pregunta[]" placeholder="Pregunta" required><br>
    <?php
        $i = 0;
        while($i < 4){
            echo "<p><input type='text' name='pregunta[]' placeholder='Respuesta " . ($i+1) . "'></p>";
            $i++;
        }
    ?>
    <label for="respuestaProfesor">Respuesta del profesor:</label><br>
    <input type="text" name="respuestaProfesor" placehol+der="Respuesta" required><br><br>
    <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        // Mostramos las preguntas
        if(isset($_POST['pregunta']) && !empty($_POST['pregunta']) && isset($_POST['respuestaProfesor']) && !empty($_POST['respuestaProfesor'])) {
            $preguntas = $_POST['pregunta'];
            $_SESSION['pregunta'] = $preguntas;
            $respuestaProfesor = $_SESSION['respuestaProfesor'];
            
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
                if($respuestaProfesor == $preguntas[$i]){
                    $respuestaProfesor == $preguntas[$i];
                }
            }
        }
    ?>
    <p>----------------------------------------------------------</p>
    <form action="JuegoPreguntas.php" method="post"><br><br>
    <label for="respuestaAlumno">Respuesta del Alumno:</label><br>
    <input type="text" name="respuestaAlumno" placeholder="Respuesta" required><br><br>
    <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        // Guardamos la respuesta del profesor en una variable global $SESSION['respuestaProfesor']
        if(isset($_POST['respuestaProfesor']) && !empty($_POST['respuestaProfesor'])) {
            $respuestaProfesor = $_POST['respuestaProfesor'];
            $_SESSION['respuestaProfesor'] = $respuestaProfesor; // Le decimos que la variable global sea igual a la variable local
        }
        // Mostramos si la respuesta es correcta
        if(isset($_POST['respuestaAlumno']) && !empty($_POST['respuestaAlumno'])) {
            $respuestaProfesor = $_SESSION['respuestaProfesor'];
            $respuestaAlumno = $_POST['respuestaAlumno'];

            for($i = 0; $i < count($_SESSION['pregunta']); $i++) {
                echo '<p>'. $_SESSION['pregunta'][$i] .'</p>';
            }
            if($respuestaAlumno == $respuestaProfesor){
                echo '<p>Tu respuesta es: </p>' . $respuestaAlumno;
                echo '<p style = "color:green;">Respuesta correcta</p>';
            }else{
                echo '<p>Tu respuesta es: </p>' . $respuestaAlumno;
                echo '<p style="color:red;">Respuesta incorrecta</p>';
            }
            // session_unset();
        }
        echo "<p>----------------------------------------------------------</p>";
        echo "<p>Sesión: " . $_SESSION['session'] . "</p>";
    ?>
    <p>FIN</p>
</body>
</html>