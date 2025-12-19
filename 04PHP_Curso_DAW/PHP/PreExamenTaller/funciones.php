<?php
    function inscripciones(string $nombre, int $edad, string $actividad, float $precio){
        $nombre;
        $edad;
        $actividad;
        $precio;
    }

    function cargarInscripciones() {
        $archivo = fopen("inscripciones.txt", "r");
        $inscripciones = [];
        while (($linea = fgets($archivo)) !== false) {
            $inscripciones[] = trim($linea);
        }
        fclose($archivo);
        return $inscripciones;
    }
    function guardarInscripcion($nombre, $edad, $actividad, $precio) {
        $archivo = fopen("inscripciones.txt", "a");
        fwrite($archivo, $nombre . PHP_EOL, $edad . PHP_EOL, $actividad . PHP_EOL, $precio . PHP_EOL);
        fclose($archivo);
    }
    function nuevaInscripcion($nombre, $edad, $actividad, $precio) {
        $inscripciones = cargarInscripciones();
        if (in_array($nombre, $inscripciones)) {
            echo "Ya estas inscrito";
            return false; // Ya inscrito
        } else {
            guardarInscripcion($nombre, $edad, $actividad, $precio);
            return true; // Inscripción exitosa
        }
        if($edad <= 8){
            echo "La edad es inferior a 8 años. No se puede inscribir.";
            return false;
        }
    }
?>