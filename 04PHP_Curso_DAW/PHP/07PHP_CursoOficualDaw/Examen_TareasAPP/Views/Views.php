<?php
    function printMenu(){
        echo "\n";
        echo "---------------------------\n";
        echo " --- Gestor de Tareas --- \n";
        echo "---------------------------\n";
        echo "1. Agregar Tarea\n";
        echo "2. Eliminar Tarea\n";
        echo "3. Editar Tarea\n";
        echo "4. Marcar tarea completada\n";
        echo "5. Listar Tareas\n";
        echo "0. Salir\n";
        echo "---------------------------\n";
        echo "Ingrese una Opcion: ";
    }
    
    function printTitle($title) {
        echo " \n";
        echo "---------------------------\n";
        echo "----- $title ----- \n";
        echo "---------------------------\n";
    }
?>