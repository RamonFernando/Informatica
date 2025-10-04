
    contadorAutomoviles = 0;
    function Automovil(marca, modelo, color, anio, titular){
        this._marca = marca;
        this._modelo = modelo;
        this._color = color;
        this._anio = anio;
        this._titular = titular;
        // ++Automovil.contadorAutomoviles;
    }

let auto1 = new Automovil('Ferrari', 'F430', 'Rojo', 2022, 'Maite');
let auto2 = new Automovil('Lamborghini', 'Huracan', 'Negro', 2020, 'Ramon');
let auto3 = new Automovil('Ford', 'Mustang', 'Blanco', 2021, 'Blas');
let auto4 = new Automovil('Tesla', 'Model S', 'Negro', 2022, 'Luis');

let automoviles = [auto1, auto2, auto3, auto4];

// Funciones venderAutomovil con protipos
Automovil.prototype.venderAutomovil = function(titularNuevo){
    this._titular = titularNuevo;
    alert("El automovil ha sido vendido");
}

Automovil.prototype.verAuto = function(){
    return `Marca: ${this._marca} - Modelo: ${this._modelo} - Anio: ${this._anio} - Titular: ${this._titular}`;
}

Automovil.prototype.encender = function(){
    alert("El auto esta encendido");
}

function mostrarAutos(){
    let lista = document.getElementById('listaAutomoviles');

    // Borrar todos los elementos de la lista
    while (lista.firstChild) {
        lista.removeChild(lista.firstChild); // Elimina el primer hijo
    }

    for (let auto of automoviles) {
        let item = document.createElement('li');
        item.textContent = auto.verAuto();
        lista.appendChild(item);
    }

}
function agregarAuto(){

}
function buscarAutos(){
    
}
function borrarTexto(){
    let eliminarElemento = document.getElementById("inputTexto").value;
    for (let i = 0; i < automoviles.length; i++) {
        if  (eliminarElemento == automoviles[i]._marca){
            automoviles.splice(i, 1);
            alert("El automovil se ha borrado");
        }
    }
    mostrarAutos();
}