<?php
/** 
 *  6.- Crea una aplicación que pregunte el precio de un producto y el número de unidades compradas. 
 *  Si el coste de la compra es mayor de 75 €, se le hará un 15% de descuento. En caso contrario, se le 
 *  hará sólo un 5% de descuento.
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
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>Introduce un numero de $precio: </p>
    <form action="Ejercicio6.php" method="post">
        <label for="$precio">Precio: </label>
        <input type="number" step='0.01' name="precio" placeholder="Introduce un  precio" required>
        <br><br>
        <label for="unidades">Unidades: </label>
        <input type="number" name="unidades" placeholder="Introduce las unidades" required>
        <br><br>
        <input type="submit" value="Enviar">
    </form>
    <?php
        if (isset($_POST['precio']) && isset($_POST['unidades'])) {
            if(!empty($_POST['precio']) && !empty($_POST['unidades'])) {
            
            // Declaramos las variables
            $precio = $_POST['precio'];
            $unidades = $_POST['unidades'];
            $precio = number_format($precio, 2); // Damos formato al precio de float, 2 decimales
            $precio *= $unidades;
            $mensaje = "";

            // Hacemos la comparacion de precios para aplicar el descuento
            if($precio > 75){
                $mensaje = "<p>Precio: " .  $precio . " €
                <br>Descuento del 15% (" . number_format($precio) * 0.15 .  " €)
                <br>Precio con Descuento: " . number_format($precio) * 0.85 . " €</p>";
            }else{
                $mensaje = "<p>Precio: " .  $precio . " €
                <br>Descuento del 5% (" . number_format($precio) * 0.05 .  " €)
                <br>Precio con Descuento: " . number_format($precio) * 0.95 . " €</p>";
            }
            // Mostramos el resultado
            echo $mensaje;
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>