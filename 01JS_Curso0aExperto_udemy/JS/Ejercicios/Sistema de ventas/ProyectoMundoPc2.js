'use strict';
console.log("// ** -------------------------------- DISPOSITIVO ------------------------------------ ** //");
class DispositivoEntrada {

    constructor (tipoEntrada, marca){
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    // Setters y Getters
    get getTipoEntrada (){
        return this._tipoEntrada;
    }
    set setTipoEntrada(tipoEntrada){
        this._tipoEntrada = tipoEntrada;
    }

    get getMarca(){
        return this._marca;
    }
    set setMarca(marca){
        this._marca = marca;
    }
}
// DISPOSITIVO COMPROBACIONES

// Comprobaciones para la clase DispositivoEntrada
// Creamos el objeto 1 con todos los parametros
let dispositivo1 = new DispositivoEntrada("USB", "Apple");
console.log(dispositivo1); // lo mostramos

// Creamos el dispositivo dos aprovechando el constructor vacion por defecto.
let dispositivo2 = new DispositivoEntrada();
// Agregamos propiedades con el metodo set
dispositivo2.setTipoEntrada = "Blouetooth";
dispositivo2.setMarca = "MSI";
// Mostramos atravez de la consola y con el metodo get
console.log(dispositivo2);
console.log("Entrada: " + dispositivo1.getTipoEntrada + ", Marca: " + dispositivo1.getMarca);


console.log("// ** -------------------------------- RATON ------------------------------------ ** //");

class Raton extends DispositivoEntrada{
    
    // Creamos elemento estatico vinculado a la clase raton para crear un contador
    static contadorRaton = 0;
    constructor(tipoEntrada, marca) {
        super(tipoEntrada, marca); // accedemos a la clase padre DispositivoEntrada
        this._idRaton = ++Raton.contadorRaton; // Creamos un contador para la clase
    }
    // Getter
    get idRaton(){
        return this._idRaton;
    }

    // Creamos el metodo toString() para mostrar todos los datos
    toString(){
        return `\nRaton: ${this._idRaton}, Entrada: ${this._tipoEntrada}, Marca: ${this._marca}`;
    }
}
// RATON COMPROBACIONES

// Instanciamos ratones
let ratonRazer = new Raton("USB", "Razer Basilik Pro");
let ratonLgth = new Raton("Bluetooth", "Logitech P94");
let ratonCorsair = new Raton("USB", "Corsair N95 Pro");

// Mostramos atravez de la consola
console.log(ratonCorsair.toString());
console.log(ratonLgth.toString());
console.log(ratonRazer.toString());

// Obtenemos el id de 1 objeto
console.log("ID: Raton - " + ratonLgth._idRaton);

console.log("// ** -------------------------------- TECLADO ------------------------------------ ** //");

class Teclado extends DispositivoEntrada {

    // Creamos elemento estatico vinculado a la clase teclado para crear un contador
    static contadorTeclado = 0;

    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca)
        this._idTeclado = ++Teclado.contadorTeclado; // Creamos el contador de la clase
    }

    // Getter
    get idTeclado(){
        return this._idTeclado;
    }

    toString(){
        return `\nTeclado: ${this._idTeclado}, Entrada: ${this._tipoEntrada}, Marca: ${this._marca}`;
    }
}

// TECLADO COMPROBACIONES

// Instanciamos Objeto Teclado
let tecladoCorsair = new Teclado("USB","Corsair K95 Platinum");
let tecladoMSI = new Teclado("Bluetooth", "MSI Gold");
let tecladoRazer = new Teclado("USB", "Razer Oppus");

// Mostramos atravez de la consola
console.log(tecladoCorsair.toString());
console.log(tecladoMSI.toString());
console.log(tecladoRazer.toString());

// id de un teclado
console.log(`ID: Teclado - ${tecladoRazer._idTeclado}`);

console.log("// ** -------------------------------- MONITOR ------------------------------------ ** //");

class Monitor{

    // Creamos elemento estatico vinculado a la clase monitor para crear un contador
    static contadorMonitor = 0;

    constructor(marca, tamanio){
        this._idMonitor = ++Monitor.contadorMonitor;
        this._marca = marca;
        this._tamanio = tamanio;
    }

    // Getters y Setters
    get idMonitor (){
        return this._idMonitor;
    }

    get getMarca(){
        return this._marca;
    }
    set setMarca(marca){
        this._marca = marca;
    }
    get getTamanio(){
        return this._tamanio;
    }
    set setTamanio(tamanio){
        this._tamanio = tamanio;
    }
    
    toString(){
        return `\nMonitor: ${this._idMonitor} , Marca: ${this._marca}, Tamaño: ${this._tamanio}`;
    }

}

// MONITOR COMPROBACIONES

