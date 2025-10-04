<!-- 16.Obtenga la clave más grande de una matriz

Escriba un script PHP para obtener la clave más grande de una matriz.-->
<?php
$countrys = array(
    "Italy" => "Rome",
    "Luxembourg" => "Luxembourg",
    "Belgium" => "Brussels",
    "Denmark" => "Copenhagen",
    "Finland" => "Helsinki",
    "France" => "Paris",
    "Slovakia" => "Bratislava",
    "Slovenia" => "Ljubljana",
    "Germany" => "Berlin",
    "Greece" => "Athens",
    "Ireland" => "Dublin",
    "Netherlands" => "Amsterdam",
    "Portugal" => "Lisbon",
    "Spain" => "Madrid",
    "Sweden" => "Stockholm",
    "United Kingdom" => "London",
    "Cyprus" => "Nicosia",
    "Lithuania" => "Vilnius",
    "Czech Republic" => "Prague",
    "Estonia" => "Tallin",
    "Hungary" => "Budapest",
    "Latvia" => "Riga",
    "Malta" => "Valetta",
    "Austria" => "Vienna",
    "Poland" => "Warsaw"
);
$numbers = array(20, 40, 10, 90, 50, 80);

echo "13_Ej16Arrays Clave mas alta por 4<br>";


// Ejemplo 1 con números
// muestra la clave mas alta del arrays $contrys Unit Kindom ya que es la letra mas alta
// array_keys muestra un array con las claves del array asociativo y max devuelve el valor mas alto
$countrysMax = max(array_keys($countrys));

// Ejemplo 2 con array asociativo (letras)
// Funcion max que devuelve la clave mas alta de un array, en este caso de numeros
$numMax = max($numbers);


echo "Máximo: $numMax<br>";
echo "País con la letra mas alta: $countrysMax<br>";

?>