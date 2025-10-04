<?php
// Iniciar sesión (por si necesitamos usar variables de sesión más adelante)
session_start();

// Conexión a la base de datos
$conn = new mysqli('localhost', 'root', '', 'login_tutorial');

// Verificar conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

// Obtener datos del formulario
$nombre_usuario = $_POST['nombre_usuario'];
$correo_electronico = $_POST['correo_electronico'];
$contraseña = $_POST['contraseña'];

// Validar que los campos no estén vacíos
if (empty($nombre_usuario) || empty($correo_electronico) || empty($contraseña)) {
    echo "Por favor, completa todos los campos.";
    exit();
}

// Hashear la contraseña
// PASSWORD_BCRYPT` se utiliza para crear nuevos hash de contraseñas empleando el algoritmo `CRYPT_BLOWFISH
$contraseña_hash = password_hash($contraseña, PASSWORD_BCRYPT);

// Verificar si el nombre de usuario o correo ya existen de forma segura
$sql = "SELECT id FROM usuarios WHERE nombre_usuario = ? OR correo_electronico = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("ss", $nombre_usuario, $correo_electronico); // Enlaza variables a una declaracion preparada como parametro
$stmt->execute(); // ejecuta la consulta preparada con los valores proporcionados, devuelve true si tiene exito o false en caso de error
$stmt->store_result(); // Devuelve true en caso de exito o false en caso de error

if ($stmt->num_rows > 0) { // num_rows — Devuelve el número de filas de un conjunto de resultados de una sentencia mysqli_stmt::$num_rows
    echo "El nombre de usuario o correo electrónico ya están en uso.";
    // Mostramos un enlace a la pagina anterior
    echo "<br><a href='javascript:history.back()'>Volver</a>";
    // header("Location: registro.html");
    exit();
}

// Insertar nuevo usuario
$sql = "INSERT INTO usuarios (nombre_usuario, correo_electronico, contraseña) VALUES (?, ?, ?)";
$stmt = $conn->prepare($sql);
$stmt->bind_param("sss", $nombre_usuario, $correo_electronico, $contraseña_hash);

if ($stmt->execute()) { // devuelve true en caso de exito o false en caso de error 
    echo "Registro exitoso. <a href='login.html'>Inicia sesión aquí</a>.";
} else {
    echo "Error: " . $stmt->error;
}

$stmt->close(); // Cerrar conexiones
$conn->close(); // $conn almacena una instancia de la clase mysqli, que representa una conexión activa con una base de datos MySQL.
?>
