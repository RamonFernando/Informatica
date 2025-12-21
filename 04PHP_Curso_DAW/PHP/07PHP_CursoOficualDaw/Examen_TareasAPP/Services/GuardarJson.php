<?php

function guardarJson(string $ruta, array $tareas): void
{
    $data = [];

    foreach ($tareas as $tarea) {
        $data[] = [
            'titulo' => $tarea->getTitulo(),
            'descripcion' => $tarea->getDescripcion(),
            'fecha' => $tarea->getFecha(),
            'completada' => $tarea->getCompletada()
        ];
    }

    $json = json_encode($data, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);

    if ($json === false) {
        echo "Error al convertir los datos a JSON.\n";
        return;
    }

    $dir = dirname($ruta);
    if (!is_dir($dir)) {
        mkdir($dir, 0777, true);
    }

    if (file_put_contents($ruta, $json) === false) {
        echo "Error al guardar el archivo JSON.\n";
        return;
    }
}
