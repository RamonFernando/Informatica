// 1. Texto inicial
let texto = "Hola, cómo estás hoy?";

// 2. Convertir a un array de caracteres
let caracteres = texto.split("");

// 3. Contar cada letra
let conteo = caracteres.reduce((contador, letra) => {
    if (letra !== " " && letra !== "," && letra !== "?") {
        contador[letra] = (contador[letra] || 0) + 1;
    }
    return contador;
}, {});

// 4. Mostrar los resultados
console.log("Conteo de letras:");
console.log(conteo);
