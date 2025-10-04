// ejercicio 1 y 2

const NOMBRE_REQUERIDO = "usuario";
const PASSWORD_REQUERIDO = "java8";

const nombreUsuario = prompt("Introduce tu nombre de usuario:");
const passwordUsuario = prompt("Introduce tu contraseña:");

if (nombreUsuario === NOMBRE_REQUERIDO && passwordUsuario === PASSWORD_REQUERIDO) {
    console.log("Acceso permitido");
    alert("Acceso permitido");
} else {
    console.log("Acceso denegado");
    alert("Acceso denegado");
}


// ejercicio 3 

const numero = prompt("Introduce un número:");

const resultado = (numero % 2 !== 0) ? "Es impar" : "No es impar";

console.log(resultado);
alert(resultado);

// ejercicio 4

const nota = parseFloat(prompt("Introduce la nota del examen:"));

let color;

if (nota < 4) {
    color = "Rojo";
} else if (nota >= 4 && nota < 5) {
    color = "Verde";
} else if (nota >= 5) {
    color = "Azul";
} else {
    color = "Nota inválida";
}

console.log(`Color para la nota: ${color}`);
alert(`Color para la nota: ${color}`);

// ejercicio 5

const opcion = parseInt(prompt("Elige un idioma:\n(1) Francés\n(2) Inglés\n(3) Alemán\n(4) Italiano"));

let saludo;

switch(opcion) {
    case 1:
        saludo = "Bonjour";
        break;
    case 2:
        saludo = "Good morning";
        break;
    case 3:
        saludo = "Guten Morgen";
        break;
    case 4:
        saludo = "Buongiorno";
        break;
    default:
        saludo = "Buenos días";
}

console.log(saludo);
alert(saludo);