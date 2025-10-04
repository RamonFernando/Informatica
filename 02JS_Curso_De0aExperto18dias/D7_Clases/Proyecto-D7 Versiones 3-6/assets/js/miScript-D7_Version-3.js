// Funciones 
// Curso JavaScript Total - De Cero a programador web en 18 dias (udemy) Seccion 7
/* NOTA: (v-variable, p-parametro, a-array y f-funcion) es pseudocodigo para entender las funciones, el(*)asterisco detras 
de una variable indica una modificacion del codigo posterior es decir que la variable se creo despues de hacer 
el codigo y se le pone asterisco para no modificar todo el codigo ejemplo (v1*) en cada funcion los (v,p) se reinician*/

/*  Funcion para crear tiendas 
    parm: contenedorId (string), min (number), cantidadTiendas (number)
    return: elementoParrafo <p>
    Crea un for para crear tantas tiendas como se pidan creando una etiqueta(textoEtiqueta) 
    con un contador(cantidadTiendas) y llama a la funcion (f1) crearParrafoTienda para crear el 
    parrafoTienda(textoEtiqueta, min)
    y agregue el contenido del parrafo en el HTML.  
    Crea el elemento parrafoTienda y lo agrega al contenedor(elementoContenedor)
     */
function crearTiendas(contenedorId, min, cantidadTiendas) { // f1 p1 p2 p3
    // Encontrar contenedor por su id
    let elementoContenedor = document.getElementById(contenedorId); // v1
    // loop para crear tantas tiendas como se pidan
    for(let conteoTiendas=1; conteoTiendas<=cantidadTiendas; conteoTiendas++) { // conteoTiendas = i(iterador o incremento);
        // crear el texto de label para poder llamar a la funcion
        let textoEtiqueta = "Tienda " + conteoTiendas; // v2 y i
        // crear tiendas con crearParrafoTienda
        let parrafoTienda = crearParrafoTienda(textoEtiqueta, min); // v3 = f2(v2, p2)
        
        // agregar el parrafo al contenedor
        elementoContenedor.appendChild(parrafoTienda); // v1(v3)
    }   
    return elementoContenedor; // v1
}
/*Funcion para crear texto(parrafo) de tienda
    parm: textoLabel (string), valorMin (number)
    return: elementoParrafo <p>
    Crea una etiqueta <p>(v1) con un <label>(v2) y un <input>(v3)
    y le asigna atributos (type, id, min, value) al elemento input
    (v1 v2 v3) es pseudocodigo para entender la funcion */
function crearParrafoTienda(textoLabel, valorMin) { // f2 p1 p2
    // Crear etiqueta <div>
    let elementoDiv = document.createElement("div"); // v1*
    elementoDiv.setAttribute("class", "box-input"); // Agregar atributo class (class="box-input") v1*

    // Crear etiqueta <p>
    //let elementoParrafo = document.createElement("p"); // v1
    
    // Crear etiqueta <label>
    let elementoEtiqueta = document.createElement("label"); // v2
    elementoEtiqueta.innerText = textoLabel + ": ";
    
    // Conectar con <input>
    elementoEtiqueta.setAttribute("for", textoLabel);
    
    // Crear el input
    let elementoInput = document.createElement("input"); // v3
    
    // Establecer atributos de input (type, id, min, value) // v3
    elementoInput.setAttribute("type", "number"); // Agregar atributo type (type="number")
    elementoInput.setAttribute("id", textoLabel); // Agregar atributo id (id="textoLabel")
    elementoInput.setAttribute("min", valorMin); // Agregar atributo min 
    elementoInput.setAttribute("value", 0); // Agregar atributo value (value="0")
    
    // Agregar label e input al parrafo o Div
    //elementoDiv.appendChild(elementoParrafo); // v1*(v1)
    elementoDiv.appendChild(elementoEtiqueta); // v1(v2) 
    elementoDiv.appendChild(elementoInput); // v1(v3)
    

    // Devolver el parrafo completo
    return elementoDiv; // v1
    // return elementoParrafo; // v1
}
// Se piden los datos de las ventas
/* Funcion para pedir datos de las ventas
    variables: (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
    Devuelve: Ventas totales, promedio, mayor y menor  
    Crea los input de las ventas mediante un for  que llama a la funcion (f4) extraerNumeroDesdeElemento
    y le agrega el valor al array (a1) al hijo item.children[1] (2do hijo del parrafo)
    <div> // Instruccion para crear el div del ejercicio en el HTML
        <label><label/>
        <input/>
    <div/>
    */
