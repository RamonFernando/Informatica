let objeto1 = { a: 1, b: 2 };
let objeto2 = { b: 3, c: 4 };

// Combinar objetos con el operador spread
let combinado = { ...objeto1, ...objeto2 };
console.log(combinado); // { a: 1, b: 3, c: 4 }

// El operador spread combina objetos. Si las propiedades se repiten, las del objeto más a la derecha prevalecen.