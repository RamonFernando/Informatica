// Crear un objeto con propiedades
let persona = {
    nombre: "Juan",
    edad: 30,
    ciudad: "Madrid"
};

// Acceder a las propiedades
console.log(persona.nombre); // "Juan" (notación de punto)
console.log(persona["edad"]); // 30 (notación de corchetes)

// Modificar propiedades
persona.edad = 31;
console.log(persona.edad); // 31

// Agregar nuevas propiedades
persona.profesion = "Desarrollador";
console.log(persona.profesion); // "Desarrollador"

/*
Usa la notación de punto (objeto.propiedad) o corchetes (objeto["propiedad"]) para acceder o modificar propiedades.
Puedes agregar nuevas propiedades dinámicamente.
*/