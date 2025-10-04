<?php
include("createBD.php");
echo "<h1>CRUD Simple v2</h1>";
btn_volver();
$conn = create_connection(); // Conectar a la base de datos
function btn_volver() {
    echo "<a style='text-decoration: none;
        background-color: #4CAF50;
        color: white;
        border: none;
        padding: 8px 12px;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
        width: 100%;'
        href='index.html'>Volver</a><br><br>";
}
// Definimos las expresiones regulares. (GLOBALES)
define('REGEX_NOMBRE', '/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/');
define("REGEX_EMAIL", '/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/');

// CREATE
function create ($conn){
    if(isset($_POST['crear'])){ // Obtenemos los datos del formulario
        $nombre = $_POST['nombre']; $email = $_POST['email'];

        // 1. Comprobamos si los campos están vacíos
        if(empty($nombre) || empty($email)) {echo "Todos los campos son obligatorios!"; return;}

        // 2. Comprobamos que no tengan caracteres especiales y validamos el email
        if(!preg_match(REGEX_NOMBRE, $nombre) || !preg_match(REGEX_EMAIL, $email))
            {echo "El campo no puede contener caracteres especiales!"; return;};
        
        // 3. Comprobamos si la persona ya existe en la base de datos
        $sqlCheck = "SELECT * FROM usuarios where nombre = '$nombre' AND email = '$email'";
        $resultado = $conn->query($sqlCheck);
        if ($resultado->num_rows > 0) {echo "El usuario ya existe en la base de datos"; return;};
        
        // 4. Comprobamos si la consulta se ha realizado correctamente
        $sqlConsulta = "INSERT INTO usuarios (nombre, email) VALUES ('$nombre', '$email')";
        echo ($conn->query($sqlConsulta) === TRUE) ? "Usuario ".strtoupper($nombre)." creado con exito!" : "Error al crear persona.";
    }
}
// READ
function read($conn) {
    if(isset($_POST['leer'])){ // Obtenemos los datos del formulario y mostramos los registros o un mensaje de registros vacios
        $sqlConsulta = "SELECT * FROM usuarios";
        $resultado = $conn->query($sqlConsulta);

        echo "<h2>Usuarios</h2>";
        // 1. Mostramos los registros mediante un bucle
        if($resultado->num_rows > 0){
            while($row = $resultado->fetch_assoc()){
                echo "<p>[Usuario: " . $row['id'] . "] Nombre: " . $row['nombre'] . ", Email: " . $row['email'] . "</p>";
            }
        } else {echo "<h2>No se han encontrado registros</h2>";}
    }
}
// UPDATE
function update($conn) {
    if(isset($_POST['actualizar'])){
        $id = $_POST['id']; $nombre = $_POST['nombre']; $email = $_POST['email'];

        // 1. Comprobamos si los campos están vacíos
        if(empty($id) || empty($nombre) || empty($email)){echo "El campo no puede estar vacio!"; return;};

        // 2. Comprobamos que el id sea un numero y que el campo no esté vacio
        if(!is_numeric($id)) {echo "El id debe ser un numero!"; return;}
        
        // 3. Comprobamos que no tengan caracteres especiales y validamos el email
        if(!preg_match(REGEX_NOMBRE, $nombre) || !preg_match(REGEX_EMAIL, $email))
            {echo "El campo no puede contener caracteres especiales!"; return;};

        // 4. Comprobamos si el ID existe en la base de datos
        $sqlCheck = "SELECT * FROM usuarios WHERE id = '$id'";
        if($conn->query($sqlCheck)->num_rows == 0){echo "El id no existe en la base de datos."; return;};

        // 5. Comprobamos si el usuario ya existe en la base de datos
        $sqlCheck1 = "SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'";
        if($conn->query($sqlCheck1)->num_rows > 0) {echo "El usuario $id: ".strtoupper($nombre)." ya existe en la base de datos"; return;};

        // 6. Comprobamos si la consulta se ha realizado correctamente
        $sqlConsulta = "UPDATE usuarios SET nombre = '$nombre', email = '$email' WHERE id = '$id'";
        echo ($conn->query($sqlConsulta) === TRUE) ?
            "Usuario $id: ".strtoupper($nombre)." actualizado con exito!" : "Error al actualizar usuario.";
    }
}
// DELETE
function delete($conn) {
    if(isset($_POST['eliminar'])){
        $id = $_POST['id'];

        // 1. Comprobamos que el id sea un numero y que el campo no esté vacio
        if(!is_numeric($id)) {echo "El id debe ser un numero valido!"; return;}

        // 2. Comprobamos si el usuario existe en la base de datos
        $sqlCheck = "SELECT * FROM usuarios WHERE id = '$id'";
        if($conn->query($sqlCheck)->num_rows == 0){echo "El usuario no existe en la base de datos."; return;}

        // 3. Comprobamos si la consulta se ha realizado correctamente
        $sqlConsulta = "DELETE FROM usuarios WHERE id = '$id'";
        echo ($conn->query($sqlConsulta) === TRUE) ? "Usuario $id eliminado con exito!" : "Error al eliminar usuario.";
    }
}
// Lógica para manejar los botones del formulario
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    if(isset($_POST['type'])) {
        switch($_POST['type']) {
            case 'create':
                create($conn);
                break;
            case 'read':
                read(($conn));
                break;
            case 'update':
                update($conn);
                break;
            case 'delete':
                delete($conn);
                break;
        }
    }
}
$conn->close();
?>