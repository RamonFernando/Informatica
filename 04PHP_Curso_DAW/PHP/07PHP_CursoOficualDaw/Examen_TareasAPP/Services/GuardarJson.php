<?php

function guardarJson(string $ruta, array $data): void
{
    $json = json_encode($data, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    file_put_contents($ruta, $json);
}

?>