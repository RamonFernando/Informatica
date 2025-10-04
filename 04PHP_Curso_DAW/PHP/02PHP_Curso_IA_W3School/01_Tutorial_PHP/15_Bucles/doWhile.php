<?php
// 04PHP_Curso_DAW/PHP/02PHP_Curso_IA_W3School/01_Tutorial_PHP/15_Bucles/forEach.php
// do...while
$i = 0;
do {
    echo "El valor de i es: $i <br>";
    $i++;
} while ($i < 10);

// do...while con array
$colores = array("rojo", "verde", "azul");
$i = 0;
do {
    echo "El color es: " . $colores[$i] . "<br>";
    $i++;
} while ($i < count($colores));

// do...while con objetos
$personas = array(
    new Persona("Juan", 25),
    new Persona("Pedro", 30),
    new Persona("Maria", 28)
);
$i = 0;
do {
    echo "Nombre: " . $personas[$i]->nombre . ", Edad: " . $personas[$i]->edad . "<br>";
    $i++;
} while ($i < count($personas));

?>