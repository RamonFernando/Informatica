<?php
// Validar la sesion y contar cuantas veces se ha visitado la página
session_start(); // Iniciar la sesión

if (!isset($_SESSION['contador'])) { // Si esta vacio el contador 
  $_SESSION['contador'] = 1;
} else {
  $_SESSION['contador']++; // Si ya se ha visitado la sesion se le suma 1
}

echo "Has visitado esta página " . $_SESSION['contador'] . " veces.";
// session.gc_maxlifetime(); (Tiempo de vida de la sesion)
?>
