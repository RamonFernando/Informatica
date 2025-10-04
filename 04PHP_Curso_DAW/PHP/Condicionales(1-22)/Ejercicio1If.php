<?php
/** 
 * 1.- Crea un programa que pida la temperatura de un reactor nuclear. Si ésta supera los 120ºC, se 
* mostrará en pantalla el mensaje: "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS! 
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
    <h2>Ejercicio 1</h2>
    <p>...</p>
    <form action="Ejercicio1If.php" method="post">
        <label for="temperatura">Temperatura</label>
        <input type="number" name="temperatura" required>
        <input type="submit" value="Enviar">
    </form>
    <?php
        $TEMPERATURA_CRITICA = 120;
        
        if(!empty($_POST['temperatura'])){
            $temperatura = $_POST['temperatura'];
            
            if($temperatura > $TEMPERATURA_CRITICA) {
                echo'<p>TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!</p>';
            }else{
                echo '<p>La temperatura del reactor es segura.</p>';
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>