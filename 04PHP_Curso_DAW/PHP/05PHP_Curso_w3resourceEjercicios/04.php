<? // 4. Cree un formulario HTML simple y acepte el nombre de usuario y muestre el nombre a través de la declaración de echo de PHP. ?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="04.php" method="post">
        <h3>Please input your Name</h3>
        <input type="text" name="name" placeholder="Input your Name">
        <input type="submit" value="Enviar">
    </form>
<?php

    // Obtener el formulario por POST
    if(isset($_POST['name'])) {
        $name = $_POST['name'];
        echo "<br>";
        echo "Hello " . strtoupper($name) . ".";
    }
    
?>
</body>
</html>