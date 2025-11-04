<?php
    // conexiones y requerimientos
    require_once 'conexionBD.php';
    require_once 'require.php';
    
    // CREATE
    function create($titulo, $descripcion, $fecha_caducidad, $completada) {
        try{
            // 1. Llamamos a la función de conexión a la BD
            $conn = conexionBD();
        
            // 2. Definir la consulta SQL
            $sql = "INSERT INTO tareas (titulo, descripcion, fecha_caducidad, completada) VALUES (?,?,?,?)";
            
            // 3. Preparar y Ejecutar la consulta
            $stmt = $conn->prepare($sql);
            $stmt->execute([$titulo, $descripcion, $fecha_caducidad, $completada]);
            
            // 4. Mostrar un mensaje de confirmación
            echo "✅ Tarea creada exitosamente.\n";
        
        }catch (PDOException $e) {
        // 5. Captura automática de cualquier error PDO
        $mensajeError = $e->getMessage();

        // 6. Detectar tipo de error (opcional, pero mejora la claridad)
        if (str_contains($mensajeError, 'SQLSTATE[HY000]')) {
            echo "❌ Error de conexión a la base de datos. Verifica los datos del servidor.\n";
        } elseif (str_contains($mensajeError, 'SQLSTATE[23000]')) {
            echo "❌ Error: Violación de restricción o dato duplicado.\n";
        } elseif (str_contains($mensajeError, 'SQLSTATE[42S02]')) {
            echo "❌ Error: La tabla 'tareas' no existe.\n";
        } else {
            echo "❌ No se pudo crear la tarea. Detalle técnico: " . $mensajeError . "\n";
        }
        }
    }

?>