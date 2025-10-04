<?php
/** 
 * 5.- Crea un programa que pregunte un número de mes. Si el número introducido está entre 1 y 12, 
*   mostrará un mensaje de aceptación: "Mes correcto". De lo contrario, se mostrará un mensaje de 
*   error: "Mes no válido". 
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
            color: #ffffff;
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>Introduce un numero de mes: </p>
    <form action="Ejercicio5.php" method="post">
        <label for="mes">Mes: </label>
        <input type="number" name="mes" placeholder="Introduce un número de mes" required>
        <input type="submit" value="Enviar"></form>
    <?php
        if (isset($_POST['mes']) && !empty($_POST['mes'])) {
            $mes = $_POST['mes'];
            $mensaje = "";

            if(esMesValido($mes)){
                $mensaje = "<p>Mes correcto</p>";
            }else{
                $mensaje = "<p>Mes no válido</p>";
            }
            echo $mensaje;
        }
        function esMesValido($mes){
            if($mes >= 1 && $mes <= 12){
                return true;
            }else{
                return false;
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>