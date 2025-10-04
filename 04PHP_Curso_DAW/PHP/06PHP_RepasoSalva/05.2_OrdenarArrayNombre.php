<!-- 2.- Crea un array con frutas y ordénalo por nombre -->
<?php

    $frutas = array("limón","manzana", "banana", "naranja", "plátano", "uva", "toronja", "fresa", "sandía", "pera", "kiwi");
    echo sort($frutas);

    function OrdenarArrayAscendente($frutas) {
        $i = 1;
        foreach ($frutas as $fruta) {
            echo  $i++ . " - (" . $fruta . ")    ";
        }
        return sort($frutas);
    }
    function OrdenarArrayDescendente($frutas) {
        for ($i = 0; $i < count($frutas); $i++) {
            echo $i + 1 . " - (". $frutas[$i] . ")    ";
        }
        return rsort($frutas);
    }
    function OrdenarArrayAleatorio($frutas) {
        for ($i = 0; $i < count($frutas); $i++) {
            echo $i + 1 . " - ". $frutas[$i] . "    ";
        }
        return shuffle($frutas);
    }
    function mostrarArray($frutas){
        return print_r($frutas);
    }

    echo "<br>Array de frutas desordenado: <br>";
    mostrarArray($frutas);

    echo "<br>Array de frutas ordenado ascendente: <br>";
    OrdenarArrayAscendente($frutas);
?>