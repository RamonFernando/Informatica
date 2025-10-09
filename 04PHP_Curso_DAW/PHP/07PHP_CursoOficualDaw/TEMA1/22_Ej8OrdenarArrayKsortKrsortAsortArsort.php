<!-- 8.Ordenar una matriz asociativa por clave y valor

Escriba un script PHP para ordenar la siguiente matriz asociativa:
array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40") en
a) orden ascendente ordenar por valor
b) orden ascendente ordenar por clave
c) clasificación de orden descendente por valor
d) orden descendente de clasificación por clave -->
<?php
    echo "22_Ej8 Arrays, Ordenar Array asociativo<br>";
    
    $nameAge = array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
    
    echo "a) orden ascendente por valor <br>";
    asort($nameAge); // ascendente x valor
    foreach($nameAge as $name => $age){
        echo "Name: $name Age: $age <br>";
    }

    echo "<hr>";
    echo "c) clasificación de orden descendente por valor<br>";
    arsort($nameAge); // descendente x valor
    foreach($nameAge as $name => $age){
        echo "Name: $name Age: $age <br>";
    }

    echo "<hr>";
    echo "b) orden ascendente por clave <br>";
    ksort($nameAge); // ascendente x clave
    foreach($nameAge as $name => $age){
        echo "Name: $name Age: $age <br>";
    }

    echo "<hr>";
    echo "d) orden descendente de clasificación por clave <br>";
    krsort($nameAge); // descendente x clave
    foreach($nameAge as $name => $age){
        echo "Name: $name Age: $age <br>";
    }
?>