<?php
    // 1. Incluir el archivo de conexión
    // require_once 'conexionBD.php';

    // 2. Insertar datos en la base de datos
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Titulo de tarea', 'Descripción de la tarea', '1')";
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Trabajo', 'Hacer el trabajo', '0')";
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Estudio', 'Estudiar para el examen', '0')";
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada) VALUES ('Viaje', 'Ir a la playa', '1')";

    // 3. Comprobar si las consultas se ejecutaron correctamente
    echo ($conn->query($sqlInsert))?
    "Datos insertados correctamente":
    "Error al insertar los datos: " . $conn->error;
?>