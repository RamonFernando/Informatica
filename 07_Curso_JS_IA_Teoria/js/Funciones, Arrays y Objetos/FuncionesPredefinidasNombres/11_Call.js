// Call se utiliza para llamar objetos sin una clase predefinida antes
const describir = function() {
    console.log(`Me llamo ${this.nombre} y tengo ${this.edad} años.`);
};
// Instanciamos un objeto
const persona1 = { nombre: "Juan", edad: 25 };
const persona2 = { nombre: "María", edad: 30 };

// Usamos call() para cambiar el contexto de this y llamar al método
describir.call(persona1); // "Me llamo Juan y tengo 25 años."
describir.call(persona2); // "Me llamo María y tengo 30 años."


const persona = {
    nombre: "Juan",
    edad: 25,
    describir: function() {
        console.log(`Me llamo ${this.nombre} y tengo ${this.edad} años.`);
    }
};

// Llamamos al método del objeto
persona.describir();
// Salida: "Me llamo Juan y tengo 25 años."


function describirConSaludo(saludo) {
    console.log(`${saludo}, me llamo ${this.nombre} y tengo ${this.edad} años.`);
}
function describirConSaludo1(saludo) {
    return `${saludo}, me llamo ${this.nombre} y tengo ${this.edad} años.`;
}

// Usamos la función con diferentes objetos y saludos
describirConSaludo.call(persona1, "Hola");   // "Hola, me llamo Juan y tengo 25 años."
describirConSaludo.call(persona2, "Buenas"); // "Buenas, me llamo María y tengo 30 años."

// Usamos la función con diferentes objetos y saludos
console.log(describirConSaludo1.call(persona1, "Hello"));   // "Hola, me llamo Juan y tengo 25 años."
console.log(describirConSaludo1.call(persona2, "Bonjuor")); // "Buenas, me llamo María y tengo 30 años."

// Si no utilizas call te tendrás que cambiar el contexto de this
describirConSaludo(persona1, "Hola");   // "[object Object], me llamo undefined y tengo undefined años."
describirConSaludo(persona2, "Buenas"); // "[object Object], me llamo undefined y tengo undefined años."