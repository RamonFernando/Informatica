<?php
    function editarTarea($tareas, $id) {
        echo "Ingrese el Id de la tarea a editar: ";
        $id = trim(fgets(STDIN));
        if($id === ''){
            echo "El ID no puede estar vacio.\n";
            return $tareas;
        }
        if(is_numeric($id) === false){
            echo "El ID debe ser un numero valido.\n";
            return $tareas;
        }
        foreach ($tareas as $tarea){
            if($tarea->getId() === $id){
                echo "Ingrese el nuevo titulo: ";
                $nuevoTitulo = mb_strtolower(trim(fgets(STDIN)));
                if(empty($nuevoTitulo)){
                    echo "El titulo no puede estar vacio.\n";
                    return $tareas;
                }
                $tarea->setTitulo($nuevoTitulo);
                $nuevaDescripcion = trim(fgets(STDIN));
                if(empty($nuevaDescripcion)){
                    echo "La descripcion no puede estar vacia.\n";
                    return $tareas;
                }
                $tarea->setDescripcion($nuevaDescripcion);
                $nuevaFecha = trim(fgets(STDIN));
                if(empty($nuevaFecha)){
                    echo "La fecha no puede estar vacia.\n";
                    return $tareas;
                }
                if(!validarFormatoFecha($nuevaFecha) || !validarFecha($nuevaFecha)){
                    echo "La fecha no es valida. Por favor, ingresa una fecha en el formato YYYY-MM-DD.\n";
                    return $tareas;
                }
                $tarea->setFecha($nuevaFecha);
                $tarea->setCompletada(false);
                
                echo "Tarea con ID '$id' editada correctamente.";
                return $tareas;
            }
        }
    }
?>