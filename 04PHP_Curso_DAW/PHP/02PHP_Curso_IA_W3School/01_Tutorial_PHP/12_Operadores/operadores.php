<?php
// Operadores aritméticos
echo "<h2>Operadores aritméticos</h2>";
echo 1 + 1 . "<br>"; // 2
echo 1 - 1 . "<br>"; // 0
echo 2 * 2 . "<br>"; // 4
echo 2 / 2 . "<br>"; // 1
echo 2 % 2 . "<br>"; // 0
echo 2 ** 2 . "<br>"; // 4

// Operadores de asignación
echo "<h2>Operadores de asignación</h2>";
$a = 5;
echo $a . "<br>"; // 5
echo $a += 2 . "<br>"; // 7
echo $a -= 2 . "<br>"; // 5
echo $a *= 2 . "<br>"; // 10
echo $a /= 2 . "<br>"; // 5
echo $a %= 2 . "<br>"; // 1
echo $a **= 2 . "<br>"; // 1

// Operadores de comparación
echo "<h2>Operadores de comparación</h2>";
echo 1 == 1 . "<br>"; // true
echo 1 === 1 . "<br>"; // true
echo 1 != 1 . "<br>"; // false
echo 1 !== 1 . "<br>"; // false
echo 1 > 1 . "<br>"; // false
echo 1 < 1 . "<br>"; // false
echo 1 >= 1 . "<br>"; // true
echo 1 <= 1 . "<br>"; // true
echo 1 <> 1 . "<br>"; // false
echo 1 <=> 1 . "<br>"; // 0

// Operadores de incremento y decremento
echo "<h2>Operadores de incremento y decremento</h2>";
$a = 5;
echo ++$a . "<br>"; // 6
echo $a++ . "<br>"; // 6
echo --$a . "<br>"; // 5
echo $a-- . "<br>"; // 5

// Operadores lógicos
echo "<h2>Operadores lógicos</h2>";
echo true && true . "<br>"; // true
echo true && false . "<br>"; // false
echo true || true . "<br>"; // true
echo true || false . "<br>"; // true
echo !true . "<br>"; // false
echo !false . "<br>"; // true
echo $x and $y . "<br>"; // true
echo $x or $y . "<br>"; // true
echo $x xor $y . "<br>"; // true

// Operadores de cadenas
echo "<h2>Operadores de cadenas</h2>";
echo "Hello" . "World" . "<br>"; // HelloWorld
echo "Hello" . " " . "World" . "<br>"; // Hello World
echo $txt1 .= $txt2 . "<br>"; // Learn PHPW3Schools.com
echo $txt1 .= $txt2 . "<br>"; // Añade $txt2 a $txt1

// Operador ternario
// $x = expr1 ? expr2 : expr3; // Si expr1 es verdadero, devuelve expr2, de lo contrario devuelve expr3
// $x = expr1 ?? expr2; // Si expr1 es verdadero, devuelve expr1, de lo contrario devuelve expr2
?>