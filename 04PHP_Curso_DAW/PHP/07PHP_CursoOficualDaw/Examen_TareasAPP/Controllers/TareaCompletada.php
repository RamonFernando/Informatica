<?php
    function marcarTareaCompletada($tareas, $id) {
        if ($id === '') {
            echo "El ID no puede estar vacio.\n";
            return $tareas;
        }
        if(!ctype_digit($id)){ // valida digitos del 0-9
            echo "El ID debe ser un numero valido.\n";
            return $tareas;
        }
        $id = (int)$id;
        foreach ($tareas as $tarea) {
            if($tarea->getId() === $id ){
                $tarea->setCompletada("si");
                echo "Tarea con ID '$id' marcada como completada correctamente.";
                return $tareas;
            }
        }
        echo "Tarea con ID '$id' no encontrada.";
        return $tareas;
    }
?>