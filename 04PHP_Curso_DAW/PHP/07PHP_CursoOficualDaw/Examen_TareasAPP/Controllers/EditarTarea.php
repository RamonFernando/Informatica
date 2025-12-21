<?php
require_once __DIR__ . '/../Models/Tarea.php';
require_once __DIR__ . '/../Helpers/Helpers.php';

function editarTarea($tareas, $id) {

    if (!ctype_digit((string)$id) || $id <= 0) {
        echo "El ID no puede estar vacio o debe ser numerico.\n";
        return $tareas;
    }

    $index = (int)$id - 1;

    if (!isset($tareas[$index])) {
        echo "Tarea con ID '$id' no encontrada.\n";
        return $tareas;
    }

    $tarea = $tareas[$index];

    do {
        echo "Ingrese el nuevo titulo: ";
        $nuevoTitulo = mb_strtolower(trim(fgets(STDIN)));
        if ($nuevoTitulo === '') {
            $nuevoTitulo = $tarea->getTitulo();
        }
        if (empty($nuevoTitulo)) {
            echo "El titulo no puede estar vacio. Por favor, ingresa un titulo valido.\n";
            continue;
        }
    } while (empty($nuevoTitulo));
    $tarea->setTitulo($nuevoTitulo);

    echo "Ingrese el nuevo descripcion: ";
    $nuevaDescripcion = trim(fgets(STDIN));
    if (empty($nuevaDescripcion)) {
        $nuevaDescripcion = $tarea->getDescripcion();
    }
    $tarea->setDescripcion($nuevaDescripcion);

    echo "Ingrese la nueva fecha (YYYY-MM-DD): ";
    $nuevaFecha = trim(fgets(STDIN));
    if (empty($nuevaFecha)) {
        $nuevaFecha = $tarea->getFecha();
    }
    if (!validarFormatoFecha($nuevaFecha) || !validarFecha($nuevaFecha)) {
        echo "La fecha no es valida. Por favor, ingresa una fecha en el formato YYYY-MM-DD.\n";
        return $tareas;
    }
    $tarea->setFecha($nuevaFecha);

    do {
        echo "Ingrese el nuevo estado (si o no): ";
        $nuevoEstado = mb_strtolower(trim(fgets(STDIN)));

        if (empty($nuevoEstado)) {
            $estadoFinal = $tarea->getCompletada();
            break;
        }
        if ($nuevoEstado !== 'si' && $nuevoEstado !== 'no') {
            echo "El estado debe ser 'si' o 'no'.\n";
            continue;
        }
        $estadoFinal = ($nuevoEstado === 'si');
        break;
    } while (true);
    $tarea->setCompletada($estadoFinal);

    echo "Tarea con ID '$id' editada correctamente.";
    return $tareas;
}

function editarTareaWrapper() {

    $ruta = getRutaTareas();    // Ruta del archivo JSON
    $tareas = cargarTareas();   // Cargas el Json (CargarJson)

    printTitle("Editar Tarea");
    echo "Ingrese el Id de la tarea a editar: ";
    $id = trim(fgets(STDIN));

    if (esEnter($id)) return $tareas;
    if (!validarId($id)) {
        echo "El ID no puede estar vacio o debe ser numerico y mayor que 0.\n";
        return $tareas;
    }

    $id = (int)$id;
    $tareas = editarTarea($tareas, $id);
    guardarJson($ruta, $tareas);

    echo "Tarea editada exitosamente.\n";
    listarTareas($tareas);
}
