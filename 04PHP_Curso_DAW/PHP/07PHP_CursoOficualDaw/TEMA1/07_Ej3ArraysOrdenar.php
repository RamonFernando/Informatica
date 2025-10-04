<!-- 3.Capitales ordenadas de la matriz CEU

$ceu = array( "Italia"=>"Roma", "Luxemburgo"=>"Luxemburgo", "Bélgica"=> "Bruselas", 
"Dinamarca"=>"Copenhague", "Finlandia"=>"Helsinki", "Francia" => "París", 
"Eslovaquia"=>"Bratislava", "Eslovenia"=>"Liubliana", "Alemania" => "Berlín", 
"Grecia" => "Atenas", "Irlanda"=>"Dublín", "Países Bajos"=>"Ámsterdam", "Portugal"=>"Lisboa", 
"España"=>"Madrid", "Suecia"=>"Estocolmo", "Reino Unido"=>"Londres", "Chipre"=>"Nicosia", 
"Lituania"=>"Vilnius", "República Checa"=>"Praga", "Estonia"=>"Tallin", "Hungría"=>"Budapest", 
"Letonia"=>"Riga", "Malta"=>"Valetta", "Austria" => "Viena", "Polonia"=>"Varsovia") ;

Cree un script PHP que muestre la capital y el nombre del país de la matriz $ceu 
anterior. Ordena la lista por la capital del país.

Salida de muestra:
La capital de los Países Bajos es Ámsterdam
La capital de Grecia es Atenas
La capital de Alemania es Berlín
- - - - - - - - - - - - - - - - - - -
- - - - - - - - - - - - - - - - - - - -->

<?php
    echo "<h1>07_Ej3Arrays</h1><br>";

    $ceu = array( "Italia"=>"Roma", "Luxemburgo"=>"Luxemburgo", "Bélgica"=> "Bruselas", 
    "Dinamarca"=>"Copenhague", "Finlandia"=>"Helsinki", "Francia" => "París", 
    "Eslovaquia"=>"Bratislava", "Eslovenia"=>"Liubliana", "Alemania" => "Berlín", 
    "Grecia" => "Atenas", "Irlanda"=>"Dublín", "País Bajos"=>"Ámsterdam", "Portugal"=>"Lisboa", 
    "España"=>"Madrid", "Suecia"=>"Estocolmo", "Reino Unido"=>"Londres", "Chipre"=>"Nicosia", 
    "Lituania"=>"Vilnius", "República Checa"=>"Praga", "Estonia"=>"Tallin", "Hungría"=>"Budapest", 
    "Letonia"=>"Riga", "Malta"=>"Valetta", "Austria" => "Viena", "Polonia"=>"Varsovia") ;

    // Mostramos un bucle
    foreach ($ceu as $country => $capital){
        echo "La capital de " . $country . " es " . $capital . "<br>";
    }

    echo "<hr>";
    /*sort($ceu);
    foreach ($ceu as $country => $capital){
        // ordenamos por el pais
        echo "La capital es " . $capital . "<br>";
    }*/
    // echo "<hr>";

    // Ordenamos el array por capitales
    asort($ceu);
    foreach ($ceu as $country => $capital){
        // ordenamos por la capital
        echo "La capital de " . $country . " es " . $capital . "<br>";
    }
?>