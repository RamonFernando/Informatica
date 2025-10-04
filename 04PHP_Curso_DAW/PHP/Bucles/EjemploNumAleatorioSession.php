<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Adivina el Número</title>
</head>
<body>
    <h2>Adivina el número entre 1 y 10</h2>
    <form action="" method="post">
        <label for="guess">Ingresa tu número:</label>
        <input type="number" name="guess" min="1" max="10" required>
        <input type="submit" value="Intentar">
    </form>

    <?php
    session_start();

    // Inicializamos el número aleatorio y el conteo de intentos si es la primera vez que se ejecuta el script
    if (!isset($_SESSION['random_number'])) {
        $_SESSION['random_number'] = rand(1, 10); // Número aleatorio entre 1 y 10
        $_SESSION['attempts'] = 0; // Contador de intentos
    }

    // Procesamos el intento del usuario
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $user_guess = (int)$_POST['guess'];
        $_SESSION['attempts']++; // Incrementamos el contador de intentos

        do {
            if ($user_guess == $_SESSION['random_number']) {
                echo "<p>¡Felicidades! Adivinaste el número {$_SESSION['random_number']} en {$_SESSION['attempts']} intentos.</p>";
                session_unset(); // Reiniciamos la sesión
                break;
            } elseif ($_SESSION['attempts'] >= 3) {
                echo "<p>Has fallado los 3 intentos. El número correcto era {$_SESSION['random_number']}.</p>";
                session_unset(); // Reiniciamos la sesión
                break;
            } else {
                echo "<p>Intento {$_SESSION['attempts']}: No es correcto. ¡Inténtalo de nuevo!</p>";
                break;
            }
        } while ($_SESSION['attempts'] < 3 && $user_guess != $_SESSION['random_number']);
    }
    ?>
</body>
</html>