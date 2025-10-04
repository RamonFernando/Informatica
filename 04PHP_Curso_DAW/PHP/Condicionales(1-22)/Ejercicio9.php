<?php
/** 
 * 
 */
// Iniciamos la sesion
// Variable globales

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
    <h3>Introduce los siguientes datos para saber el precio final:</h3>
    <form action="Ejercicio9.php" method="post">
        <label for="precio">Precio: </label>
        <input type="number" step="0.01" name="precio" placeholder="Introduce el precio" min="0" required><br><br>
        <label for="unidades">Unidades: </label>
        <input type="number" name="unidades" placeholder="Introduce las unidades" min="1" required><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(isset($_POST['precio']) && isset($_POST['unidades'])) {
            if(!empty($_POST['precio']) && !empty($_POST['unidades'])) {
                
                // Variables
                $precio = number_format(floatval($_POST['precio']),2,);
                $unidades = $_POST['unidades'];
                $precio *= $unidades;
                $mensaje = "";
                echo "<p>Lista de datos introducidos:<br>
                    -----------------------------------</p>";
                if($precio >= 0 && $unidades >= 0){
                    
                    if($precio < 100){
                        $mensaje = "<p>Precio: " . $precio . " €</p>";
                    }elseif($precio >= 200){
                        $mensaje = "<p>Precio: " . $precio . " €</p>".
                        "<p>Descuento 15%:  " . number_format(($precio*0.15), 2) . " €</p>".
                        "<p>Precio con descuento: " . number_format(($precio*0.85), 2) . " €</p>";
                    }else{
                        $mensaje = "<p>Precio: " . $precio . " €</p>".
                        "<p>Descuento:  " . number_format(($precio*0.10), 2) . " €</p>".
                        "<p>Precio con descuento 10%: " . number_format(($precio*0.90), 2) . " €</p>";
                    }
                }else{
                    $mensaje = "Precio o unidades incorrectas";
                }
                
                echo $mensaje;
                echo "Gracias por su visita";
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>