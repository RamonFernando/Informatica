<?php
/*
// CRUD (READ)
fetch_assoc(): Devuelve una fila como un array asociativo. (array['prop'])
fetch_object(): Devuelve una fila como un objeto. (array->prop)
fetch_row(): Devuelve una fila como un array indexado por números.
fetch_all(): Devuelve todas las filas como un array.
*/
// Ejemplo 1: fetch_assoc()
// Conexión a la base de datos
$conexion = new mysqli("localhost", "usuario", "contraseña", "base_datos");

// Verificar conexión
if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}

// Consulta SQL
$sql = "SELECT id, nombre, email FROM usuarios";
$resultado = $conexion->query($sql);

// Ejemplo de una sola linea
// $resultado = $conexion->query("SELECT id, nombre, email FROM usuarios");

// Verificar si hay resultados
if ($resultado->num_rows > 0) {
    // Iterar sobre las filas
    while ($fila = $resultado->fetch_assoc()) {
        echo "ID: " . $fila['id'] . " - Nombre: " . $fila['nombre'] . " - Email: " . $fila['email'] . "<br>";
    }
} else {
    echo "No se encontraron resultados.";
}

// Cerrar la conexión
$conexion->close();


?>

