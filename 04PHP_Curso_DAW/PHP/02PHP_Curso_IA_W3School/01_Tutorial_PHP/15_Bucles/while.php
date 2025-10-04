<?php
// While
// Ejemplo 1
$i = 1;
while ($i <= 10) {
    echo $i . "<br>";
    $i++;
}
// Ejemplo 2
// While con array
$colores = array("rojo", "verde", "azul");
$i = 0;
while ($i < count($colores)) {
    echo "El color es: " . $colores[$i] . "<br>";
    $i++;
}

// Ejemplo 3
// While con objetos
class Persona {
    public $nombre;
    public $edad;
    public function __construct($nombre, $edad) {
        $this->nombre = $nombre;
        $this->edad = $edad;
    }
}
$personas = array(
    new Persona("Juan", 25),
    new Persona("Pedro", 30),
    new Persona("Maria", 28)
);
$i = 0;
while ($i < count($personas)) {
    echo "Nombre: " . $personas[$i]->nombre . ", Edad: " . $personas[$i]->edad . "<br>";
    $i++;
}


?>