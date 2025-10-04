<?php
/* Casting
La conversión en PHP se realiza con estas declaraciones:

(string) - Se convierte en el tipo de datos String
(int) - Se convierte en el tipo de datos Integer
(float) - Se convierte en el tipo de datos Float
(bool) - Convierte a tipo de datos booleano
(array) - Convierte al tipo de datos Array
(object) - Se convierte en el tipo de datos Object
(unset) - Se convierte en el tipo de datos NULL

*/
// Ejemplo $a = 5;       // Integer
$b = 5.34;    // Float
$c = "hello"; // String
$d = true;    // Boolean
$e = NULL;    // NULL

// Convertir a string
$a = (string) $a;
$b = (string) $b;
$c = (string) $c;
$d = (string) $d;
$e = (string) $e;

// Convertir a entero
$a = (int) $a;
$b = (int) $b;
$c = (int) $c;
$d = (int) $d;
$e = (int) $e;

// Convertir a float
$a = (float) $a;
$b = (float) $b;
$c = (float) $c;
$d = (float) $d;
$e = (float) $e;

//To verify the type of any object in PHP, use the var_dump() function:
var_dump($a);
var_dump($b);
var_dump($c);
var_dump($d);
var_dump($e);

// Ejemplo casting a array
$a = 5;       // Integer
$b = 5.34;    // Float
$c = "hello"; // String
$d = true;    // Boolean
$e = NULL;    // NULL

$a = (array) $a;
$b = (array) $b;
$c = (array) $c;
$d = (array) $d;
$e = (array) $e;

// Ejemplo con codigo
class Car {
    public $color;
    public $model;
    public function __construct($color, $model) {
        $this->color = $color;
        $this->model = $model;
    }
    public function message() {
        return "My car is a " . $this->color . " " . $this->model . "!";
    }
}

    $myCar = new Car("red", "Volvo");

    $myCar = (array) $myCar;
    var_dump($myCar);
?>