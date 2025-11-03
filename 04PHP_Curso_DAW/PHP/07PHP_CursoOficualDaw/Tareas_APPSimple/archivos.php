<?php
require_once 'conexionBD.php';
$conn = conexionBD();

/**
 * Inserta una tarea solo si no existe previamente.
 *
 * @param PDO $conn Conexión PDO activa
 * @param string $titulo Título de la tarea
 * @param string $fecha_caducidad Fecha de caducidad (YYYY-MM-DD)
 * @param int $completada Estado (0 o 1)
 * @return bool true si se insertó, false si ya existía
 */
function insertIfNotExist(PDO $conn, string $titulo, string $fecha_caducidad, int $completada): bool {
    $sqlcheck = "SELECT COUNT(*) FROM tareas WHERE titulo = ? AND fecha_caducidad = ? AND completada = ?";
    $stmt = $conn->prepare($sqlcheck);
    $stmt->execute([$titulo, $fecha_caducidad, $completada]);
    $result = $stmt->fetchColumn();

    if ($result > 0) {
        echo "⚠️ [TAREA] El registro '$titulo' ya existe.\n";
        return false;
    }

    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, fecha_caducidad, completada) VALUES (?, ?, ?, ?)";
    $stmt = $conn->prepare($sqlInsert);
    $stmt->execute([$titulo, 'Descripción automática', $fecha_caducidad, $completada]);
    echo "✅ [TAREA] Nueva tarea '$titulo' creada con éxito.\n";
    return true;
}

try {
    // 1️⃣ Inserción inicial (solo para insertar un registro de prueba)
    $sqlInsert = "INSERT INTO tareas (titulo, descripcion, completada)
                VALUES ('Titulo de tarea DAW', 'Descripción de la tarea DAW', 1)";
    $conn->exec($sqlInsert);
    echo "✅ [SQL] Registro inicial insertado.\n\n";

    // 2️⃣ Forma 1: SQL interpolada (menos segura)
    $inserts = [
        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Titulo de tarea', 'Descripción de la tarea', 1
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Titulo de tarea' AND completada = 1)",

        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Trabajo', 'Hacer el trabajo', 0
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Trabajo' AND completada = 0)",

        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Estudio', 'Estudiar para el examen', 0
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Estudio' AND completada = 0)",

        "INSERT INTO tareas (titulo, descripcion, completada)
            SELECT 'Viaje', 'Ir a la playa', 1
            WHERE NOT EXISTS (SELECT 1 FROM tareas WHERE titulo = 'Viaje' AND completada = 1)"
    ];

    $contSQL = 0;
    foreach ($inserts as $insert) {
        $filas = $conn->exec($insert); // exec devuelve el número de filas afectadas
        if ($filas > 0) {
            echo "✅ [SQL] Registro insertado correctamente.\n";
            $contSQL += $filas;
        } else {
            echo "⚠️ [SQL] Registro duplicado — no se insertó.\n";
        }
    }
    echo "📊 [SQL] Total de filas insertadas sin duplicados: $contSQL\n\n";

    // 3️⃣ Forma 2: Prepared statements (más segura y profesional)
    $tareas = [
        ['Titulo de tarea', '2025-11-05', 1],
        ['Trabajo', '2025-11-10', 0],
        ['Estudio', '2025-11-12', 0],
        ['Viaje', '2025-11-15', 1],
        ['Trabajo', '2025-11-10', 0] // duplicado
    ];

    $contTask = 0;
    foreach ($tareas as [$titulo, $fecha_caducidad, $completada]) {
        if (insertIfNotExist($conn, $titulo, $fecha_caducidad, $completada))
            $contTask++;
    }
    echo "📊 [TAREA] Total de tareas insertadas: $contTask\n";

} catch (Exception $e) {
    echo "❌ Error: " . $e->getMessage();
}
?>
