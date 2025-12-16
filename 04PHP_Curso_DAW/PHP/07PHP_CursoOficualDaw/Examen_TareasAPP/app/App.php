<?php
require_once __DIR__ . '/Require.php';
class App {
        
    public function run(){
        
        $tareas = [];
        while (true){

            printMenu();
            $opcion = trim(fgets(STDIN));

            switch ($opcion) {
                case 1:
                    printTitle("Agregar Tarea");
                    echo "Ingrese la nueva tarea: ";
                    $nuevaTarea = nuevaTarea();
                    
                    // Validar que la tarea no sea nula y que sea una instancia de Tarea
                    if($nuevaTarea === null || !($nuevaTarea instanceof Tarea)){
                        echo "\nNo se pudo agregar la tarea. Intente nuevamente.\n";
                        break;
                    }
                    $exists = false;
                    foreach($tareas as $tarea){
                        if($tarea->getTitulo() === $nuevaTarea->getTitulo() && $tarea->getFecha() === $nuevaTarea->getFecha()){
                            echo "\nLa tarea ya existe. No se puede agregar duplicados.\n";
                            $exists = true;
                            break;
                        }
                    }
                    if($exists) break;
                    
                    $tareas[] = $nuevaTarea;
                    echo "Tarea agregada exitosamente.\n";
                    listarTareas($tareas);
                    break;
                case 2:
                    /*printTitle("Eliminar Tarea");
                    echo "Ingrese el Id de la tarea a eliminar: ";
                    $indice = trim(fgets(STDIN));
                    $tareas = eliminarTarea($tareas, $indice);*/
                    break;
                case 3:
                    /*printTitle("Editar Tarea");
                    echo "Ingrese el Id de la tarea a editar: ";
                    $id = trim(fgets(STDIN));
                    echo "Ingrese la nueva descripcion: ";
                    $nuevaDescripcion = trim(fgets(STDIN));
                    $tareas = editarTarea($tareas, $id, $nuevaDescripcion);*/
                    break;
                
                case 4:
                    /*printTitle("Marcar Tarea Completada");
                    echo "Ingrese el Id de la tarea a marcar como completada: ";
                    $id = trim(fgets(STDIN));
                    $tareas = marcarTareaCompletada($tareas, $id);*/
                    break;
                case 5:
                    printTitle("Listar Tareas");
                    listarTareas($tareas);
                    break;
                case 0:
                    echo "Saliendo...\n";
                    return;
                default:
                    echo "Opcion no valida.\n";
                    break;
            }
        }
    }
}

?>