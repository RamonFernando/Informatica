<?php
    function marcarTareaCompletada($tareas, $indice) {
        if($indice >= 0 && $indice < count($tareas)) {
            $tareas[$indice]['completada'] = true;
        } else {
            echo "Índice inválido. No se pudo marcar la tarea como completada.";
        }
    }
?>