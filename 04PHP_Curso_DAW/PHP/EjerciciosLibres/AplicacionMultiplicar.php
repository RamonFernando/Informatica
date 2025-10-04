<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla Multiplicar</title>
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
    <h2>Tabla de multiplicar</h2>
    <form action="AplicacionMultiplicar.php" method="post">
        <label for="numero">Numero: </label><br>
        <input type="number" name="numero" min="1" required placeholder="Numero"><br><br>
        <label for="numeroContador">Columnas: </label><br>
        <input type="number" name="numeroContador" min="1" required placeholder="Columnas"><br><br>
        <input type="submit" class="boton" value="Enviar"><br><br>
    </form>

<?php
    // Variables
    $numero = 10; // Filas
    $numeroContador = 10; // Columnas
    $contador = 1;

    // Comprobaciones de variables recibidas por POST
    if(!empty($_POST["numero"]) && !empty($_POST["numeroContador"])) {
        $numero = $_POST["numero"];// Introducimos el numero
        $numeroContador = $_POST["numeroContador"];// Introducimos el numero
    }

    echo"Puedes modificar las variables numero = " . $numero . " (filas) y numeroContador = " . $numeroContador . " (columnas) para cambiar el numero de filas y columnas.<br><br>";

    // Cabecera
    echo"Tablas de multiuplicar del " . $numero . " al " . $numeroContador . " Ejemplo: {$numero} x {$numeroContador} = " . ($numero*$numeroContador) . "</p><hr>";
    echo "<table border=1>"; // Crea la tabla
    echo "<tr>"; // Crea la fila
        
    // Algoritmo
        for ($cabecera = 1; $cabecera <= $numero; $cabecera++) {
            echo "<td>Tabla del " . $cabecera . "</td>";
        }
        echo "</tr>";

        for ($i=1; $i <= $numero ; $i++) {
            echo "<td>";
            for ($j=1; $j <= $numeroContador ; $j++) {
                echo "$i x $j = " . ($i*$j) . "<br>";
                if($j == 10 ) { // 
                    echo "<hr>";
                }
            }
            echo "</td>";
            $contador++;
        }
    echo "</table>";
?>
    <p>FIN</p>
</body>
</html>