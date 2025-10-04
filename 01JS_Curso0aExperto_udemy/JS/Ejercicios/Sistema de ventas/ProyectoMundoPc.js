'use strict';
// ** ------------------------------------------------------------------------- ** //
class DispositivoEntrada {

    constructor(tipoEntrada, marca){
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    // Getter y Setter
    get tipoEntrada(){
        return this._tipoEntrada;
    }
    set tipoEntrada(tipoEntrada){
        this._tipoEntrada = tipoEntrada;
    }

    get marca(){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }
}

// ** ------------------------------------------------------------------------- ** //
class Raton extends DispositivoEntrada{

    static contadorRatones = 0;
    
    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }

    get idRaton(){
        return this._idRaton;
    }

    toString(){
        return `Raton: ${this._idRaton}, Entrada: ${this._tipoEntrada}, Marca: ${this._marca} `;
    }
}

// ** ------------------------------------------------------------------------- ** //

class Teclado extends DispositivoEntrada {
    
    static contadorTeclado = 0;

    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclado;
    }
    get idTeclado(){
        return this._idTeclado;
    }
    toString(){
        return `Teclado: ${this._idTeclado}, Entrada: ${this._tipoEntrada}, Marca: ${this._marca} `;
    }
    
}

// ** ------------------------------------------------------------------------- ** //

class Monitor {

    static contadorMonitores = 0;
    constructor(marca, tamanio){
        this._idMonitores = ++Monitor.contadorMonitores;
        this._marca = marca;
        this._tamanio = tamanio;
    }

    // Getters y Setters
    get idMonitores(){
        return this._idMonitores;
    }
    /*
    get marca(){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }

    get tamanio(){
        return this._tamanio;
    }
    set tamanio(tamanio){
        this._tamanio = tamanio;
    }*/

    toString(){
        return `Monitor: ${this._idMonitores}, Marca: ${this._marca}, Tamaño: ${this._tamanio} `;
    }
}

// ** ------------------------------------------------------------------------- ** //

class Computadora{

    static contadorComputadoras = 0;

    constructor (nombre, monitor, teclado, raton){
        this._idComputadoras = ++Computadora.contadorComputadoras;
        this._nombre = nombre;
        this._monitor = monitor;
        this._raton = raton;
        this._teclado = teclado;
    }

    // Getters y Setters
    /*get idComputadoras(){
        return this._idComputadoras;
    }

    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }

    get monitor(){
        return this._monitor;
    }
    set monitor(monitor){
        this._monitor = monitor;
    }

    get teclado(){
        return this._teclado;
    }
    set teclado(teclado){
        this._teclado = teclado;
    }

    get raton(){
        return this._raton;
    }
    set raton(raton){
        this._raton = raton;
    }*/

    toString(){
        return `Computadora: ${this._idComputadoras}: ${this._nombre}: ${this._monitor}: ${this._teclado}: ${this._raton}`;
    }
}

// ** ------------------------------------------------------------------------- ** //

class Orden{
    static contadorOrdenes = 0;
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarComputadora(computadora){
        this._computadoras.push(computadora);
    }

    mostrarOrden(){
        let computadoraOrden = '';

        this._computadoras.forEach(computadora =>{
            computadoraOrden += "\n" + computadora;
        });
        console.log(`Orden: ${this._idOrden}, Computadora: ${computadoraOrden}`);
    }
}

// ** ------------------------------------------------------------------------- ** //

// DispositivoEntrada
let dispositivoEntrada1 = new DispositivoEntrada("USB", "Logitech");
let dispositivoEntrada2 = new DispositivoEntrada("Bluetooth", "Razer");

// Ratones
console.log("Ratones");
let raton1 = new Raton ("USB", "Razer");
let raton2 = new Raton ("Bluetooth", "Logitech");
let raton3 = new Raton ("USB", "Acer");

// toString de Raton
console.log(raton1.toString());
console.log(raton2.toString());
console.log(raton3.toString());

// Teclados
console.log("Teclados");
let teclado1 = new Teclado ("USB", "Logitech");
let teclado2 = new Teclado ("Bluetooth", "Razer");
let teclado3 = new Teclado ("USB", "Corsair");

// toString de Teclado
console.log(teclado1.toString());
console.log(teclado2.toString());
console.log(teclado3.toString());

// Monitores
console.log("Monitores");
let monitor1 = new Monitor ("HP", 15);
let monitor2 = new Monitor ("DELL", 27);
let monitor3 = new Monitor ("ASUS", 27);

// toString de Monitor
console.log(monitor1.toString());
console.log(monitor2.toString());
console.log(monitor3.toString());

// Computadoras
// nombre, monitor, teclado, raton
let computadora1 = new Computadora ("HP", monitor1, teclado1, raton1);
let computadora2 = new Computadora ("DELL", monitor2, teclado2, raton2);
let computadora3 = new Computadora ("HP", monitor2, teclado3, raton1);
let computadora4 = new Computadora ("ASUS", monitor3, teclado3, raton3);

// toString de Computadoras
console.log("Ordenadores");
console.log(computadora1.toString());
console.log(computadora2.toString());
console.log(computadora3.toString());
console.log(computadora4.toString());

// ** ------------------------------------------------------------------------- ** //

console.log("Orden");
let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);
orden1.mostrarOrden();

let orden2 = new Orden();
orden2.agregarComputadora(computadora3);
orden2.agregarComputadora(computadora4);
orden2.mostrarOrden();
