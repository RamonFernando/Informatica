<?php
    /**
     * 4.- Un profesor quiere una aplicación que muestre las notas de un examen con diferente color según
    * este esquema:
    * • Nota < 4: Rojo.
    * • 4 <= Nota < 5: Verde.
    * • Nota >= 5: Azul.
    * El programa pedirá una nota (puede tener decimales) y devolverá el nombre del color a usar. Utiliza
    * las instrucciones if y else if.
    */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 4</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT'; 
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body >
    <h2>Ejercicio 4 "NOTAS"</h2>
    <h3>Introduce una nota</h3>
    <form action="Ejercicio4IfElse.php" method="post">
        <label for="nota">Nota:</label>
        <input type="text" name="nota" id="nota" placeholder="Escribe una nota">
        <input type="submit" value="Enviar">
    </form>

    <?php
        if (!empty($_POST['nota'])) { // si el usuario ha introducido una nota $_POST['nota']
            $nota = $_POST['nota']; // la nota introducida por el usuario = $nota
            echo "<p>La nota introducida es: </p>";
            if ($nota < 5) {
                echo "<p style='color:red;'>$nota</p>";
            } elseif ($nota >= 5 && $nota < 7) {
                echo "<p style='color:green;'> $nota</>";
            } else {
                echo "<p style='color:blue;'> $nota</p>";
            }
        }else {
            echo "<p>No has introducido ninguna nota</p>";
        }
    ?>
</body>
</html>