<?php
/** 
 * 5.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo 
* adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario 
* adivina el número o falla tres veces, el programa termina. 
* Utiliza un bucle do-while.
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
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <h2>Adivina el número entre 1 y 10</h2>
    <form action="" method="post">
        <label for="numero">Ingresa tu número:</label>
        <input type="number" name="numero" min="1" max="10" required>
        <input type="submit" value="Intentar">
    </form>
    <?php
        session_start();

        // Inicializamos el número aleatorio y el contador de intentos si es la primera vez que se ejecuta el script
        if (!isset($_SESSION['numero_aleatorio'])) {
            $_SESSION['numero_aleatorio'] = rand(1, 10); // Número aleatorio entre 1 y 10
            $_SESSION['intentos'] = 0; // Contador de intentos
        }
    
        // Procesamos el intento del usuario
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $usuario_numero = (int)$_POST['numero']; // Obtenemos el número ingresado por el usuario
            
            do {
                $_SESSION['intentos']++; // Incrementamos el contador de intentos
    
                // Verificamos si el usuario adivinó el número
                if ($usuario_numero == $_SESSION['numero_aleatorio']) {
                    echo "<p>¡Has acertado al {$usuario_numero} intento!<br> El número era {$_SESSION['numero_aleatorio']}.</p>";
                    session_unset(); // Reiniciamos la sesión para empezar un nuevo juego
                    break;
                } elseif ($_SESSION['intentos'] >= 3) {
                    echo "<p>Has perdido. El número correcto era {$_SESSION['numero_aleatorio']}.</p>";
                    session_unset(); // Reiniciamos la sesión
                    break;
                } else {
                    echo "<p>Intento {$_SESSION['intentos']}: Has fallado. Inténtalo de nuevo.</p>";
                    break;
                }
            // Incrementamos el contador de intentos y volvemos al bucle siempre que el usuario no haya adivinado el número
            } while ($_SESSION['intentos'] < 3 && $usuario_numero != $_SESSION['numero_aleatorio']);
        }
    ?>
    <p>FIN</p>
</body>
</html>