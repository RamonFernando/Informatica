<?php
// Version antigua vs version moderna(mysqli vs PDO)

// Version antigua
// $conn = new mysqli("localhost", "root", "", "tareas_db");
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

// Version moderna (MySQLi)
// 1. Variables
// 2. Activamos control de errores
// 3. Creamos la conexion
// 4. Creamos la base de datos si no existe y la configuramos con UTF8MB4
// 5. Seleccionamos la base de datos
// 6. Retornamos la conexion con un mensaje de exito

// Version moderna (PDO)
// 1. Variables
// 2. Activamos control de errores
// 3. Creamos la conexion
// 4. Creamos la base de datos si no existe y la configuramos con UTF8MB4
// 5. Seleccionamos la base de datos
// 6. Retornamos la conexion con un mensaje de exito


function conexionBD(): PDO
{
    
    // 1. Variables
    $serverName = "localhost";
    $user = "root";
    $password = "";
    $dbName = "tareas_db";
    static $conexionMostrada = false; // solo mostrar mensaje una vez

    // 2. Activamos control de errores
    // (PDO lanza excepciones automáticamente al detectar errores)
    try {

        // 3. Creamos la conexión (sin seleccionar base de datos todavía)
        $dsn = "mysql:host=$serverName;charset=utf8mb4";
        $conn = new PDO($dsn, $user, $password, [
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
            PDO::ATTR_EMULATE_PREPARES => false
        ]);

        // 4. Creamos la base de datos si no existe y la configuramos con UTF8MB4
        $conn->exec("CREATE DATABASE IF NOT EXISTS $dbName
                    DEFAULT CHARACTER SET utf8mb4
                    COLLATE utf8mb4_unicode_ci");

        // 5. Seleccionamos la base de datos
        $conn->exec("USE $dbName");

        // 6. Retornamos la conexión con un mensaje de éxito
        // Mostrar el mensaje solo la primera vez
        if (!$conexionMostrada) {
            echo "✅ Conexión exitosa y base de datos seleccionada\n";
            $conexionMostrada = true;
        }

        return $conn;
    } catch (PDOException $e) {
        die("Error de conexión: " . $e->getMessage());
    }
}

$conn = conexionBD();


/*
function conexionBD(): mysqli {

    // 1. Variables
    $serverName = "localhost";
    $user = "root";
    $password = "";
    $dbName = "tareas_db";

    // 2. Activamos control de errores
    mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);
    
    // 3. Creamos la conexion
    $conn = new mysqli($serverName, $user, $password);
    
    // 4. Creamos la base de datos si no existe y la configuramos con UTF8MB4
    $conn->query("CREATE DATABASE IF NOT EXISTS $dbName DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci");
    
    // 5. Seleccionamos la base de datos
    $conn->select_db($dbName);

    // 6. Retornamos la conexion con un mensaje de exito
    echo "Conexion exitosa y base de datos seleccionada\n";
    return $conn;
}

$conn = conexionBD();
*/

/*function conexionBD(): mysqli
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
        "ERROR de conexion: $conn->connect_error \n" :
        "Conexion exitosa\n";

    // 4. Crear la base de datos si no existe
    $sqlCreateDB = "CREATE DATABASE IF NOT EXISTS $dbName";

    // 5. Ejecutar la consulta
    if ($conn->query($sqlCreateDB))
        echo "Base de datos creada o ya existe. \n";
    else
        die("Error al crear la base de datos: " . $conn->error . "\n");

    // 6. Selección de la base de datos
    $dbSelected = $conn->select_db($dbName);

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
*/
?>