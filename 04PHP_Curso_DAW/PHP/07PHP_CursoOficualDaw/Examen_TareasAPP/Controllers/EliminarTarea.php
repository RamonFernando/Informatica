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

    function eliminarTareaWrapper(){
        
        $ruta = getRutaTareas();    // Ruta del archivo JSON
        $tareas = cargarTareas();   // Cargas el Json (CargarJson)
        
        printTitle("Eliminar Tarea");
        echo "Ingrese el Id de la tarea a eliminar: ";
        $id = trim(fgets(STDIN));
                    
        if(esEnter($id)) return $tareas;
        if(!validarId($id)){
            echo "El ID no puede estar vacio o debe ser numerico y mayor que 0.\n";
            return $tareas;
        }

        $id = (int)$id;
        $tareas = eliminarTarea($tareas, $id);
        
        guardarJson($ruta, $tareas);
        
        echo "Tarea eliminada exitosamente.\n";
        listarTareas($tareas);
    }
?>