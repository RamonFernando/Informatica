<?php

require_once __DIR__ . '/../Helpers/Helpers.php';
require_once __DIR__ . '/../Models/Tarea.php';

function cargarJson(string $ruta): array {

    if (!file_exists($ruta)) {
        return [];
    }

    $contenido = file_get_contents($ruta);
    $data = json_decode($contenido, true);

    if (!is_array($data)) {
        return [];
    }

    $tareas = [];

    foreach ($data as $item) {

        // Si el item no es un array, lo ignoramos
        if (!is_array($item)) {
            continue;
        }

        // Valores seguros (evita warnings)
        $titulo = $item['titulo'] ?? '';
        $descripcion = $item['descripcion'] ?? '';
        $fecha = $item['fecha'] ?? date('Y-m-d');
        $completada = $item['completada'] ?? false;

        // No cargamos tareas sin título
        if (empty($titulo)) {
            continue;
        }

        $tareas[] = new Tarea(
            $titulo,
            $descripcion,
            $fecha,
            (bool)$completada
        );
    }

    return $tareas;
}
