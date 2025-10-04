<?php
// Ejemplo 2: fetch_row()
// fetch_row(): Devuelve una fila como un array indexado por números.
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
    while ($fila = $resultado->fetch_row()) {
        echo "ID: " . $fila[0] . " - Nombre: " . $fila[1] . " - Email: " . $fila[2] . "<br>";
    }
} else {
    echo "No se encontraron resultados.";
}
$conexion->close();
?>