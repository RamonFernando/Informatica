/* Variables globales */
let tiempoTerminado;
let intervaloDeTiempo;
/* Funcion para iniciar el tiempo */
function onload() {
    tiempoTerminado = setTimeout(timeOut, 30000);
    intervaloDeTiempo = setInterval(ticTac, 1000);

    document.getElementById("seconds").textContent = 30;
}
/* Funcion para detener el tiempo */
function ticTac(){
    let time = document.getElementById("seconds").textContent;
    document.getElementById("seconds").textContent = time - 1;

    /* funcion para mostrar la hora y añadir un 0 delante cuando el tiempo llegue a 9s */
    /*let segundos = String(time.getSeconds()).padStart(2, "0");
    let minuto = String(tiempoActual.getMinutes()).padStart(2, "0");
    let hora = String(tiempoActual.getHours()).padStart(2, "0");
    let textoHora = ":" + segundos;
    document.getElementById("time").textContent = textoHora;*/
}
/* Funcion para terminar el tiempo, cuando llega a 0 se ejecuta el audio y se termina el juego */
function timeOut(){
    clearInterval(intervaloDeTiempo);
    document.getElementById("seconds").textContent = 0;
    document.getElementById("audio").play();
    
    alert("Game Over");
}
/* Funcion para finalizar el juego */
function finalizado(){
    clearTimeout(tiempoTerminado);
    clearInterval(intervaloDeTiempo);

    let fecha = new Date();/* Fecha de hoy */
    let respuesta1 = document.getElementById("question-1").value;
    let respuesta2 = document.getElementById("question-2").value;
    let respuesta3 = document.getElementById("question-3").value;
    let respuesta4 = document.getElementById("question-4").value;
    let respuesta5 = document.getElementById("question-5").value;
    
    let mensaje = fecha.toLocaleDateString("es-Es") + "\n" +
    "1. " + respuesta1 + "\n" +
    "2. " + respuesta2 + "\n" +
    "3. " + respuesta3 + "\n" +
    "4. " + respuesta4 + "\n" +
    "5. " + respuesta5;

    alert(mensaje);
    
}
/* Funcion para mostrar las respuestas que captura del id("question-1") del 
cuestionario y muestra el mensaje mediante un if(compara la variable
mensaje con la respuesta capturada si son iguales) en el caso de 
que sean iguales muestra el mensaje de Correcto y en el caso de 
que sean diferentes muestra el mensaje de Incorrecto capturado en la
variable validarRespuesta */
function mostrarRespuesta() {
    // Obtengo respuesta
    let respuesta1 = document.getElementById("question-1").value;
    let respuesta2 = document.getElementById("question-2").value;
    let respuesta3 = document.getElementById("question-3").value;
    let respuesta4 = document.getElementById("question-4").value;
    let respuesta5 = document.getElementById("question-5").value;

    // muestro respuesta
    let mostrarRespuesta1 = document.getElementById("answer-1");
    let mostrarRespuesta2 = document.getElementById("answer-2");
    let mostrarRespuesta3 = document.getElementById("answer-3");
    let mostrarRespuesta4 = document.getElementById("answer-4");
    let mostrarRespuesta5 = document.getElementById("answer-5");

    // Respuesta correcta
    let mensaje1 = "Paris";
    let mensaje2 = "H2O";
    let mensaje3 = "1492";
    let mensaje4 = "299792458";
    let mensaje5 = "O2";
    let respuesta = "Respuesta: ";

    // Validar respuesta
    const validarRespuesta1 = "Correcto";
    const validarRespuesta2 = "Incorrecto";
    /*validarRespuesta1.style.color = "green";
    validarRespuesta2.style.color = "red";*/

    /* Estructura de control que comprueba las respuestas si son iguales a la variable muestra Correcto y 
    si son diferentes mostrara Incorrecto */
    if (respuesta1 == mensaje1) {
        mostrarRespuesta1.textContent = respuesta + " " + mensaje1 + " " + validarRespuesta1;
    }else{
        mostrarRespuesta1.textContent = respuesta + " " + mensaje1 + " " + validarRespuesta2;
    }
    if (respuesta2 == mensaje2) {
        mostrarRespuesta2.textContent = respuesta + " " + mensaje2 + " " + validarRespuesta1;
    }else{
        mostrarRespuesta2.textContent = respuesta + " " + mensaje2 + " " +validarRespuesta2;
    }
    if (respuesta3 == mensaje3) {
        mostrarRespuesta3.textContent = respuesta + " " + mensaje3 + " " + validarRespuesta1;
    }else{
        mostrarRespuesta3.textContent = respuesta + " " + mensaje3 + " " + validarRespuesta2;
    }
    if (respuesta4 == mensaje4) {
        mostrarRespuesta4.textContent = respuesta + " " + mensaje4 + " " + validarRespuesta1;
    }else{
        mostrarRespuesta4.textContent = respuesta + " " + mensaje4 + " " + validarRespuesta2;
    }
    if (respuesta5 == mensaje5) {
        mostrarRespuesta5.textContent = respuesta + " " + mensaje5 + " " + validarRespuesta1;
    }else{
        mostrarRespuesta5.textContent = respuesta + " " + mensaje5 + " " + validarRespuesta2;
    }
    
    
    finalizado();
}
/* Funcion para recargar la pagina */
function volverAIntentar() {
    location.reload();
}

