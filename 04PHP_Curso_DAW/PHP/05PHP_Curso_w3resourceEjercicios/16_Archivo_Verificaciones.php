<?php
// 15. Escriba un script PHP para obtener la última información modificada de un archivo.
echo "Ejercicio 15 <br>";
// Get the current file name using basename and $_SERVER['PHP_SELF']
$current_file_name = basename($_SERVER['PHP_SELF']);

// Get the last modification time of the current file
$file_last_modified = filemtime($current_file_name);

// Display the last modified time in a human-readable format
echo "Last modified " . date("l, dS F, Y, h:ia", $file_last_modified) . "\n";

echo "<br>Pruebas <br>";
$archivo = "16_Archivo_Verificaciones.php";

// Verificamos si el archivo existe
echo (file_exists($archivo)) ? "El archivo $archivo existe" : "El archivo $archivo no existe";
echo "<br>";

// Mostramos la fecha de formato legal
echo "Fecha de formato legal: " . date("l, dS F, Y, h:ia", fileatime($archivo));
echo "<br>";

// Mostrar la fecha en formato legible
echo "Última modificación: " . date("d-m-Y H:i:s", filemtime($archivo));
echo "<br>";

// Verificaciones para un archiuvo en PHP
// Verificamos si el archivo es ejecutable
echo (is_executable($archivo)) ? "El archivo $archivo es ejecutable" : "El archivo $archivo no es ejecutable";
echo "<br>";

// Verificamos si el archivo es un directorio
echo (is_dir($archivo)) ? "El archivo $archivo es un directorio" : "El archivo $archivo no es un directorio";
echo "<br>";

// Verificamos si el archivo es un fichero
echo (is_file($archivo)) ? "El archivo $archivo es un fichero" : "El archivo $archivo no es un fichero";
echo "<br>";

// Verificamos si el archivo es un link simbolico
echo (is_link($archivo)) ? "El archivo $archivo es un link" : "El archivo $archivo no es un link";
echo "<br>";

// Obtenemos la informacion del archivo
print_r(stat($archivo));
echo "<br>";

// Obtenemos la fecha de modificacion del archivo
echo "Fecha de modificacion: " . date("l, dS F, Y, h:ia", filemtime($archivo));
echo "<br>";

// Obtenemos el tamanio del archivo
echo "Tamanio del archivo: " . filesize($archivo);
echo "<br>";

// Obtenemos el nombre del archivo
echo "Nombre del archivo: " . basename($archivo);
echo "<br>";

// Obtenemos la extension del archivo
echo "Extension del archivo: " . pathinfo($archivo, PATHINFO_EXTENSION);
echo "<br>";

// Obtenemos la ruta del archivo
echo "Ruta del archivo: " . dirname($archivo);
echo "<br>";

// Obtenemos la ruta absoluta del archivo
echo "Ruta absoluta del archivo: " . realpath($archivo);
echo "<br>";



// 16. Escribe un script PHP para contar el número de líneas en un archivo.
// Nota : Almacene un nombre de archivo de texto en una variable y cuente el número de líneas de texto que tiene.
echo "Ejercicio 16 <br>";
$archivo = "16_Archivo_Verificaciones.php";
$lineas = file($archivo);
echo "El archivo tiene " . count($lineas) . " lineas.";

// 17. Escriba un script PHP para imprimir la versión actual de PHP.
// Nota: No use la función phpinfo().
echo "Ejercicio 17 <br>";
echo "La version de PHP es: " . PHP_VERSION;

echo "<br><br>";
?>