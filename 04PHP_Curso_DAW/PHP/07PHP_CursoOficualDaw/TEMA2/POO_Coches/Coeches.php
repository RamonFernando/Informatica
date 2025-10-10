<?php
    class Car {
        // Atributos
    public $marca;
    public $modelo;
    public $anyo;
    public $velocidadActual;

    public function __construct($marca, $modelo, $anyo, $velocidadActual) {
        $this-> marca = $marca;
        $this-> modelo = $modelo;
        $this-> anyo = $anyo;
        $this->velocidadActual = $velocidadActual;
    }
    // Setters and Getters
    function get_marca(){
        return $this->marca;
    }
    function set_marca($marca){
        $this->marca = $marca;
    }
    function get_modelo(){
        return $this->modelo;
    }
    function set_modelo($modelo){
        $this->modelo = $modelo;
    }
    function get_anyo(){
        return $this->anyo;
    }
    function set_anyo($anyo){
        $this->anyo=$anyo;
    }
    function get_velocidadActual(){
        return $this->velocidadActual;
    }
    function set_velocidadActual($velocidadActual){
        $this->velocidadActual=$velocidadActual;
    }

    // Methods
    function incremento($velocidad): float|int{
        return $this->velocidadActual+= $velocidad;
    }
    function decremento($frenar): float|int{
        if($this->velocidadActual > 0)
            return $this->velocidadActual -= $frenar;
        else
            return 0;
    }
    function detalles(){
        echo "Marca: $this->marca, Modelo: $this->modelo, Año: $this->anyo, Velocidad: $this->velocidadActual km/h <br>";
    }
    }
    echo "<br>Coche1<br>";
    $car1 = new Car("Nissan", "Micra", 2018, 100);
    echo $car1->detalles();
    $car1->incremento(20);
    echo "Velocidad: " . $car1->get_velocidadActual() . " km/h";
    $car1->decremento(10);
    echo "Velocidad: " . $car1->get_velocidadActual() . " km/h<br>";
    
    echo "<br>Coche2<br>";
    $car2 = new Car("Renault", "Megan", 2005, 110);
    echo $car2->detalles();
    $car2->incremento(30);
    echo "Velocidad: " . $car2->get_velocidadActual() . " km/h";
    $car2->decremento(20);
    echo "<br>Velocidad: " . $car2->get_velocidadActual() . " km/h";

    // Agregamos una modificacion al los atributo dle coche 2
    $car2->set_modelo("Megan Style");
    $car2->set_anyo(2006);
    "Coche: " . $car2->detalles();
    echo "Marca: " . $car2->get_marca() . "<br>";
    echo "Año:" . $car2->get_anyo() . "<br>";
?>