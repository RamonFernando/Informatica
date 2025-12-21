<?php
require_once __DIR__ . '/Require.php';

class App {
        
    public function run(){
        
        $ruta = (__DIR__ . '/../data/tareas.json');
        $tareas = cargarJson($ruta);
        if(empty($tareas)){
            $tareas = [];
        }
        // $tareas = [];
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
                        if(mb_strtolower($tarea->getTitulo()) === mb_strtolower($nuevaTarea->getTitulo()) 
                            && $tarea->getFecha() === $nuevaTarea->getFecha()){
                            echo "\nLa tarea ya existe. No se puede agregar duplicados.\n";
                            $exists = true;
                            break;
                        }
                    }
                    if($exists) break;
                    
                    $tareas[] = $nuevaTarea;
                    guardarJson($ruta, $tareas);

                    echo "Tarea agregada exitosamente.\n";
                    listarTareas($tareas);
                    break;

                case 2:
                    printTitle("Eliminar Tarea");
                    echo "Ingrese el Id de la tarea a eliminar: ";
                    $id = trim(fgets(STDIN));
                    
                    if(esEnter($id)) break;
                    if(!validarId($id)){
                        echo "El ID no puede estar vacio o debe ser numerico y mayor que 0.\n";
                        break;
                    }

                    $id = (int)$id;
                    $tareas = eliminarTarea($tareas, $id);
                    
                    guardarJson($ruta, $tareas);
                    
                    echo "Tarea eliminada exitosamente.\n";
                    listarTareas($tareas);
                    break;

                case 3:
                    printTitle("Editar Tarea");
                    echo "Ingrese el Id de la tarea a editar: ";
                    $id = trim(fgets(STDIN));
                    
                    if(esEnter($id)) break;
                    if(!validarId($id)){
                        echo "El ID no puede estar vacio o debe ser numerico y mayor que 0.\n";
                        break;
                    }

                    $id = (int)$id;
                    $tareas = editarTarea($tareas, $id);
                    guardarJson($ruta, $tareas);
                    break;
                
                case 4:
                    printTitle("Marcar Tarea Completada");
                    echo "Ingrese el Id de la tarea a marcar como completada: ";
                    $id = trim(fgets(STDIN));
                    if(empty($id) || !is_numeric($id)) break;
                    
                    $tareas = marcarTareaCompletada($tareas, $id);
                    guardarJson($ruta, $tareas);

                    echo "Tarea marcada como completada exitosamente.\n";
                    listarTareas($tareas);
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