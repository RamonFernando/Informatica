/*
5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de 
un examen que hayas hecho este curso (no sólo de programación).
*/
/*
// Ejercicio para usar en el HTML
let notas = Array(5).fill(0).reduce((resultado, _, i) => {
    let nota = prompt("Nota: " + (i + 1) + '\n' + "Por favor, ingresa una nota entre 0 y 10: " );

    // Mientras que nota sea mayor a menor a 0 o mayor a 10 se repite el prompt while(si es falso se repite)
    while (nota < 0 || nota > 10 || nota == ""){ 
        nota = prompt("Nota: " + (i + 1) + '\n' + "Nota Incorrecta!, ingresa una nota entre 0 y 10: ");    
    };
    resultado.push(parseFloat(nota));
    return resultado;
}, []);
*/
let notas = [8, 7, 9, 10, 6];

// mostramos las notas y sacamos el promedio
let notaMedia = notas.reduce((acumulador, nota) => acumulador + nota, 0) / notas.length;
console.log("Notas:", notas);
console.log("Promedio:", notaMedia.toFixed(2));


let notas2 = [8, 7.5, 9, 10, 6.5];
let notaMedia2 = notas2.reduce((acumulador, nota ) => (acumulador + nota), 0) / notas.length;
console.log("Notas:", notas);
console.log("Promedio:", notaMedia2.toFixed(2));

// Notas mayores a 5 con filter
let notasMayores5 = notas.filter(nota => nota > 5);
console.log("Notas mayores a 5:", notasMayores5);
console.log("Tienes " + notasMayores5.length + " notas mayores a 5");
