// Extrae el valor de un elemento HTML y lo convierte en un número
function extraerElemento(elemento) {
    let miElemento = document.getElementById(elemento);
    let miTexto = miElemento.value;
    let miNumero = Number(miTexto);
    return miNumero;
}

// Calcula el promedio de las ventas
function calcularPromedio() {

    let tienda1 = extraerElemento("tienda-1");
    let tienda2 = extraerElemento("tienda-2");
    let tienda3 = extraerElemento("tienda-3");
    let tienda4 = extraerElemento("tienda-4");
    let tienda5 = extraerElemento("tienda-5");
    let tienda6 = extraerElemento("tienda-6");
    // total de ventas
    let totalVentas = tienda1 + tienda2 + tienda3 + tienda4 + tienda5 + tienda6;
    let promedio = totalVentas / 6; // promedio
    promedio = promedio.toFixed(2); // redondear a dos decimales
    
    // mostrar resultados
    let mensajeVentas = "Las ventas totales son: " + totalVentas + " €";
    let mensajePromedio = "El promedio de ventas es: " + promedio + " €";
    
    // obtener los elementos HTML (id) para mostrar los resultados
    document.getElementById("totalVentasRespuesta").textContent = mensajeVentas;
    document.getElementById("promedioRespuesta").textContent = mensajePromedio;
}