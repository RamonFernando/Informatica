<?php
// Constantes mágicas
// Las constantes mágicas no distinguen entre mayúsculas y minúsculas, lo que significa 
// que devuelve lo mismo que .__LINE____line__
echo "<h2>Constantes mágicas</h2>";
echo __DIR__ . "<br>"; // Devuelve la ruta de la carpeta actual
echo __FILE__ . "<br>"; // Devuelve la ruta del archivo actual
echo __LINE__ . "<br>"; // Devuelve el número de línea actual
echo __METHOD__ . "<br>"; // Devuelve el nombre del método actual
echo __NAMESPACE__ . "<br>"; // Devuelve el espacio de nombres actual
echo __TRAIT__ . "<br>"; // Devuelve el nombre del trait actual
echo __CLASS__ . "<br>"; // Devuelve el nombre de la clase actual
echo __FUNCTION__ . "<br>"; // Devuelve el nombre de la función actual
// echo ClassName::class . "<br>"; // Devuelve el nombre de la clase actual
?>