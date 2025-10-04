<?php
/** 
*   11.- Crea un programa que almacene las órdenes que debe seguir un robot en un array de 1000 
*   elementos. Las órdenes son palabras escritas por el usuario en la consola como: 
*   • izquierda
*   • derecha
*   • arriba
*   • abajo
*   • matar
*   El programa parará de pedir órdenes cuando el usuario escriba "ejecutar". Entonces mostrará la lista 
*   de comandos que debe seguir el robot.
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
    <form action="Ejercicio11.php" method="post">
        <?php
        echo "<p>" . "Escribe una orden" . "</p>";
            $i = 1;
            while( $i <= 10){
                echo "<input type='text' name='orden[]' placeholder='Introduce la " . $i . " orden '><br><br>";
                $i++;
            }
        ?>
        <input type="submit" name="enviar" class="boton" value="Enviar" >
    </form>
    <?php
        if(isset($_POST['orden'])){
            define("EJECUTAR","ejecutar");
            $ordenes = $_POST['orden'];
            $i = 0;
            while($i < 10){
                if($ordenes[$i] == EJECUTAR){
                    echo "<p>" . "Ejecutando..." . "</p>";
                    break;
                }
                echo "<p>" . "Orden " . ($i+1) . ": " . $ordenes[$i] . "</p>";
            $i++;
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>