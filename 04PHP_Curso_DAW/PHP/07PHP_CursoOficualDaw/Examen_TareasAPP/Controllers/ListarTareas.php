<?php
    function listarTareas($tareas) {
        if (count($tareas) === 0) {
            echo "No hay tareas disponibles.\n";
            return;
        }
        foreach ($tareas as $tarea) {
            echo $tarea->mostrarDetalles() . "\n";
        }
    }
?>