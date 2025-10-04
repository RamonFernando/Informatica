// Algoritmos JS
// Hacer una resta sin restar
function restarAlg(a, b) {
    let valor = 0;
    let num1 = a, num2 = b;
    while (a > b) {
        b++;
        valor++;
    }
    return `${num1} - ${num2} = ${valor}`;
}
console.log(restarAlg(10, 2)); // 8

// Hacer una suma sin sumar
function sumarAlg(a, b) {
    let result = 0;
    let num1 = a, num2 = b;
    while (a) {
        a--; 
        b++;
    }
    result = `${num1} + ${num2} = ${b}`;
    return result;
}
console.log(sumarAlg(7, 5)); 

// Hacer una suma sin sumar
function multiplicarAlg(a, b) {
    let valor = 0;
    let num1 = a, num2 = b;
    while (a) {
        a--;
        valor += b;
    }
    return `${num1} * ${num2} = ${valor}`;
}
console.log(multiplicarAlg(10, 2));

// Dividir dos números
function dividirAlg(a, b) {
    let valor = 0;
    let num1 = a, num2 = b;
    while (a>=b) {
        a -= b; 
        valor++;
    }
    valor = `${num1} / ${num2} = ${valor}`;
    return valor;
}
console.log(dividirAlg(15, 3)); 

// Potencia dos números
function powAlg(a, b) {
    let valor = 1;
    let num1 = a, num2 = b;
    while (b) { // Tambien puede ser la condicion (b > 0)
        b--;
        valor *= a;
    }
    return `Pow: ${num1} ^ ${num2} = ${valor}`;
}
console.log(powAlg(5, 4)); // 4(5*5*5*5) = 625 4(5*5 = 25 * 5 = 125 * 5 = 625)

// Factorial de un número
// El factorial de un número es el producto de todos los números anteriores. Ejemplo 4! = 4*(1*2*3*4) = 24
function factorialAlg(a) {
    let valor = 1;
    for (let i = 1; i <= a; i++) {
        valor *= i;
        
    }
    return `Factorial: ${a}! = ${valor}`;
}
console.log(factorialAlg(5)); // 120 (!5 = 120 5*(1*2*3*4*5) = 120) (5*1 = 5*2 = 10*3 = 30*4 = 120)

// Número Primo
// Número primo es aquel que solo es divisible por 1 y por si mismo
function primeNum(num) {
    Boolean = true;
    for (let i = 2; i <= num/2 && Boolean; i++) {
        if (num % i == 0) {
            Boolean = false;
        }
    }
    return `Is prime (${num})? : ${Boolean}`;
}
console.log(primeNum(7));

// Número Perfecto
// Número perfecto es aquel que es igual a la suma de todos sus divisores Ejemplo 28 = (1 + 2 + 4 + 7 + 14)
function perfectNumAlg(num) {
    let value = 0;
    Boolean = false;
    for (let i = 1; i < num; i++) {
       if (num % i == 0) { // Si el resto de la division es 0
        value += i; // Se suma el valor de los divisores y se acumulara en value
        } 
    }
    if (value == num) {
        Boolean = true;
    }
    return `Is perfect number (${num})? : ${Boolean}`;
}
console.log(perfectNumAlg(28));

// Números Amigos
// Dos números distintos son amigos si a cada uno de ellos se lo obtiene sumando los divisores propios del otro (220 y 284)
// Ejemplo: 220 divisores (1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110) = 284 
// Ejemplo: 284 (1, 2, 4, 71, 142) = 220
function verifyFriends(num1, num2) {
    let sum1 = 0, sum2 = 0, result= 0;
    Boolean = false;
    // sum1
    for (let i = 1; i <= num1 /2; i++) {
        if(num1 % i == 0){
            sum1 += i;
        }      
    }
    // sum2
    for (let i = 0; i <= num2 /2; i++) {
        if (num2 % i == 0) {
            sum2 += i;
        }   
    }
    if (num1 == sum2 && num2 == sum1) {
        Boolean = true;
    }
    result = `Is friends (${num1} and ${num2})? : ${Boolean}`
    return result;
}
console.log(verifyFriends(220, 284));

// Número Guay
// Un número es guay si es igual a la suma de todos sus divisores, excepto el mismo. Ejemplo 6 = (1 + 2 + 3)
function guayNumber(num) {
    let value = 0, result = 0, varNum = num;
    Boolean = false;
    for (let i = 1; i < num && Boolean == false; i++) {
        value+= i;
        if (value == num) {
            Boolean = true;   
        } 
    }
    result = `Is guay number (${varNum}) = sum (${value})? : ${Boolean}` ;
    return result;
}
console.log(guayNumber(15)); 

// Fibonacci
// La serie Fibonacci es una serie de números donde el siguiente siempre es la suma de los dos anteriores. Ejemplo 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
function fibonacci(num) {
    let a = 0, b = 1, result = 0;
    for (let i = 0; i < num; i++) {
        result = a + b;
        a = b;
        b = result;
    }
    result = `Fibonacci at position ${num} = ${result}`;
    return result;
    
}
console.log(fibonacci(4));