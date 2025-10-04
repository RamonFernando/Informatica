let original = { a: 1, b: 2 };

// Clonar con Object.assign
let copia1 = Object.assign({}, original);
console.log(copia1); // { a: 1, b: 2 }

// Clonar con el operador spread
let copia2 = { ...original };
console.log(copia2); // { a: 1, b: 2 }

// Usa Object.assign o el operador spread (...) para crear una copia superficial de un objeto.