'use strict'

// ARRAY
let personas = [
    new Persona("Ramon", "Perez"),
    new Persona('Maite', 'Danese'),
    new Persona('Ramon', 'Alvarez'),
    new Persona('Genesis', 'Rondom'),
    new Persona('Claudia', 'Mercadal'),
    new Persona('Jorge', 'Garcia')
];

// READ
function mostrarPersonas(){
    if(personas.length == 0)
        document.getElementById('personas').innerHTML = '<h3>No hay personas en la lista</h3>';
    else
        document.getElementById('personas').innerHTML = personas.map(p => `<li> ${p.nombre} ${p.apellido}</li>`).join(" ");
}

// CREATE
function agregarPersona(){
    
    if(nombre.value.trim() == '' || apellido.value.trim() == '') return alert('Campos vacios');
    if(personas.find(p => (p.nombre == nombre.value && p.apellido == apellido.value))) return alert('La persona ya existe')
    personas.push(new Persona(nombre.value.trim(), apellido.value.trim()));
    
    mostrarPersonas();
    resetearCampos();
}

// UPDATE
function actualizarPersona(){
    let num = parseInt(prompt("Ingrese el número de la persona a actualizar"));
    if(num == '' || isNaN(num) || num < 1 || num > personas.length) return alert("Numero incorrecto o invalido!");

    let nuevaPersona = prompt("Ingresa el nombre y apellido que desea actualizar");
    let [nombre, apellido] = nuevaPersona.trim().split(" "); // Desestructuracion (asignamos la nueva persona al array)
    if(nombre == undefined || apellido == undefined) return alert('Campos vacios'); // Evita que se actualice con un campo undefined
    if(personas.find(p => (p.nombre == nombre.trim() && p.apellido == apellido.trim()))) return alert('La persona ya existe');
    
    if(!confirm(`Seguro que desea actualizar la persona ${personas[num -1].nombre} ${personas[num -1].apellido} a ${nombre} ${apellido}`)) return;
    personas.splice(num -1, 1, new Persona(nombre, apellido));
    
    mostrarPersonas();
    resetearCampos();
}

// DELETE
function borrarPersona(){
    let num = parseInt(prompt("Ingrese el número de la persona a borrar"));
    if(num == '' || isNaN(num) || num < 1 || num > personas.length) return alert("Numero incorrecto o invalido!");
    if(!confirm(`Seguro que desea eliminar a ${personas[num-1].nombre} ${personas[num-1].apellido}`)) return;
    personas.splice(num -1, 1);
    mostrarPersonas();
}

// RESET
function resetearCampos(){
    document.getElementById('forma').reset();
}
    
/* CRUD V4 JS (Pasos para cada funcion) Ejercicio
Crear un array para almacenar las personas
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