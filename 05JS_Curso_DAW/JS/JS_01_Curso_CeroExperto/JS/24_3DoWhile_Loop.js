// Do While Loop
// La condicion se coloca al final del bucle

// Diferencia entre while y do while: 
// do while ejecuta el codigo al menos una vez y luego evalua la condición 
// while primero comprueba la condición y si es correcta luego se ejecuta

let k = 0;
do {
  console.log(k);
  k++;
} while (k < 10);

console.log("Do While Loop");

// Do While Par o impar
let j = 1;
do {
  if (j % 2 === 0) {
    console.log(`El numero ${j} es par`);
  }else {
    console.log(`El numero ${j} es impar`);
  }
  j++;
} while (j < 10);
