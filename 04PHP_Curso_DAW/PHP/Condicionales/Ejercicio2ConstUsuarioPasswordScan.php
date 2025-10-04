<?php

// PHP_DAW/Condicionales/Ejercicio2Condicionales.php
/*
2.- Vamos a perfeccionar la aplicación anterior pidiendo un nombre de usuario y una contraseña 
para permitir el acceso al ordenador. 
El programa guardará el nombre de usuario y la contraseña necesarias en las constantes 
NOMBRE_REQUERIDO, PASSWORD_REQUERIDO. 
Si el nombre de usuario y la contraseña introducidas coinciden con los de estas constantes, 
aparecerá el mensaje "Acceso permitido". En caso contrario se escribirá "Acceso denegado".
*/


  // Crear las 2 constantes
define("NOMBRE_REQUERIDO", "pepe");
define("PASSWORD_REQUERIDO", "1234");

  // Pedir el nombre de usuario y la contraseña
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio2Condicionales</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color:rgb(164, 150, 126);
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio 2</h2>
    <form action="Ejercicio2ConstUsuarioPasswordScan.php" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" placeholder="Escribe tu nombre"><br><br>
        <label for="password">Password:</label>
        <input type="password" name="password" placeholder="Escribe tu password"><br><br>
        <input type="submit" value="Enviar">
    </form>
<?php
    
    if(isset($_POST['nombre']) && isset($_POST['password'])) {
        if(!empty($_POST['nombre']) && !empty($_POST['password'])) {
            echo ($_POST['nombre'] === NOMBRE_REQUERIDO && $_POST['password'] === PASSWORD_REQUERIDO) ?
                '<p>Acceso permitido</p>' : '<p>Acceso denegado</p>';
        }
    }else{
        echo '<p>Saliendo del programa...</p>';
    }

    //Tipos de metodo de envio un form GET o POST

    //para acceder a los GET se hace con $_GET
    //para acceder a los POST se hace con $_POST
    //si ignoramos que tipo de method utilizado podemos usar $_REQUEST (y use GET o POST lo leerá)
?>
</body>
</html>
