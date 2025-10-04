<!-- 3.- Crea una función llamada diaSemana() que devuelva de forma aleatoria un día
de la semana (de lunes a domingo). A continuación, utiliza esa función para mostrar
por pantalla un mensaje del tipo: "El próximo <día aleatorio> voy al cine." -->
<?php

function diaSemana(){

    $dia = rand(1, 7);

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

echo "El proximo " . diaSemana() . " voy al cine.";
?>