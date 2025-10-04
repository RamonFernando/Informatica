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
    <p>Introduce los Precios de los Productos</p>
    <form action="Ejercicio9For.php" method="post">
    <label for="precioProducto">
        <?php
        $i = 0;
            while($i < 3){
                echo "<p><input type='number' step='0.01' name='precioProducto[]' placeholder='Introduce el precio ". ($i+1). "'></p>";
                $i++;
            }
        ?>
    </label>
        <input type="submit" class="boton" value="Enviar">
    </form>
    <?php
        if(isset($_POST['precioProducto']) && !empty($_POST['precioProducto'])) {
            $precioProducto = $_POST['precioProducto'];
            $total = 0;
            
            for($i = 0; $i < count($precioProducto); $i++) {
                echo "<p>Precio " . ($i + 1) . ": " . $precioProducto[$i] . " €</p>";
                $total += $precioProducto[$i];
            }
            echo "<p>Total: " . $total . " €</p>";
    }
    ?>
    
    <p>FIN</p>
</body>
</html>