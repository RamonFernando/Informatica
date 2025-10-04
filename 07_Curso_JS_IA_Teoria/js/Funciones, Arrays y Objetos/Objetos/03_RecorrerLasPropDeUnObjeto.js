let usuario = {
    nombre: "Ana",
    edad: 25,
    pais: "España"
};

// Usar un bucle for...in
for (let clave in usuario) {
    console.log(`${clave}: ${usuario[clave]}`);
}
// Resultado:
// nombre: Ana
// edad: 25
// pais: España
