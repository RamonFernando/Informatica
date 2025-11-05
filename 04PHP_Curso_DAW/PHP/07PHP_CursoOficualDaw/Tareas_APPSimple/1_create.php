<?php
    // conexiones y requerimientos
    require_once 'conexionBD.php';
    require_once 'require.php';
    
    // CREATE
    function create($titulo, $descripcion, $fecha_caducidad, $completada): bool {
        try{
            // 1. Llamamos a la función de conexión a la BD
            $conn = conexionBD();
        
            // 2. Definir la consulta SQL
            $sql = "INSERT INTO tareas (titulo, descripcion, fecha_caducidad, completada) VALUES (?,?,?,?)";
            
            // 3. Preparar y Ejecutar la consulta
            $stmt = $conn->prepare($sql);
            $stmt->execute([$titulo, $descripcion, $fecha_caducidad, $completada]);
            
            // 4. Devolver confirmación comprobando filas afectadas
            return $stmt->rowCount() > 0;
        
        }catch (PDOException $e) {
        // 5. Captura automática de cualquier error PDO
        $msgError = $e->getMessage();

        // 6. Detectar tipo de error (opcional, pero mejora la claridad)
        manejarErrorPDO($msgError, "crear la tarea");

        return false;
        }
    }

?>