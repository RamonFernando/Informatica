// Script Proyecto Dia 8

// Array de objetos
let empleados = [];

function Empleado(legajo, nombre, apellido, nacimiento, cargo) {
    this.legajo = legajo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacimiento = nacimiento;
    this.cargo = cargo;
}

function agregarEmpleado(){
    let legajo = document.getElementById("txtLegajo").value;
    let nombre = document.getElementById("txtNombre").value;
    let apellido = document.getElementById("txtApellido").value;
    let nacimiento = document.getElementById("txtFecha").value;
    let cargo = document.getElementById("txtCargo").value;

    // Crear objeto
    let empleado = new Empleado(legajo, nombre, apellido, nacimiento, cargo);
    // Agregar empleados
    empleados.push(empleado);
    alert("Empleado ha sido agregado");
    

}
function mostrarEmpleados() {

    let listado = [];
    for (let empleado of empleados) { // recorrer el array de objetos
        let items = [];
        for (let propiedad in empleado) { // recorrer el objeto recorriendo las propiedades
            listado += propiedad.toUpperCase() + ": " + empleado[propiedad] + ", " + "\n";
            items += propiedad.toUpperCase() + ": " + empleado[propiedad] + ", " + "\n";
        }
        listado = listado + "\n";
        agregarLista(items);
    }
    alert(listado);
    
}
function agregarLista(lista){
    let ol = document.getElementById("listado");
    // lista.textContent = listado;
    // Crear elemento li
    let li = document.createElement("li");
    li.setAttribute("id", "li");
    li.textContent = lista;
    ol.appendChild(li);
}
function limpiarCampos() {
    // Limpiar campos

    document.getElementById("txtLegajo").value = "";
    document.getElementById("txtNombre").value = "";
    document.getElementById("txtApellido").value = "";
    document.getElementById("txtFecha").value= "";
    document.getElementById("txtCargo").value = "";
}

function borrarEmpleados() {
    let listado = document.getElementById("listado");
    listado.innerHTML = "";
}

