// ** ----------------------------- CRUD -------------------------------------- ** //
const personas = [
    new Persona('Juan', 'Perez'),
    new Persona('Karla', 'Lara'),
    new Persona('Miguel', 'Cervantes'),
    new Persona('Maite', 'Danese'),
    new Persona('Ramón', 'Pérez')
];
function mostrarPersonas() {
    let mensaje = personas.map(persona => `<li>${persona.nombre} ${persona.apellido} </li>`).join(' ');
    document.getElementById('personas').innerHTML = mensaje;    // Insertamos la lista en el DOM
}
function agregarPersona() {
    const {nombre, apellido} = document.forms['forma']; // (Desestructuración) accedemos al formulario con forms
    
    if (personas.find(persona => persona.nombre == nombre.value && persona.apellido == apellido.value)){
        mensajeInformacion("Persona ya existente.");
        return;
    }

    // Validar 2 nombres y 2 apellidos
    const nombres = nombre.value.split(" ");
    const apellidos = apellido.value.split(" ");
    if(nombres.length > 2 || apellidos.length > 2){alert("Debes ingresar 2 nombres y 2 apellidos");return;}

    if((nombre.value == "") || apellido.value == ""){
        // alert("Error! Campos vacios");
        mensajeInformacion("Campleta todos los campos.");
    }else{
        personas.push(new Persona(nombre.value, apellido.value));
        mensajeExitoso("Persona agregada con exito.");
    }
    mostrarPersonas();
    
}
function actualizarPersona() {
    let num = parseInt(prompt("Ingresa el número que deseas actualizar."));
    if (num < 1 || num > personas.length || isNaN(num)) {
        mensajeError("Error! Número no valido o nulo.");
        
    }else{
        let nuevaPersona = (prompt("Introduce la informacion que deseas actualizar"));
        let [nombre, apellido] = nuevaPersona.trim().split(" "); // (Desestructuración)
        if(nombre == undefined || apellido == undefined){
            mensajeInformacion("Informacion no actualizada, nombre o apellidos vacios.");
        }else{
            personas.splice(num-1, 1, new Persona(nombre, apellido));
            mensajeExitoso(`Información actualizada del id: ${num}. ${nombre}  ${apellido}`);
        }
    }
    mostrarPersonas();
}
function borrarPersona() {
    let num = parseInt(prompt("Ingresa el id que deseas eliminar."));
    if(num < 1 || num > personas.length || isNaN(num)){
        mensajeError("Error! Número no valido o nulo.")
    }else{
        personas.splice((num-1), 1);
        mensajeExitoso(`Información borrada del id: ${num}.`);
    }
        
    
    mostrarPersonas();
}
// ** ----------------------------- Eventos -------------------------------------- ** //
function mensajeExitoso(texto){
    let mensaje = document.getElementById('textoInfoAgregar');
    let contenedor = document.getElementById('infoAgregar');
    if(mensaje && contenedor){
        mensaje.innerHTML = texto;
        contenedor.style.display = 'block'; // Muestra el contenedor
        
        setTimeout(() => { // Desaparece el contenedor 3seg
            contenedor.style.display = 'none';
            mensaje.innerHTML = '';
        }, 3000);
    }
}
function mensajeInformacion(texto){
    let mensaje = document.getElementById('textoInfoActualizar');
    let contenedor = document.getElementById('infoActualizar');
    if(mensaje && contenedor){
        mensaje.innerHTML = texto;
        contenedor.style.display = 'block';
        
        setTimeout(() => {
            contenedor.style.display = 'none';
            mensaje.innerHTML = '';
        }, 3000);
    }
}
function mensajeError(texto){
    let mensaje = document.getElementById('textoInfoBorrar');
    let contenedor = document.getElementById('infoError');
    if(mensaje && contenedor){
        mensaje.innerHTML = texto;
        contenedor.style.display = 'block';
        
        setTimeout(() => {
            contenedor.style.display = 'none';
            mensaje.innerHTML = '';
        }, 3000);
    }
}

// Explicación de los métodos
// Map: recorre y crea un nuevo array de listado de personas li
// Find: comprueba si la persona ya existe en el array y la devuelve (1ra coincidencia), true si la encuentra o undefined si no
// Split: divide la informacion en nombre y apellido
// Splice: elimina una persona del array
// Trim: elimina espacios adicionales
// Deestructuracion: permite extraer el nombre y apellido del array personas
// isNaN: método que comprueba si el id es un numero
// forms: propiedad que permite acceder al formulario, en este caso con el id 'forma'