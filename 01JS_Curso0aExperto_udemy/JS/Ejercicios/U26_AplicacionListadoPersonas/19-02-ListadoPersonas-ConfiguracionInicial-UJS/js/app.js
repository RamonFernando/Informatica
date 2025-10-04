const personas = [
    new Persona('Juan','Perez'),
    new Persona('Karla', 'Lara'),
    new Persona('Miguel', 'Cervantes'),
    new Persona('Maite', 'Danese'),
    new Persona('Ramón', 'Pérez')
];
const regex = /^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\s]+$/; // Expresión regular para validar solo letras
function mostrarPersonas(){
    let texto = personas.map(persona => `<li>${persona.nombre} ${persona.apellido}</li>`).join(' ');
    document.getElementById('personas').innerHTML = texto;
};

function agregarPersona(){
    const {nombre, apellido} = document.forms['forma']; // (Desestructuración) accedemos al formulario con forms
    if((nombre.value == "" || apellido.value == ""))
        alert("Por favor, completa todos los campos.");
    else
        ((!regex.test(nombre.value) || !regex.test(apellido.value)) ? alert("Caracteres no permitidos") :
            personas.push(new Persona(nombre.value, apellido.value)));
    
    mostrarPersonas();
};

function borrarPersona(){
    let id = parseInt(prompt("Inserte el número de la persona a borrar"));
    if (isNaN(id) || id == null) { // Comprobamos que el id sea un numero y no nulo
        alert("Error! Valor no numérico o nulo.");
        return;
    }
    (id > personas.length || id < 1) ? alert("Persona no encontrada") : personas.splice(id - 1, 1);
    mostrarPersonas(); // Mostramos el listado de personas
};

function actualizarPersona(){
    let id = parseInt(prompt("Inserte el número de la persona a actualizar"));
    if(id > personas.length || id < 1){
        alert("Persona no encontrada");
    }else{
        let nuevoNombre = prompt("Inserte el nuevo nombre y apellido");
        (nuevoNombre == "" || !nuevoNombre || !regex.test(nuevoNombre)) ? alert("Información no actualizada") :
            personas[id - 1] = new Persona(nuevoNombre.trim().split(" ")[0], nuevoNombre.trim().split(" ")[1]);
    }
    mostrarPersonas();
};
