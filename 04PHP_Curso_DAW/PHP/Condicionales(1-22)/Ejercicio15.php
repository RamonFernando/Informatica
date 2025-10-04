<?php
/** 
 *  15.- Crea un programa que pida un número de mes entre 1 y 12. A continuación devolverá el 
 *  número de días de ese mes. Supón que no existen años bisiestos. 
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
    <p>...</p>
    <form action="Ejercicio15.php" method="post">
        <input type="number" name="mes" placeholder="Introduce un mes">
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(isset($_POST['mes']) && !empty($_POST['mes'])) {
            $mes = intval($_POST['mes']); // Convertimos la entrada a un número entero

            switch($mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12;
                    echo '<p>31 dias</p>';
                    break;
                case 4: case 6: case 9: case 11;
                    echo '<p>30 dias</p>';
                    break;
                case 2:
                    echo '<p>28 dias</p>';
                    break;
                default:
                    echo '<p>Mes no valido</p>';
                    break;
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>