<!-- 1.- Escribe un programa que pregunte el precio de un producto. Si vale más de 80 €, le hará un descuento del 10%.
Se mostrará en pantalla el precio final. -->
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-size: 20px;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h2>Ejercicio 04.1_PreguntarNota</h2>
    <form action="" method="post">
        <label for="precio">Introduzca el precio del producto: </label><br>
        <input type="number" name="precio" placeholder="Introduzca el precio del producto" required>
        <input type="submit" value="Enviar">
    </form>

<?php
// Obtenemos la informacion del formulario
if($_SERVER['REQUEST_METHOD'] === 'POST'){ // Si el formulario ha sido enviado
    if(isset($_POST['precio']) && !empty($_POST['precio'])){ // Si el precio existe y es distinto de vacio
        
        // Obtenemos el precio del formulario y calculamos el descuento (precio con 2 decimales y float)
        $precioProducto = number_format(floatval($_POST['precio']));
        $descuento = number_format($precioProducto - ($precioProducto * 0.2), 2);

        if($precioProducto > 80){
            echo "<h3>El precio del producto es: $precioProducto</h3>";
            echo "<h3>El precio con descuento es: $descuento</h3>";
        }else{
            echo "<h3>El precio del producto es: $precioProducto</h3>";
        }
    }
}
?>
</body>
</html>