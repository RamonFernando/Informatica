<?php
/** 
 *  2.- Escribe un programa que pregunte el precio de un producto. Si vale más de 80 €, le hará un
 *  descuento del 10%. Se mostrará en pantalla el precio final.
 *  3.- Modifica el ejercicio anterior de manera que si la compra es inferior a 5 €, se sumen 2 euros a la 
 *  compra del factura por gastos de gestión. 
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
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <form action="Ejercicio3ifElse.php" method="post">
        <label for="precio">Precio:</label>
        <input type="text" name="precio" placeholder="Introduce el precio" required>
        <input type="submit" value="Enviar">
    </form>
    <?php

        if(isset($_POST["precio"])) {
            if(!empty($_POST["precio"])) {
                $precio = $_POST["precio"];
                
                if($precio < 0) {
                    echo "<p>El precio no puede ser negativo</p>";
                } else {
                    if($precio > 80){
                        echo "<p>Precio: " . $precio . " €</p>";
                        echo"Descuento del 10%: ". $precio*0.10 . " €";
                        echo "<p>El precio con descuento es: " . $precio * 0.90 . " €</p>";
                    }else{
                        echo "<p>Precio: " . $precio . " €</p>";
                        echo"Descuento del 5%: ". $precio*0.05 . " €";
                        echo "<p>El precio con descuento es: " . $precio * 0.95 . " €</p>";
                    }
                }
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>