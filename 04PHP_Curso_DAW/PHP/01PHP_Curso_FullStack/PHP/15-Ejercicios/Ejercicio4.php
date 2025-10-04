<?php

    // Ejercicio 4
    /*
    Crea un script en php que tenga 4 variables, una de tipo array,
    otra de tipo string, otra de tipo int y otra de tipo booleana y 
    que imprima un mensaje segun el tipo de variable que sea.
    */

    $array = [1,2,3,4,5];
    $string = "hola";
    $int = 5;
    $boolean = true;

    if(is_array($array)){
        echo "La variable es un array";
    }
    else if(is_string($string)){
        echo "La variable es un string";
    }
    else if(is_int($int)){
        echo "La variable es un int";
    }
    else if(is_bool($boolean)){
        echo "La variable es un bool";
    }
?>