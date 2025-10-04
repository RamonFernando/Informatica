function calcular(operacion, num1, num2) {
    if (operacion === "sumar") return num1 + num2;
    if (operacion === "restar") return num1 - num2;
    if (operacion === "multiplicar") return num1 * num2;
    if (operacion === "dividir") return num1 / num2;
    return "Operación no válida";
}

// Probar la calculadora
console.log(calcular("sumar", 5, 3)); // 8
console.log(calcular("restar", 10, 7)); // 3
console.log(calcular("multiplicar", 4, 6)); // 24
console.log(calcular("dividir", 20, 5)); // 4
