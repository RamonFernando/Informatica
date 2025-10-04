<?php
declare(strict_types=1);

class User {
    private PDO $db;
    private string $table = 'users';

    public function __construct(PDO $dbConnection) {
        $this->db = $dbConnection;
    }

    // Registrar nuevo usuario
    public function register(string $username, string $email, string $password): bool {
        if ($this->userExists($username, $email)) {
            return false; // Usuario ya existe
        }

        $hashedPassword = password_hash($password, PASSWORD_BCRYPT);
        $query = "INSERT INTO $this->table (username, email, password) VALUES (?, ?, ?)";
        
        try {
            $stmt = $this->db->prepare($query);
            return $stmt->execute([$username, $email, $hashedPassword]);
        } catch (PDOException $e) {
            error_log("Error en registro: " . $e->getMessage());
            return false;
        }
    }

    // Iniciar sesión de usuario
    public function login(string $username, string $password): array|false {
        $query = "SELECT * FROM $this->table WHERE username = ? LIMIT 1";
    
        try {
            $stmt = $this->db->prepare($query);
            $stmt->execute([$username]);
            $user = $stmt->fetch(PDO::FETCH_ASSOC);
    
            if (!$user) {
                error_log("Error de login: Usuario '$username' no encontrado.");
                return false; // Usuario no existe
            }
    
            // Verificar la contraseña
            if (!password_verify($password, $user['password'])) {
                error_log("Error de login: Contraseña incorrecta para usuario '$username'.");
                return false;
            }
    
            // Si todo está bien, retornamos los datos del usuario
            return $user;
            
        } catch (PDOException $e) {
            error_log("Error en login: " . $e->getMessage());
            return false;
        }
    }
    

    // Verificar si el usuario o email ya existen
    public function userExists(string $username, string $email): bool {
        $query = "SELECT id FROM $this->table WHERE username = ? OR email = ? LIMIT 1";

        try {
            $stmt = $this->db->prepare($query);
            $stmt->execute([$username, $email]);
            return $stmt->fetch(PDO::FETCH_ASSOC) !== false;
        } catch (PDOException $e) {
            error_log("Error en verificación de usuario: " . $e->getMessage());
            return false;
        }
    }
}
