function Automovil(marca, modelo, anio, color, titular) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
    this.titular = titular;
}

let automovil1 = new Automovil('Ford', 'Focus', 2015, 'Rojo', 'Matias Perez');
let automovil2 = new Automovil('Chevrolet', 'Camaro', 2018, 'Amarillo', 'Silvina Marquez');
let automovil3 = new Automovil('Toyota', 'Corolla', 2021, 'Blanco', 'Carlos Garcia');
let automovil4 = new Automovil('Volkswagen', 'Jetta', 2020, 'Negro', 'Pedro Sanchez');

let automoviles = [automovil1, automovil2, automovil3, automovil4];

Automovil.prototype.venderAutomovil = function(nuevoTitular) {
    this.titular = nuevoTitular;
};
Automovil.prototype.verAuto = function () {
    // console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}, Año: ${this.anio}, Color: ${this.color}, Titular: ${this.titular}`);
    return (`Marca: ${this.marca}, Modelo: ${this.modelo}, Año: ${this.anio}, Color: ${this.color}, Titular: ${this.titular}`);
};
Automovil.prototype.encender = function () {
    alert("El automovil esta en marcha");
};

function mostrarAutos() {
    let lista = document.getElementById('listaAutomoviles');
    
    for (const auto of automoviles) {
        let item = document.createElement('li');
        item.innerText = auto.verAuto();
        lista.appendChild(item);
    }
}
function limpiarCampos() {
        document.getElementById("marca").value = "";
        
}
function borrarTexto() {
    document.getElementById("inputTexto").value = "";

    
}


