<?php
/**
 * 3.- Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o 
 * "No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String 
 * el resultado y mostrando después esta variable.
 */
    // $_POST['numero'] = "";
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio3Condicionales</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #ded6c9;
            padding: 20px;
        }
    </style>
</head>

<body style="text-align: center; background-color:rgb(161, 141, 107)">
    <h2>Ejercicio 3</h2>
    <p>Introduce un numero para saber si es PAR o IMPAR</p>
    <form action="Ejercicio3ParesImpares.php" method="post">
        <label for="nuemro">Numero:</label>
        <input type="text" name="numero" id="numero" placeholder="Escribe un numero">
        <input type="submit" value="Enviar">

    </form>

    <?php
        
        if (isset($_POST['numero'])) {
            if(!empty($_POST['numero'])){
                echo ($_POST['numero'] % 2 == 0) ?  '<p>PAR</p>' : '<p>IMPAR</p>';
            }else{
                echo "<p>Introduce un número... Vuelve a probar</p>";
            }
            
            
        }
    ?>
</body>

</html>