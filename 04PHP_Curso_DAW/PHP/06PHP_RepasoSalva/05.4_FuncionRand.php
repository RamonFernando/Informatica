<!-- 3.- Crea una función llamada diaSemana() que devuelva de forma aleatoria un día
de la semana (de lunes a domingo). A continuación, utiliza esa función para mostrar
por pantalla un mensaje del tipo: "El próximo <día aleatorio> voy al cine." -->
<?php

function diaSemana(){

    $dia = rand(1, 7);
    $actividad = rand(1, 9);

    switch($dia){
        case 1:
            $dia = "Lunes";
            break;
        case 2:
            $dia = "Martes";
            break;
        case 3:
            $dia = "Miercoles";
            break;
        case 4:
            $dia = "Jueves";
            break;
        case 5:
            $dia = "Viernes";
            break;
        case 6:
            $dia = "Sabado";
            break;
        case 7:
            $dia = "Domingo";
            break;
    }
    return $dia;
}

function actividadSemana(){

    $actividad = rand(1, 7);

    switch($actividad){
        case 1:
            $actividad = "Cine";
            break;
        case 2:
            $actividad = "Merendar";
            break;
        case 3:
            $actividad = "Cenar";
            break;
        case 4:
            $actividad = "Playa";
            break;
        case 5:
            $actividad = "Peli en casa";
            break;
        case 6:
            $actividad = "Dar una vuelta";
            break;
        case 7:
            $actividad = "Manicura o depicura";
            break;
        case 8:
            $actividad = "Cocinar";
            break;
        case 9:
            $actividad = "Jugar";
            break;
        case 10:
            $actividad = "Estudiar";
            break;
    }
    return $actividad;
}

echo "El proximo " . diaSemana() . " voy a " . actividadSemana() . ".";
?>