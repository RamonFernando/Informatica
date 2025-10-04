function mostrarTexto() {
    let texto = document.getElementById("inputTexto").value;

    let textoSalida = document.getElementById("textoSalida");
    textoSalida.textContent = "Tu nombre es " + texto.toUpperCase();
}