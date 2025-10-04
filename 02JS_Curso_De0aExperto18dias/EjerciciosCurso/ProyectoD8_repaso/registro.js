let empleados = [];

// Agregamos un constructor para la clase Empleado

function Empleado(DNI,nombre, apellido, fechaNacimiento, cargo) {
    this._DNI = DNI;
    this._nombre = nombre;
    this._apellido = apellido;
    this._fechaNacimiento = fechaNacimiento;
    this._cargo = cargo;
}
function mostrarEmpleados() {
    let listaEmpleados = "";
    for (let empleado of empleados) {
        for (let propiedad in empleado) {
        listaEmpleados += `${propiedad.toUpperCase()}: ${empleado[propiedad]}, <br>`;
    }
    listaEmpleados = `${listaEmpleados} <hr>`;
}
    document.getElementById("empleados").innerHTML = listaEmpleados;
}


function agregarEmpleado() {
    let DNI = document.getElementById("txtDNI").value;
    let nombre = document.getElementById("txtNombre").value;
    let apellido = document.getElementById("txtApellido").value;
    let fechaNacimiento = document.getElementById("txtNacimiento").value;
    let cargo = document.getElementById("txtCargo").value;

    let empleadoNuevo = new Empleado(DNI, nombre, apellido, fechaNacimiento, cargo);
    
    // Verificar si el DNI ya existe
    for (let i = 0; i < empleados.length; i++){
        if (empleadoNuevo._DNI == empleados[i]._DNI){
            alert("El empleado ya se encuentra registrado");
            return;
        }
    }
    if(empleadoNuevo._DNI){
        empleados.push(empleadoNuevo);
        alert("Empleado ha sido agregado");
    }
}
function agregarEmpleadoPlus() {
    let DNI = document.getElementById("txtDNI").value;
    let nombre = document.getElementById("txtNombre").value;
    let apellido = document.getElementById("txtApellido").value;
    let fechaNacimiento = document.getElementById("txtNacimiento").value;
    let cargo = document.getElementById("txtCargo").value;

    let empleadoNuevo = new Empleado(DNI, nombre, apellido, fechaNacimiento, cargo);
    
    // Verificar si ya existe un empleado con el mismo DNI
    let existeDNI = empleados.some(empleados => empleados._DNI === DNI); // Some devuelve true o false si encuentra el DNI
    if (existeDNI) {
        alert("Ya existe un empleado con ese DNI");
        return;
    }

    empleados.push(empleadoNuevo);
    alert("Empleado ha sido agregado");
}