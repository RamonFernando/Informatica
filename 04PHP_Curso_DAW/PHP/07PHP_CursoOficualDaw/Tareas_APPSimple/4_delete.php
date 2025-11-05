<?php
// conexiones y requerimientos
require_once 'conexionBD.php';
require_once 'require.php';

// DELETE
function delete($id): bool {
    try {
        $conn = conexionBD();

        // 1. Definir la consulta SQL
        $sql = "DELETE FROM tareas WHERE ID = ?";
        
        // 2. Preparar y Ejecutar la consulta
        $stmt = $conn->prepare($sql);
        $stmt->execute([$id]);

        // 3. Devolver confirmación comprobando filas afectadas
        return $stmt->rowCount() > 0;
    
    } catch (PDOException $e) {
        $msgError = $e->getMessage();
        manejarErrorPDO($msgError, "eliminar la tarea");
        return false;
    }
}
