<!-- 4.Ordenación de matrices

Escriba una función para ordenar una matriz.-->
<?php
    echo "19_Ej3 Funciones, Ordenar Array<br>";

    $words = array("amar", "temer", "partir", "comenzar", "terminar", "perder", "repartir", "ganar");
    $numbers = array(8, 5, 9, 2, 7, 1, 3, 4, 6, 0);

    // Ordenar Arrays
    function sortArray($array){
        if(!is_array($array))return "Debes introducir un array";
        sort($array);
        return $array;
    }
    function showArray($array){
        for ($i=0; $i < count($array) ; $i++)
            echo $array[$i] . " ";
        echo "<br>";
    }

    // Mostramos los array Originales y ordenados
    // Ejemplo 1
    showArray($words); // Original
    showArray(sortArray($words)); // Ordenado

    // Ejemplo 2
    showArray($numbers); // Original
    showArray(sortArray($numbers)); // Ordenado
    
?>