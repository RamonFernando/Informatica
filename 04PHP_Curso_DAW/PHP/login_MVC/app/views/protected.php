<!-- app/views/protected.php -->
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Página Protegida</title>
    <link rel="stylesheet" href="./assets/css/main.css">
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <script>
        function editarElemento(id, name, title) {
            document.getElementById('editId').value = id;
            document.getElementById('editName').value = name;
            document.getElementById('editTitle').value = title;
            document.getElementById('editModal').style.display = 'flex';
        }

        function cerrarModal() {
            document.getElementById('editModal').style.display = 'none';
        }
    </script>
</head>
<body>
    <h2>Bienvenido, <?php echo htmlspecialchars($username); ?>!</h2>

    <input type="text" id="search" placeholder="Buscar...">
    
    <form action="index.php?action=create" method="POST">
        <input type="text" name="title" placeholder="Título" required>
        <input type="text" name="name" placeholder="Enlace (URL)" required>
        <button type="submit">Agregar</button>
    </form>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Enlace</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($items as $item): ?>
                <tr>
                    <td><?= htmlspecialchars($item['id']); ?></td>
                    <td><?= htmlspecialchars($item['title']); ?></td>
                    <td>
                        <?php if (filter_var($item['name'], FILTER_VALIDATE_URL)): ?>
                            <a href="<?= htmlspecialchars($item['name']); ?>" target="_blank"><?= htmlspecialchars($item['name']); ?></a>
                        <?php else: ?>
                            <?= htmlspecialchars($item['name']); ?>
                        <?php endif; ?>
                    </td>
                    <td>
                        <button onclick="editarElemento(<?= $item['id']; ?>, '<?= $item['name']; ?>', '<?= $item['title']; ?>')">Editar</button>
                        <a href="index.php?action=delete&id=<?= $item['id']; ?>">Eliminar</a>
                    </td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>

    <div id="editModal" class="modal">
        <form action="index.php?action=update" method="POST">
            <input type="hidden" name="id" id="editId">
            <input type="text" name="title" id="editTitle" required>
            <input type="text" name="name" id="editName" required>
            <button type="submit">Actualizar</button>
            <button type="button" onclick="cerrarModal()">Cancelar</button>
        </form>
    </div>

    <a href="index.php?action=logout">Cerrar Sesión</a>
</body>
</html>

