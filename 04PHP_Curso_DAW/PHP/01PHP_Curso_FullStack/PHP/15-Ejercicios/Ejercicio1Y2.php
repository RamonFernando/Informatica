<?php

    // Ejercicio 1

    // Recorrer un array con ForEach
    // Ordenar un array con sort
    // Mostrar la longitud de un array
    // Busqueda en array con in_array
    // Busqueda en array con array_search

    echo "<h3>Ejercicio 1</h3>";
    // global $numeros;
    $numeros = [7,9,6,7,8,9,10,8];

    // Recorrer el array con ForEach
    echo "<p>Recorrer el array con ForEach</p>";
    foreach ($numeros as $i => $numero) {
        echo "Posicion: " . $i . " Num: " . $numero . "<br>";
    }
    function mostrarArray($numeros){
        
        foreach ($numeros as $i => $numero) {
            echo  "[" . $i . "º: " . " Num: " . $numero . "]\t";
            
        }
        return $numeros;
    }
    
    echo "<hr>";
    
    // Ordenar y mostrar el Array
    echo "<p>Ordenar el array con sort</p>";
    sort($numeros) ."<br>";
    mostrarArray($numeros);
    
    echo "<hr>";
    // Mostrar la longitud del array
    echo "<p>Longitud del array: " . count($numeros) . "</p>";

    echo "<hr>";
    
    // Busqueda en array con in_array
    echo "<p>Busqueda en array (si existe el número 9, devuelve true(1) o false(0) si no existe) con in_array: ";
    echo in_array(9, $numeros) . "</p>";
    mostrarArray($numeros);
    
    echo "<hr>";

    // Busqueda en array con array_search
    echo "<p>Busqueda en el array (posicion del número 8) con array_search: ";
    echo array_search(8, $numeros) . "</p>";
    mostrarArray($numeros);
    
    echo "<hr>";

    // Busqueda en array con array_search
    if (isset($_GET["numeros"])){
        array_search(9, $numeros);
        
        $busqueda = $_GET["numeros"]; // Recoger el numero a buscar por la URL
        echo "<p>Busqueda en el array (posicion del número $busqueda) con array_search: ";
        echo array_search($busqueda, $numeros) . "</p>";
        mostrarArray($numeros);

        echo "<hr>";

        if(!empty($busqueda)){
            echo "<p>Busqueda en el array (posicion del número $busqueda) con array_search: ";
            echo array_search($busqueda, $numeros) . "</p>";
            mostrarArray($numeros);
        }else{
            echo "<p>No se ha introducido ningún número</p>";
        }
    }

?>