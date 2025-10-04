<?php

// Ejercicio 1
$temperatura = floatval(readline("Introduce la temperatura del reactor nuclear (en °C): "));
if ($temperatura > 120) {
    echo "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!\n";
} else {
    echo "La temperatura del reactor es segura.\n";
}

// Ejercicio 2 y 3
$precioOriginal = floatval(readline("Introduce el precio del producto (en €): "));
if ($precioOriginal < 5) {
    $precioFinal = $precioOriginal + 2;
} elseif ($precioOriginal > 80) {
    $precioFinal = $precioOriginal * 0.90;
} else {
    $precioFinal = $precioOriginal;
}
echo "El precio final es: €" . number_format($precioFinal, 2) . "\n";

// Ejercicio 4
$contrasena = readline("Introduce la contraseña: ");
if ($contrasena === "1234") {
    echo "Acceso permitido\n";
} else {
    echo "Acceso denegado\n";
}

// Ejercicio 5
$numeroMes = intval(readline("Introduce un número de mes (1-12): "));
if ($numeroMes >= 1 && $numeroMes <= 12) {
    echo "Mes correcto\n";
} else {
    echo "Mes no válido\n";
}

// Ejercicio 6
$precioProducto = floatval(readline("Introduce el precio del producto (en €): "));
$unidades = intval(readline("Introduce el número de unidades compradas: "));
$costeTotal = $precioProducto * $unidades;
$precioFinal2 = $costeTotal > 75 ? $costeTotal * 0.85 : $costeTotal * 0.95;
echo "El precio final es: €" . number_format($precioFinal2, 2) . "\n";

// Ejercicio 7
define("NUMERO_SECRETO", 7);
$numeroUsuario = intval(readline("Adivina el número secreto (del 1 al 10): "));
if ($numeroUsuario === NUMERO_SECRETO) {
    echo "¡Felicidades! Has adivinado el número secreto.\n";
} else {
    echo "Has fallado. Inténtalo de nuevo.\n";
}

// Ejercicio 8
$respuestaUsuario = strtolower(readline("¿Cómo se dice 'ordenador' en inglés? "));
if ($respuestaUsuario === "computer") {
    echo "¡Felicidades! Has respondido correctamente.\n";
} else {
    echo "Lo siento, esa no es la respuesta correcta. Inténtalo de nuevo.\n";
}

// Ejercicio 9
$precioProducto2 = floatval(readline("Introduce el precio del producto (en €): "));
$unidades2 = intval(readline("Introduce el número de unidades compradas: "));
$costeTotal2 = $precioProducto2 * $unidades2;
if ($costeTotal2 < 100) {
    echo "No tienes derecho a descuento.\n";
} else {
    $descuento = $costeTotal2 > 200 ? 0.15 : 0.10;
    $precioFinal3 = $costeTotal2 * (1 - $descuento);
    echo "El precio final después de aplicar el descuento es: €" . number_format($precioFinal3, 2) . "\n";
}

// Ejercicio 10 y 11
$nota = floatval(readline("Introduce una nota entre 0 y 10: "));
if ($nota < 0 || $nota > 10) {
    echo "Error: La nota debe estar entre 0 y 10.\n";
} else {
    $calificacion = $nota < 5 ? "Insuficiente" : ($nota < 7 ? "Suficiente" : ($nota < 9 ? "Bien" : ($nota < 10 ? "Notable" : "Sobresaliente")));
    echo "La calificación es: $calificacion\n";
}

// Ejercicio 12 y 13
$numeroMes2 = intval(readline("Introduce el número del mes (1-4): "));
$nombreMes = ["Enero", "Febrero", "Marzo", "Abril"];
if ($numeroMes2 >= 1 && $numeroMes2 <= 4) {
    echo "El mes es: " . $nombreMes[$numeroMes2 - 1] . "\n";
} else {
    echo "Mes no válido. Solo se aceptan números del 1 al 4.\n";
}

// Ejercicio 14
$numeroMes3 = intval(readline("Introduce el número del mes (1-12): "));
$nombreMeses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
if ($numeroMes3 >= 1 && $numeroMes3 <= 12) {
    echo $nombreMeses[$numeroMes3 - 1] . "\n";
} else {
    echo "Mes no válido. Debe ser un número entre 1 y 12.\n";
}

// Ejercicio 15 y 16
$anio = intval(readline("Introduce el año: "));
$numeroMes4 = intval(readline("Introduce el número del mes (1-12): "));
$diasDelMes = in_array($numeroMes4, [1, 3, 5, 7, 8, 10, 12]) ? 31 : (in_array($numeroMes4, [4, 6, 9, 11]) ? 30 : (($numeroMes4 === 2 && (($anio % 4 === 0 && $anio % 100 !== 0) || $anio % 400 === 0)) ? 29 : 28));
echo "El mes $numeroMes4 del año $anio tiene: $diasDelMes días\n";

// Ejercicio 17
$numero1 = floatval(readline("Introduce el primer número: "));
$numero2 = floatval(readline("Introduce el segundo número: "));
$menu = "Seleccione una operación:\n1) Suma\n2) Resta\n3) Multiplicación\n4) División\n";
$seleccion = intval(readline($menu));
switch ($seleccion) {
    case 1:
        $resultado = $numero1 + $numero2;
        echo "El resultado de la suma es: $resultado\n";
        break;
    case 2:
        $resultado = $numero1 - $numero2;
        echo "El resultado de la resta es: $resultado\n";
        break;
    case 3:
        $resultado = $numero1 * $numero2;
        echo "El resultado de la multiplicación es: $resultado\n";
        break;
    case 4:
        if ($numero2 != 0) {
            $resultado = $numero1 / $numero2;
            echo "El resultado de la división es: $resultado\n";
        } else {
            echo "Error: No se puede dividir entre cero.\n";
        }
        break;
    default:
        echo "Opción no válida. Por favor, selecciona un número entre 1 y 4.\n";
        break;
}

// Ejercicio 18 y 19
$entrada = intval(readline("Introduce un número entero entre 1 y 10: "));
if ($entrada >= 1 && $entrada <= 10) {
    echo "El número introducido es: $entrada\n";
    if ($entrada === 3) echo "¡Has acertado! El número es 3.\n";
} else {
    echo "Error: Debes introducir un número entero entre 1 y 10.\n";
}

// Ejercicio 20
$edad = intval(readline("Introduce tu edad: "));
echo "Mayor de edad: " . ($edad >= 18 ? "Sí" : "No") . "\n";

// Ejercicio 21
$nombre = readline("¿Cuál es tu nombre? ");
echo "Tu nombre es: " . ($nombre ?: "Desconocido") . "\n";

// Ejercicio 22
$dia = readline("Introduce el día (escribe 'entre semana' o 'fin de semana'): ");
echo "La hora de cierre de la tienda es: " . ($dia === "entre semana" ? "20:00" : "14:00") . "\n";

?>