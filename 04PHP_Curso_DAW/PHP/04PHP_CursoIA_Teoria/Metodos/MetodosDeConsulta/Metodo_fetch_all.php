<?php
 // fetch_all(): Devuelve todas las filas como un array.
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
    $filas = $resultado->fetch_all(MYSQLI_ASSOC);
    foreach ($filas as $fila) {
        echo "ID: " . $fila['id'] . " - Nombre: " . $fila['nombre'] . " - Email: " . $fila['email'] . "<br>";
    }
} else {
    echo "No se encontraron resultados.";
}
$conexion->close();

?>