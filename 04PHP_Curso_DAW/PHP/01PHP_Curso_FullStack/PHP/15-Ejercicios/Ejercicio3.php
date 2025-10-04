<?php

    // Ejercicio 3
    /* Programa que compruebe si una variable esta vacia y si esta vacia rellenarla con texto en
    minusculas y mostrarlo en mayusculas y negrita.
     */

    $texto = "";
    if(empty($texto)){
        $texto = "texto en mayusculas";
        echo "<b>" . strtoupper($texto) . "</b><br>";
        $texto = "texto en minusculas";
        echo "<b>" . strtolower($texto) . "</b>";
    }
    
?>