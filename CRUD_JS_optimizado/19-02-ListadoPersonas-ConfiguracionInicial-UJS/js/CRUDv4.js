'use strict'
/* CRUD V4 JS (Pasos para cada funcion)
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
// ARRAY
let personas = [
    new Persona ('Maite', 'Danese'),
    new Persona ('Ramon', 'Fernando'),
    new Persona ('Ramon', 'Javier'),
    new Persona ('Eva', 'Herminia'),
    new Persona ('Iosmany', 'Rodriguez')
];
// CREATE
function agregarPersona(){
    if(document.getElementById('nombre').value.trim() == '' || document.getElementById('apellido').value.trim() == ''){alert('Campos vacios'); return;};
    if(personas.find(p => p.nombre == nombre.value && p.apellido == apellido.value)){alert('La persona ya existe'); return;}
    personas.push(new Persona(document.getElementById('nombre').value, document.getElementById('apellido').value));
    mostrarPersonas();
}
// READ
function mostrarPersonas(){
    document.getElementById('personas').innerHTML = personas.map(p => `<li> ${p.nombre} ${p.apellido}</li>`).join(' ');
    if(personas.length == 0){document.getElementById('personas').innerHTML = '<h3>No hay personas en la lista</h3>'};
}
// UPDATE
function actualizarPersona(){
    let num = parseInt(prompt("Ingresa el id que deseas actualizar."));
    if(num < 1 || num > personas.length || isNaN(num)){alert("Error! Número no valido o nulo.");return;};
    
    let nuevaPersona = (prompt("Introduce la informacion que deseas actualizar"));
    let [nombre, apellido] = nuevaPersona.trim().split(" "); // (Desestructuración)
    if(nombre == undefined || apellido == undefined){alert("Informacion no actualizada, nombre o apellidos vacios.");return;}
    
    if(confirm(`¿Deseas actualizar ${personas[num-1].nombre} ${personas[num-1].apellido} a ${nombre} ${apellido}?`))
        { console.log("Persona actualizada con exito!");} else {console.log("Persona no actualizada"); return;}
    if(personas.find(p => p.nombre == nombre.trim() && p.apellido == apellido.trim())){alert("La persona ya existe!"); return;}
    
    personas.splice(num-1, 1, new Persona(nombre, apellido));
    mostrarPersonas();
}
// DELETE
function borrarPersona(){
    let num = parseInt(prompt("Ingresa el id que deseas eliminar."));
    if(num < 1 || num > personas.length || isNaN(num)){alert("Error! Número no valido o nulo.");return;};
    
    if(confirm(`Estas seguro de eliminar a la persona ${personas[num-1].nombre} ${personas[num-1].apellido}`))
        {console.log("Persona eliminada con exito!");} else {console.log("Persona no eliminada"); return;}
    personas.splice(num-1, 1);
    mostrarPersonas();
}

function resetearCampos(){
    document.getElementById('nombre').value = '';
    document.getElementById('apellido').value = '';

    // document.getElementById('forma').reset();
}