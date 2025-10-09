<!-- 242matematicas.php: Añade las siguientes funciones:
1 digitos(int $num): int → devuelve la cantidad de dígitos de un número.
2 digitoN(int $num, int $pos): int → devuelve el dígito que ocupa, empezando por
la izquierda, la posición $pos.
3 quitaPorDetras(int $num, int $cant): int → le quita por detrás (derecha) $cant dígitos.
4 quitaPorDelante(int $num, int $cant): int → le quita por delante (izquierda) $cant dígitos.
Para probar las funciones, haz uso tanto de paso de argumentos posicionales como argumentos con nombre.-->
<?php
    echo "27_Ej241F Funciones contar y quitar caracteres<br>";

    //------------------------------ Ejercicio 1 --------------------------------
    // Devuelve la cantidad de digitos de un numero (int o string)
    function digitos(int $num): int{
        $digitosNum = strlen(intval($num)); // Numeros
        return $digitosNum;
    }
    echo "Cantidad de numeros: " . digitos(1231314) ."<br>";
    echo "Cantidad de numeros: " . digitos("12313125") ."<br>";

    // Devuelve la cantidad de caracteres de un string
    function digitosStr(string $char): string{
        $digitosChar = strlen(strval($char)); // String
        return $digitosChar;
    }
    echo "Caracteres de la cadena: " . digitosStr("sygjwhewsdofj") ."<br>";

    //------------------------------ Ejercicio 2 --------------------------------
    // Devuelve la posicion de la primera coincidencia de un digito dentro de un número
    function digitosN (int $num, int $pos): int {
        $digiPos = strpos(strval($num), $pos);// devuelve la pos de un digito en el num
        return $digiPos;
    }
    $result = digitosN(386789679, 7);
    echo ($result) ?
        "El número se encuentra en la posición: " . $result
        : "Número no encontrado";
    
    echo "<br>";
    //------------------------------ Ejercicio 3 --------------------------------
    // Devuelve un numero quitandole la cantidad de digitos pasados como argumento (derecha-izquierda)
    function quitaPorDetras(int $num, int $cant): int{
        $number = substr($num, 0, strlen($num) - $cant);
        $result = intval($number); // convertimos a entero
        return $result;
    }
    $numberFormatMin = quitaPorDetras(987654321, 3);
    echo ($numberFormatMin) ?
        "El número final es: " . $numberFormatMin
        : "No se pudo realizar la operación";

    echo "<br>";
    //------------------------------ Ejercicio 4 --------------------------------
    // Devuelve un numero quitandole la cantidad de digitos pasados como argumento (izquierda-derecha)
    function quitaPorDelante(int $num, int $cant): int{
        $number = substr($num, $cant);
        $result = (int) $number; // convertir a entero
        return $result;
    }
    $numberFormat = quitaPorDelante(987654321, 2);
    echo ($numberFormat) ?
        "El número final es: " . $numberFormat
        : "No se pudo realizar la operación";
?>