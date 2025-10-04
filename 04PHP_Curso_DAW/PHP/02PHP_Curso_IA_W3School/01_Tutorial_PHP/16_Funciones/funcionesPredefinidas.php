<?php
    // -------------- funciones predefinidas ---------------- // 
    
    // strlen(): Devuelve la longitud de una cadena
    $cadena = "Hola, Mundo";
    echo strlen($cadena); // Salida: 11

    // strtoupper(): Devuelve una cadena en mayúsculas
    $cadena = "hola, mundo";
    echo strtoupper($cadena); // Salida: HOLA, MUNDO

    // strtolower(): Devuelve una cadena en minúsculas
    $cadena = "HOLA, MUNDO";
    echo strtolower($cadena); // Salida: hola, mundo

    // trim(): Elimina espacios en blanco al inicio y al final de una cadena
    $cadena = "   Hola, Mundo   ";
    echo trim($cadena); // Salida: Hola, Mundo

    // substr(): Devuelve una parte de una cadena
    $cadena = "Hola, Mundo";
    echo substr($cadena, 0, 4); // Salida: Hola

    // sort(): Ordena los elementos de un array
    $array = array("c", "a", "b");
    sort($array);
    echo implode(", ", $array); // Salida: a, b, c

    // rsort(): Ordena los elementos de un array en orden descendente
    $array = array("c", "a", "b");
    rsort($array);
    echo implode(", ", $array); // Salida: c, b, a

    // shuffle(): Desordena los elementos de un array
    $array = array("a", "b", "c");
    shuffle($array);
    echo implode(", ", $array); // Salida: c, b, a

    // explode(): Divide una cadena en un array
    $cadena = "a,b,c";
    $array = explode(",", $cadena);
    echo implode(", ", $array); // Salida: a, b, c

    // implode(): Convierte un array en una cadena
    $array = array("a", "b", "c");
    $cadena = implode(",", $array);
    echo $cadena; // Salida: a,b,c

    // -------------- funciones predefinidas con Arrays ---------------- //
    
    // array_map(): Aplica una función a todos los elementos de un array
    $array = array("a", "b", "c");
    $array = array_map("strtolower", $array);
    echo implode(", ", $array); // Salida: a, b, c

    // array_filter(): Filtra los elementos de un array
    $array = array("a", "b", "c");
    $array = array_filter($array, "strlen");
    echo implode(", ", $array); // Salida: a, b, c

    // array_reduce(): Reduce los elementos de un array a un solo valor
    function concat($carry, $item) {
        return $carry . $item;
    }
    $array = array("a", "b", "c");
    $result = array_reduce($array, "concat");
    echo $result; // Salida: abc

    // array_search(): Busca un elemento en un array y devuelve su clave
    $array = array("a", "b", "c");
    $index = array_search("b", $array);
    echo $index; // Salida: 1

    // array_push(): Agrega un elemento al final de un array
    $array = array("a", "b", "c");
    array_push($array, "d");
    echo implode(", ", $array); // Salida: a, b, c, d

    // array_pop(): Elimina el ultimo elemento de un array
    $array = array("a", "b", "c");
    array_pop($array);
    echo implode(", ", $array); // Salida: a, b

    // in_array(): Comprueba si un elemento pertenece a un array
    $array = array("a", "b", "c");
    echo in_array("a", $array); // Salida: true

    // array_shift(): Elimina el primer elemento de un array
    $array = array("a", "b", "c");
    array_shift($array);
    echo implode(", ", $array); // Salida: b, c

    // array_unshift(): Agrega un elemento al inicio de un array
    $array = array("a", "b", "c");
    array_unshift($array, "d");
    echo implode(", ", $array); // Salida: d, a, b, c

    // array_reverse(): Invierte el orden de los elementos de un array
    $array = array("a", "b", "c");
    $array = array_reverse($array);
    echo implode(", ", $array); // Salida: c, b, a

    // array_merge(): Une dos arrays
    $array1 = array("a", "b");
    $array2 = array("c", "d");
    $array = array_merge($array1, $array2);
    echo implode(", ", $array); // Salida: a, b, c, d

    // array_keys(): Devuelve todas las claves de un array
    $array = array("a" => "A", "b" => "B", "c" => "C");
    $keys = array_keys($array);
    echo implode(", ", $keys); // Salida: a, b, c

    // array_values(): Devuelve todos los valores de un array
    $array = array("a" => "A", "b" => "B", "c" => "C");
    $values = array_values($array);
    echo implode(", ", $values); // Salida: A, B, C

    // array_sum(): Suma todos los elementos de un array
    $array = array(1, 2, 3);
    $sum = array_sum($array);
    echo $sum; // Salida: 6

    // array_product(): Multiplica todos los elementos de un array
    $array = array(1, 2, 3);
    $product = array_product($array);
    echo $product; // Salida: 6

    // array_rand(): Devuelve una clave aleatoria de un array
    $array = array("a", "b", "c");
    $index = array_rand($array);
    echo $index; // Salida: 1

    // array_chunk(): Divide un array en partes
    $array = array("a", "b", "c", "d");
    $chunks = array_chunk($array, 2);
    echo implode(", ", $chunks[0]); // Salida: a, b
    echo implode(", ", $chunks[1]); // Salida: c, d

    // array_column(): Devuelve una columna de un array
    $array = array(
        array("a", "b", "c"),
        array("d", "e", "f"),
        array("g", "h", "i")
    );
    $column = array_column($array, 1);
    echo implode(", ", $column); // Salida: b, e, h

?>