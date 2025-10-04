<?php
// Archivo donde se almacenarán los datos
$dataFile = 'data.txt'; // Este archivo guardará la lista de elementos de forma persistente.

// Leer los datos del archivo.
// Si el archivo no existe, inicializamos un arreglo vacío.
$items = file_exists($dataFile) ? unserialize(file_get_contents($dataFile)) : [];

// --- Crear un nuevo elemento ---
if (isset($_POST['create'])) { // Si se envió el formulario de "Agregar".
    $name = $_POST['name']; // Obtener el valor ingresado en el formulario.
    if (!empty($name)) { // Asegurarse de que no esté vacío.
        $items[] = $name; // Agregar el nuevo elemento al final del arreglo.
        // Guardar el arreglo actualizado en el archivo.
        file_put_contents($dataFile, serialize(array_values($items)));
    }
}

// --- Actualizar un elemento existente ---
if (isset($_POST['update'])) { // Si se envió el formulario de "Actualizar".
    $id = $_POST['id']; // Obtener el ID del elemento a actualizar.
    $name = $_POST['name']; // Obtener el nuevo nombre ingresado.
    $items[$id] = $name; // Actualizar el valor en el arreglo.
    // Guardar el arreglo actualizado en el archivo.
    file_put_contents($dataFile, serialize(array_values($items)));
}

// --- Eliminar un elemento ---
if (isset($_POST['delete'])) { // Si se envió el formulario de "Eliminar".
    $id = $_POST['id']; // Obtener el ID del elemento a eliminar.
    unset($items[$id]); // Eliminar el elemento del arreglo.
    // Reindexar el arreglo y guardarlo en el archivo.
    file_put_contents($dataFile, serialize(array_values($items)));
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD en PHP sin BD</title>
    <style>
        /* Estilo general del cuerpo */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: #f4f4f9;
        }

        /* Contenedor principal */
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        /* Título principal */
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        /* Estilos del formulario para agregar elementos */
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

        /* Estilos para la tabla */
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

        /* Botón de eliminar */
        .delete {
            background: #e74c3c;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            margin-left: 5px;
        }

        .delete:hover {
            background: #c0392b;
        }

        /* Estilos para el modal */
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
        <h1>CRUD en PHP sin BD</h1>

        <!-- Formulario para crear un nuevo elemento -->
        <form method="POST" class="form">
            <input type="text" name="name" placeholder="Escribe un elemento" required> <!-- Campo de texto -->
            <button type="submit" name="create">Agregar</button> <!-- Botón de agregar -->
        </form>

        <!-- Tabla para mostrar los elementos -->
        <table>
            <thead>
                <tr>
                    <th>ID</th> <!-- Columna de ID -->
                    <th>Nombre</th> <!-- Columna de Nombre -->
                    <th>Acciones</th> <!-- Columna de Acciones -->
                </tr>
            </thead>
            <tbody>
                <!-- Mostrar cada elemento en la tabla -->
                <?php foreach ($items as $id => $name): ?>
                    <tr>
                        <td><?= ($id+1) ?></td> <!-- Mostrar el ID -->
                        <td><?= $name ?></td> <!-- Mostrar el nombre -->
                        <td>
                            <!-- Botón para editar -->
                            <button onclick="editarElemento(<?= $id ?>, '<?= $name ?>')">Editar</button>
                            <!-- Botón para eliminar -->
                            <form method="POST" style="display:inline;">
                                <input type="hidden" name="id" value="<?= $id ?>">
                                <button type="submit" name="delete" class="delete">Eliminar</button>
                            </form>
                        </td>
                    </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
    </div>

    <!-- Modal para editar un elemento -->
    <div id="editModal" class="modal">
        <div class="modal-content">
            <form method="POST">
                <h2>Editar Elemento</h2>
                <!-- Campo oculto para enviar el ID -->
                <input type="hidden" name="id" id="editId">
                <!-- Campo para ingresar el nuevo valor -->
                <input type="text" name="name" id="editName" required>
                <button type="submit" name="update">Actualizar</button>
                <button type="button" onclick="cerrarModal()">Cancelar</button>
            </form>
        </div>
    </div>

    <script>
        // Función para abrir el modal con los datos del elemento a editar
        function editarElemento(id, name) {
            document.getElementById('editId').value = id; // Asigna el ID al campo oculto
            document.getElementById('editName').value = name; // Muestra el nombre en el campo de texto
            document.getElementById('editModal').style.display = 'flex'; // Muestra el modal
        }

        // Función para cerrar el modal
        function cerrarModal() {
            document.getElementById('editModal').style.display = 'none'; // Oculta el modal
        }
    </script>
</body>
</html>
