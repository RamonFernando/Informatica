<?php
function create_connection() {
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "crud_db";

    // Create connection
    // servername: nombre del servidor
    // username: nombre de usuario
    // password: contrasenia
    // dbname: nombre de la base de datos
    // $conn (conexión)
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Check connection
    if ($conn->connect_error) {
        die("Fallo de conexion: " . $conn->connect_error);
    }
    return $conn;
}

/*
// CREATE DATABASE crud_db;
USE crud_db;
// SQL to create table
$sql = "CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  email VARCHAR(100)
);";

// Execute SQL statement (ejecuta la sentencia SQL)
if ($conn->query($sql) === TRUE) {
    echo "Tabla usuarios creada exitosamente";
} else {
    echo "Error al crear la tabla: " . $conn->error;
}

$conn->close();*/
?>