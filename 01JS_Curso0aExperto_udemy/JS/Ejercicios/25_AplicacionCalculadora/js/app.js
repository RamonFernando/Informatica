console.log("Aplicacion Calculadora");
function sumar() {
    console.log("Sumar");
    const formulario = document.getElementById('formCalculadora');
    let num1 = formulario['num1'];
    let num2 = formulario['num2'];
    let sumar = parseFloat(num1.value) + parseFloat(num2.value); // convertimos a float
    let resultado = document.getElementById("resultado");
    
    if(!validarCampos()){
        console.log("Uno o ambos campos estan vacios o has introducido un caracter no numerico");
    }else{
        // Mostramos el resultado
        resultado.value = sumar; // obtenemos el id de donde mostramos
        console.log(num1.value + " + " + num2.value + " = " + resultado.value);
    }
}

function restar() {
    console.log("Restar");
    let num1 = document.getElementById("num1");
    let num2 = document.getElementById("num2");
    let resultado = document.getElementById("resultado");

    let resta = parseFloat(num1.value) - parseFloat(num2.value);
    resultado = document.getElementById('resultado').value = resta;

    if(!validarCampos()){
        console.log("Uno o ambos campos estan vacios o has introducido un caracter no numerico");
    }else{
        console.log(num1.value + " - " + num2.value + " = " + resultado);
    }
}
function multiplicar() {
    console.log("multiplicar");
    let num1 = document.getElementById("num1");
    let num2 = document.getElementById("num2");
    let resultado = document.getElementById("resultado");

    let resta = parseFloat(num1.value) * parseFloat(num2.value);
    resultado = document.getElementById('resultado').value = resta;

    if(!validarCampos()){
        console.log("Uno o ambos campos estan vacios o has introducido un caracteres no valido");
    }else{
        console.log(num1.value + " * " + num2.value + " = " + resultado);
    }
}
function dividir() {
    console.log("Dividir");
    let num1 = document.getElementById("num1");
    let num2 = document.getElementById("num2");
    let resultado = document.getElementById("resultado");

    let resta = parseFloat(num1.value) - parseFloat(num2.value);
    resultado = document.getElementById('resultado').value = resta;

    if(num2.value == 0){
        console.log("No se puede dividir entre 0");
        mostrarAlertError();
    }else{
        if(!validarCampos()){
            console.log("Uno o ambos campos estan vacios o has introducido un caracteres no valido");
        }else{
            console.log(num1.value + " / " + num2.value + " = " + resultado);
        }
    }
}

function validarCampos(){
    num1 = document.getElementById("num1");
    num2 = document.getElementById("num2");
    alert = document.getElementById("alert");
    if((num1.value == "" || num2.value == "") || (isNaN(num1.value) || isNaN(num2.value))){
        mostrarAlert();
        return false;
    }

    return true;
}
function mostrarAlert() {
    const alert = document.querySelector('.alert');
    alert.style.display = 'block';

    setTimeout(ocultarAlert, 4000);

}
function ocultarAlert() {
    const alert = document.querySelector('.alert');
    alert.style.display = 'none';
}


function mostrarAlertError() {
    const alert = document.querySelector('#alert-error');
    alert.style.display = 'block';
    setTimeout(ocultarAlertError, 4000);
}
function ocultarAlertError() {
    const alert = document.querySelector('#alert-error');
    alert.style.display = 'none';
}

document.querySelector('.alert').addEventListener('click', function(){
    this.style.display = 'none';
});