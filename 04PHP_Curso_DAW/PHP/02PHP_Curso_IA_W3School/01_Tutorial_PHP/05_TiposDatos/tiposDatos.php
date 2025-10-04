<?php

/*Tipo	    Ejemplo
Entero	    $edad = 25;
Flotante    $precio = 19.99;
string	    $nombre = "Juan";
Booleano	$esValido = true;
Array	    $frutas = ["manzana"];
Objeto	    $persona = new Persona();
NULL	    $valor = null;
Recurso	    $conexion = fopen();

Array asociativo	$datos = ["nombre" => "Ana", "edad" => 30];
Objeto compuesto	$vehiculo = new Vehiculo();
Arrays multidimensionales
$notas = [
    ["nota1", "nota2"],
    ["nota3", "nota4"]
]
*/

/*
1. Tipos escalares
Son los datos básicos en PHP.

a. Enteros (int)
Números enteros positivos o negativos, sin decimales.*/
$numero = 42;
$negativo = -15;

/*
b. Flotantes (float o double)
Números con decimales.*/
$precio = 19.99;
$pi = 3.14159;

/*
c. Cadenas (string)
Texto o secuencias de caracteres.*/
$saludo = "Hola, Mundo";
$comilla = 'Texto con una comilla simple';

/*d. Booleanos (bool)
Valores lógicos: true (verdadero) o false (falso).*/
$esMayorDeEdad = true;
$esEstudiante = false;

/*
2. Tipos compuestos
Son tipos que pueden contener múltiples valores o estructuras complejas.

a. Arrays
Colecciones de datos indexados o asociativos.*/


// Array indexado
$numeros = [1, 2, 3, 4];

// Array asociativo
$persona = [
    "nombre" => "Ana",
    "edad" => 30,
    "profesion" => "Ingeniera"
];

/*
b. Objetos (object)
Instancias de clases que encapsulan propiedades y métodos.*/

class Persona {
    public $nombre;
    public $edad;

    public function __construct($nombre, $edad) {
        $this->nombre = $nombre;
        $this->edad = $edad;
    }
}

$usuario = new Persona("Juan", 25);

/*
3. Tipos especiales
a. NULL
Representa una variable sin valor asignado.*/
$variableSinValor = null; // Variable sin valor


/*b. Recursos (resource)
Representa referencias a recursos externos, como una conexión a base de datos o un archivo.
Son utilizados para manejar recursos externos, como archivos, bases de datos, sockets, etc.*/
$archivo = fopen("archivo.txt", "r"); // Recurso de archivo

/*
4. Tipos de datos introducidos en versiones recientes
a. Unión de tipos (PHP 8.0+)
Permite declarar más de un tipo para una variable.*/


function mostrarDato(int|string $dato) {
    echo $dato;
}
mostrarDato(42); // Válido
mostrarDato("Texto"); // Válido

/*
b. Enumeraciones (PHP 8.1+)
Permite definir conjuntos de valores constantes.*/

enum Estado {
    case Activo;
    case Inactivo;
}

$estadoActual = Estado::Activo;


?>