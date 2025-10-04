// 2. Math.random

// Genera un número aleatorio entre 0 (incluido) y 1 (excluido).
// Número aleatorio entre 0 y 1
let aleatorio = Math.random();
console.log(aleatorio); // Ejemplo: 0.673456

// Número aleatorio entre 1 y 10
let entreUnoYDiez = Math.floor(Math.random() * 10) + 1;
console.log(entreUnoYDiez); // Ejemplo: 7

// Muy útil para juegos o aplicaciones donde necesitas generar datos aleatorios.
// Multiplica Math.random() por un rango y usa Math.floor para redondear.

/*
EXPLICACION DEL MÉTODO
La expresión Math.floor(Math.random() * 10) + 1 se utiliza en JavaScript para generar un número aleatorio 
entre 1 y 10. Aquí te explico cómo funciona cada parte:

Math.random(): Esta función genera un número decimal aleatorio entre 0 (inclusive) y 1 (exclusivo). 
Por ejemplo, podría devolver 0.123456 o 0.987654.

Math.random() * 10: Multiplicando el resultado de Math.random() por 10, obtienes un número decimal 
aleatorio entre 0 y 10 (0 inclusive y 10 exclusivo). Por ejemplo, si Math.random() devuelve 0.5, el 
resultado sería 5.

Math.floor(...): La función Math.floor() redondea hacia abajo el número decimal al entero más cercano. 
Así que si el resultado anterior es 5.7, Math.floor(5.7) devolverá 5. Esto significa que el resultado 
de Math.floor(Math.random() * 10) será un número entero entre 0 y 9.

+ 1: Finalmente, al sumar 1 al resultado de Math.floor(...), se ajusta el rango de números posibles 
de 0-9 a 1-10. Por lo tanto, el resultado final será un número entero aleatorio entre 1 y 10.

En resumen, esta expresión se utiliza para obtener un número aleatorio en el rango de 1 a 10 en JavaScript.
*/