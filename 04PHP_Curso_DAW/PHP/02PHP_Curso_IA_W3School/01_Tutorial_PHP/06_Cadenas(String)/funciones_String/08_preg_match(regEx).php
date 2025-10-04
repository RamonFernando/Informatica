<?php
// preg_match(): Buscar una expresión regular en una cadena (un patrón)
$cadena = "123-456-789";
if (preg_match("/\d{3}-\d{3}-\d{3}/", $cadena)) {
    echo "El formato es válido.";
}
?>
