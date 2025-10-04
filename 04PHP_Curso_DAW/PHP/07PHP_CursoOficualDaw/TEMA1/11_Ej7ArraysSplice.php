<!-- 7.Insertar nuevo elemento de matriz por posición

Escriba un script PHP que inserte un nuevo elemento en una matriz
en cualquier posición.
Salida esperada:
Matriz original:
12345
Después de insertar '$' la matriz es:
1 2 3 $ 4 5 -->

<?php
    echo "<h1>11_Ej7.Insertar nuevo elemento de matriz por posición</h1>";
    $elementos = array(1, 2, 3, 4, 5);
    print_r($elementos);

    array_splice($elementos, 3,0, '$');
    
    echo "<hr>";
    echo "<br>";

    // Mostramos el array con el elemento agregado
    for($i = 0; $i < count($elementos); $i++){
        echo $elementos[$i] . " ";
    }
?>