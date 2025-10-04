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
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        h1 {
            color: #2c3e50;
        }

        form {
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            width: 100%;
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: calc(100% - 22px);
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 3px;
            margin-bottom: 10px;
        }

        button {
            background: #3498db;
            color: #fff;
            border: none;
            padding: 10px 15px;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background: #2980b9;
        }

        ol {
            background: #fff;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            width: 100%;
            list-style: decimal inside;
        }

        li {
            margin: 5px 0;
        }

        p {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Órdenes del Robot</h1>

    <form method="post">
        <label for="orden">Ingresa una orden:</label>
        <input type="text" id="orden" name="orden" required placeholder="izquierda, derecha, etc.">
        <button type="submit">Enviar</button>
    </form>

    <?php if (isset($mensaje)): ?>
        <p><?= $mensaje ?></p>
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
