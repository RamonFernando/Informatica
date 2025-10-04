let mascota = {
    nombre: "Max",
    tipo: "perro",
    edad: 5
};

// Convertir a JSON
let json = JSON.stringify(mascota);
console.log(json); // '{"nombre":"Max","tipo":"perro","edad":5}'

// Convertir de JSON a objeto
let objetoDeNuevo = JSON.parse(json);
console.log(objetoDeNuevo); // { nombre: "Max", tipo: "perro", edad: 5 }

// JSON.stringify: Convierte un objeto a una cadena JSON.
// JSON.parse: Convierte una cadena JSON a un objeto.