<?php
    class Tarea{

        private static $contadorId = 0;
        private $id;
        private $titulo;
        private $descripcion;
        private $fecha;
        private $completada;

        // Constructor
        public function __construct($titulo, $descripcion, $fecha, $completada = false){
            $this->id = ++self::$contadorId;
            $this->titulo = $titulo;
            $this->descripcion = $descripcion;
            $this->fecha = $fecha;
            $this->completada = $completada;
        }

        // Getters y setters
        public function getId(){
            return $this->id;
        }
        public function setId($id){
            $this->id = $id;
        }
        public function getTitulo(){
            return $this->titulo;
        }
        public function setTitulo($titulo){
            $this->titulo = $titulo;
        }
        public function getDescripcion(){
            return $this->descripcion;
        }
        public function setDescripcion($descripcion){
            $this->descripcion = $descripcion;
        }
        public function getFecha(){
            return $this->fecha;
        }
        public function setFecha($fecha){
            $this->fecha = $fecha;
        }
        public function isCompletada(){
            return $this->completada;
        }
        public function setCompletada($completada){
            $this->completada = $completada;
        }
        public function getCompletada(){
            return $this->completada;
        }


        // Mostrar
        public function mostrarDetalles(){
            return
                "ID: " . $this->id .
                "\nTitulo: " . $this->titulo .
                "\nDescripcion: " . $this->descripcion .
                "\nFecha: " . $this->fecha .
                "\nCompletada: " . ($this->completada ? "Si" : "No") . "\n";
        }
    }
?>