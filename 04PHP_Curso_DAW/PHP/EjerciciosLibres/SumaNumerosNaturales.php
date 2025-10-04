<?php
/**
* Enunciado: Escribe un programa en PHP que calcule la suma de los 
* primeros n números naturales. El valor de n debe ser ingresado por el usuario.
 */
?>
<?php
/** 
 * 
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
    <h2>Ejercicios</h2>
    <p>...</p>
    <form action="SumaNumerosNaturales.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero" placeholder="Numero">
        <input type="submit" value="Enviar">
    </form>
    <?php
        if(!empty($_POST['numero'])){
            $numero = $_POST['numero'];
            $suma = 1;
            echo "<p>Ejemplo: </p>";
            for($i = 1; $i <= $numero; $i++){
                
                echo "<p>{$suma} = {$suma} + {$i}</p>";
                $suma += $i;
            }
            echo "<p>La suma de los {$numero} primeros numeros naturales es {$suma}</p>";
        }
    ?>
    <p>FIN</p>
</body>
</html>