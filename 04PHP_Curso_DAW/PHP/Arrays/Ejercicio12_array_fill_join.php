<?php
/*
    12.- Escribe una aplicación que cree un array de 10 posiciones llamado matriculas y rellene todas 
    las posiciones con el valor por defecto "sinmatricula". Haz que después se muestren todos los 
    valores mediante un bucle for.
    */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
            color: #ffffff;
        }
        .boton{
            color: #7b7b7a;
            border-radius: 0.3em;
            padding: .5em 1em;
            border: none;
            background-color: #ffffff;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>Matrícluas</p>
    <?php
    
    // $matriculas = array(); // Array vacio
    $matriculas = array_fill(0, 10, "sinMatricula"); // Array con 10 posiciones con el valor "sinMatricula"
    

    // Creamos el array con array_fill y Mostrar el array con join para separarlo por comas
    echo join(" - ", $matriculas) . PHP_EOL;
    echo "<br><br>";
    
    // ForEach con indice
    foreach ($matriculas as $i => $matricula) {
        echo $i . ": " . $matricula . "<br>";
    }
    echo "<br><br>";

    // ForEach sin indice
    foreach ($matriculas as $matricula) {
        echo $matricula . PHP_EOL;
    }
    echo "<br><br>";

    // Crear un array de 10 posiciones e inicializarlo con el valor por defecto "sinmatricula"
    for ($i = 0; $i < count($matriculas); $i++) {
        echo ($i+1) . ": " . $matriculas[$i] . "<br>";
    }
?>
    <p>FIN</p>
</body>
</html>