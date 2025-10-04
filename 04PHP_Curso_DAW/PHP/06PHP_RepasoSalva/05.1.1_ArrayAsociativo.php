<!-- 1.- Crea un array asociativo con 15 países y su capital,
muéstrame los todos los países y su capital, y por ultimo aparte muéstrame
la primera y la ultima del array, sin usar el arrayPaises(0) o arrayPaises(14)
o parecido, es decir quiero el primero y el ultimo de manera dinámica (con funciones) -->
<?php
$paises = array( "Esp" => "Madrid", "Cub" => "La Habana",
    "EUA" => "Washington D.C", "Ita" => "Roma", "Jap" => "Tokio");

    
    // mostramos el array mediante una funcion
    function mostrarPaises($paises){
        $i = 1;
        foreach ($paises as $pais => $capital) {
            echo $i++ ."País: $pais => Capital: $capital<br>";
        }
    }
    function mostrarPosiciones($paises){

            foreach($paises as $pais => $capital){
                $pais . " " . $capital;
            }
        
            echo "Primer País: " . array_key_first($paises) . " Capital: " . current($paises) . "<br>";
            echo "Último País: " . array_key_last($paises) . " Capital: " . end($paises) . "<br>";
        
    }

    mostrarPaises($paises);
    mostrarPosiciones($paises);
?>