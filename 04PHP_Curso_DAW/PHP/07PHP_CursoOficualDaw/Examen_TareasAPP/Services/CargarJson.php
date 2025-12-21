<?php

require_once __DIR__ . '/../Helpers/Helpers.php';

function cargarJson(string $ruta): array
{
    // Si el archivo no existe, devolvemos array vacío
    if (!file_exists($ruta)) {
        return [];
    }

    $json = file_get_contents($ruta);

    if ($json === false || empty($json)) {
        return [];
    }

    $data = json_decode($json, true);

    // Si el JSON está mal formado
    if (!is_array($data)) {
        return [];
    }

    return $data;
}

?>