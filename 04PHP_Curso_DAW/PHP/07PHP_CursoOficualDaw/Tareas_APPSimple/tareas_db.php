<?php
    require_once "conexionBD.php";

    // Llamamos a la función de conexión
    $conn = new mysqli($serverName, $user, $password, $dbName);

    // 1. Creamos las tablas si no existen
    $sql_table = "CREATE TABLE IF NOT EXISTS tareas (
        id INT AUTO_INCREMENT PRIMARY KEY,
        titulo VARCHAR(100) NOT NULL,
        descripcion VARCHAR(255),
        fecha_caducidad DATE,
        completada BOOLEAN DEFAULT FALSE
    )";

    // 2. Ejecutamos la consulta para crear la tabla
    echo($conn->query($sql_table))?
        "Tabla tareas creada exitosamente":
        "Error al crear la tabla: " . $conn->error;

    // 3. Cerramos la conexion
    $conn->close();

?>