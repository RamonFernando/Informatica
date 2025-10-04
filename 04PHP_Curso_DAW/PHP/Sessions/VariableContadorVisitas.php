<?php
// Iniciar la sesión al principio del archivo
session_start();
?>
<?php
/** 
 * 
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
    <p>...</p>
    <?php
        // Comprobar si ya se ha almacenado el nombre de usuario en la sesión
        if (!isset($_SESSION['usuario'])) {
            // Si no existe, lo establecemos
            $_SESSION['usuario'] = "Ramon";
            $_SESSION['visitas'] = 1; // Primera visita
        } else {
            // Si ya existe, aumentamos el contador de visitas
            $_SESSION['visitas']++;
        }

        // Mostrar el nombre del usuario y el número de visitas
        echo "Bienvenido, " . $_SESSION['usuario'] . "<br>";
        echo "Esta es tu visita número " . $_SESSION['visitas'];

        // Puedes eliminar el usuario y el contador de visitas así:
        // session_unset(); // Esto borra todas las variables de sesión
        // session_destroy(); // Esto destruye completamente la sesión
        // unset($_SESSION['usuario']);
        // Configurar para usar cookies seguras y solo accesibles en HTTP
        // ini_set('session.cookie_secure', 1); configura las cookies para que solo se accedan en HTTPS
        // ini_set('session.cookie_httponly', 1); configura las cookies para que no puedan ser accedidas desde JavaScript y evitar ataques (XSS)
    ?>
    <p>FIN</p>
</body>
</html>