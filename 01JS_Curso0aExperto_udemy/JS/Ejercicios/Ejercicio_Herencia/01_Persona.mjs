import { Empleado } from "./03_Empleado.mjs";
import { Cliente } from "./04_Cliente.js";
class Persona {

    static contadorPersonas = 0;
    constructor(nombre, apellido, edad) {
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    // Getters y Setters
    get idPersona() {
        return this._idPersona;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }
    toString() {
        return `${this._idPersona} ${this._nombre} ${this._apellido} ${this.edad}`;
    }
}

let persona1 = new Persona('Juan', 'Perez', 28);
console.log(persona1.toString());



let cliente1 = new Cliente('Miguel', 'Cervantes', 30, new Date());
console.log(cliente1.toString());

export {Persona};