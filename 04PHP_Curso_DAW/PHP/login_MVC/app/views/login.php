<!-- app/views/login.php o app/views/register.php -->
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Iniciar Sesión</title>
    <link rel="stylesheet" href="./assets/css/main.css">
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <script>
        // Funcion para ocultar el mensaje despues de 5 segundos
        document.addEventListener("DOMContentLoaded", function() {
            let message = document.getElementById("message");
            if (message) {
                setTimeout(() => {
                    message.style.transition = "opacity 1s ease-out";
                    message.style.opacity = "0";
                    setTimeout(() => message.style.display = "none", 1000);
                }, 5000);
            }
        });
    </script>
</head>
<body>
    <div class="container">
        <!-- Mostrar mensajes de error o éxito -->
        <?php if (!empty($error)): ?>
            <p id="message" class="error"><?php echo htmlspecialchars($error); ?></p>
        <?php endif; ?>
        
        <!-- Mostrar mensajes de éxito -->
        <?php if (!empty($success)): ?>
            <p id="message" class="success"><?php echo htmlspecialchars($success); ?></p>
        <?php endif; ?>

        <h2>Iniciar Sesión</h2>
        <form action="index.php?action=login" method="POST">
            <label>Nombre de usuario:</label>
            <input type="text" name="username" value="<?php echo isset($_POST['username']) ? htmlspecialchars($_POST['username']) : ''; ?>" required>

            <label>Contraseña:</label>
            <input type="password" name="password" required>

            <button type="submit" class="btn btn-block">Iniciar Sesión</button>
        </form>
        <p><a href="index.php?action=forgot_password">¿Olvidaste tu contraseña?</a></p>
        <p>¿No tienes una cuenta? <a href="index.php?action=register">Regístrate aquí</a></p>
    </div>
</body>
</html>
