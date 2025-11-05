<?php
    // conexiones y requerimientos
    require_once 'conexionBD.php';
    require_once 'require.php';

    // Llamamos a la función de conexión
    $conn = conexionBD();

    // Index.php
    while (true){
        
        echo "========================\n";
        echo "Tareas de la APP Simple\n";
        echo "========================\n";
        echo "1. Crear registro\n";
        echo "2. Leer registros\n";
        echo "3. Actualizar registro\n";
        echo "4. Eliminar registro\n";
        echo "5. Buscar registro\n";
        echo "6. Salir del programa\n";
        echo "========================\n";

        // Manipulación de la entrada del usuario
        echo "Ingrese una opcion (número del 1 al 6): ";
        $opcion = trim(fgets(STDIN));
        
        // Lógica para manejar la opción seleccionada
        switch ($opcion) {
    case "1":
        echo "Introduce el título: ";
        $titulo = trim(fgets(STDIN));

        echo "Introduce la descripción: ";
        $descripcion = trim(fgets(STDIN));

        echo "Introduce la fecha (YYYY-MM-DD): ";
        $fecha_caducidad = trim(fgets(STDIN));

        echo "Estado de la tarea, Completada? ((0)❌No o (1)✅Sí): ";
        $completada = trim(fgets(STDIN));
        
        // 4. Mostrar un mensaje de confirmación
        $msgVerify = create($titulo, $descripcion, $fecha_caducidad, $completada);
            echo $msgVerify ?
                "✅  Tarea creada exitosamente.\n":
                "❌  No se pudo crear la tarea. Verifique los datos e intente nuevamente.\n";
        
        break;

    case "2":
        echo read();
        break;

    case "3":
        echo update();
        break;

    case "4":
        echo "Inserte la ID de la tarea a eliminar: ";
        $id = trim(fgets(STDIN));
            // Mostrar mensaje de confirmación
            $msgVerify = delete($id);
            echo $msgVerify ?
                "✅ Tarea eliminada exitosamente.\n":
                "❌ No se pudo eliminar la tarea $id. Verifique la ID e intente nuevamente.\n";
            
        break;

    case "5":
        echo search();
        break;

    case "6":
        closeConnection($conn);
        break;

    default:
        echo "Opción no válida. Por favor, intente de nuevo.\n";
        break;
}

    }

    function closeConnection($conn){
        $conn->close();
        exit("Saliendo del programa...\n");
    }
?>