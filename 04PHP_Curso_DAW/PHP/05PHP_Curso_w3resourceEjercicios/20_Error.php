<?php
// 20. Escriba un script PHP para obtener el último error ocurrido.
echo "Ejercicio 20 <br>";
echo "El ultimo error es: " . error_get_last()['message'];
?>