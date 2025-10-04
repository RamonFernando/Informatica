// CRUD
// Mostrar Personas: Metodo reduce o un map, find 
// Agregar Personas: Metodo find
// Actualizar Personas: Metodo splice
// Borrar Personas: Metodo filter
// Validaciones cortas

// Metodos de Arrays 
// Reduce y map
// Map: Recorre y crea un nuevo array de listado de personas
// Reduce: Reduce los elementos a un solo valor acumulado
// Find: Comprueba si la persona ya existe en el array y la devuelve (1ra coincidencia), true si la encuentra o undefined si no
// Filter: Filtra el array y devuelve un nuevo array con los elementos que cumplen la condicion
// Splice: Elimina una persona del array o agrega una persona al array
// Push: Agrega una persona al array

// Array de personas
const personas = [
    new Persona('Juan', 'Perez'),
    new Persona('Maria', 'Gomez'),
    new Persona('Pedro', 'Lopez'),
    new Persona('Ana', 'Garcia'),
    new Persona('Luis', 'Martinez')
];

// CRUD Simple
function mostrarPersonas(){
    let li = personas.map(persona => `<li>${persona.nombre} ${persona.apellido}</li>`).join(" ");
    document.getElementById('personas').innerHTML = li; // obtenemos el elemento
}

function agregarPersonaSimple(){
    const {nombre, apellido} = document.forms['forma'];
    (nombre.value.trim() && apellido.value.trim()) ? personas.push(new Persona(nombre.value, apellido.value)): "";
    mostrarPersonas();
}
function actualizarPersonaSimple() {
    let numero = parseInt(prompt("Ingrese el número de la persona a actualizar"));
    if(numero == "" || isNaN(numero)){
        alert("Error, numero no valido o nulo");
    }else{
        let nuevoNombre = prompt("Ingrese el nuevo nombre");
        let nuevoApellido = prompt("Ingrese el nuevo apellido");
        (nuevoNombre.trim() && nuevoApellido.trim()) ?
            personas.splice(numero-1, 1, new Persona(nuevoNombre, nuevoApellido)): alert("Persona no actualizada");
        }
    mostrarPersonas();
}
function borrarPersonaSimple(){
    let numero = parseInt(prompt("Ingrese el número de la persona a borrar"));
    (!numero == "") ? personas.splice(numero-1, 1) : "";
    mostrarPersonas();
}

// CRUD Completo
function agregarPersona(){
    const {nombre, apellido} = document.forms['forma'];
    if(validarCampos()){
        if(validarPersona()){
            (caracteresPermitidos(nombre.value, apellido.value)) ?
                personas.push(new Persona(nombre.value, apellido.value)) :
                alert("Persona agregada con exito");
        }
    }
    mostrarPersonas();
}
// Validaciones individuales
// validarCampos() ? personas.push(new Persona(nombre.value, apellido.value)) : "";
// if(!validarPersona()) return;
// if(!caracteresPermitidos(nombre.value, apellido.value)) return;

// Funcion en la forma simple
function actualizarPersona() {
    let numero = parseInt(prompt("Ingrese el número de la persona a actualizar"));
    
    if(!validarNumero(numero)){
        alert("Error, numero no valido o nulo");
    }else{
        let nuevoNombre = prompt("Ingrese el nuevo nombre");
        let nuevoApellido = prompt("Ingrese el nuevo apellido");
        
        if(personas.find(persona => persona.nombre == nuevoNombre && persona.apellido == nuevoApellido)){
            alert("Error! Persona ya existente");
            return;
        }
        if(nuevoNombre.trim() && nuevoApellido.trim()) {
            (caracteresPermitidos(nuevoNombre, nuevoApellido)) ?
            personas.splice(numero-1, 1, new Persona(nuevoNombre, nuevoApellido)): "";
            }else{
                alert("Error! Hay campos vacios");
            }
        }
    mostrarPersonas();
}
function borrarPersona(){
    let numero = parseInt(prompt("Ingrese el número de la persona a borrar"));
    (!validarNumero(numero)) ? alert("Error, numero no valido o nulo") : personas.splice(numero-1, 1);
    mostrarPersonas();
}


/*function mostrarPersonas(){
   // Primera forma
    for (let i = 0; i < personas.length; i++) {
        let li = document.createElement('li');
        lista.appendChild(li);
        li.innerHTML = personas[i].nombre + " " + personas[i].apellido;
    
}*/

// Validaciones
function validarCampos() {
    const {nombre, apellido} = document.forms['forma'];
    
    if(!nombre.value.trim() || !apellido.value.trim()){
        let mensaje = alert("Error, hay campos vacios!");
        return false;
    }else{
        // mensaje = alert("Persona agregada");
        return true;
    }
}

function validarPersona(){

    const {nombre, apellido} = document.forms['forma'];
    if(personas.find(persona => persona.nombre == nombre.value && persona.apellido == apellido.value)){
        alert("Error! Persona ya existente");
        return false;
    }
    return true;
}

function caracteresPermitidos(nombre, apellido) {
    const regex = /^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\s]+$/;
    if(regex.test(nombre) && regex.test(apellido)){
        return true;
    }else{
        alert("Caracteres no permitidos");
        return false;
    }
}
function validarNumero(num) {
    
    if(isNaN(num) || num < 0 || num > personas.length || num == undefined || num == null){
        return false;
    }else{
        return true;
    }
}