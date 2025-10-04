<?php
// . Escriba un script PHP para obtener el nombre del servidor.
echo "Ejercicio 25 <br>";
echo "El nombre del servidor es: " . $_SERVER['SERVER_NAME'];
echo "<br><br>";

// 21. Escriba una función PHP para probar si un número es mayor que 30, 20 o 10 usando un operador ternario.
echo "Ejercicio 21 <br>";
$num = 50;
echo ($num > 30) ? "El numero es mayor que 30" : ($num > 20 ? "El numero es mayor que 20" : ($num > 10 ? "El numero es mayor o igual que 10" : "El numero es menor que 10"));
echo "El numero es $num <br>";
echo "<br><br>";

// 22. Escribe un script PHP para obtener la URL completa.
echo "Ejercicio 22 <br>";
echo "La URL completa es: " . $_SERVER['HTTP_HOST'] . $_SERVER['REQUEST_URI'];
echo "<br><br>";

// 23. Escribe un script PHP para comparar la versión PHP.
// Nota: Utilice la función version_compare() y la constante PHP_VERSION.
echo "Ejercicio 23 <br>";
echo "La version de PHP es: " . PHP_VERSION;

// Comparamos las versiones de PHP
if (version_compare(PHP_VERSION, '8.2.0', '>')) {
    echo "<br>La version de PHP es mayor que 8.2.0";
} else if (version_compare(PHP_VERSION, '8.2.0', '<')) {
    echo "<br>La version de PHP es menor o igual que 8.2.0";
} else if (version_compare(PHP_VERSION, '8.0.0', '>=') && version_compare(PHP_VERSION, '8.2.0', '<=')) {
    echo "<br>La version de PHP es mayor o igual a 8.0.0";
} else {
    echo "<br>La version de PHP es menor a 8.0.0";
}
echo "<br><br>";

// 24. Escriba un script PHP para obtener el nombre del propietario del script PHP actual.
echo "Ejercicio 24 <br>";
// Obtiene el nombre del propietario del script actual
echo 'Current script owner: ' . get_current_user() . "\n";

echo "<br><br>";

// 25. Escriba un script PHP para obtener el directorio raíz del documento bajo el cual se está ejecutando el script actual,
// como se define en el archivo de configuración del servidor.
echo "Ejercicio 25 <br>";
echo "El directorio raiz es: " . $_SERVER['DOCUMENT_ROOT'];
echo "<br><br>";

// 26. Escriba un script PHP para obtener la información sobre el sistema operativo en el que se está ejecutando PHP.
echo "Ejercicio 26 <br>";
echo "El sistema operativo es: " . $_SERVER['SERVER_SOFTWARE'];
echo "<br><br>";

// Escriba un script PHP para obtener la información de la base de datos.
echo "Ejercicio 27 <br>";
echo "La informacion de la base de datos es: " . $_SERVER['SERVER_ADMIN'];
echo "<br><br>";

// 27. Escribe un script PHP para imprimir todos los créditos para PHP.
echo "Ejercicio 27 <br>";
// phpcredits(CREDITS_ALL - CREDITS_FULLPAGE);
echo "<br><br>";

// 28. Escriba un script PHP para obtener la ruta de directorio utilizada para archivos temporales.
echo "Ejercicio 28 <br>";
// Generate a temporary file with a unique filename
// The tempnam() function creates a temporary file with a unique name in the system's temporary directory
$temp_file = tempnam(sys_get_temp_dir(), 'Tux');
// Output the path of the created temporary file
echo $temp_file."\n";
echo "<br><br>";

// 29. Escribe un script PHP para obtener los nombres de las funciones de un módulo.
// Nota: Encuentra funciones XML, JSON, etc.
echo "Ejercicio 29 <br>";
// Get the names of all functions provided by the JSON extension
$json_extension_funcs = get_extension_funcs("JSON");
// Print the list of JSON extension functions
echo "JSON extension functions: <br>";
print_r($json_extension_funcs);
echo "<br>";

// Get the names of all functions provided by the XML extension
$xml_extension_funcs = get_extension_funcs("XML");
// Print the list of XML extension functions
echo "XML extension functions: <br>";
print_r($xml_extension_funcs);
echo "<br>";
echo "<br><br>";

// 30. Escribe un script PHP para obtener el tiempo de la última modificación de la página actual.
echo "Ejercicio 30 <br>";
// Obtenemos el tiempo de la ultima modificacion
$ultima_modificacion_time = getlastmod();
// Formato de la fecha de ultima modificación
echo "La ultima modificacion es: " . date("l, dS F, Y, h:ia", $ultima_modificacion_time);
echo "<br><br>";

?>