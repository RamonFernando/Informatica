<?php

// Switch

// Ejemplo 1
$dia = "lunes";

switch ($dia) {
    case "lunes":
        echo "Hoy es lunes";
        break;
    case "martes":
        echo "Hoy es martes";
        break;
    case "miercoles":
        echo "Hoy es miercoles";
        break;
    case "jueves":
        echo "Hoy es jueves";
        break;
    case "viernes":
        echo "Hoy es viernes";
        break;
    case "sabado":
        echo "Hoy es sabado";
        break;
    case "domingo":
        echo "Hoy es domingo";
        break;
    default:
        echo "No es ningun dia de la semana";
        break;
}
// Ejemplo 2
// Swich con numeros enteros agrupando casos
echo "\n";
$dia = 3;
switch ($dia) {
    case 1: case 2: case 3: case 4: case 5:
        echo "Hoy es dia entre semana";
        break;
    case 6: case 7:
        echo "Hoy es fin de semana";
        break;
    default:
        echo "No es ningun dia de la semana";
        break;
}

// Ejemplo 2
// introduciendo el dia de la semana con readline
echo "\n";
$dia = readline("Introduce el dia de la semana: ");
switch ($dia) {
    case "lunes":
        echo "Hoy es lunes";
        break;
    case "martes":
        echo "Hoy es martes";
        break;
    case "miercoles":
        echo "Hoy es miercoles";
        break;
    case "jueves":
        echo "Hoy es jueves";
        break;
    case "viernes":
        echo "Hoy es viernes";
        break;
    case "sabado":
        echo "Hoy es sabado";
        break;
    case "domingo":
        echo "Hoy es domingo";
        break;
    default:
        echo "No es ningun dia de la semana";
        break;
}

// Ejemplo 3
// Agrupando casos
echo "\n";
$dia = readline("Introduce el dia de la semana: ");
switch ($dia) {
    case "lunes":
    case "martes":
    case "miercoles":
    case "jueves":
    case "viernes":
        echo "Hoy es dia laboral";
        break;
    case "sabado":
    case "domingo":
        echo "Hoy es fin de semana";
        break;
    default:
        echo "No es ningun dia de la semana";
        break;
}

// Ejemplo 4
// Introduciendo nivel de dificultad
echo "\n";
$nivel = intval(readline("Introduce el nivel de dificultad: "));
switch ($nivel) {
    case 1:
        echo "Facil";
        break;
    case 2:
        echo "Medio";
        break;
    case 3:
        echo "Dificil";
        break;
    default:
        echo "No es ningun nivel de dificultad";
        break;
}

// Ejemplo 5
// Introduciendo nivel de dificultad con readline
echo "\n";
$nivel = readline("Introduce el nivel de dificultad: ");
switch ($nivel) {
    case "principante": case "basico": case "intermedio": 
        echo "Este nivel es para programadores becarios";
        break;
    case "intermedio-alto":
        echo "Este nivel es para programadores junior";
        break;
    case "avanzado":
        echo "Este nivel es para programadores junior-middle";
        break;
    case "profesional":
        echo "Este nivel es para programadores senior";
        break;
    default:
        echo "No es ningun nivel de dificultad";
        break;
}
   
?>