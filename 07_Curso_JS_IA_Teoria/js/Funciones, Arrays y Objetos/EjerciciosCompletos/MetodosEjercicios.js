// Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro 
// estaciones del año (verano, otono, invierno, primavera). hazlo con reduce

let estaciones = ["verano", "otoño", "invierno", "primavera"];

let estacionesAnio = estaciones.reduce((acumulador, estacion) => {
    acumulador += ' ' + estacion.toLowerCase();
    return acumulador;
});

console.log(estacionesAnio);

// ** ---------------------------------------------------------------------------- ** //

// Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve) 
// planetas del Sistema Solar.

let planetas = ["Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno", "Pluton"];
let densidadesPlanetas = [0.330, 4.87, 5.97, 0.642, 1.27, 0.687, 1.64, 5.43, 10.7];

let densidades = planetas.reduce((_densidad, _planeta, i) => {
    _densidad[_planeta] = densidadesPlanetas[i];
    
    // Verificar que los arrays tengan la misma longitud
    if (planetas.length !== densidadesPlanetas.length) {
        throw new Error("Los arrays tienen longitudes diferentes.");
    }
    
    return _densidad;
}, {});

console.log(densidades);

// ** ---------------------------------------------------------------------------- ** //
// Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve) 
// planetas del Sistema Solar. Hacerlo con splice

let densidadesPlanetas2 = [0.330, 4.87, 5.97, 0.642, 1.27, 0.687, 1.64, 5.43, 10.7];

let planetas2 = ["Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno", "Pluton"];

let densidades2 = [];
// Agregar elementos a un nuevo array
for (let i = 0; i < planetas2.length; i++) {
    densidades2.push({
        [planetas2[i]]: densidadesPlanetas2[i]
    });
}
console.log(densidades2);

// ** ---------------------------------------------------------------------------- ** //


