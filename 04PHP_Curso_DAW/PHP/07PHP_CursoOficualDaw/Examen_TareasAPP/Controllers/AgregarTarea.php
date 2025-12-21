<?php
require_once __DIR__ . '/../Models/Tarea.php';
require_once __DIR__ . '/../Helpers/Helpers.php';
require_once __DIR__ . '/../app/Require.php';

// " ----- Agregar Tareas ---- ";
function nuevaTarea() {
    // Titulo
    do{
        echo "Ingresa el Titulo de la tarea: ";
        $titulo = trim(fgets(STDIN));
    
        if(empty($titulo))
            echo "El titulo no puede estar vacio. Por favor, ingresa un titulo valido.\n";
    }while(empty($titulo));
    
    // Descripcion
    echo "Ingresa la Descripcion de la tarea: ";
    $descripcion = trim(fgets(STDIN));

    if(empty($descripcion))
        $descripcion = 'unknown';
        
    // Fecha de Vencimiento
    do{
        echo "Ingresa la Fecha de vencimiento (YYYY-MM-DD): ";
        $fecha = trim(fgets(STDIN));
    
        if(empty($fecha)) // fecha por defecto hoy
            $fecha = date('Y-m-d');
            
        if(!validarFecha($fecha) || !validarFormatoFecha($fecha)) // fecha real, regex
            echo "La fecha no es valida. Por favor, ingresa una fecha en el formato YYYY-MM-DD.\n";
    
    }while(!validarFormatoFecha($fecha) || !validarFecha($fecha));
        
    // Tarea Completada
    do{
        echo "¿La tarea está Completada? (si/no): ";
        $completadaInput = strtolower(trim(fgets(STDIN)));
    
        if(empty($completadaInput))
            $completadaInput = 'no';
    
        if($completadaInput !== 'si' && $completadaInput !== 'no')
            echo "Entrada no valida. Por favor, responde con 'si' o 'no'.\n";
    
    }while($completadaInput !== 'si' && $completadaInput !== 'no');
        
    $completada = $completadaInput === 'si' ? true : false;
        
    return new Tarea($titulo, $descripcion, $fecha, $completada);
}

function agregarTareaWrapper() {
        
    $ruta = getRutaTareas();    // Ruta del archivo JSON
    $tareas = cargarJson($ruta);   // Cargas el Json (CargarJson)

    printTitle("Agregar Tarea");
    $nuevaTarea = nuevaTarea();

    // Validar que la tarea no sea nula y que sea una instancia de Tarea
    if($nuevaTarea === null || !($nuevaTarea instanceof Tarea)){
        echo "\nNo se pudo agregar la tarea. Intente nuevamente.\n";
        return $tareas;
    }
        
    foreach($tareas as $tarea){
        if(mb_strtolower($tarea->getTitulo()) === mb_strtolower($nuevaTarea->getTitulo())
            && $tarea->getFecha() === $nuevaTarea->getFecha()){
            echo "\nLa tarea ya existe. No se puede agregar duplicados.\n";
            return $tareas;
        }
    }

    $tareas[] = $nuevaTarea;
    guardarJson($ruta, $tareas);
    echo "Tarea agregada exitosamente.\n";
    listarTareas($tareas);
}
?>