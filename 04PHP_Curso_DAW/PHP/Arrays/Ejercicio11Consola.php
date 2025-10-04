<?php
session_start(); // Para mantener la lista de órdenes en la sesión

if (!isset($_SESSION['ordenes'])) {
    $_SESSION['ordenes'] = []; // Inicializamos el array en la sesión
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $entrada = trim($_POST['orden']); // Recibimos la orden del formulario

    if ($entrada === "ejecutar") {
        // Mostramos las órdenes y limpiamos la sesión
        $ordenes = $_SESSION['ordenes'];
        $_SESSION['ordenes'] = [];
    } else {
        // Agregamos la orden al array en la sesión
        if (count($_SESSION['ordenes']) < 1000) {
            $_SESSION['ordenes'][] = $entrada;
        } else {
            $mensaje = "Límite de órdenes alcanzado.";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Órdenes del Robot</title>
</head>
<body>
    <h1>Órdenes del Robot</h1>

    <form method="post">
        <label for="orden">Ingresa una orden:</label>
        <input type="text" id="orden" name="orden" required>
        <button type="submit">Enviar</button>
    </form>

    <?php if (isset($mensaje)): ?>
        <p style="color: red;"><?= $mensaje ?></p>
    <?php endif; ?>

    <?php if (isset($ordenes)): ?>
        <h2>Órdenes del Robot:</h2>
        <ol>
            <?php foreach ($ordenes as $orden): ?>
                <li><?= htmlspecialchars($orden) ?></li>
            <?php endforeach; ?>
        </ol>
    <?php endif; ?>
</body>
</html>
