<?php
/**
* Ejercicio: Adivina el Número (PHP)
*Desarrolla una aplicación en PHP que permita al usuario adivinar un número aleatorio entre 1 y 10. La aplicación debe cumplir 
*con los siguientes requisitos:

*Generación del Número Aleatorio: Al cargar la página por primera vez, el sistema debe generar un número aleatorio entre 1 y 10, que 
*se mantendrá constante durante la sesión de juego.

*Formulario de Entrada: Muestra un formulario en la página donde el usuario pueda introducir un número (entre 1 y 10) e intentar adivinar el 
*número generado aleatoriamente.

*Control de Intentos:

*El usuario tiene un máximo de 3 intentos para adivinar el número.
*Si el número ingresado no está entre 1 y 10, muestra un mensaje de error y no cuentes el intento.
*Resultado del Intento:

*Si el usuario acierta el número dentro de los 3 intentos, muestra un mensaje de éxito indicando el intento en el que acertó y termina el juego.
*Si el usuario no acierta después de 3 intentos, muestra un mensaje indicando que ha perdido, junto con el número correcto.
*Manejo de Sesiones: Utiliza sesiones para almacenar tanto el número aleatorio como el número de intentos realizados, de manera que estos 
*datos se mantengan entre envíos del formulario.

*Reinicio del Juego: Después de que el usuario acierte o agote sus intentos, reinicia la sesión para que se pueda iniciar un nuevo 
*juego en el próximo envío del formulario.

*Pistas:
*Usa rand(1, 10) para generar el número aleatorio.
*Utiliza session_start() para iniciar la sesión y almacenar las variables de sesión ($_SESSION).
*Asegúrate de validar la entrada del usuario para que esté en el rango de 1 a 10.
*Utiliza isset() para verificar si el formulario ha sido enviado.
*session_unset();    // Borra todas las variables de la sesión
*session_destroy();  // Termina la sesión
 */
?>

 <?php
 // ------------------- RESPUESTA DEL EJERCICIO ----------------------
 // Iniciar la sesión para poder almacenar datos que persistan entre peticiones, como el número de intentos y el número aleatorio
 //Error si se usa session_start(); y no existe la cookie sesion (Warning: Cannot send session cookie - headers already sent by (output started at ...))
 session_start();

// Verificar si la variable de sesión 'intentos' está definida, lo que indica que es la primera vez que se carga la página
 if (!isset($_SESSION['intentos'])) {
     // Si es la primera carga, inicializar los intentos en 1 y generar un número aleatorio entre 1 y 10
     $_SESSION['intentos'] = 1;
     $_SESSION['numero_aleatorio'] = rand(1, 10);
 }
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <tEjercicios</title>
    <style>
        body {
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
        }
    </style>
</head>

<body>
    <h2>Ejercicios</h2>
    <p>Introduce un número entre 1 y 10 (3 intentos)</p>
    <!-- Formulario para que el usuario introduzca un número -->
    <form action="" method="post">
        <label for="numero">Número: </label>
        <input type="text" name="numero" placeholder="Introduce un número">
        <input type="submit" value="Enviar">
    </form>

    <?php
   
    // Verificar si el formulario ha sido enviado comprobando si $_POST['numero'] está definido
    if (isset($_POST['numero'])) {
        // Convertir el valor introducido por el usuario en un número entero para evitar errores
        $numero = intval($_POST['numero']);

        // Validar que el número esté en el rango de 1 a 10
        if ($numero < 1 || $numero > 10) {
            // Si el número no está en el rango, mostrar un mensaje de error
            echo "<p>Por favor, introduce un número entre 1 y 10.</p>";
        } else {
            // Recuperar el número aleatorio y el contador de intentos desde la sesión
            $numero_aleatorio = $_SESSION['numero_aleatorio'];
            $intentos = $_SESSION['intentos'];

            // Comparar el número introducido por el usuario con el número aleatorio
            if ($numero == $numero_aleatorio) {
                // Si el usuario acierta, mostrar un mensaje de éxito con el intento en que acertó
                echo "<p>¡HAS ACERTADO en el intento $intentos! El número era: $numero_aleatorio</p>";
                // Reiniciar la sesión para que se pueda empezar un nuevo juego
                session_unset();
                session_destroy();
            } elseif ($intentos >= 3) {
                // Si el usuario ha agotado los 3 intentos sin acertar, mostrar un mensaje de derrota
                echo "<p>HAS PERDIDO. El número era: $numero_aleatorio</p>";
                // Reiniciar la sesión para que se pueda empezar un nuevo juego
                session_unset();
                session_destroy();
            } else {
                // Si el usuario no ha acertado y aún le quedan intentos, mostrar un mensaje de fallo y aumentar el contador de intentos
                echo "<p>HAS FALLADO. Intento $intentos de 3.</p>";
                $_SESSION['intentos']++; // Incrementar el número de intentos en la sesión
                
            }
        }
    }
    ?>
    <p>FIN</p>
</body>

</html>