// Instanciamos los objetos
let monitorHP = new Monitor("HP", "28");
let monitorAcer = new Monitor("Acer Predator", "27");
let monitorDELL = new Monitor("AlienWare", "27.5");

// Creamos un objeto vacio (añadimos y mostramos)
let monitorAsus = new Monitor();
// Utilizamos los metodos (Setters) para agregar las propiedades
monitorAsus.setMarca = "Asus Rog Ally";
monitorAsus.setTamanio = "32";
// Mostramos con (Getters)
console.log(`Monitor: ${monitorAsus._idMonitor}, Marca: ${monitorAsus.getMarca}, Tamaño: ${monitorAsus.getTamanio}`);

// Mostramos los objetos
console.log(monitorHP.toString());
console.log(monitorAcer.toString());
console.log(monitorDELL.toString());

console.log("// ** -------------------------------- ORDENADOR ------------------------------------ ** //");

class Computadora {

    static contadorComputadora = 0;

    constructor(nombre, monitor, teclado, raton){
        this._idComputadora = ++Computadora.contadorComputadora;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    // Getters y Setters
    get idComputadora(){
        this._idComputadora;
    }
    get getMonitor(){
        return this._monitor;
    }
    set setMonitor(monitor){
        this._monitor = monitor;
    }
    get getTeclado(){
        return this._teclado;
    }
    set setTeclado(teclado){
        this._teclado = teclado;
    }
    get getRaton(){
        return this._raton;
    }
    set setRaton(raton){
        this._raton = raton;
    }
    toString(){
        return `\nOrdenador: ${this._idComputadora}, ${this._nombre}, ${this._monitor}, ${this._teclado}, ${this._raton}`
    }
}

// ORDENADOR COMPROBACIONES
let compAlienware = new Computadora("AlienWare", monitorDELL ,tecladoCorsair, ratonCorsair );
let compCorsair = new Computadora("Corsair", monitorAsus, tecladoCorsair, ratonCorsair);
let compMSI = new Computadora("MSI", monitorAcer, tecladoMSI, ratonRazer);
let compRazer = new Computadora("Razer", monitorHP, tecladoRazer, ratonRazer);

// Mostramos
console.log(compAlienware.toString());
console.log(compCorsair.toString());
console.log(compMSI.toString());
console.log(compRazer.toString());

// Utilizamos los setters y getters
console.log("ID: Ordenador - " + compAlienware._idComputadora);
compAlienware.setRaton = ratonRazer; // cambiamos el raton
console.log("Raton: " + compAlienware.getRaton);
console.log(`Info Monitor: ${compAlienware.getMonitor}`);
console.log(compAlienware.toString());

console.log("// ** -------------------------------- ORDENES ------------------------------------ ** //");

class Orden {

    static contadorOrdenes = 0;

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }
    // Getter
    get idOrden(){
        return this._idOrden;
    }

    // Metodos
    agregarComputadora(ordenador){
        let computadora = this._computadoras;
        if(computadora) computadora.push(ordenador);
        
        return computadora;
    }
    mostrarOrden(){
        let mostrarDatos = "";
        let ordenadores = this._computadoras;
        
        ordenadores.forEach(ordenador => {
            mostrarDatos += ordenador;
        });
        return `Orden: ${this._idOrden}, Ordenador: ${mostrarDatos}`;
    }
    mostrarOrden2(){
        let mostrarDatos = this._computadoras.reduce((computadoras, index) => computadoras + index, 0);
        return `Orden: ${this._idOrden}, Ordenador: ${mostrarDatos}`;
    }
    mostrarOrden3(){
        let mostrarDatos = this._computadoras.map((computadoras, index) => computadoras + index, 0);
        return `Orden: ${this._idOrden}, Ordenador: ${mostrarDatos}`;
    }

    toString(){
        return `Orden: ${this._idOrden}, Ordenador: ${this._computadoras}`;
    }
}

// ORDENES COMPROBACIONES
console.log("// ** -------------------------------- Orden 1 ------------------------------------ ** //");
let Orden1 = new Orden();
Orden1.agregarComputadora(compMSI);
Orden1.agregarComputadora(compCorsair);
// console.log(Orden1.toString());
console.log(Orden1.mostrarOrden());

console.log("// ** -------------------------------- Orden 2 ------------------------------------ ** //");
let Orden2 = new Orden();
Orden2.agregarComputadora(compAlienware);
Orden2.agregarComputadora(compRazer);
// console.log(Orden2.toString());
console.log(Orden2.mostrarOrden());

console.log("// ** -------------------------------- Orden 2 con Reduce ------------------------------------ ** //");
console.log(Orden2.mostrarOrden2());

console.log("// ** -------------------------------- Orden 2 con Map ------------------------------------ ** //");
console.log(Orden2.mostrarOrden3());

