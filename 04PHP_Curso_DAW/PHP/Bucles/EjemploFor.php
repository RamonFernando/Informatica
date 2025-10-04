<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Números</title>
</head>
<body>
    <form action="" method="post">
        <?php
        // Generamos 5 campos de entrada de número entero
        for ($i = 1; $i <= 5; $i++) {
            echo "Número $i: <input type='number' name='numero[]' required><br>";
        }
        ?>
        <input type="submit" value="Enviar">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $numeros = $_POST['numero'];

        // Validamos si todos los valores son enteros
        $fallo = false;
        foreach ($numeros as $numero) {
            if (!is_numeric($numero) || intval($numero) != $numero) {
                $fallo = true;
                break;
            }
        }

        // Mostramos el mensaje si hubo un fallo
        if ($fallo) {
            echo "<p>Has fallado.</p>";
        } else {
            echo "<p>Todos los números son válidos.</p>";
        }
    }
    ?>
</body>
</html>