<?php
// app/controllers/UserController.php

require_once 'app/models/User.php';

class UserController {
    private PDO $db;
    private User $userModel;

    public function __construct(PDO $dbConnection) {
        $this->db = $dbConnection;
        $this->userModel = new User($this->db);
    }

    // Acción de registro
    public function register() {
        $error = "";
        $success = "";

        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $username = filter_input(INPUT_POST, 'username', FILTER_SANITIZE_STRING);
            $email = filter_input(INPUT_POST, 'email', FILTER_SANITIZE_EMAIL);
            $password = $_POST['password'];

            if (empty($username) || empty($email) || empty($password)) {
                $error = "Todos los campos son obligatorios.";
            } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
                $error = "El formato del correo electrónico no es válido.";
            } elseif ($this->userModel->userExists($username, $email)) {
                $error = "El nombre de usuario o correo electrónico ya están en uso.";
            } else {
                if ($this->userModel->register($username, $email, $password)) {
                    $success = "Registro exitoso. <a href='index.php?action=login'>Inicia sesión aquí</a>.";
                } else {
                    $error = "Error en el registro.";
                }
            }
        }

        require 'app/views/register.php'; // Cargar la vista con mensaje de error o éxito
    }

    // Acción de inicio de sesión
    public function login() {
        if (session_status() === PHP_SESSION_NONE) {
            session_start();
        }

        $error = "";
        
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $username = filter_input(INPUT_POST, 'username', FILTER_SANITIZE_STRING);
            $password = $_POST['password'];

            if (empty($username) || empty($password)) {
                $error = "Por favor, completa todos los campos.";
            } else {
                $user = $this->userModel->login($username, $password);

                if ($user) {
                    $_SESSION['user_id'] = $user['id'];
                    $_SESSION['username'] = $user['username'];
                    header("Location: index.php?action=protected");
                    exit();
                } else {
                    $error = "Nombre de usuario o contraseña incorrectos.";
                }
            }
        }

        require 'app/views/login.php'; // Pasar el mensaje de error a la vista
    }

    // Acción para mostrar la página protegida
    public function protectedPage() {
        if (session_status() === PHP_SESSION_NONE) {
            session_start();
        }

        if (!isset($_SESSION['user_id'])) {
            header("Location: index.php?action=login");
            exit();
        }

        $username = $_SESSION['username'];
        require 'app/views/protected.php';
    }

    // Acción para cerrar sesión
    public function logout() {
        if (session_status() === PHP_SESSION_NONE) {
            session_start();
        }

        session_unset();
        session_destroy();

        header("Location: index.php?action=login");
        exit();
    }
}
