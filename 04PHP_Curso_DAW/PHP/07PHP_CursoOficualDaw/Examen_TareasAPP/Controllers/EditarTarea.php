<?php
    function editarTarea($tareas, $id) {
        echo "Ingrese el Id de la tarea a editar: ";
        $input = trim(fgets(STDIN));
        
        if($input === '' || !ctype_digit($input)){ // valida digitos del 0-9
            echo "El ID no puede estar vacio o debe ser numerico.\n";
            return $tareas;
        }
        
        $id = (int)$input;
        foreach ($tareas as $tarea){
            if($tarea->getId() === $id){
                echo "Ingrese el nuevo titulo: ";
                $nuevoTitulo = mb_strtolower(trim(fgets(STDIN)));
                if(empty($nuevoTitulo)){
                    $nuevoTitulo = $tarea->getTitulo();
                }
                $tarea->setTitulo($nuevoTitulo);

                echo "Ingrese el nuevo descripcion: ";
                $nuevaDescripcion = trim(fgets(STDIN));
                if(empty($nuevaDescripcion)){
                    $nuevaDescripcion = $tarea->getDescripcion();
                }
                $tarea->setDescripcion($nuevaDescripcion);

                echo "Ingrese la nueva fecha (YYYY-MM-DD): ";
                $nuevaFecha = trim(fgets(STDIN));
                if(empty($nuevaFecha)){
                    $nuevaFecha = $tarea->getFecha();
                }
                if(!validarFormatoFecha($nuevaFecha) || !validarFecha($nuevaFecha)){
                    echo "La fecha no es valida. Por favor, ingresa una fecha en el formato YYYY-MM-DD.\n";
                    return $tareas;
                }
                $tarea->setFecha($nuevaFecha);

                do{
                    echo "Ingrese el nuevo estado (si o no): ";
                    $nuevoEstado = mb_strtolower(trim(fgets(STDIN)));

                    if(empty($nuevoEstado)){
                        $nuevoEstado = $tarea->getCompletada();
                        break;
                    }
                    if($nuevoEstado !== 'si' && $nuevoEstado !== 'no'){
                        echo "El estado debe ser 'si' o 'no'.\n";
                        continue;
                    }
                }while(true);
                $tarea->setCompletada($nuevoEstado);

                echo "Tarea con ID '$id' editada correctamente.";
                return $tareas;
            }
        }
    }
?>