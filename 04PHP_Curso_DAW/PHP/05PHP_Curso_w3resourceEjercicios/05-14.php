<?php
// 5. Escriba un script PHP para obtener la dirección IP del cliente.
echo "Ejercicio 5 <br>";
if(!empty($_SERVER['HTTP_CLIENT_IP']))
    $ip = $_SERVER['HTTP_CLIENT_IP'];
else if(!empty($_SERVER['HTTP_X_FORWARDED_FOR']))
    $ip = $_SERVER['HTTP_X_FORWARDED_FOR'];
else
    $ip = $_SERVER['REMOTE_ADDR'];

echo "IP: ". $ip;
echo "<br><br>";

// 6. Escribe un script de detección de navegador PHP simple.
echo "Ejercicio 6 <br>";
echo "Navegador: " .$_SERVER['HTTP_USER_AGENT'];
echo "<br><br>";

// 7. Escriba un script PHP para obtener el nombre de archivo actual.
echo "Ejercicio 7 <br>";
echo "Ruta: ". $_SERVER['PHP_SELF'];
echo "<br>";
echo "Nombre del Archivo: " .  basename($_SERVER['PHP_SELF']);

echo "<br><br>";
// 8. Escribe un script PHP, que devolverá los siguientes componentes de la url 'https://www.w3resource.com/php-exercises/php-basic-exercises.php'.
echo "Ejercicio 8 <br>";
$url = 'https://www.w3resource.com/php-exercises/php-basic-exercises.php';

// Parse the URL and store its components in the $url variable
$url = parse_url($url);

// Display the scheme (protocol) of the parsed URL
echo 'Scheme : ' . $url['scheme'] . "<br>";

// Display the host (domain) of the parsed URL
echo 'Host : ' . $url['host'] . "<br>";

// Display the path of the parsed URL
echo 'Path : ' . $url['path'];
echo "<br><br>";

// 9. Escribe un script PHP, que cambia el color del primer carácter de una palabra.
// Cadena de muestra : Tutorial PHP
echo "Ejercicio 9 <br>";

// Define a text string
$text = 'PHP Tutorial';

// Use a regular expression to replace the first letter of each word with a span element with red color
$text = preg_replace('/(\b[a-z])/i', '<span style="color:red">\1</span>', $text);

// Display the modified text with styled first letters
echo $text;
echo "<br><br>";

// 10. Escribe un script PHP, para comprobar si la página se llama desde 'https' o 'http'.
echo "Ejercicio 10 <br>";
if(!empty($_SERVER['HTTPS']))
    echo "La pagina se llama desde https";
else
    echo "La pagina se llama desde http";

echo "<br><br>";

// 11. Escribe un script PHP para redirigir a un usuario a una página diferente .
echo "Ejercicio 11 <br>";
// Use the header function to send a raw HTTP header
// In this case, the header function is used to perform a redirection
// The 'Location' header specifies the URL to which the user will be redirected
// header('Location: https://www.w3resource.com/');
// header('Location: https://www.w3schools.com/');
echo "<br><br>";

// 12. Escriba un programa PHP simple para verificar que los correos electrónicos sean válidos.
// Sugerencias : Utilice el filtro FILTER_VALIDATE_EMAIL que valida el valor como una dirección de correo electrónico.
// Nota: La documentación de PHP no dice que FILTER_VALIDATE_EMAIL deba pasar el RFC5321.
/*
Código	Descripción
220	Servidor SMTP listo
250	Acción completada correctamente
354	Inicio de entrada de datos (DATA)
421	Servidor no disponible
450	Dirección de destino temporalmente no disponible
550	Dirección de destino no existe
554	Correo rechazado por política de spam */

echo "Ejercicio 12 <br>";
$email = "ramonrfpa88@gmail.com";
if(filter_var($email, FILTER_VALIDATE_EMAIL)) // Validate the email
    echo "El correo electronico es valido";
else
    echo "El correo electronico no es valido";
echo "<br><br>";

// 13. Escriba un script e PHP para mostrar la cadena, valores dentro de una tabla.
echo "Ejercicio 13 <br>";

$nombre1 = "David";
$apellido1 = "Sanchez";
$nombre2 = "Ramon";
$apellido2 = "Perez";
echo "<table border='1' cellspacing='0' cellpadding='5'>"; // Create a table with a border of 1 pixel
    echo "<tr>";
        echo "<td><font color=blue>Nombre</font> </td>";
        echo "<td><font color=blue>Apellido</font> </td>";
    echo "</tr>";
    echo "<tr>";
        echo "<td>$nombre1</td>";
        echo "<td>$apellido1</td>";
    echo "</tr>";
    echo "<tr>";
        echo "<td>$nombre2</td>";
        echo "<td>$apellido2</td>";
    echo "</tr>";
echo "</table>";

echo "<br><br>";

// 14. Escriba un script PHP para mostrar el código fuente de una página web (por ejemplo, "http://www.example.com/").
echo "Ejercicio 14 <br>";
// Read all lines from the specified URL and store them in an array
/*
$all_lines = file('https://www.w3resource.com/');

// Iterate through each line in the array
foreach ($all_lines as $line_num => $line) {
    // Display the line number and the HTML-escaped content of the line
    echo "Line No.-{$line_num}: " . htmlspecialchars($line) . "\n";
}
*/
echo "<br><br>";

?>