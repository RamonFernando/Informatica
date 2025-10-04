<?php
//1. Variables escalares
// Entero
$edad = 25;

// Flotante
$precio = 19.99;

// Cadena de texto
$nombre = "Juan";

// Booleano
$esMayorDeEdad = true;
?>
<?php
// 2. Variables compuestas
// Array
$frutas = ["manzana", "plátano", "naranja"];

// Array asociativo
$persona = [
    "nombre" => "Ana",
    "edad" => 30,
    "profesion" => "Ingeniera"
];

// Objeto
class Vehiculo {
    public $marca;
    public $modelo;

    public function __construct($marca, $modelo) {
        $this->marca = $marca;
        $this->modelo = $modelo;
    }
}

$auto = new Vehiculo("Toyota", "Corolla");
?>

<?php
// 3. Variables especiales
// NULL (variable sin valor)
$variableSinValor = null;

// Variables superglobales
$nombreArchivo = $_SERVER['SCRIPT_NAME']; // Obtiene el nombre del script actual

// Variables por referencia
$a = 10;
$b = &$a; // $b es una referencia a $a
$b = 20;
echo $a; // Salida: 20
?>

<?php
// Variables dinámicas
$nombreVariable = "miVariable";
$$nombreVariable = "Hola Mundo"; // Crea la variable $miVariable
echo $miVariable; // Salida: Hola Mundo
?>



