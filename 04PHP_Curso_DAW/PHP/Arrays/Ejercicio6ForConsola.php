<?php
/**
 * 6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array. 
 * Haz que después se muestren todos los valores mediante un bucle for. 
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body {
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
    <form method="POST" action="">
        <p>Introduce los precios de 10 productos:</p>
        <?php
            // Generamos 10 campos de entrada para los precios
            for ($i = 0; $i < 10; $i++) {
                echo "<input type='number' step='0.01' name='precios[]' placeholder='Precio' " . ($i + 1) . "' required><br><br>";
            }
        ?>
        <input type="submit" value="Enviar">
    </form>

    <?php
        if (isset($_POST['precios']) && !empty($_POST['precios'])) {
            $precioProducto = $_POST['precios'];
            echo "<h3>Precios ingresados:</h3>";
            // Mostramos los precios ingresados
            foreach ($precioProducto as $index => $precio) { // Utilizamos foreach para recorrer el array
                echo "<p>Producto " . ($index + 1) . ": $" . number_format((float)$precio, 2) . "</p>";
            }
        }
    ?>

    <p>FIN</p>
</body>
</html>
