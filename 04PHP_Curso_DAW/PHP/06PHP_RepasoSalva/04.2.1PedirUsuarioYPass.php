<!-- 2.- Crea un programa que pida al usuario un usuario y una contraseña. Si escribe java y "1234"
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
    <form action="04.2.1PedirUsuarioYPass.php" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" placeholder="Introduce el Username" required>
        <label for="password">Password:</label>
        <input type="text" name="password" placeholder="Introduce el Password" required>
        <input type="submit" value="Enviar">
    </form>

<?php
    if($_SERVER['REQUEST_METHOD'] === 'POST'){
        if(isset($_POST['username']) && !empty($_POST['username'])){
            if(isset($_POST['password']) && !empty($_POST['password'])){
            $username = $_POST['username'];
            $password = $_POST['password'];
            
            echo ($username === 'java' && $password === '1234') ?
                '<p>Acceso concedido</p>' : '<p>Acceso denegado</p>';
            }
        }
    }

?>
</body>
</html>