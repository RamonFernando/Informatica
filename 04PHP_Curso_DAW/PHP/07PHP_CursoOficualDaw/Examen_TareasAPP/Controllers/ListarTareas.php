<?php
    function listarTareas($tareas) {
        if (empty($tareas)) {
            echo "No hay tareas disponibles.\n";
            return;
        }
        foreach ($tareas as $indice => $tarea) {
            echo $tarea->mostrarDetalles() . "\n";
        }
    }
?>