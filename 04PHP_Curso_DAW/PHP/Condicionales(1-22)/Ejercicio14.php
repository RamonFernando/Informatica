<?php
/** 
 *  14.- Haz un programa que pida un  número de mes entre 1 y 12. A continuación devolverá el 
 *  nombre del mes correspondiente. 
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
    <form action="Ejercicio14.php" method="post">
        <input type="number" name="mes" placeholder="Introduce un mes">
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(isset($_POST['mes']) && !empty($_POST['mes'])) {
            $mes = intval($_POST['mes']); // Convertimos la entrada a un número entero
            
            switch($mes) {
                case 1:
                    echo '<p>Enero</p>';
                    break;
                case 2:
                    echo '<p>Febrero</p>';
                    break;
                case 3:
                    echo '<p>Marzo</p>';
                    break;
                case 4:
                    echo '<p>Abril</p>';
                    break;
                case 5:
                    echo '<p>Mayo</p>';
                    break;
                case 6:
                    echo '<p>Junio</p>';
                    break;
                case 7:
                    echo '<p>Julio</p>';
                    break;
                case 8:
                    echo '<p>Agosto</p>';
                    break;
                case 9:
                    echo '<p>Septiembre</p>';
                    break;
                case 10:
                    echo '<p>Octubre</p>';
                    break;
                case 11:
                    echo '<p>Noviembre</p>';
                    break;
                case 12:
                    echo '<p>Diciembre</p>';
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