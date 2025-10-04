<?php
/**
 * Enunciado: Escribe un programa en PHP que verifique si un número dado es primo o no. 
 * El número debe ser ingresado por el usuario.
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
    <h2>Numero Primo</h2>
    <p>Ingresa un numero</p>
    <form action="NumeroPrimo.php" method="post">
        <label for="num"></label>
        <input type="number" name="num" required placeholder="Numero">
        <input type="submit" value="Enviar">
    </form>
    <?php
        if (!empty($_POST['num'])) {
            $numero = $_POST['num'];
            $boolean = true;
            for ($i = 2; $i < sqrt($numero); $i++) {
                if($numero % $i == 0) {
                    $boolean = false;
                    break;
                }
            }
            ($boolean) ? print "<p>El {$numero} es primo</p>": print "<p>El {$numero} no es primo</p>";
            
        }
    ?>
    <p>FIN</p>
</body>
</html>