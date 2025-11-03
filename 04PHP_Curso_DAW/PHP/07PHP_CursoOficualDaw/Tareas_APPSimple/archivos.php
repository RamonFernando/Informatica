<?php
    // 1. Incluir el archivo de conexión
    require_once 'conexionBD.php';

    // Llamamos a la función de conexión
    $conn = conexionBD();

    try {
        // 2. Insertar datos en la base de datos
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Titulo de tarea DAW', 'Descripción de la tarea DAW', '1')";
    
    // Hacemos un arreglo de las consultas
    $inserts = [
        "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Titulo de tarea', 'Descripción de la tarea', '1')",
        "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Trabajo', 'Hacer el trabajo', '0')",
        "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Estudio', 'Estudiar para el examen', '0')",
        "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Viaje', 'Ir a la playa', '1')"
    ];

    // 3. Comprobar si las consultas se ejecutaron correctamente
    $conn->exec($sqlInsert);
        echo "Nuevo registro creado con éxito\n";

    
    }catch (Exception $e) {
        echo "Error: " . $e->getMessage();
    }

    
?>