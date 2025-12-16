<?php
    function eliminarTarea($tareas, $id) {
        foreach ($tareas as $index => $tarea) {
            if($tarea->getId() === $id ){
                unset($tareas[$index]);
                $tareas = array_values($tareas); // Reindexar el array
                echo "Tarea con ID '$id' eliminada correctamente.";
                return $tareas;
            }
        }
        echo "Tarea con ID '$id' no encontrada.";
        return $tareas;
    }
?>