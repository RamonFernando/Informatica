<?php
    /**
     *  5.- Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En primer
* lugar se mostrará un menú:
* (1) Francés
* (2) Inglés
* (3) Alemán
* (4) Italiano
* El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación, 
* parecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si 
* scribe otro número, el mensaje se mostrará en español.
* Utiliza la instrucción switch
     */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 5 switch</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT'; 
            background-color: #ded6c9; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicio 5</h2>
    <p>Selecciona el idioma de la frase de saludo</p>
    <form action="Ejercicio5Swich.php" method="post">
        <label for="idioma">Idioma:</label>
        <select name="idioma" id="idioma">
            <option value="en">Inglés</option>
            <option value="es">Español</option>
            <option value="fr">Frances</option>
            <option value="de">Alemán</option>
            <option value="it">Italiano</option>
            
        </select>
        <input type="submit" value="Enviar">
    </form>
    <?php
        if (!empty($_POST['idioma'])) { // resive por parametro el idioma (name=idioma)
            $idioma = $_POST['idioma'];
            switch ($idioma) {
                case 'fr':
                    echo "<p>Bonjour</p>";
                    break;
                case 'en':
                    echo "<p>Hello</p>";
                    break;
                case 'de':
                    echo "<p>Guten Morgen</p>";
                    break;
                case 'it':
                    echo "<p>Ciao</p>";
                    break;
                case "es":
                    echo "<p>Hola</p>";
                    break;
                default:
                    echo "<p>Hola</p>";
                    break;
            }
        } else {
            echo "<p>Selecciona un idioma</p>";
        } 
    ?>
    
</body>
</html>