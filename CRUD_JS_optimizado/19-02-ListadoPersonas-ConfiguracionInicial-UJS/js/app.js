// Array de objetos Persona
// Se crea un array inicial que contiene varias instancias de la clase Persona, representando un conjunto predefinido de personas.
const personas = [
    new Persona('Juan', 'Perez'),
    new Persona('Karla', 'Lara'),
    new Persona('Miguel', 'Cervantes'),
    new Persona('Maite', 'Danese'),
    new Persona('Ramón', 'Pérez')
];

// Expresión regular para validar caracteres permitidos
// La expresión regula que solo se acepten letras (mayúsculas y minúsculas), números, caracteres con acentos, la letra "ñ" y espacios.
const regex = /^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\s]+$/;

// Función para mostrar la lista de personas en el DOM
// Genera una lista HTML con los nombres y apellidos de las personas en el array `personas` y la inserta en el elemento con ID 'personas'.
function mostrarPersonas() {
    let texto = personas.map(persona => `<li>${persona.nombre} ${persona.apellido}</li>`).join(' '); // Genera una lista concatenada con elementos <li>.
    document.getElementById('personas').innerHTML = texto;  // Actualiza el contenido del DOM.
};

// Función para agregar una nueva persona al array
// Valida los datos del formulario antes de agregar una nueva persona. Comprueba que los campos no estén vacíos y que los valores cumplan con la expresión regular.
function agregarPersona() {
    const {nombre, apellido} = document.forms['forma'];     // Accede al formulario llamado 'forma' y extrae los campos 'nombre' y 'apellido' mediante desestructuración.
    if ((nombre.value == "" || apellido.value == "")) {     // Verifica que los campos no estén vacíos.
        alert("Por favor, completa todos los campos.");     // Muestra un mensaje si faltan datos.
    } else {
        // método find devuelve el primer elemento que coincide con la condición o undefined si no se encuentra ninguno
        if (personas.find(persona => persona.nombre == nombre.value && persona.apellido == apellido.value))
            return alert("Error! Persona ya existente");
        
        (!regex.test(nombre.value) || !regex.test(apellido.value)) // Valida que los valores cumplan con la expresión regular.
            ? alert("Caracteres no permitidos")             // Alerta si los valores contienen caracteres no permitidos.
            : personas.push(new Persona(nombre.value, apellido.value)); // Agrega una nueva instancia de Persona al array.
    }
    mostrarPersonas();                                      // Actualiza la lista visual en el DOM.
};

// Función para borrar una persona del array
// Solicita al usuario el índice de la persona a eliminar. Valida la entrada y, si es válida, elimina a la persona correspondiente del array.
function borrarPersona() {
    let id = parseInt(prompt("Inserte el número de la persona a borrar")); // Solicita al usuario un índice numérico.
    if (isNaN(id) || id == null) {                  // Comprueba que el valor ingresado sea un número válido y no nulo.
        alert("Error! Valor no numérico o nulo.");  // Muestra un mensaje de error si el valor no es válido.
        return;                                     // Finaliza la ejecución de la función.
    }
    (id > personas.length || id < 1)                // Verifica si el número ingresado está dentro del rango del array.
        ? alert("Persona no encontrada")            // Alerta si el número está fuera de rango.
        : personas.splice(id - 1, 1);               // Elimina la persona correspondiente ajustando el índice (de base-1 a base-0).
    mostrarPersonas();                              // Actualiza la lista visual en el DOM.
};

// Función para actualizar la información de una persona
// Solicita al usuario el índice de la persona y un nuevo nombre completo. Valida los datos antes de actualizar la información.
function actualizarPersona() {
    let id = parseInt(prompt("Inserte el número de la persona a actualizar")); // Solicita el índice de la persona a modificar.
    if (id > personas.length || id < 1) {           // Valida que el índice esté dentro del rango permitido.
        alert("Persona no encontrada");             // Alerta si el índice es inválido.
        
    } else {
        let nuevoNombre = prompt("Inserte el nuevo nombre y apellido"); // Solicita un nuevo nombre completo al usuario.
        let nombre = nuevoNombre.trim().split(" ")[0]; // Extrae el primer nombre eliminando espacios adicionales.
        let apellido = nuevoNombre.trim().split(" ")[1]; // Extrae el apellido eliminando espacios adicionales.
        if(personas.find(persona => persona.nombre == nombre && persona.apellido == apellido)){ // Comprueba si la persona ya existe en el array.
            alert("Error! Persona ya existente");
            return;
        }
        (nuevoNombre == "" || !nuevoNombre || !regex.test(nuevoNombre)) // Valida que el nombre no esté vacío, sea válido y cumpla con la expresión regular.
            ? alert("Información no actualizada")   // Alerta si la entrada no es válida.
            : personas[id - 1] = new Persona(       // Actualiza la información de la persona en la posición correspondiente.
                nuevoNombre.trim().split(" ")[0],   // Extrae el primer nombre eliminando espacios adicionales.
                nuevoNombre.trim().split(" ")[1]    // Extrae el apellido eliminando espacios adicionales.
            );
    }
    mostrarPersonas();                              // Actualiza la lista visual en el DOM.
};
