<?php
// fetch_object(): Devuelve una fila como un objeto.

// Conexión a la base de datos
$conexion = new mysqli("localhost", "usuario", "contraseña", "base_datos");

// Verificar conexión
if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}

// Consulta SQL
$sql = "SELECT id, nombre, email FROM usuarios";
$resultado = $conexion->query($sql);

// Verificar si hay resultados
if ($resultado->num_rows > 0) {
    // Iterar sobre las filas
    while ($fila = $resultado->fetch_object()) {
        echo "ID: " . $fila->id . " - Nombre: " . $fila->nombre . " - Email: " . $fila->email . "<br>";
    }
} else {
    echo "No se encontraron resultados.";
}
$conexion->close();
?>