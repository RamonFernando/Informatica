<?php
/** 
 * 4.- Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase 
* "Has fallado".
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
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>Introduce un número</p>
        <form action="Ejercicio4.php" method="post">
        <label for="numero">Numero: </label>
        <input type="text" name="numero"placeholder="Introduce un número">
        <input type="submit" value="Enviar">
    </form>
    <?php
        define("NUMERO_INTENTOS",5);
        define("NUMERO_SECRETO",6);
        $numero_secreto = 6;
        if(!empty($_POST['numero'])){
            $numero = $_POST['numero'];
            if($numero == NUMERO_SECRETO){
                echo '<p>Has acertado</p>';
            }else{
                echo '<p>Has fallado</p>';
            }
        }

        
    ?>
    <p>FIN</p>
</body>
</html>