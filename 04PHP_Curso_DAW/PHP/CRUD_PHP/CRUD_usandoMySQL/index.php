<?php
// Conexión a la base de datos
$host = 'localhost';
$dbname = 'crud_php';
$username = 'root';
$password = '';

$conn = new mysqli($host, $username, $password, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

// Crear un nuevo elemento
if (isset($_POST['create'])) {
    $name = $_POST['name'];
    if (!empty($name)) {
        $sql = "INSERT INTO items (name) VALUES ('$name')";
        $conn->query($sql);
    }
}

// Actualizar un elemento
if (isset($_POST['update'])) {
    $id = $_POST['id'];
    $name = $_POST['name'];
    $sql = "UPDATE items SET name = '$name' WHERE id = $id";
    $conn->query($sql);
}

// Eliminar un elemento
if (isset($_GET['delete'])) {
    $id = $_GET['delete'];
    $sql = "DELETE FROM items WHERE id = $id";
    $conn->query($sql);
}

// Leer los elementos
$sql = "SELECT * FROM items";
$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD en PHP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: #f4f4f9;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }

        input {
            width: 70%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        button {
            padding: 10px 15px;
            background: #3498db;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background: #2980b9;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: center;
        }

        .delete {
            color: #e74c3c;
            text-decoration: none;
            font-weight: bold;
        }

        .delete:hover {
            text-decoration: underline;
        }

        /* Modal */
        .modal {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.5);
            justify-content: center;
            align-items: center;
        }

        .modal-content {
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>CRUD en PHP</h1>

        <!-- Formulario para Crear un nuevo elemento -->
        <form method="POST" class="form">
            <input type="text" name="name" placeholder="Escribe un elemento" required>
            <button type="submit" name="create">Agregar</button>
        </form>

        <!-- Tabla para mostrar los elementos -->
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <?php while ($row = $result->fetch_assoc()): ?>
                    <tr>
                        <td><?= $row['id'] ?></td>
                        <td><?= $row['name'] ?></td>
                        <td>
                            <a href="?delete=<?= $row['id'] ?>" class="delete">Eliminar</a>
                            <button onclick="editarElemento(<?= $row['id'] ?>, '<?= $row['name'] ?>')">Editar</button>
                        </td>
                    </tr>
                <?php endwhile; ?>
            </tbody>
        </table>
    </div>

    <!-- Modal para Editar un elemento -->
    <div id="editModal" class="modal">
        <div class="modal-content">
            <form method="POST">
                <h2>Editar Elemento</h2>
                <input type="hidden" name="id" id="editId">
                <input type="text" name="name" id="editName" required>
                <button type="submit" name="update">Actualizar</button>
                <button type="button" onclick="cerrarModal()">Cancelar</button>
            </form>
        </div>
    </div>

    <script>
        // Abrir el modal con los datos del elemento a editar
        function editarElemento(id, name) {
            document.getElementById('editId').value = id;
            document.getElementById('editName').value = name;
            document.getElementById('editModal').style.display = 'flex';
        }

        // Cerrar el modal
        function cerrarModal() {
            document.getElementById('editModal').style.display = 'none';
        }
    </script>
</body>
</html>
