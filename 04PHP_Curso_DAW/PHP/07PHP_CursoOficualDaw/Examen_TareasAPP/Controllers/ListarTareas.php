<?php
function listarTareas(array $tareas) {
    if (empty($tareas)) {
        echo "No hay tareas disponibles.\n";
        return;
    }

    foreach ($tareas as $index => $tarea) {
        $id = $index + 1;

        echo "ID: $id\n";
        echo "Titulo: " . $tarea->getTitulo() . "\n";
        echo "Descripcion: " . $tarea->getDescripcion() . "\n";
        echo "Fecha: " . $tarea->getFecha() . "\n";
        echo "Completada: " . ($tarea->getCompletada() ? "Si" : "No") . "\n\n";
    }
}

function listarTareasWrapper(){
    
    $tareas = cargarJson(getRutaTareas());
    
    printTitle("Listar Tareas");
    if(empty($tareas)){
        echo "No hay tareas disponibles.\n";
        return;
    }
    listarTareas($tareas);
}

?>