// Clase Auto (constructor)
function Automovil(marca, modelo, anio, color, titular) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
    this.titular = titular;
}

// Objetos
let automovil1 = new Automovil('Ford', 'Focus', 2015, 'Rojo', 'Matias Perez');
let automovil2 = new Automovil('Chevrolet', 'Camaro', 2018, 'Amarillo', 'Silvina Marquez');
let automovil3 = new Automovil('Toyota', 'Corolla', 2021, 'Blanco', 'Carlos Garcia');
let automovil4 = new Automovil('Volkswagen', 'Jetta', 2020, 'Negro', 'Pedro Sanchez');
let automovil5 = new Automovil('Honda', 'Civic', 2019, 'Azul', 'Eva Maria Gonzalez');
let automovil6 = new Automovil('Mazda', 'MX-5', 2022, 'Gris', 'Luis Perales');
let automovil7 = new Automovil('Nissan', 'Altima', 2017, 'Blanco', 'Ana Mendoza');
let automovil8 = new Automovil('Subaru', 'Impreza', 2016, 'Negro', 'Ricardo Gomez');
let automovil9 = new Automovil('Kia', 'Sportage', 2023, 'Azul', 'Sofia Ramirez');
let automovil10 = new Automovil('Hyundai', 'Elantra', 2018, 'Gris', 'Pedro Garcia');
let automovil11 = new Automovil('Tesla', 'Model S', 2022, 'Negro', 'Luis Castro');
let automovil12 = new Automovil('Audi', 'A4', 2021, 'Blanco', 'Sofia Ramirez');
let automovil13 = new Automovil('BMW', 'X5', 2020, 'Negro', 'Pedro Sanchez');
let automovil14 = new Automovil('Mercedes-Benz', 'C-Class', 2019, 'Gris', 'Maite Claudia');
let automovil15 = new Automovil('Lamborghini', 'Aventador', 2022, 'Negro', 'Ramón Perez Alvarez');
let automovil16 = new Automovil('Ferrari', '488', 2021, 'Blanco', 'Sofia Ramirez');
let automovil17 = new Automovil('Lamborghini', 'Huracan', 2020, 'Negro', 'Luis Alcover');
let automovil18 = new Automovil('Bugatti', 'Chiron', 2019, 'Gris', 'Lionel Messi');
let automovil19 = new Automovil('Porsche', '911', 2022, 'Negro', 'Nicolas Cosso');
let automovil20 = new Automovil('Jaguar', 'F-Pace', 2021, 'Blanco', 'Cristiano Ronaldo');

let automoviles = [automovil1, automovil2, automovil3, automovil4, automovil5, automovil6, automovil7, automovil8, automovil9, automovil10];

// ** ----------------------------- CRUD -------------------------------------- **

// Agregar (Create)
function createAuto() {
    marca = document.getElementById("marca").value;
    modelo = document.getElementById("modelo").value;
    anio = document.getElementById("anio").value;
    color = document.getElementById("color").value;
    titular = document.getElementById("titular").value;
    let autoNuevo = new Automovil(marca, modelo, anio, color, titular);
    automoviles.push(autoNuevo);
    limpiarCampos();
}

// Mostrar (Read)
function readAutos() {
    for (const auto of automoviles) {
        let lista = document.getElementById('listaAutomoviles');
        let item = document.createElement('li');
        item.innerText = auto.verAuto();
        lista.appendChild(item);
        }
}

// Modificar (Update)
function updateAuto() {
    let indice = document.getElementById("indice").value;
    let marca = document.getElementById("marca").value;
    let modelo = document.getElementById("modelo").value;
    let anio = document.getElementById("anio").value;
    let color = document.getElementById("color").value;
    let titular = document.getElementById("titular").value;
    automoviles[indice].marca = marca;
    automoviles[indice].modelo = modelo;
    automoviles[indice].anio = anio;
    automoviles[indice].color = color;
    automoviles[indice].titular = titular;
    limpiarCampos();
}

// Borrar (Delete)
function deleteAuto() {
    let indice = document.getElementById("indice").value;
    automoviles.splice(indice, 1);
    limpiarCampos();
}

// Buscar
function searchAuto() {
    let indice = document.getElementById("indice").value;
    document.getElementById("marca").value = automoviles[indice].marca;
    document.getElementById("modelo").value = automoviles[indice].modelo;
    document.getElementById("anio").value = automoviles[indice].anio;
    document.getElementById("color").value = automoviles[indice].color;
    document.getElementById("titular").value = automoviles[indice].titular;
}

// ** -------------------------- METODOS -------------------------------------- **

Automovil.prototype.arrancarAutomovil = function() {
    alert("El automovil esta en marcha");
};

Automovil.prototype.venderAutomovil = function(nuevoTitular) {
    this.titular = nuevoTitular;
};
Automovil.prototype.verAuto = function () {
    console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}, Año: ${this.anio}, Color: ${this.color}, Titular: ${this.titular}`);
    document.write(`Marca: ${this.marca}, Modelo: ${this.modelo}, Año: ${this.anio}, Color: ${this.color}, Titular: ${this.titular}`);
};

Automovil.prototype.encender = function () {
    alert("El automovil esta en marcha");
};
function limpiarCampos() {
        document.getElementById("marca").value = "";
        marca = document.getElementById("marca").value = "";
        modelo = document.getElementById("modelo").value = "";
        anio = document.getElementById("anio").value = "";
        color = document.getElementById("color").value = "";
        titular = document.getElementById("titular").value = "";
        
}
function borrarTexto() {
    document.getElementById("inputTexto").value = "";
}

// ** ------------------------- GETTERS Y SETTERS ----------------------------- **
Automovil.prototype.getMarca = function() {
    return this.marca;
}
Automovil.prototype.setMarca = function(marca) {
    this.marca = marca;
}
Automovil.prototype.getModelo = function() {
    return this.modelo;
}
Automovil.prototype.setModelo = function(modelo) {
    this.modelo = modelo;
}
Automovil.prototype.getAnio = function() {
    return this.anio;
}
Automovil.prototype.setAnio = function(anio) {
    this.anio = anio;
}
Automovil.prototype.getColor = function() {
    return this.color;
}
Automovil.prototype.setColor = function(color) {
    this.color = color;
}
Automovil.prototype.getTitular = function() {
    return this.titular;
}
Automovil.prototype.setTitular = function(titular) {
    this.titular = titular;
}




