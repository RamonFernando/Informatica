<?php
session_start();

// Destruir todas las variables de sesión
// Se utiliza para vaciar todos los datos de la sesión actual. 
//Esto significa que se borran todas las variables almacenadas en la sesión, pero la sesión en sí sigue activa (no se destruye).
$_SESSION = array(); 
session_destroy(); // Destruye la sesión actual

// Redirigir al usuario a la página de inicio de sesión
header("Location: index.html");
exit();
?>
