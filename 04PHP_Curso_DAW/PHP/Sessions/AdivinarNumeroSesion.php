<?php
/**
 *
 */
// Iniciamos la sesion
session_start();
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
    <p>Introduce un número entre 1 y 10 (3 intentos)</p>
    <form action="AdivinarNumeroSesion.php" method="post">
        <label for="numero">Numero: </label>
        <input type="number" name="numero"placeholder="Introduce un número">
        <input type="submit" value="Enviar">
    </form>
    <?php
    // Inicializamos las variables de sesión en el primer acceso
    if(!isset($_SESSION['contador']) && !isset($_SESSION['numero_aleatorio'])){ // Si es diferente de creado (vacio), crear las variables
        $_SESSION['contador'] = 1; // Contador
        $_SESSION['numero_aleatorio'] = rand(1, 10); // numero aleatorio
    }

    if(isset($_POST['numero'])){
        if(empty($_POST['numero'])){
            echo "<p>Por favor, introduce un número antes de enviar.</p>";
        }else{
            $numero = intval( $_POST['numero']);

            if($numero < 1 || $numero > 10){
                echo "<p>Por favor, introduce un número entre 1 y 10.</p>";
            }else{
                // Comprobamos si el usuario ha adivinado el número
                if ($numero === $_SESSION['numero_aleatorio']) {
                    echo "<p>¡HAS ACERTADO! al " . $_SESSION['contador'] . "º intento.El número era: " . $_SESSION['numero_aleatorio'] . "</p>";
                    session_unset(); // Reiniciamos la sesión para empezar un nuevo juego
                    session_destroy();
                }else{
                    
                    if($_SESSION['contador'] < 3){
                        echo "<p>¡HAS FALLADO!</p>";
                        echo "Intento: " . ($_SESSION['contador'] . " de 3");
                        $_SESSION['contador']++; // Incrementamos el contador de intentos  
                    }else{
                        echo "<p>HAS PERDIDO</p>";
                        echo "<p>El numero correcto era: " . $_SESSION['numero_aleatorio'] ."</p>";
                        session_unset(); // Reiniciamos la Sesión para empezar un nuevo juego
                        session_destroy();
                        }
                    }
                }
            }

        }
    ?>
    <p>FIN</p>
</body>
</html>