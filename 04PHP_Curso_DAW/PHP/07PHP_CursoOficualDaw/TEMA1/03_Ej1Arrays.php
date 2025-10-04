<!-- 1.Cadena de memoria colorida

$color = array('blanco', 'verde', 'rojo', 'azul', 'negro');
Escriba un script que muestre la siguiente cadena:
"El recuerdo de esa escena para mí es como un fotograma de película congelado
para siempre en ese momento: la alfombra roja, el césped verde, la casa blanca, el cielo plomizo.
El nuevo presidente y su primera dama. - Richard M. Nixon"
y las filas 'rojo', 'verde' y 'blanco' vendrán de $color. -->

<?php
echo "<h1>1.Ejercicio 3</h1><br>";

// Opcion 1
echo "<b>Opción 1:</b><br>";
$color = array('blanco', 'verde', 'rojo', 'azul', 'negro');
$fraseCelebre = "El recuerdo de esa escena para mí es como un fotograma de película congelado
para siempre en ese momento: la alfombra " . $color[2] . ", el césped " . $color[1] . ", la casa " . $color[0] . ", el cielo plomizo.
El nuevo presidente y su primera dama. - Richard M. Nixon";

echo $fraseCelebre . "<br>";

// Opcion 2 str_replace
echo "<b>Opción 2:</b><br>";
$color1 = array('blanco', 'verde', 'rojo', 'azul', 'negro');
// recorremos la frase
echo "<br>";
echo str_replace($color1[0], 'blanco', $fraseCelebre . "<br>"); // str_replace() devuelve un string con la sustitución de un string por otro
echo "<br>";
echo str_replace($color1[1], 'verde', $fraseCelebre . "<br>");
echo "<br>";
echo str_replace($color1[2], 'rojo', $fraseCelebre . "<br>");


// Opcion 3: recorriendo fila por fila con foreach
echo "<b>Opción 3:</b><br>";

$fraseReconstruida = "";

// Reconstruyendo la frase palabra por palabra
foreach (explode(" ", $fraseCelebre) as $palabra) { // explode() divide un string en un array
    // limpiamos signos de puntuación para comparar
    $palabraLimpia = trim($palabra, ",.");

    if (in_array($palabraLimpia, $color)) {
        // reemplazamos por el valor del array (aquí mismo valor, pero útil si cambiara)
        $fraseReconstruida .= $palabraLimpia . " ";
    } else {
        $fraseReconstruida .= $palabra . " ";
    }
}

echo $fraseReconstruida . "<br>";
// Nota: La opcion 3 Chatgpt

?>