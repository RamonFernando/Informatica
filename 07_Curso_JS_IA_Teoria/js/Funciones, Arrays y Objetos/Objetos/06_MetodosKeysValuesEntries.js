let producto = { id: 1, nombre: "Laptop", precio: 1500 };

// Obtener las claves
// Object.keys: Devuelve un array con las claves del objeto.
console.log(Object.keys(producto)); // ["id", "nombre", "precio"]

// Obtener los valores
// Object.values: Devuelve un array con los valores del objeto.
console.log(Object.values(producto)); // [1, "Laptop", 1500]

// Obtener pares clave-valor
// Object.entries: Devuelve un array de pares [clave, valor].
console.log(Object.entries(producto)); // [["id", 1], ["nombre", "Laptop"], ["precio", 1500]]

// Obtener el largo
// Object.entries().length: Devuelve el largo del objeto.
console.log(Object.entries(producto).length); // 3
// Concatenar las claves y los valores
console.log(Object.keys(producto).join(", ") + ", " + Object.values(producto).join(", ")); // 'id,nombre,precio, 1, Laptop, 1500'


