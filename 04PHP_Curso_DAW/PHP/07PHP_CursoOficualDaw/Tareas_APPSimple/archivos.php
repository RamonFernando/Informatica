<?php
require_once 'conexionBD.php';
$conn = conexionBD();

/**
 * Inserta una tarea solo si no existe previamente.
 *
 * @param PDO $conn Conexión PDO activa
 * @param string $titulo Título de la tarea (obligatorio)
 * @param string|null $descripcion Descripción opcional
 * @param string|null $fecha_caducidad Fecha (YYYY-MM-DD) opcional
 * @param int $completada Estado (0 o 1)
 * @return bool true si se insertó, false si ya existía
 */
function insertIfNotExist(PDO $conn, string $titulo, ?string $descripcion, ?string $fecha_caducidad, int $completada): bool {
    $descripcion = $descripcion ?: 'Descripción automática'; // Valor por defecto si está vacío
    $fecha_caducidad = $fecha_caducidad ?: null; // Permitir NULL si no se proporciona fecha
    
    // Comprobar si ya existe
    $sqlcheck = "SELECT COUNT(*) FROM tareas WHERE titulo = ? AND fecha_caducidad <=> ? AND completada = ?";
    $stmt = $conn->prepare($sqlcheck);
    $stmt->execute([$titulo, $fecha_caducidad, $completada]);
    $result = $stmt->fetchColumn();

    if ($result > 0) {
        echo "⚠️ [TAREA] El registro '$titulo' ya existe.\n";
        return false;
    }

    // Insertar
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, fecha_caducidad, completada)
                VALUES (?, ?, ?, ?)";
    $stmt = $conn->prepare($sqlInsert);
    $stmt->execute([$titulo, $descripcion, $fecha_caducidad, $completada]);
    echo "✅ [TAREA] Nueva tarea '$titulo' creada con éxito.\n";
    return true;
}

try {
    // 1️⃣ Inserción inicial
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada)
                VALUES ('Titulo de tarea DAW', 'Descripción de la tarea DAW', 1)";
    $conn->exec($sqlInsert);
    echo "✅ [SQL] Registro inicial insertado.\n\n";

    // 2️⃣ Forma 1: SQL directa (con control de duplicados)
    $inserts = [
        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Titulo de tarea', 'Descripción de la tarea', 1
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Titulo de tarea' AND completada = 1)",

        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Trabajo', 'Hacer el trabajo', 0
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Trabajo' AND completada = 0)"
    ];

    $contSQL = 0;
    foreach ($inserts as $insert) {
        $filas = $conn->exec($insert);
        if ($filas > 0) {
            echo "✅ [SQL] Registro insertado correctamente.\n";
            $contSQL += $filas;
        } else {
            echo "⚠️ [SQL] Registro duplicado — no se insertó.\n";
        }
    }
    echo "📊 [SQL] Total de filas insertadas sin duplicados: $contSQL\n\n";

    // 3️⃣ Forma 2: Prepared statements (más segura)
    $tareas = [
        ['Titulo de tarea', '2025-11-05', 1],
        ['Entrega de proyecto PHP Tareas_APP', 'Descripción de la entrega', '2025-11-08', 0],
        ['Trabajo', '2025-11-10', 0],
        ['Estudio', '2025-11-12', 0],
        ['Viaje', '2025-11-15', 1],
        ['Trabajo', '2025-11-10', 0] // duplicado
    ];

    $contTask = 0;
    foreach ($tareas as $tarea) {
        // Validar título
        if (empty($tarea[0])) {
            echo "⚠️ [ERROR] No se puede insertar una tarea sin título.\n";
            continue;
        }

        $titulo = $tarea[0];
        // Detectar si el segundo valor es una fecha o descripción
        if (isset($tarea[1]) && preg_match('/^\d{4}-\d{2}-\d{2}$/', $tarea[1])) {
            $descripcion = null;
            $fecha_caducidad = $tarea[1];
            $completada = isset($tarea[2]) ? (int)$tarea[2] : 0;
        } else {
            $descripcion = $tarea[1] ?? null; // Puede ser null
            $fecha_caducidad = $tarea[2] ?? null;
            $completada = isset($tarea[3]) ? (int)$tarea[3] : 0;
        }

        if (insertIfNotExist($conn, $titulo, $descripcion, $fecha_caducidad, $completada))
            $contTask++;
    }

    echo "📊 [TAREA] Total de tareas insertadas: $contTask\n";

} catch (Exception $e) {
    echo "❌ Error: " . $e->getMessage();
}
?>
