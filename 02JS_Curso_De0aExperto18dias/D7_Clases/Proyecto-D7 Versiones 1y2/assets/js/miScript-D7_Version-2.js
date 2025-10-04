// Funciones
function calcularDatos() {
    
    // Variables (agregamos las posiciones manualmente)
    let tiendas = [];
    tiendas[0] = extraerElemento("tienda-1");
    tiendas[1] = extraerElemento("tienda-2");
    tiendas[2] = extraerElemento("tienda-3");
    tiendas[3] = extraerElemento("tienda-4");
    tiendas[4] = extraerElemento("tienda-5");
    tiendas[5] = extraerElemento("tienda-6");
    
    // Funciones 
    let totalVentas = calcularSumaTotal(tiendas); //calculamos el total de ventas pasandole el array (tiendas)
    let numeroMayor = calcularNumeroMayor(tiendas); // calculamos el numero mayor de ventas 
    let numeroMenor = calcularNumeroMenor(tiendas); // calculamos el numero menor de ventas 
    let promedio = calcularPromedio(tiendas); // calculamos el promedio de ventas

    
    // mostrar resultados
    let mensajeVentasTotales = "Las ventas totales son: " + totalVentas + " €";
    let mensajePromedio = "El promedio de ventas es: " + promedio + " €";
    let mensajeVentaMayor = "La venta mayor es: " + numeroMayor + " €";
    let mensajeVentaMenor = "La venta menor es: " + numeroMenor + " €";
    
    // obtener los elementos HTML (id) para mostrar los resultados
    document.getElementById("totalVentasRespuesta").textContent = mensajeVentasTotales;
    document.getElementById("promedioRespuesta").textContent = mensajePromedio;
    document.getElementById("ventaMayor").textContent = mensajeVentaMayor;
    document.getElementById("ventaMenor").textContent = mensajeVentaMenor;
}
// Extraer elemento
function extraerElemento(elemento) {
    let miElemento = document.getElementById(elemento);
    let miTexto = miElemento.value;
    let miNumero = Number(miTexto);
    return miNumero;
}
// Suma total
function calcularSumaTotal(array) {
    let sumaTotal = 0;
    for (let venta of array) {
        sumaTotal += venta;
    }
    return sumaTotal;
}
// Numero mayor
function calcularNumeroMayor(array) {
    let maximo = array[0];
    for (let venta of array) {
        if (venta > maximo) {
            maximo = venta;
        }
    }
    return maximo;
}
// Numero menor
function calcularNumeroMenor(array) {
    let minimo = array[0];
    for (let venta of array) {
        if(venta < minimo){
            minimo = venta;
        }
    }
    return minimo;
}
// Promedio
function calcularPromedio(array) {

    let totalVentas = 0;
    for (let i = 0; i < array.length; i++) {
        totalVentas += array[i];
    }

    let promedio = totalVentas / array.length; // promedio
    promedio = promedio.toFixed(2); // redondear a dos decimales

    return promedio;
}



/*function calcularPromedioFor() {
    let tiendas = [];
    let totalVentas = 0;

    for (let i = 1; i < tiendas.length; i++) {
        tiendas[i] = extraerElemento(`tienda-${i}`);
        totalVentas += tiendas[i];
        console.log(tiendas[i]);
        console.log(totalVentas);
        
    }
}
console.log(calcularPromedioFor());*/