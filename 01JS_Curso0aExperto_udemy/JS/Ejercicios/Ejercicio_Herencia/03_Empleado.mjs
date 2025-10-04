import { Persona } from "./01_Persona.mjs";

class Empleado extends Persona {

    static contadorEmpleados = 0

    constructor(nombre, apellido, edad, sueldo) {
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    // Getters y Setters
   get idEmpleado() {
        return this._idEmpleado;
    }

    get sueldo() {
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    // Metodos
    toString() {
        return `${super.toString()} ${this._idEmpleado} ${this._sueldo}`;
    }

}

let empleado1 = new Empleado('Karla', 'Gomez', 25, 5000);
console.log(empleado1.toString());

export {Empleado};