<?php
// for 

for ($i = 0; $i < 5; $i++) {
    echo "Iteración $i<br>";
}
// Ejemplo 2
// For con array 
$colores = array("rojo", "verde", "azul");
for ($i = 0; $i < count($colores); $i++) {
    echo "El color es: " . $colores[$i] . "<br>";
}
// for con objetos
class Persona {
    public $nombre;
    public $edad;
}
$personas = array(
    new Persona("Juan", 25),
    new Persona("Pedro", 30),
    new Persona("Maria", 28)
);
for ($i = 0; $i < count($personas); $i++) {
    echo "Nombre: " . $personas[$i]->nombre . ", Edad: " . $personas[$i]->edad . "<br>";
}

?>