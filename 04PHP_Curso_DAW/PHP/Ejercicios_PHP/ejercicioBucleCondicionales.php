<?php
// 1 y 2

$numeroAleatorio = rand(1, 10);
$intentos = 0;
$maxIntentos = 3;
$puntuacion = 0;

while ($intentos < $maxIntentos) {
    $adivinanza = (int)readline("Adivina el número entre 1 y 10: ");

    $intentos++;

    if ($adivinanza === $numeroAleatorio) {
        if ($intentos === 1) {
            $puntuacion = 10;
        } elseif ($intentos === 2) {
            $puntuacion = 5;
        } elseif ($intentos === 3) {
            $puntuacion = 2;
        }

        echo "¡Felicidades! Has adivinado el número $numeroAleatorio en $intentos intentos. Tu puntuación es: $puntuacion\n";
        break;
    } else {
        echo "Incorrecto. Intenta de nuevo.\n";
    }
}

if ($intentos === $maxIntentos) {
    echo "Lo siento, no has adivinado el número. Era $numeroAleatorio. Tu puntuación es: $puntuacion\n";
}

// 3 y 4

while (true) {
    $num1 = rand(1, 100);
    $num2 = rand(1, 100);
    $suma = $num1 + $num2;
    $respuestaUsuario = (int)readline("¿Cuál es la suma de $num1 + $num2? ");

    if ($respuestaUsuario === $suma) {
        echo "¡Correcto! Has acertado.\n";
    } else {
        echo "Incorrecto. La respuesta correcta es $suma.\n";
    }

    $continuar = readline("¿Quieres continuar (s/n)? ");
    if (strtolower($continuar) !== 's') {
        break;
    }
}

echo "Gracias por jugar. ¡Hasta la próxima!\n";

// 5 y 6

do {
    $numero = (int)readline("Introduce un número para ver su tabla de multiplicar (0 para salir): ");

    if ($numero === 1) {
        echo "No seas tonto.\n";
        continue;
    }

    if ($numero !== 0) {
        echo "Tabla de multiplicar del $numero:\n";
        for ($i = 1; $i <= 10; $i++) {
            $resultado = $numero * $i;
            echo "$numero x $i = $resultado\n";
        }
    } else {
        echo "Tabla de multiplicar del 0:\n";
        for ($i = 1; $i <= 10; $i++) {
            echo "0 x $i = 0\n";
        }
    }
} while ($numero !== 0);

echo "Gracias por usar la calculadora de tablas de multiplicar. ¡Hasta la próxima!\n";
?>