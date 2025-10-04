// 6. JSON.stringify y JSON.parse

// Convierte objetos a cadenas JSON y viceversa.
// Convertir un objeto a JSON
let persona = { nombre: "Ana", edad: 25 };
let json = JSON.stringify(persona);
console.log(json); // '{"nombre":"Ana","edad":25}'

// Convertir JSON a un objeto
let objeto = JSON.parse(json);
console.log(objeto.nombre); // "Ana"
console.log(objeto.edad); // 25

// Muy usado en aplicaciones web para almacenar o transmitir datos.