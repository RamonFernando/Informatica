let nota = 5;
let nota2 = 6;
let nota3 = 7;
let promedio = (nota + nota2 + nota3) / 3;
console.log(promedio);

let n = 8;

// if, else if
if (n >= 9) {
  console.log("Sobresaliente");
} else if (n >= 7) {
  console.log("Notable");
} else if (n >= 5) {
  console.log("Aprobado");
} else {
  console.log("Suspenso");
}

// switch
switch (n) {
  case 9:
    console.log("Sobresaliente");
    break;
  case 7:
    console.log("Notable");
    break;
  case 5:
    console.log("Aprobado");
    break;
  default:
    console.log("Suspenso");
    break;
}