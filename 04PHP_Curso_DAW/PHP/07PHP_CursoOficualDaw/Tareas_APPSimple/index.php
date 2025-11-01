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
        echo match ($opcion) {
            "1" => create(),
            "2" => read(),
            "3" => update(),
            "4" => delete(),
            "5" => search(),
            "6" => closeConnection($conn),
            default => "Opción no válida. Por favor, intente de nuevo.\n"
        };
    }

    function closeConnection($conn){
        $conn->close();
        exit("Saliendo del programa...\n");
    }
?>