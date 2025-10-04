<?php
// Operadores de comparación
echo "<h2>Operadores de comparación</h2>";
echo 1 == 1 . "<br>"; // true
echo 1 === 1 . "<br>"; // true
echo 1 != 1 . "<br>"; // devuelve true si uno es distinto al otro
echo 1 !== 1 . "<br>"; // devuelve true si uno es distinto al otro
echo 1 > 1 . "<br>"; // false
echo 1 < 1 . "<br>"; // false
echo 1 >= 1 . "<br>"; // devuelve true si uno es mayor o igual al otro
echo 1 <= 1 . "<br>"; // devuelve true si uno es menor o igual al otro
echo 1 <> 1 . "<br>"; // devuelve true si uno es distinto al otro
echo 1 <=> 1 . "<br>"; // devuelve 0 si ambos son iguales

// Operadores Logicos
echo "<h2>Operadores Logicos</h2>";
echo $x and $y . "<br>"; // true
echo $x or $y . "<br>"; // true
echo $x xor $y . "<br>"; // true
echo !$x . "<br>"; // false
?>