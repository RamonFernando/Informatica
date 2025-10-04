<?php
// Iniciar sesión
session_start();

// Conexión a la base de datos
$conn = new mysqli('localhost', 'root', '', 'login_tutorial');

// Verificar conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

// Obtener datos del formulario
$nombre_usuario = $_POST['nombre_usuario'];
$contraseña = $_POST['contraseña'];

// Validar que los campos no estén vacíos
if (empty($nombre_usuario) || empty($contraseña)) {
    echo "Por favor, completa todos los campos.";
    exit();
}

// Buscar al usuario en la base de datos
$sql = "SELECT id, contraseña FROM usuarios WHERE nombre_usuario = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("s", $nombre_usuario);
$stmt->execute(); // ejecuta la consulta preparada con los valores proporcionados, devuelve true si tiene exito o false en caso de error
$stmt->store_result(); // Devuelve true en caso de exito o false en caso de error

// Verificar si el usuario existe
if ($stmt->num_rows > 0) {
    $stmt->bind_result($id, $contraseña_hash);
    $stmt->fetch(); // Es para recuperar datos de una consulta a la base de datos, obteniendo una fila a la vez

    // Verificar la contraseña
    if (password_verify($contraseña, $contraseña_hash)) {
        // Iniciar sesión y guardar variables de sesión
        $_SESSION['usuario_id'] = $id;
        $_SESSION['nombre_usuario'] = $nombre_usuario;

        echo "Inicio de sesión exitoso. <a href='pagina_protegida.php'>Ir a la página protegida</a>.";
    } else {
        echo "Contraseña incorrecta.";
    }
} else {
    echo "El nombre de usuario no existe.";
}

// Cerrar conexiones
$stmt->close();
$conn->close();
?>
