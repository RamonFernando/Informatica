<?php
include("createBD.php");
echo "<h1>CRUD Simple</h1>";
// Depuración: Verifica qué datos llegan al script
echo "<pre>";
// print_r($_POST); // Ver datos del formulario POST
// print_r($_GET);  // Ver datos del formulario GET
echo "</pre>";
/*
CRUD en Mysql
INSERT INTO usuarios (nombre, email) VALUES ('$nombre','$email');
SELECT * FROM usuarios WHERE id = $id;
UPDATE usuarios SET nombre = '$nombre', email = '$email' WHERE id = $id;
DELETE FROM usuarios WHERE id = $id;
*//*
// obtenemos la variable mensaje
$message = isset($_GET['message']) ? $_GET['message'] : '';

$conn = create_connection();
if(isset($_POST['type'])){
    switch($_POST['type']){
        case "create":
            create($conn, $_POST['nombre'], $_POST['email']);
            break;
        case "read":
            read($conn);
            break;
        case "update":
            update($conn, $_POST['id'], $_POST['nombre'], $_POST['email']);
            break;
        case "delete":
            delete($conn, $_POST['id']);
            break;
    }
}
// CREATE
function create($conn, $nombre, $email){
    if (isset($_POST['crear'])){
        $nombre = $_POST['nombre'];
        $email = $_POST['email'];
        boton_volver();
        
        $sql = "INSERT INTO usuarios (nombre, email) VALUES ('$nombre','$email')";

        // comprobamos si el usuario ya existe en la base de datos
        $checkSql = "SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'";
        $result = $conn->query($checkSql);
        if ($result->num_rows > 0) {
            echo "<h3>El usuario ya existe</h3>";
            return;
        }

        // comprobamos que los campos no esten vacios
        if(empty($nombre) || empty($email)){
            echo "<h3>Todos los campos son obligatorios!</h3>";
            return;
        }

        // Comprobamos si la consulta se ha realizado correctamente
        if($conn->query($sql) === TRUE) {
            echo "<h3>Nuevo registro creado exitosamente: " . $conn->insert_id . "</h3><br>";
            read($conn);
        } else {
            echo "<h3>Error al crear el registro: $sql  $conn->error </h3><br>"; // $conn->error devuelve el error de la consulta
        }
    }
}
// READ
function read($conn){
    // num_rows — Devuelve el número de filas de un conjunto de resultados de una sentencia mysqli_stmt::$num_rows
    // fetch_assoc() — Obtiene una fila de resultados como un arreglo asociativo
    // result — almacena el conjunto de resultados
    // query — realiza la consulta
    // row — almacena una fila de resultados
    boton_volver();

    $sql = "SELECT * FROM usuarios";
    
    // Comprobamos si la consulta se ha realizado correctamente y mostramos el resultado
    $result = $conn->query($sql);
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "ID: " . $row["id"] . "<br>";
            echo "Nombre: " . $row["nombre"] . "<br>";
            echo "Email: " . $row["email"] . "<br>";
            echo "<br>";
        }
    } else {
        echo "<h3>No se han encontrado registros</h3>";
    }
}
// UPDATE
function update($conn, $id, $nombre, $email){
    if(isset($_POST['actualizar'])){
        $id = $_POST['id'];
        $nombre = $_POST['nombre'];
        $email = $_POST['email'];
        boton_volver();
        
        // comprobamos que los campos no esten vacios
        if(empty($nombre) || empty($email) || empty($id) || $id <= 0){
            echo "<h3>Todos los campos son obligatorios</h3>";
            return;
        }

        // comprobamos si el id existe en la base de datos
        $checkSql = "SELECT * FROM usuarios WHERE id = $id";
        $result = $conn->query($checkSql);
        if ($result->num_rows == 0) {
            echo "<h3>El id $id no existe.</h3>";
            read($conn);
            return;
        }

        // comprobamos si el usuario ya existe en la base de datos
        $checkSql = "SELECT * FROM usuarios WHERE nombre = '$nombre' AND email = '$email'";
        $result = $conn->query($checkSql);
        if ($result->num_rows > 0) {
            echo "<h3>El usuario ya existe</h3>";
            return;
        }

        // realizamos consulta para actualizar
        $sql = "UPDATE usuarios SET nombre = '$nombre', email = '$email' WHERE id = $id";
        if ($conn->query($sql) === TRUE ){
            echo "Registro actualizado con exito: <br>Id: $id <br>Nombre: $nombre <br>Email: $email <br><br>";
            read($conn);
        }else{
        echo "<h3>Error al actualizar el registro: " . $conn->error . "</h3>";
        }
    }
}
// DELETE
function delete($conn, $id){
    if(isset($_POST['eliminar'])){
        $id = $_POST['id'];
        
        // comprobamos que el id no este vacio
        if(empty($id)){
            echo "<h3>Ingrese un id valido.</h3>";
            boton_volver();
            return;
        }

        // comprobamos si el id existe en la base de datos
        $checkSql = "SELECT * FROM usuarios WHERE id = $id";
        $result = $conn->query($checkSql);
        if ($result->num_rows == 0) {
            echo "<h3>El id $id no existe.</h3>";
            read($conn);
            return;
        }

        // realizamos consulta para borrar
        $sql = "DELETE FROM usuarios WHERE id = $id";
        if ($conn->query($sql) === TRUE){
            echo "<h3>El registro $id a sido borrado exitosamente! </h3><br>";
            read($conn);
        }else{
            echo "<h3>Error al borrar el registro: $sql $conn->error </h3>";
        }
    }
}
function boton_volver(){
    echo "<br><a href='index.html'>Volver</a><br>";
}
// Cerrar conexión
$conn->close();*/
?>