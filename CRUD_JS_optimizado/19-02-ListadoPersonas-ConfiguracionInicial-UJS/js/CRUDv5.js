// CRUD simple
// ARRAY
let personas = [
    new Persona("Ramón", "Pérez"),
    new Persona('Maite', 'Danese'),
    new Persona('Ramón', 'Álvarez'),
    new Persona('Genesis', 'Rondom'),
    new Persona('Claudia', 'Mercadal'),
    new Persona('Jorge', 'Garcia')
];
// CREATE
function agregarPersona(){

    if(nombre.value.trim() == '' || apellido.value.trim() == '') return alert("Campos vacios");
    if(personas.find(p => (nombre.value == p.nombre && apellido.value == p.apellido))) return alert("La persona ya existe!");

    personas.push(new Persona(
        document.getElementById('nombre').value,
        document.getElementById('apellido').value));
    
    mostrarPersonas();
    resetearCampos();
}
// READ
function mostrarPersonas(){

    li = personas.map(persona => `<li>${persona.nombre} ${persona.apellido}</li>`).join(" ");
    document.getElementById('personas').innerHTML = li;
    if(personas.length == 0) {document.getElementById('personas').innerHTML = '<h3>No hay personas en la lista</h3>'};
}
// UPDATE
function actualizarPersona(){
    num = parseInt(prompt("Ingrese el número de la persona a borrar"));
    if(num < 1 || num > personas.length || num == "" || isNaN(num)) return alert("Persona no encontrada o numero invalido");
    
    let nuevaPersona = (prompt("Ingresa el nombre y apellido que desea actualizar"));
    let [nombre, apellido] = nuevaPersona.trim().split(" "); // Desestructuracion (asignamos la nueva persona al array)
    
    if(nombre == undefined || apellido == undefined) return alert("Campos vacios");
    if(personas.find(p => p.nombre == nombre.trim() && p.apellido == apellido.trim())){
        return alert("La persona ya existe!");
    }else{
        if(confirm(`Seguro que desea actualizar la persona ${personas[num -1].nombre} ${personas[num -1].apellido} a ${nombre} ${apellido}`)){
            console.log("Persona actualizada con exito!");
        }else{
            return;
    }}

    personas.splice(num -1, 1, new Persona(nombre, apellido));
    mostrarPersonas();
}
// DELETE
function borrarPersona(){

    let num = parseInt(prompt("Ingrese el número de la persona a borrar"));
    if(num == "" || isNaN(num) || num < 0 || num > personas.length) return alert("Numero incorrecto o invalido!");
    
    if(confirm(`Seguro que desea eliminar a ${personas[num-1].nombre} ${personas[num-1].apellido}`)){
        personas.splice(num -1, 1);
        console("Persona eliminada con exito!");
    }else {
        return;
    }
    
    mostrarPersonas();
}
// Resetear campos
function resetearCampos (){
    document.getElementById('forma').reset();
}