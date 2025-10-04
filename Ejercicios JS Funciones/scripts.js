function llamadaFunciones(){
    
    alert(saludarUsuario() + ', ' + obtenerEdad() + ', ' + preguntarApellido());
    mostrarTexto();
}
function saludarUsuario(){
    let miNombre = document.getElementById("nombreUsuario").value;
    return 'Hola ' + miNombre;
}
function obtenerEdad(){
    let miEdad = document.getElementById("edadUsuario").value;
    return 'tu edad es ' + miEdad + ' años';
}
function preguntarSexo(){
    let miSexo = prompt('¿Cuál es tu sexo, escribe h(hombre) o m(mujer)?');
    const mensajeIncorrecto = 'debes escribir h(hombre) o m(mujer)';

    /*Este while evalua si es hombre o mujer*/ 
    while(miSexo != 'h' && miSexo != 'm'){
        alert(mensajeIncorrecto);
        miSexo = prompt('¿Cuál es tu sexo, escribe h(hombre) o m(mujer)?');
    }
    /* Este if evalua si es hombre o mujer y si hay un error de escritura devuelve el mensaje
    de error, comprueba tambien que despues de haber un error de escritura vuelva a comprobar las 3 condiciones nuevamente. */
    if(miSexo == 'h'){
        return 'h';
    }else if(miSexo == 'm'){
        return 'm';
    }else{
        return mensajeIncorrecto;
    }
}
/* Esta funcion llama a la funcion preguntarSexo para evaluar si es hombre o mujer y 
regresa el valor correspondiente con Sr. o Sra. mas el apellido*/
function preguntarApellido(){
    let miApellido = prompt('¿Cuál es tu Apellido?');
    let varMiSexo = preguntarSexo();
    const mensajeIncorrecto1 = 'Su apellido no debe contener números, caracteres especiales o ser nulo.';
    const mensajeIncorrecto2 = 'debes escribir h(hombre) o m(mujer)';

    let expRegular = /[a-zA-Z]\w+\w/ /*Expresion Regular para validar el apellido*/

    /* comprueba que el apellido no contenga numeros, caracteres especiales o sea nulo */
    while(expRegular.test(miApellido) == false && miApellido != null){
        alert(mensajeIncorrecto1);
        miApellido = prompt('¿Cuál es tu Apellido?');
    }

    /* Este if evalua si es hombre o mujer y si hay un error de escritura devuelve el mensaje
    de error, comprueba tambien que despues de haber un error de escritura vuelva a comprobar las 3 fracciones nuevamente. */
    if(miApellido != ''){
        if(varMiSexo == 'h'){
            return ' le llamaremos Sr. ' + miApellido ;
        } else if(varMiSexo == 'm'){
            return ' la llamaremos Sra. ' + miApellido ;
        } else {
            return mensajeIncorrecto2;  
    }

    }else{
        return mensajeIncorrecto1;
    }
}
function mostrarTexto(){
    /* obtiene los valores de nombre y edad del usuario y los muestras en el texto (p)*/
    let miNombre = document.getElementById("nombreUsuario").value;
    let miApellido = document.getElementById("edadUsuario").value;
    let mostrarTexto = document.getElementById("informacion");
    let mensaje = 'Hola tu Nombre es ' + miNombre + ' y tienes ' + miApellido + ' años';
    mostrarTexto.textContent = mensaje;
    
}
