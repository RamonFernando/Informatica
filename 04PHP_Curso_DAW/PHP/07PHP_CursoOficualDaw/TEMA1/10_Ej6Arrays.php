<!-- 6.Decodificar cadena JSON

Escriba un script PHP que decodifique la siguiente cadena JSON.
Ejemplo de código JSON:
{"Título": "Los cucos llamando",
"Autor": "Robert Galbraith",
"Detalle": {
"Editor": "Little Brown"
}}
Salida esperada:
Título: Los cucos llamando
Autor: Robert Galbraith
Editorial: Little Brown -->

<?php
    echo "<h1>Ejercicio 09_Ej6Arrays</h1> <br>";
    
    $details = '{
        "Título": "Los cucos llamando",
        "Autor": "Robert Galbraith",
        "Detalle": {
            "Editor": "Little Brown"
        }
    }';
    // Decodificamos el JSON
    $json = json_decode($details, true);
    
    print_r($json);
    echo "<hr>";
    
    // Función para mostrar el JSON
    function showJSON($value, $key) {
        echo $key . ": " . $value . "<br>";
    }

    // Funcion recursiva que recorre el array y llama a la funcion showJSON
    array_walk_recursive($json, 'showJSON');

    echo "<hr>";

    // Mostramos los datos manualmente
    echo "Título: " . $json["Título"] . "<br>";
    echo "Autor: " . $json["Autor"] . "<br>";
    echo "Editorial: " . $json["Detalle"]["Editor"] . "<br>";
    ?>