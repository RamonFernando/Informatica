<?php
/** 
 *  4.- Crea un programa que pida al usuario una contraseña. Si escribe "1234" el programa responderá 
 *  "Acceso concedido.".  
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
    <form action="Ejercicio4.php" method="post">
        <label for="password">Password:</label>
        <input type="text" name="password" placeholder="Introduce el Password" required>
        <input type="submit" value="Enviar">
    </form>
    <?php
        if(isset($_POST['password'])){
            if(!empty($_POST['password'])) {
                $password = $_POST['password'];
                if($password === '1234') {
                    echo '<p>Acceso concedido</p>';
                } else {
                    echo '<p>Acceso denegado</p>';
                }
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>