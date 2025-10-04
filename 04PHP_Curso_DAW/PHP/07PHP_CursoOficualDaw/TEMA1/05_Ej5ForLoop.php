<!-- 5.Cálculo factorial
Escribe un programa para calcular e imprimir el factorial de un número usando un
bucle for. El factorial de un número es el producto de todos los números enteros
hasta ese número inclusive, por lo que el factorial de 4 es 4*3*2*1= 24.-->
<?php
echo "<h1>5.Ejercicio 5</h1><br>";
function factorial($num){
    $factorial = 1;
    for ($i = 1; $i <= $num; $i++){
        $factorial *= $i;
    }
    return $factorial;
}
$num = 5;
echo "El factorial de " . $num . " es: " . factorial($num) . "<br>";
?>