function calcularDatos() { // f3
    
    // Variables (agregamos las posiciones manualmente)
    let ventas = []; // a1
    let posicionVentas = 0; // v1
    let elementosVentas = document.getElementById("itemsTienda"); // v2(id) 
    

    // Por cada item del array elementosVentas(hijo) tomamos el valor de ventas que tiene el input de cada parrafo (div)
    for(let item of elementosVentas.children) { // v3
        // Le decimos que vaya a la funcion y que tome el valor del input que es el 2do Hijo del parrafo(div), el 1ro es el label
        let valorVenta = extraerNumeroDesdeElemento(item.children[1]); // v4 = f4(v3.id) posicion 2 del array (input)tienda
        
        ventas[posicionVentas] = valorVenta;
        posicionVentas ++;
    }
    
    // Funciones // v5, v6, v7, v8
    let totalVentas = calcularSumaTotal(ventas); //calculamos el total de ventas pasandole el array (tiendas) //v5 = f5(a1)
    let numeroMayor = calcularNumeroMayor(ventas); // calculamos el numero mayor de ventas //v6 = f6(a1)
    let numeroMenor = calcularNumeroMenor(ventas); // calculamos el numero menor de ventas //v7 = f7(a1)
    let promedio = calcularPromedio(ventas); // calculamos el promedio de ventas //v8 = f8(a1)
    
    // Mostrar color
    for (let item of elementosVentas.children) {
        let valorVenta = extraerNumeroDesdeElemento(item.children[1]); // f4 = v4
        item.children[1].className = "menuNeutro";
        if(valorVenta == numeroMayor){ // Muestra el color de la venta mayor // v4 = v6
            item.children[1].className = "menuInputMayor"; // Utiliza el atributo className para dar nombre a la clase
        }
        if (valorVenta == numeroMenor) { // Muestra el color de la venta menor // v4 = v7
            item.children[1].className = "menuInputMenor";
        }
        if(numeroMayor == numeroMenor){
            item.children[1].className = "menuInputIgual";
        }
        if (numeroMayor == 0 && numeroMenor == 0) {
            item.children[1].className = "menuInputCero";
        }
    }

    // mostrar resultados // v9, v10, v11, v12
    let mensajeVentasTotales = "Las ventas totales son: " + totalVentas + " €"; //v9 = v5
    let mensajePromedio = "El promedio de ventas es: " + promedio + " €"; // v10 = v8
    let mensajeVentaMayor = "La venta mayor es: " + numeroMayor + " €"; // v11 = v6
    let mensajeVentaMenor = "La venta menor es: " + numeroMenor + " €"; // v12 = v7
    
    // obtener los elementos HTML (id) para mostrar los resultados (al id se le asigna el valor (=) de la variable)
    document.getElementById("totalVentasRespuesta").textContent = mensajeVentasTotales; // id = v9 = v5
    document.getElementById("promedioRespuesta").textContent = mensajePromedio; // id = v10 = v8
    document.getElementById("ventaMayor").textContent = mensajeVentaMayor; // id = v11 = v6
    document.getElementById("ventaMenor").textContent = mensajeVentaMenor; // id = v12 = v7
}
// Extraer elemento
function extraerNumeroDesdeElemento(elemento) { // f4
    // let miElemento = document.getElementById(elemento); // Extrae el elemento id
    let miTexto = elemento.value; // Extrae el valor del elemento (input)
    let miNumero = Number(miTexto); // Convierte el texto en un numero
    return miNumero; // Devuelve el numero
}
// Suma total
function calcularSumaTotal(array) { // f5
    let sumaTotal = 0;
    for (let venta of array) { // Recorre el array
        sumaTotal += venta; // Suma las ventas por cada iteracion  del array
    }
    return sumaTotal;
}
// Numero mayor
function calcularNumeroMayor(array) { // f6
    let maximo = array[0];
    for (let venta of array) {
        if (venta > maximo) {
            maximo = venta;
        }
    }
    return maximo;
}
// Numero menor
function calcularNumeroMenor(array) { // f7
    let minimo = array[0];
    for (let venta of array) {
        if(venta < minimo){
            minimo = venta;
        }
    }
    return minimo;
}
// Promedio
function calcularPromedio(array) { // f8

    let totalVentas = 0;
    for (let i = 0; i < array.length; i++) {
        totalVentas += array[i];
    }

    let promedio = totalVentas / array.length; // promedio
    promedio = promedio.toFixed(2); // redondear a dos decimales
    
    let numPromedio = Number(promedio); // Convierte el texto en un numero (de String a numero)
    return numPromedio;
}

