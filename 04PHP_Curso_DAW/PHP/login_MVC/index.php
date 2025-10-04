<?php
// index.php

require_once 'core/Database.php';
require_once 'app/controllers/UserController.php';

// Conexión a la base de datos
$database = new Database();
$dbConnection = $database->getConnection();

// Crear instancia del controlador
$userController = new UserController($dbConnection);

// Enrutamiento básico
$action = isset($_GET['action']) ? $_GET['action'] : 'login';

switch ($action) {
    case 'register':
        $userController->register();
        break;
    case 'login':
        $userController->login();
        break;
    case 'protected':
        $userController->protectedPage();
        break;
    case 'logout':
        $userController->logout();
        break;
    default:
        echo "Acción no válida.";
        break;
}
