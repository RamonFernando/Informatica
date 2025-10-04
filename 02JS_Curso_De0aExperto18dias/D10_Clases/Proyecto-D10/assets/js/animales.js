let animales = [];

// Metodo mostrarAnimales()
function mostrarAnimales() {
    let lista = document.getElementById('listaAnimales');
    lista.innerHTML = ''; // Limpiar la lista y evita que se duplique el contenido

    for (let animal of animales) {
        let li = document.createElement('li');
        li.textContent = animal.informacion(); // Agrega el contenido al elemento li y llama al metodo informacion
        lista.appendChild(li);
    }
}

class Animal {
    
    constructor (nombre, peso, edad) {
        this._nombre = nombre;
        this._peso = peso;
        this._edad = edad;
    }
    
    informacion() {
        return `${this._nombre} - ${this._peso} kg. - ${this._edad} años`
    }
}
class Perro extends Animal {
    
    constructor (nombre, peso, edad, raza) {
        super(nombre, peso, edad);
        this._raza = raza;
    }
    informacion() {
        return `Perro: ${super.informacion()} - Raza: ${this._raza}`;
    }
}

class Gato extends Animal {
    
    constructor (nombre, peso, edad, sexo) {
        super(nombre, peso, edad);
        this._sexo = sexo;
    }
    informacion() {
        return `Gato: ${super.informacion()} - ${this._sexo}`;
    }
}

class Conejo extends Animal {
    
    constructor (nombre, peso, edad, color) {
        super(nombre, peso, edad);
        this._color = color;
    }
    informacion() {
        return `Conejo: ${super.informacion()} - Color: ${this._color}`;
    }
}

// Declaracion de Objetos de la clase Animal
let perro = new Perro('Firulay', 10, 5, 'Golden Retriever');
let gato = new Gato('Simba', 5, 3, 'Macho');
let conejo = new Conejo('Dumbo', 2, 2, 'Blanco');

// Agregar Objetos a la lista de animales
animales.push(perro, gato, conejo);


