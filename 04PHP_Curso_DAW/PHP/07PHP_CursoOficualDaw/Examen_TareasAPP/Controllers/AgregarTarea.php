<?php
    // " ----- Agregar Tareas ---- ";
    function nuevaTarea() {
        do{
            echo "Ingresa el Titulo de la tarea: ";
            $titulo = trim(fgets(STDIN));

            if(empty($titulo))
                echo "El titulo no puede estar vacio. Por favor, ingresa un titulo valido.\n";
        }while(empty($titulo));
                    
        do{
            echo "Ingresa la Descripcion de la tarea: ";
            $descripcion = trim(fgets(STDIN));

            if(empty($descripcion))
                echo "La descripcion no puede estar vacia. Por favor, ingresa una descripcion valida.\n";
        }while (empty($descripcion));

        do{
            echo "Ingresa la Fecha de vencimiento (YYYY-MM-DD): ";
            $fecha = trim(fgets(STDIN));
                    
            if(empty($fecha) || !preg_match('/^\d{4}-\d{2}-\d{2}$/', $fecha))
                echo "La fecha no es valida. Por favor, ingresa una fecha en el formato YYYY-MM-DD.\n";
        }while(empty($fecha) || !preg_match('/^\d{4}-\d{2}-\d{2}$/', $fecha));
        
        do{
            echo "¿La tarea está Completada? (si/no): ";
            $completadaInput = trim(fgets(STDIN));

            if(strtolower($completadaInput) !== 'si' && strtolower($completadaInput) !== 'no')
                echo "Entrada no valida. Por favor, responde con 'si' o 'no'.\n";
                
        }while(strtolower($completadaInput) !== 'si' && strtolower($completadaInput) !== 'no');
        
        $completada = strtolower($completadaInput) === 'si' ? true : false;
        
        return new Tarea($titulo, $descripcion, $fecha, $completada);
    }
?>