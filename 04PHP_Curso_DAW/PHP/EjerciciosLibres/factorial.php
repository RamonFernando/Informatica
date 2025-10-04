<?php
/**
 * Enunciado: Escribe un programa en PHP que calcule el numero de un número dado. 
 * El número debe ser ingresado por el usuario.
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
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio Tabla de Multiplicar</h2>
    <p>Escribe un numero para dibujar un triangulo </p>
    <form action="factorial.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero" min="1" max="10" required placeholder="Numero">
        <input type="submit" value="Enviar">
    </form>
    <?php
        if(!empty($_POST["numero"])) {
            $numero = $_POST["numero"];// Introducimos el numero
            echo "<p>El factorial de $numero es: " . factorial($numero) . "</p>";
        }
        function factorial($numero) {
            if ($numero <= 1) {
                
                return 1;
            } else {
                // Factorial(5) (1)5*1 = 5 (2)5*2 = 10 (3)10*3 = 30 (4)30*4 = 120
                // Factorial(4) (1)4*1 = 4 (2)4*2 = 8 (3)8*3 = 24
                // Factorial(3) (1)3*1 = 3 (2)3*2 = 6 (3)6*3 = 18
                // 5! = 5*4*3*2*1 = 120
                return $numero * factorial($numero - 1);
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>