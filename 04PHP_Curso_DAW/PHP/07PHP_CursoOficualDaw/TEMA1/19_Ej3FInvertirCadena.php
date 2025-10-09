<!-- 3.Inversión de cadena

Escriba una función para invertir una cadena.-->
<?php
    echo "19_Ej3 Funciones, Invertir Cadena<br>";
    $Montesquieu = "No hay peor dictadura que la que se ejerce a la sombra de las leyes y bajo el calor de la justicia";
    function reverseChain($text){
        if(empty($text) || !is_string($text)) return "Debes introducir un texto.";
        return strrev($text);
    }
    echo "Frase Original: $Montesquieu<br>" ;
    echo "Cadena invertida: " . reverseChain($Montesquieu) . "<br>";
?>