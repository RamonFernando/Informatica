<?php
$txt1 = "Learn PHP";
$txt2 = "W3Schools.com";

echo "<h2>$txt1</h2>";
echo "<p>Study PHP at $txt2</p>";
// Uso de comillas simples
// Las cadenas están entre comillas, pero hay una diferencia entre las cadenas y comillas dobles en PHP.

// Cuando se utilizan comillas dobles, las variables se pueden insertar en la cadena como en el ejemplo anterior.

// Cuando se usan comillas simples, las variables deben insertarse usando el operador, así:.

// print "<h2>$txt1</h2>";
// print "<p>Study PHP at $txt2</p>";
print "<h2>$txt1</h2>";
print "<p>Study PHP at $txt2</p>";
/*
Uso de comillas simples
Las cadenas están entre comillas, pero hay una diferencia entre las cadenas y comillas dobles en PHP.

Cuando se utilizan comillas dobles, las variables se pueden insertar en la cadena como en el ejemplo anterior.

Cuando se usan comillas simples, las variables deben insertarse usando el operador, así:.
*/
// Ejemplo
$txt1 = "Learn PHP";
$txt2 = "W3Schools.com";

print '<h2>' . $txt1 . '</h2>';
print '<p>Study PHP at ' . $txt2 . '</p>';
print "<h2>$txt1</h2>";
print "<p>Study PHP at $txt2</p>";
?>