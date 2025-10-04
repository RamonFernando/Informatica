let personas = ["ramon", "maite", "nichi", "peach"];
function mostrarLista(){
    // Obtenemos los datos
    let nombre = document.getElementById("inputTextoNombre").value;
    let apellido = document.getElementById("inputTextoApellido").value;
    let edad = document.getElementById("inputTextoEdad").value;

    if(nombre == "" || apellido == "" || edad == "") {
        alert("Por favor, completa todos los campos.");
    }else{
        let salida = document.getElementById("textoSalida");
    salida.innerHTML = "Tu nombre es " + nombre + " y tu apellido es " + apellido + " y tienes " + edad + " años";
    }
}

function agregarPersona() {
    let nombre = document.getElementById("inputTextoNombre").value;
    let apellido = document.getElementById("inputTextoApellido").value;
    let edad = document.getElementById("inputTextoEdad").value;

    if (nombre == "" || apellido == "" || edad == "") {
        alert("Por favor, completa todos los campos.");
    }else{
        let nuevaPersona = `${nombre} ${apellido} ${edad} años`;
        let lista = document.getElementById("textoSalida");
        // lista.innerHTML = "";
        lista.textContent = `Nombre: ${nuevaPersona}`;
        
        if(personas.includes(nuevaPersona)){
            alert("La persona ya existe");
        }else{
            personas.push(nuevaPersona);
        }

        mostrarLista();
    }
}
function mostrarPersonas(){
    let salida = document.getElementById("textoSalida");
    salida.textContent = personas + " ";
}

// crear un li con el nombre, apellido y edad
function crearLista() {
    // Obtener valores del formulario
    let nombre = document.getElementById("inputTextoNombre").value;
    let apellido = document.getElementById("inputTextoApellido").value;
    let edad = document.getElementById("inputTextoEdad").value;

    // Verificar que todos los campos estén completos
    // if (nombre && apellido && edad) {
        /*// Formar la persona como un string único
        let nuevaPersona = `${nombre} ${apellido}, ${edad} años`;

        // Verificar si la persona ya existe
        if(personas.includes(nuevaPersona)){
            alert("Persona ya existe");
        }else{
            // Agregar la nueva persona al array
            personas.push(nuevaPersona);
        }*/

        // Limpiar la lista existente en el DOM
        let lista = document.getElementById("textoSalida");
        lista.innerHTML = ""; // Limpia todos los elementos de la lista

        // Recorrer y mostrar la lista actualizada
        for (let i = 0; i < personas.length; i++) {
            let li = document.createElement("li");
            li.textContent = personas[i];
            lista.appendChild(li);
        }
    //} else {
        // alert("Por favor, completa todos los campos.");
    //}
}

