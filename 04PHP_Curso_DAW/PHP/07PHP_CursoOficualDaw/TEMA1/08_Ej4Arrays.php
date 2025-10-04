<!-- 4.Eliminar elementos y normalizar claves

$x = matriz(1, 2, 3, 4, 5);
Elimine un elemento de la matriz PHP anterior. Después de eliminar el elemento, 
las claves enteras deben normalizarse.
Salida de muestra:
matriz(5) { [0]=> int(1) [1]=> int(2) [2]=> int(3) [3]=> int(4) [4]=> int(5) }
matriz(4) { [0]=> int(1) [1]=> int(2) [2]=> int(3) [3]=> int(5) } -->

<?php
echo "<h1>08_Ej4.Eliminar elementos y normalizar claves</h1>";
$x = array(10, 20, 30, 40, 50);
foreach($x as $key => $value){
    echo "$key => $value <br>";
}

// Ejemplo 1
unset($x[2]); // elimina el elemento 3
print_r($x);
echo "<br>";

// Ejemplo 2
$x = array(10, 20, 30, 40, 50);
array_splice($x, 3, 1); // elimina el elemento 4
print_r($x);

echo "<br>";

// Ejemplo 3
// Agregando elementos al array
$x = array(10, 20, 30, 40, 50);

// array_splice(array($x), posicion(3), cantidad(0), elemento(60))
array_splice($x, 3, 0, 60); // agrega el elemento 60 en la posicion 3
print_r($x);
?>