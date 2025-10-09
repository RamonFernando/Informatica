<!-- 230aleatorios50.php: Rellena un array con 50 números
aleatorios comprendidos entre el 0 y el 99, y luego muéstralo
en una lista desordenada. Para crear un número aleatorio,
utiliza la función rand(inicio, fin). Por ejemplo:
$num = rand(0, 99)-->
<?php
echo "27_Ej230FRand Ordenar un array con números aleatorios<br>";
$num = range(0, 99);

for ($i = 0; $i < 50; $i++){
    $numRandom = rand(0,99);
    echo ($i+1) ."º: " . ($num[$i] = $numRandom) . "<br>";
}
?>