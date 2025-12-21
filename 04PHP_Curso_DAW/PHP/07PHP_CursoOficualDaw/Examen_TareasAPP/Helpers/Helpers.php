<?php
    function validarFecha(string $fecha): bool {
        $dt = DateTime::createFromFormat('Y-m-d', $fecha);

        if (!$dt || $dt->format('Y-m-d') !== $fecha) {
            return false;
        }

        return true;
    }

    function validarFormatoFecha(string $fecha): bool {
        if (preg_match('/^\d{4}-\d{2}-\d{2}$/', $fecha)) {
            return true;
        }
        return false;
    }
    
    function esEnter(string $input): bool {
        return $input === '';
    }

    function validarId(string $id): bool {
        if(empty($id)) return true; // Permitir id vacio para editarTarea
        return ctype_digit($id) && (int)$id > 0;
    }

    // *Cargar Tareas desde el JSON*
    // Obtener la ruta del archivo JSON
    function getRutaTareas(): string {
        $ruta = __DIR__ . '/../data/tareas.json';
        // echo "[DEBUG] Ruta JSON: $ruta\n";
        return $ruta;
    }

    // Inicializar el array de tareas
    function inicializarTareas(string $ruta): array {
        $tareas = cargarJson($ruta);
        return empty($tareas) ? [] : $tareas;
    }

    // Cargar tareas desde el archivo JSON
    function cargarTareas(): array {
        return inicializarTareas(getRutaTareas());
    }
    




?>