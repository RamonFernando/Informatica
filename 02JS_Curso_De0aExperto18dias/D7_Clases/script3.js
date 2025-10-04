function generarContenido(numero) {
    let content, label, input;// v1, v2, v3
    content = document.getElementById("contenido");// v1
    
    label = document.createElement("label");// v2
    label.setAttribute("for", "txtInput" + numero);// v2
    label.innerText = "Label " + numero;// v2  


    input = document.createElement("input");// v3
    input.setAttribute("id", "txtInput" + numero);// v3
    input.setAttribute("type","number");// v3
    input.setAttribute("value", 0); // v3

    content.appendChild(label); // v1(v2)
    content.appendChild(input); // v1(v3)


    return content; // v1
    }