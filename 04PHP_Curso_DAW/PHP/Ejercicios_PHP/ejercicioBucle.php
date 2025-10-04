<?php

// e1 y e2

$contador = 5;
$suma = 0;

while ($contador <= 1000) {
    $suma += $contador;
    $contador += 5;
}

echo "La suma de todos los múltiplos de 5 entre 1 y 1000 es: $suma\n";

// e3

$exponente = 0;
$potencias = [];

do {
    $potencia = pow(3, $exponente);
    
    if ($potencia < 12000) {
        $potencias[] = $potencia;
        echo "3^$exponente = $potencia\n";
    }
    
    $exponente++;
} while (pow(3, $exponente) < 12000);

echo "Potencias de 3 menores que 12000: " . implode(", ", $potencias) . "\n";

// e4

for ($i = 0; $i < 5; $i++) {
    $numero = (int)readline("Introduce un número entero: ");
}

echo "Has fallado\n";

// e5

$numeroAleatorio = rand(1, 10);
$intentos = 0;
$adivinado = false;

do {
    $adivinanza = (int)readline("Adivina el número entre 1 y 10: ");

    $intentos++;

    if ($adivinanza === $numeroAleatorio) {
        $adivinado = true;
        echo "¡Felicidades! Has adivinado el número.\n";
    } else {
        echo "Incorrecto. Intenta de nuevo.\n";
    }

} while (!$adivinado && $intentos < 3);

if (!$adivinado) {
    echo "Lo siento, no has adivinado el número. Era $numeroAleatorio.\n";
}

?>