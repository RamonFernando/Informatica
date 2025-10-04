<!--1.Visualización de secuencia numérica

Cree un script que muestre 1-2-3-4-5-6-7-8-9-10 en una línea. 
No habrá guión (-) en la posición inicial y final. -->
<?php
echo "<h1>Ejercicio 2 Bucle for</h1><br>";

$numbers = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Mostramos un bucle
    for ($i = 1; $i <= count($numbers); $i++){
        
        // Comprobamos que la posicion del array no sea 0, 1 o 10 para mostrar el guión
        if($i != $numbers[0])
            echo " - ";
        
        echo $i . " ";
    }
?>