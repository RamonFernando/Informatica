<?php
/** 
 *  10.- Crea un programa que lea los precios de hasta cien productos y los guarde en un array llamado 
 *  compra. Mientras los precios se van pidiendo al usuario, si éste introduce el valor 0, el programa 
 *  entenderá que se ha terminado la compra, y mostrará todos los precios introducidos hasta el
 *  momento (no las posiciones vacías).
 */
/*session_start();
if (isset($_SESSION["precio"]) && !empty( $_SESSION["precio"] )) {
    $precio = ($_SESSION['precio']);
    $_SESSION['contador'] = 1;
    $_SESSION['contador']++;
    
}*/
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
    <p>Arrays incompletos</p>
    <form action="Ejercicio10ArrayIncompleto.php" method="post">
        <?php
        echo "<label for='precioProducto'>Precios</label><br><br>";
        $i = 0;
        while ($i < 5){
            echo "<input type='text' name='precioProducto[]' placeholder = 'Introduce el precio " . ($i+1) .  "'><br><br>";
            $i++;
        }
        ?>
        <input type="submit" name="enviar" class="boton" value="Enviar" >
    </form>
    <?php
        if(isset($_POST['precioProducto']) && !empty($_POST['precioProducto'])) {
            $precioProducto = $_POST['precioProducto'];
            $precioTotal = 0;
            echo '<p>Precio de los productos</p>';
            for ($j=0; $j < count($precioProducto) ; $j++) {
                
                if($precioProducto[$j] < 0){
                    echo '<p>El precio no puede ser negativo</p>';
                } else{
                    if($precioProducto[$j] == 0){
                        break;
                    }else{
                        echo "<p>". $precioProducto[$j]." €<br></p>";
                        $precioTotal += $precioProducto[$j];
                    }
                }
            }
            echo "<p>Precio total: " . $precioTotal . " €</p>";
            // session_unset();
        }
    ?>
    <p>FIN</p>
</body>
</html>