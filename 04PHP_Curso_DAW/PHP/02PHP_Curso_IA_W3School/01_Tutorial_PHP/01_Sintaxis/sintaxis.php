<?php
# Sintaxis básica de PHP
/*
Explicación rápida:
Declaración de variables: Se usa el signo $.
Estructuras de control: Condicionales (if, else) y bucles (for, foreach).
Funciones: Definidas con function.
Arrays: Usados con corchetes [].
Clases y objetos: Se definen con class y se instancian con new.
*/
// Ejemplos básicos de PHP

// Declaración de variables
$nombre = "Juan";
$edad = 25;

// Estructura condicional
if ($edad >= 18) {
    echo "Hola, $nombre. Eres mayor de edad.\n";
} else {
    echo "Hola, $nombre. Eres menor de edad.\n";
}

// Uso de un bucle
echo "Cuento hasta 5:\n";
for ($i = 1; $i <= 5; $i++) {
    echo $i . "\n";
}

// Definición y uso de funciones
function saludar($nombre) {
    return "Hola, $nombre. ¡Bienvenido!\n";
}

echo saludar($nombre);

// Arrays y bucles foreach
$frutas = ["manzana", "plátano", "naranja"];
echo "Lista de frutas:\n";
foreach ($frutas as $fruta) {
    echo "- $fruta\n";
}

// Clase y objeto
class Persona {
    public $nombre;
    public $edad;

    public function __construct($nombre, $edad) {
        $this->nombre = $nombre;
        $this->edad = $edad;
    }

    public function presentarse() {
        return "Soy $this->nombre y tengo $this->edad años.\n";
    }
}

$persona = new Persona("Ana", 30);
echo $persona->presentarse();

?>
