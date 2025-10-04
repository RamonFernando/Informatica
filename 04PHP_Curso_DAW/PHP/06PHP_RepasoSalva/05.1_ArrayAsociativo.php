<!-- 1.- Crea un array asociativo con 15 países y su capital,
muéstrame los todos los países y su capital, y por ultimo aparte muéstrame
la primera y la ultima del array, sin usar el arrayPaises(0) o arrayPaises(14)
o parecido, es decir quiero el primero y el ultimo de manera dinámica (con funciones) -->

<?php

    $paises = array( "Esp" => "Madrid", "Cub" => "La Habana",
    "EUA" => "Washington D.C", "Ita" => "Roma", "Jap" => "Tokio");
    
    
    function mostrarPaises($paises){
        $i = 1;
        echo "Listado de Países y Capitales: <br>";
        foreach($paises as $pais => $capital){
            echo $i ."º País: $pais => Capital: $capital <br>";
            $i++;
        }
    echo "<br>";
    }
    function mostrarPosiciones($paises){
        echo "Posiciones Primera y Ultima: <br>";
        echo "Primer País: " . key($paises) . " => Capital: " . current($paises) ."<br>";
        echo "Último País: " . end($paises) . " => Capital: ". current($paises)  . "<br>";
    }

    // Mostramos el array, el primer país y capital y el ultimo del array
    echo "Ejercicio 5.1 Array Asociativo: <br><br>";
    mostrarPaises($paises);
    mostrarPosiciones($paises);
    

    
    
    
    
    

    /*for ($i = 0; $i < count($paises); $i++){
        echo `Pais: $i => Capital: $paises[$i] <br>`;
    }*/
?>