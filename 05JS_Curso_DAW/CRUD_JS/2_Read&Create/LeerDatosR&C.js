let elementos = ["Ramon Fernando", "Maite Danese", "Nichi", "Peach"];

function leerTexto(){
    let lista = document.getElementById("resultado");
    lista.innerHTML = "";
    
    for (const elemento of elementos) {
        let item = document.createElement("li");
        item.innerText = elemento;
        lista.appendChild(item);
    }
    
}

function agregarElemento() {
    let entrada = document.getElementById("elementoTexto");
    let nuevoElemento = entrada.value.trim();
    if(nuevoElemento){
        elementos.push(nuevoElemento);
        entrada.value = "";
        leerTexto();
    }else{
        alert("Por favor, escribe un elemento.");
    }
}

// Eliminar por posicion del array empezando desde el 1 y no el 0
/*function borrarElemento() {
    let borrarElemento = document.getElementById("elementoTexto").value;
    elemento = Number(borrarElemento);
    for (let i = elemento; i <= elementos.length; i++) {
            elementos.splice((i-1), 1);
            break;
    }
    leerTexto();
}*/

function borrarElemento() {
    let borrarElemento = document.getElementById("elementoTexto").value;
    elemento = Number(borrarElemento);
    elementos.splice((elemento-1), 1);
    leerTexto();
}

