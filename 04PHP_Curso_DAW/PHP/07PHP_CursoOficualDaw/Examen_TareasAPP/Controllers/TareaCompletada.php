<?php
    function marcarTareaCompletada($tareas, $id) {
        if ($id === '' || $id === null) {
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
                $tarea->setCompletada(true);
                echo "Tarea con ID '$id' marcada como completada correctamente.";
                return $tareas;
            }
        }
        echo "Tarea con ID '$id' no encontrada.";
        return $tareas;
    }

    function marcarTareaCompletadaWrapper(){
        
        $ruta = getRutaTareas();    // Ruta del archivo JSON
        $tareas = cargarTareas();   // Cargas el Json (CargarJson)
        
        printTitle("Marcar Tarea Completada");
        echo "Ingrese el Id de la tarea a marcar como completada: ";
        $id = trim(fgets(STDIN));
                    
        if($id === '' || $id === null) {
            echo "El ID no puede estar vacio.\n";
            return $tareas;
        }
        if(!ctype_digit($id)){ // valida digitos del 0-9
            echo "El ID debe ser un numero valido.\n";
            return $tareas;
        }

        $id = (int)$id;
        $tareas = marcarTareaCompletada($tareas, $id);
        
        guardarJson($ruta, $tareas);
        
        echo "Tarea marcada como completada exitosamente.\n";
        listarTareas($tareas);
    }
?>