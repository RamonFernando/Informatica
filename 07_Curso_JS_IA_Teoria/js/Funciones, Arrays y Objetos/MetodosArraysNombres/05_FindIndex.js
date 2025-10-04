// Crear un array de objetos
let personas = [
    { nombre: "Ana", edad: 25 },
    { nombre: "Luis", edad: 30 },
    { nombre: "Marta", edad: 20 }
];

// Buscar el índice de la persona con edad mayor a 25
let indice = personas.findIndex((persona) => persona.edad > 25);
console.log(indice); // 1 (Luis es el primero que cumple la condición)

// findIndex devuelve el índice del primer elemento que cumple la condición.
// Si ningún elemento cumple, devuelve -1.