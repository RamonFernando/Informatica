<?php
require_once __DIR__ . '/Require.php';

class App {
        
    public function run(){
        
        while (true){

            printMenu();
            $opcion = trim(fgets(STDIN));

            switch ($opcion) {
                case 1:
                    // Agregar Tarea
                    agregarTareaWrapper();
                    break;

                case 2:
                    // Eliminar Tarea
                    eliminarTareaWrapper();
                    break;

                case 3:
                    // Editar Tarea
                    editarTareaWrapper();
                    break;
                
                case 4:
                    // Marcar Tarea Completada
                    marcarTareaCompletadaWrapper();
                    break;

                case 5:
                    // Listar Tareas
                    listarTareasWrapper();
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