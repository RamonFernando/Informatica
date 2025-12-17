<?php
    function marcarTareaCompletada($tareas, $id) {
        if ($id === '') {
            echo "El ID no puede estar vacio.\n";
            return $tareas;
        }
        if(is_numeric($id) === false){
            echo "El ID debe ser un numero valido.\n";
            return $tareas;
        }
        foreach ($tareas as $tarea) {
            if($tarea->getId() === $id ){
                $tarea->setCompletada(true);
                echo "Tarea con ID '$id' marcada como completada correctamente.";
                return $tareas;
            }
        }
        echo "Tarea con ID '$id' no encontrada.";
        return $tareas;
    }
?>