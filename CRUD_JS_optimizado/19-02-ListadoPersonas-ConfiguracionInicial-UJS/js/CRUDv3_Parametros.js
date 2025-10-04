// CRUD V3 Update confirm y funciones con parametros
const personas = [
    new Persona('Juan', 'Perez'),
    new Persona('Maria', 'Gomez'),
    new Persona('Pedro', 'Lopez'),
    new Persona('Ana', 'Garcia'),
    new Persona('Luis', 'Martinez')
];
const regex = /^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/;

/* CRUD V3 JS (Pasos para cada funcion)
CEATE
1. Comprobar campos
2. Comprobar caracteres permitidos
3. Validar longitud de los nombres y apellidos
4. Comprobar si la persona ya existe
5. Mostrar el mensaje de exito o de error al agregar
6. Agregar persona al array
7. Limpiar campos
8. Mostrar listado de personas
READ
1. Crear la lista
2. Mostrar la lista en el DOM
3. Comprobar si la lista esta vacia
UPDATE
1. Solicitar el numero o id
2. Comprobarque el numero exista, sea valido(numero) y no sea nulo
3. Solicitar el nuevo nombre y apellido
4. Comprobar que los campos no esten vacios
5. Comprobar caracteres permitidos
6. Validar longitud de los nombres y apellidos
7. Comprobar si la persona ya existe
8. Confirmar si la persona quiere ser actualizada
9. Actualizar persona
10. Mostrar el mensaje de exito o de error al actualizar
DELETE
1. Solicitar el numero o id
2. Comprobar que el numero exista, sea valido(numero) y no sea nulo
3. Preguntar al usuario si la persona será eliminada
4. Eliminar la persona
5. Mostramos la listaS
*/
// CREATE
function agregarPersona() {

    // 1. Comprobar campos
    if(nombre.value.trim() == "" || apellido.value.trim() == "") {alert("Por favor, completa todos los campos."); return;}

    // 2. Comprobar caracteres permitidos
    if(!regex.test(nombre.value) || !regex.test(apellido.value)) {alert("Caracteres no permitidos"); return;}

    // 3. Validar longitud de los nombres y apellidos
    if((nombre.value.length + apellido.value.length) > 50){alert("El nombre y apellidos deben tener máximo 50 caracteres"); resetCampos(); return;}
    
    // 4. Comprobar si la persona ya existe
    if(personas.find(p => p.nombre == nombre.value.trim() && p.apellido == apellido.value.trim())){alert("La persona ya existe!"); resetCampos(); return;}

    // 5. Mostrar el mensaje de exito o de error al agregar
    if(nombre.value.trim() || apellido.value.trim()) alert("Persona agregada con exito"); else {alert("Error! Persona no agregada"); resetCampos(); return;}
    
    // 6. Agregar persona al array
    personas.push(new Persona(nombre.value.trim(), apellido.value.trim()));

    // 7. Limpiar campos
    document.getElementById('forma').reset();
    
    // 8. Mostrar listado de personas
    mostrarPersonas();
}

// READ
function mostrarPersonas() {

    // 1. Crear la lista
    lista = personas.map(persona => `<li> ${persona.nombre} ${persona.apellido} </li>`).join(" ");

    // 2. Mostrar la lista en el DOM
    document.getElementById('personas').innerHTML = lista;

    // 3. Comprobar si la lista esta vacia
    if(personas.length == 0) document.getElementById('personas').innerHTML = '<h3>No hay personas en la lista</h3>';
    
}

// UPDATE
function actualizarPersona(num, nuevoNombre, nuevoApellido) {

    // 1. Solicitar el numero o id
    num = parseInt(prompt("Ingresa el id que deseas actualizar."));

    // 2. Comprobarque el numero exista, sea valido(numero) y no sea nulo
    if(num < 1 || num > personas.length || isNaN(num)){alert("Error! Número no valido o nulo.");return;}

    // 3. Solicitar el nuevo nombre y apellido
    nuevoNombre = prompt("Ingrese el nuevo nombre");
    nuevoApellido = prompt("Ingrese el nuevo apellido");

    // 4. Comprobar que los campos no esten vacios
    if(nuevoNombre.trim() == "" || nuevoApellido.trim() == "") {alert("Por favor, completa todos los campos."); return;}

    // 5. Comprobar caracteres permitidos
    if(!regex.test(nuevoNombre) || !regex.test(nuevoApellido)) {alert("Caracteres no permitidos"); return;}

    // 6. Validar longitud de los nombres y apellidos
    if((nuevoNombre.length + nuevoApellido.length) > 50){alert("El nombre y apellidos deben tener máximo 50 caracteres"); return;}
    
    // 7. Comprobar si la persona ya existe
    if(personas.find(p => p.nombre == nuevoNombre.trim() && p.apellido == nuevoApellido.trim())){alert("La persona ya existe!"); return;}

    // 8. Confirmar si la persona quiere ser actualizada
    if(confirm(`Estas seguro de actualizar a la persona:\n ${personas[num-1].nombre} ${personas[num-1].apellido} a\n ${nuevoNombre} ${nuevoApellido}`))
        {console.log("Persona actualizada con exito!");} else {console.log("Persona no actualizada"); return;}
    
    // 9. Actualizar persona
    personas.splice(num-1, 1, new Persona(nuevoNombre, nuevoApellido));

    // 10. Mostramos la lista
    mostrarPersonas();
}

// DELETE
function borrarPersona(num) {
    
    // 1. Solicitar el numero o id
    num = parseInt(prompt("Ingresa el id que deseas eliminar."));
    console.log("Prueba " + num);

    // 2. Comprobar que el numero exista, sea valido(numero) y no sea nulo
    if(num < 1 || num > personas.length || isNaN(num)){alert("Error! Número no valido o nulo.");return;}
    
    // 3. Preguntar al usuario si la persona será eliminada
    if(confirm(`Estas seguro de eliminar a la persona ${personas[num-1].nombre} ${personas[num-1].apellido}`))
        {console.log("Persona eliminada con exito!");} else {console.log("Persona no eliminada"); return;}
    
    // 4. Eliminar la persona
    personas.splice(num-1, 1);
    
    // 5. Mostramos la lista
    mostrarPersonas();
}

// RESET
function resetCampos() {
    document.getElementById('forma').reset();
}