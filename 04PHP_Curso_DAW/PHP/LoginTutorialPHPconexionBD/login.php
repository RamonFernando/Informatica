<?php
// Iniciar sesión para manejar datos del usuario
session_start();

// Conexión a la base de datos
$conn = new mysqli('localhost', 'root', '', 'login_tutorial');

// Verificar conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

$error = ''; // Variable para almacenar mensajes de error

// Verificar si se enviaron los datos del formulario
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Obtener datos del formulario
    $nombre_usuario = $_POST['nombre_usuario'];
    $contraseña = $_POST['contraseña'];

    // Validar que los campos no estén vacíos
    if (empty($nombre_usuario) || empty($contraseña)) {
        $error = "Por favor, completa todos los campos.";
    } else {
        // Verificar si el usuario existe
        $sql = "SELECT id, contraseña FROM usuarios WHERE nombre_usuario = ? OR correo_electronico = ?";
        $stmt = $conn->prepare($sql);
        $stmt->bind_param("ss", $nombre_usuario, $nombre_usuario);
        $stmt->execute();
        $stmt->store_result();

        // Si el usuario existe
        if ($stmt->num_rows > 0) {
            $stmt->bind_result($id, $contraseña_hash);
            $stmt->fetch();

            // Verificar contraseña
            if (password_verify($contraseña, $contraseña_hash)) {
                // Iniciar sesión exitosamente
                $_SESSION['usuario_id'] = $id;
                $_SESSION['nombre_usuario'] = $nombre_usuario;

                // Redirigir a la página protegida
                header("Location: pagina_protegida.php");
                exit();
            } else {
                $error = "Contraseña incorrecta.";
            }
        } else {
            $error = "El usuario o correo electrónico no existen.";
        }

        // Cerrar consulta
        $stmt->close();
    }
}

// Cerrar conexión
$conn->close();
?>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="styles.css">
    <!-- Incluye tu archivo CSS aquí -->
</head>
<body>
    <main class="login-container">
        <!-- Encabezado de la página -->
        <h2 class="login-title">Iniciar Sesión</h2>
        <?php if (!empty($error)): ?>
            
            <p id="error-message" style= "color: #856404;                
                                        background-color: #fff3cd;     
                                        border: 1px solid #a7945c;     
                                        padding: 15px;                 
                                        margin-bottom: 20px;           
                                        border-radius: 5px; ">
                                        <?php echo htmlspecialchars($error); ?>
                                    </p>
        
            
        <?php endif; ?>
        <!-- Formulario de inicio de sesión -->
        <form class="login-form" action="login.php" method="POST">
                <!-- Campo de nombre de usuario -->
                <div class="form-group">
                    <label for="nombre_usuario">Nombre de usuario:</label>
                    <input type="text" id="nombre_usuario" name="nombre_usuario" required>
                </div>

                <!-- Campo de contraseña -->
                <div class="form-group">
                    <label for="contraseña">Contraseña:</label>
                    <input type="password" id="contraseña" name="contraseña" required>
                </div>

                <!-- Botón de inicio de sesión -->
                <button class="login-button" type="submit">Iniciar Sesión</button>
            </form>
            <!-- Enlace para registrarse -->
            <div class="register-link">
                <p>¿No tienes una cuenta? <a href="registro.html">Regístrate aquí</a></p>
            </div>
    <?php if (!empty($error)): ?>
    <script>
        // JavaScript para ocultar el mensaje de error después de 5 segundos
        setTimeout(function() {
            var errorMessage = document.getElementById('error-message');
            if (errorMessage) {
                errorMessage.style.display = 'none';
            }
        }, 5000); // 5000 milisegundos = 5 segundos
    </script>
    <?php endif; ?>
    </main>
</body>
</html>
