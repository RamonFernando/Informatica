// While Loop
// While Loop: Es un bucle que se ejecuta mientras se cumpla la condición dentro del paréntesis.

// Diferencia entre while y do while: 
// do while ejecuta el codigo al menos una vez y luego evalua la condición 
// while primero comprueba la condición y si es correcta luego se ejecuta

// Mostrar números del 1 al 10
let i = 0;
while (i < 10) {
  console.log(i);
  i++;
}

console.log("While Loop");

// While Par o impar
let numero = 1;
while (numero >= 1 && numero <= 10) {
  if (numero % 2 === 0) {
    console.log(`El numero ${numero} es par`);
  } else {
    console.log(`El numero ${numero} es impar`);
  }

  numero++;
}
