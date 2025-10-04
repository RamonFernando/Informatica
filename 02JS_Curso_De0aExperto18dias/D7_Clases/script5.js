function automatizarSuma() {
    let sumaTotal = 0;
    let contenido = document.getElementById("contenido");
    for(let suma of contenido.children){
        sumaTotal += Number(suma.children[1].value);
    }
}
// div padre.children
    // p 0 hijo
        // label 0 nietos
        // input 1 nietos
 
// p  
    // label 0
    // input 1

    // suma 
    // contenido.children > p

    // 1 = 84, 2 = 35, 3 = 69