<?php
/**
 * Configurar la Base de Datos (MySQL): Crea una base de datos para almacenar información de usuarios, pedidos y el menú.
 */
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "La_Toscana_pizzeria"; // Cambiar el nombre de la base de datos

// Crea la conexiòn a la base de datos 
$conn = new mysqli($servername, $username, $password, $dbname);

// Comprueba la conexiòn a la base de datos (si falla, muestra un mensaje de error)
// (connect_error) Se utiliza para verificar si hay un error al intentar conectarse a una base de datos en PHP
// específicamente cuando se utiliza la extensión mysqli
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error); 
}
?>