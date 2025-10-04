function saludar() {
    let miNombre = document.getElementById("inputNombre").value.trim();
    let miEdad = parseInt(document.getElementById("inputEdad").value); // parseInt convierte a entero

    let informacion = document.getElementById("informacion");
    let miSaludo = document.getElementById("saludo");

    

    // Validaciones
    if (isNaN(miEdad) || miEdad < 0 || miEdad > 130 || miNombre === '' || miNombre.length < 3)
        return error.textContent = 'Datos incorrectos';
        
    // Mostrar saludo
    miSaludo.textContent = `Hola ${miNombre}, tienes ${miEdad} años`;

    // Evaluar edad con operador ternario
    informacion.textContent = (miEdad >= 18) ? 'Es mayor de edad' : 'Es menor de edad';

    
}

function mostrarPromedio() {
    let miNota1 = parseInt(document.getElementById("inputNota").value);
    let miNota2 = parseInt(document.getElementById("inputNota2").value);
    let miNota3 = parseInt(document.getElementById("inputNota3").value);


    if (saludar() === 'Datos incorrectos') {
        return;
    }
    if (isNaN(miNota1) || isNaN(miNota2) || isNaN(miNota3) || miNota1 < 0 || miNota1 > 10 || miNota2 < 0 || miNota2 > 10 || miNota3 < 0 || miNota3 > 10)
        return informacion.textContent = 'Datos incorrectos';

    let miPromedio = (miNota1 + miNota2 + miNota3) / 3;
    let informacion = document.getElementById("promedio");
    promedio.textContent = `Tu promedio es ${miPromedio.toFixed(2)}`;
    limpiarCampos();
}

function limpiarCampos() {
    document.getElementById("inputNombre").value = '';
    document.getElementById("inputEdad").value = '';
    document.getElementById("inputNota").value = '';
    document.getElementById("inputNota2").value = '';
    document.getElementById("inputNota3").value = '';
}
