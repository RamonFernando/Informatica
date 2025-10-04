<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px"
        }
    </style>
</head>
<body>
    <h1>Leccion 1</h1>
        <p>Introduce tu edad</p>
        <form action="Leccion1.php" method="post">
            <input type="number" name="edad" placeholder="Introduce tu edad">
            <input type="submit" name="boton" value="Enviar">
            </form>
        <p id="textoSalida">Resulado</p>
    <?php

        if(isset($_POST['boton']) && !empty($_POST['edad'])){
            $edad = $_POST['edad'];
            
                if($edad >= 0 && $edad <= 130 ){
                    if($edad < 18){
                        echo "<p>Es menor de edad</p>";
                    }else{
                        echo "<p>Es mayor de edad</p>";
                    }
                }else{
                    echo "<p>La edad introducida no es correcta</p>";
                }

                
            
        }

    ?>
</body>
</html>