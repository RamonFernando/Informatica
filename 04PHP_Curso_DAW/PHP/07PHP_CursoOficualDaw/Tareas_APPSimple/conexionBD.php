<?php
// Conexión a la base de datos
// 1. Variables
// 2. Conexion
// 3. Verificar la conexion
// 4. Crear la base de datos si no existe
// 5. Ejecutar la consulta
// 6. Selección de la base de datos
// 7. Verificar selección de la base de datos
// 8. Retornar la conexion
// 9. Verificar la conexión

function conexionBD(): mysqli
{
    // 1. Variables
    $serverName = "localhost";
    $user = "root";
    $password = "";
    $dbName = "tareas_db";

    // 2. Conexion
    $conn = new mysqli($serverName, $user, $password);

    // 3. Verificar la conexión
    echo ($conn->connect_error) ?
        "ERROR de conexion $ $conn->connect_error \n" :
        "Conexion exitosa\n";

    // 4. Crear la base de datos si no existe
    $sqlCreateDB = "CREATE DATABASE IF NOT EXISTS $dbName";

    // 5. Ejecutar la consulta
    if ($conn->query($sqlCreateDB))
        echo "Base de datos creada o ya existe. \n";
    else
        die("Error al crear la base de datos: " . $conn->error . "\n");

    // 6. Selección de la base de datos
    $dbSelected = $conn->select_db('tareas_db');

    // 7. Verificar selección de la base de datos
    if ($dbSelected)
        echo "Base de datos seleccionada \n";
    else
        die("Error al seleccionar la base de datos: " . $conn->error . "\n");

    // 8. Retornar la conexion
    return $conn;
}

// 9. Verificar la conexión
$conn = conexionBD();
