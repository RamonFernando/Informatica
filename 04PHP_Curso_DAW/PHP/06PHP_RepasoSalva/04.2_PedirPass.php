<!-- 2.- Crea un programa que pida al usuario una contraseña. Si escribe "1234"
el programa responderá "Acceso concedido." -->
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
    <h2>Ejercicio 04.2_PedirPass</h2>
    <form action="04.2_PedirPass.php" method="post">
        <label for="password">Password:</label>
        <input type="text" name="password" placeholder="Introduce el Password" required>
        <input type="submit" value="Enviar">
    </form>

<?php
    if($_SERVER['REQUEST_METHOD'] === 'POST'){
        if(isset($_POST['password']) && !empty($_POST['password'])){
            $password = $_POST['password'];
            echo ($password === '1234') ? '<p>Acceso concedido</p>' : '<p>Acceso denegado</p>'; //if($password === '1234') ? '<p>Acceso concedido</p>' : '<p>Acceso denegado</p>';
            
        }
    }

?>
</body>
</html>