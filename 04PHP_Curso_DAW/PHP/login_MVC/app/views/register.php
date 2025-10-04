<!-- app/views/register.php -->
<!DOCTYPE html>
<html label="es">
<head>
    <title>Registro</title>
    <link rel="stylesheet" href="./assets/css/main.css">
    <meta charset="UTF-8" viewport="width=device-width, initial-scale=1.0">
</head>
<body>
    <div class="container">
        <h2>Registro de Usuario</h2>
        <form action="index.php?action=register" method="POST">
            <label>Nombre de usuario:</label>
            <input type="text" name="username" required>
            
            <label>Correo electrónico:</label>
            <input type="email" name="email" required>
            
            <label>Contraseña:</label>
            <input type="password" name="password" required>
            
            <button type="submit" class="btn btn-block">Registrarse</button>
        </form>
        <p>¿Ya tienes una cuenta? <a href="index.php?action=login">Inicia sesión aquí</a></p>
    </div>
</body>
</html>

