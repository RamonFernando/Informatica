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
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio Tabla de Multiplicar</h2>
    <p>Escribe un numero para dibujar un triangulo </p>
    <form action="tablaMultiplicar.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero" min="1" max="10" required placeholder="Numero">
        <input type="submit" value="Enviar">
    </form>
    <?php
        if(!empty($_POST["numero"])) {
            $numero = $_POST["numero"];// Introducimos el numero
            $contador = 1;
            $resultado = 0;
            while($contador <= 10){
                $resultado =  $numero * $contador;
                echo"<p>{$numero} x {$contador} = {$resultado}</p>";
                $contador++;
            }
            
        }
    ?>
    <p>FIN</p>
</body>
</html>
