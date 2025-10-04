<?php
include("createBD.php");
echo "<h1>CRUD Simple Optimizado</h1>";
/*
// Botón de regreso
function boton_volver() {
    echo "<br><a href='index.html'>Volver</a><br><br>";
}

// Funciones de validación de entrada
// Validar entrada de datos con metodos de validación
function validate_input($data) {
    $data = trim($data);                // Elimina espacios en blanco al inicio y al final
    $data = stripslashes($data);        // Elimina backslashes \
    $data = htmlspecialchars($data);    // Convierte caracteres especiales en entidades HTML
    return $data;
}
// Funciones que validan si un USUARIO o el ID ya existen
function existeUsuario($conn, $nombre, $email) {
    $checkSql = "SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'";
    $result = $conn->query($checkSql);
    if ($result->num_rows > 0) {
        echo "<p>El Usuario: <strong> ". strtoupper($nombre) ."</strong> Email: <strong>" . strtoupper($email) . "</strong> ya existe.</p>";
        boton_volver();
        return true;
    }
}
function existeId($conn, $id) {
    $checkSql = "SELECT * FROM usuarios WHERE id = $id";
    $result = $conn->query($checkSql);
    if ($result->num_rows > 0) {
        echo "<p>El usuario con ID <strong>\" $id \"</strong> ya existe.</p>";
        boton_volver();
        return true;
    }
}
// ---------------------------------- CRUD ----------------------------------------- //
// Crear un nuevo usuario
function create($conn, $nombre, $email) {
    $nombre = validate_input($nombre);
    $email = validate_input($email);

    if (empty($nombre) || empty($email)) {
        echo "<p>Por favor completa todos los campos.</p>";
        boton_volver();
        return;
    }

    if (existeUsuario($conn, $nombre, $email)) return;
    
    $sql = "INSERT INTO usuarios (nombre, email) VALUES ('$nombre', '$email')";
    if ($conn->query($sql) === TRUE) {
        echo "<p>Usuario: <strong>" . strtoupper($nombre) ."</strong> Email: <strong>" . strtoupper($email) . "</strong> ha sido creado con exito!</p>";
    } else {
        echo "<p>Error al crear usuario: " . $conn->error . "</p>";
    }
    boton_volver();
    read($conn);
}

// Leer todos los usuarios
function read($conn) {
    $sql = "SELECT * FROM usuarios";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "ID: " . $row["id"] . "<br>";
            echo "Nombre: " . $row["nombre"] . "<br>";
            echo "Email: " . $row["email"] . "<br><br>";
        }
    } else {
        echo "<p>No se encontraron registros.</p>";
    }
    boton_volver();
}

// Actualizar usuario
function update($conn, $id, $nombre, $email) {
    $id = (int) validate_input($id);
    $nombre = validate_input($nombre);
    $email = validate_input($email);

    if (empty($id) || empty($nombre) || empty($email)) {
        echo "<p>Todos los campos son obligatorios.</p>";
        boton_volver();
        return;
    }
    
    $sql = "UPDATE usuarios SET nombre = '$nombre', email = '$email' WHERE id = $id";
    if ($conn->query($sql) === TRUE) {
        echo "<p>Usuario  <strong>\"$id: " . strtoupper($nombre) .  "\"</strong> actualizado correctamente.</p>";
        read($conn);
    } else {
        echo "<p>Error al actualizar usuario: " . $conn->error . "</p>";
    }
    boton_volver();
}

// Eliminar usuario
function delete($conn, $id) {
    $id = (int) validate_input($id);

    if (empty($id)) {
        echo "<p>Por favor ingresa un ID válido.</p>";
        boton_volver();
        return;
    }

    if (!existeId($conn, $id)) echo "<p>El usuario con ID <strong>\"$id\"</strong> no existe.</p>", boton_volver(), return;

    $sql = "DELETE FROM usuarios WHERE id = $id";
    if ($conn->query($sql) === TRUE) {
        echo "<p>Usuario \"$id\" eliminado correctamente.</p>";
        read($conn);
    } else {
        echo "<p>Error al eliminar usuario: " . $conn->error . "</p>";
    }
    boton_volver();
}

// Procesar solicitudes POST
$conn = create_connection();
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $type = isset($_POST['type']) ? $_POST['type'] : '';

    switch ($type) {
        case 'create':
            create($conn, $_POST['nombre'], $_POST['email']);
            break;
        case 'read':
            read($conn);
            break;
        case 'update':
            update($conn, $_POST['id'], $_POST['nombre'], $_POST['email']);
            break;
        case 'delete':
            delete($conn, $_POST['id']);
            break;
        default:
            echo "<p>Acción no válida.</p>";
            boton_volver();
    }
}
$conn->close();*/
?>
