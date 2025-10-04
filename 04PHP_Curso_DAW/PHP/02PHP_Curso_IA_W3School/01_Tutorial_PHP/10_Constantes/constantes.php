<?php
// Estructura de una constante 
// define(name, value);
define('constante', "Este es el valor de la constante");

// Ejemplo
define("GREETING", "Welcome to W3Schools.com!");
echo GREETING;

// También se puede utilizar constante para declarar una variable, ejemplo:
const MYCAR = "Volvo";
echo MYCAR;

// Diferencia 
// const vs. define()
//const no se puede crear dentro de otro ámbito de bloque, 
// como dentro de una (función) o dentro de una instrucción (if)
// define se puede crear dentro de otro ámbito de bloque.


// Ejemplo
// Cree una constante Array:

define("cars", [
    "Alfa Romeo",
    "BMW",
    "Toyota"
]);
echo cars[0];

// En este ejemplo se utiliza una constante dentro de una función, 
// incluso si se define fuera de la función:

define("GREETING1", "Welcome to W3Schools.com!");

function myTest() {
    echo GREETING1;
}

myTest();
?>