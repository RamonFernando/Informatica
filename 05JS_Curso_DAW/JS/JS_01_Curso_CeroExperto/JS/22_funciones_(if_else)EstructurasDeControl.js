// Estructuras de control

/* Nota:    1 signo de igual inicializar una variable
            2 signos de igual compara el valor
            3 signos de igual compara el valor y el tipo de dato */ 

const puntaje = 1000;
if(puntaje === 1000) {
    console.log(`El puntaje si es 1000`);
}else{
    console.log(`El puntaje no es 1000`);
}
const puntaje1 = 10;
if(puntaje1 !== 1000) {
    
    console.log(`El puntaje no es 1000`);
}else{
    console.log(`El puntaje si es 1000`);
}

const efectivo = 700;
const carrito = 800;

if(efectivo > carrito) {
    boleano = true;
    console.log(`El usuario puede pagar con efectivo ${efectivo}€\n${boleano}`);
}else{
    boleano = false;
    console.log(`Fondos Insuficientes ${efectivo}€\n${boleano}`);
}

const rol = "Administrador";
const rol2 = "Usuario";
if(rol === "Administrador") {
    console.log(`Acceso concedido con privilegios`);
} else if (rol === "Usuario") {
    console.log(`Acceso restringido`);
} else{
    console.log(`Acceso denegado`);
}

