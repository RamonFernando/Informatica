/* Script Ejercicio D6 */
function multiplicar() {
    // obtener id del elemento input en el que se ingresa el numero
    let elementoTabla = document.getElementById("numeroTabla");
    let textoNumeroTabla = elementoTabla.value;
    let numeroTabla = Number(textoNumeroTabla);
    
    // Obtener id del elemento resultado
    let resultado = document.getElementById("resultado");
    let numTabla = document.getElementById("numTabla");
    // Vaciar la tabla antes de ejecutar
    resultado.innerText = "";

    // variable que cuenta el numero de iteraciones 
    // del for para mostrar la tabla
    let contador = 1;
    numTabla.textContent = " del " + numeroTabla;
    // Multiplicar el numero por la tabla
    for (i = 1; i <= 10; i++) {
        // Calcular el resultado
        let numeroResultado = numeroTabla * i;

        // Mostrar resultado en la tabla
        let textoResultado = contador + ".  (" + numeroTabla + " x " + i + ") = " + numeroResultado;

        // Crear un elemnento en la lista 
        let itemLista = document.createElement("li");
        itemLista.innerText = textoResultado;
        resultado.appendChild(itemLista);
        contador++;
    }
    
}