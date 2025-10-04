<?php
/*
include("createBD.php");
echo "<h1>CRUD Simple v1</h1>";
$conn = create_connection(); // Conectar a la base de datos
function create($conn) {
    if (isset($_POST['crear'])) {
        $nombre = $_POST['nombre']; $email = $_POST['email'];

        $result = $conn->query("SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'"); // Verificar si el usuario ya existe
        if($result->num_rows > 0) {echo "El usuario ya existe"; return;}
        
        $sql = "INSERT INTO usuarios (nombre, email) VALUES ('$nombre', '$email')";
        echo ($conn->query($sql) === TRUE && $nombre != "" && $email != "") ? "Registro creado con éxito" : "Error al crear registro: " . $conn->error;
    }
}
function read($conn) {
    if (isset($_POST['leer'])) {
        $sql = "SELECT * FROM usuarios";
        $result = $conn->query($sql);
        
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                echo "ID: " . $row["id"] . " - Nombre: " . $row["nombre"] . " - Email: " . $row["email"] . "<br>";
            }
        } else { echo "No se encontraron registros"; }
    }
}
function update($conn) {
    if (isset($_POST['actualizar'])) {
        $id = $_POST['id']; $nombre = $_POST['nombre']; $email = $_POST['email'];

        $result = $conn->query("SELECT * FROM usuarios WHERE id = '$id'"); // Verificar si el ID existe
        if ($result->num_rows == 0) { echo "El usuario no existe"; return; };
        
        $result = $conn->query("SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'"); // Verificar si el usuario ya existe
        if($result->num_rows > 0) { echo "El usuario ya existe en la base de datos"; return; };
        
        $sql = "UPDATE usuarios SET nombre = '$nombre', email = '$email' WHERE id = '$id'"; // Actualizar el registro
        echo ($conn->query($sql) === TRUE && $id != "" && $nombre != "" && $email != "") ? "Registro actualizado con éxito" : "Error al actualizar: ". $conn->error;
    }
}
function delete($conn) {
    if (isset($_POST['eliminar'])) {
        $id = $_POST['id'];

        $result = $conn->query("SELECT * FROM usuarios WHERE id = '$id'"); // Verificar si el ID existe
        $sql = "DELETE FROM usuarios WHERE id = '$id'";
        echo ($conn->query($sql) === TRUE && $id != "" && $result->num_rows > 0) ? "Registro eliminado con éxito" : "Error al eliminar registro: " . $conn->error;
    }
}
// Lógica para manejar los botones del formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if (isset($_POST['crear'])) {
        create($conn);
    } elseif (isset($_POST['leer'])) {
        read($conn);
    } elseif (isset($_POST['actualizar'])) {
        update($conn);
    } elseif (isset($_POST['eliminar'])) {
        delete($conn);
    }
}
$conn->close();*/
?>
