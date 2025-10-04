<?php

/** 
 * 4.- Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase 
 * "Has fallado".
 * Variante PHP- Aquí tienes un programa en PHP que utiliza un bucle for para preguntar al usuario por un 
 * número entero cinco veces. Si el usuario acierta el número, el programa muestra "Has acertado" y termina. 
 * Si el usuario no acierta después de cinco intentos, el programa muestra "Has perdido". Utiliza una constante 
 * NUMERO_SECRETO para almacenar el numero correcto.
 */
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios 4_1</title>
    <style>
        body {
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #ded6c9;
            padding: 20px";

        }
    </style>
</head>

<body>
    <h2>Ejercicios 4_1</h2>
    <p>Introduce un número</p>
    <form action="Ejercicio4_1.php" method="post">
        <label for="numero">Numero: </label>
        <input type="text" name="numero" placeholder="Introduce un número" min="1" max="10" required>
        <input type="submit" value="Enviar">
    </form>
    <?php
    session_start();

    // Definimos las constantes
    define("NUMERO_INTENTOS", 5);
    define("NUMERO_SECRETO", 6);
    // Definimos una constante para el número secreto
    // define('NUMERO_SECRETO', rand(1, 10));


    // Inicializamos el contador de intentos si es la primera vez que se ejecuta el script
    if (!isset($_SESSION['intentos'])) {
        // Contador de intentos
        $_SESSION['intentos'] =  0;
    }
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Obtenemos el número ingresado por el usuario
        $numero = (int)$_POST['numero'];
        $_SESSION['intentos']++; // Incrementamos el contador

        // Bucle for para realizar hasta 5 intentos
        for ($i = 0; $i < NUMERO_INTENTOS;) {

            // Comprobamos si el número es correcto
            if ($numero == NUMERO_SECRETO) {
                echo "<p>Has acertado el número en el intento {$_SESSION['intentos']} No: {$numero}</p>";
                session_unset(); // Reiniciamos la sesión
                break;
            } elseif ($_SESSION['intentos'] >= NUMERO_INTENTOS) {
                echo "<p>Has perdido. El número correcto era: " . NUMERO_SECRETO . ".</p>";
                session_unset();
                break;
            } else {
                echo "<p>Intento {$_SESSION['intentos']}: Has fallado. Inténtalo de nuevo.</p>";
                break;
            }
        }
    }
    ?>
    <p>FIN</p>
</body>
</html>