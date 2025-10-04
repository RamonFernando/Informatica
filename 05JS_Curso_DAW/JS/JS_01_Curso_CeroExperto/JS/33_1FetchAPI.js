// Fetch API

async function obtenerEmpleados(){

    const archivo = 'js/33_2empleados.json';
    
    /*fetch(archivo)
        .then( resultado => {
            return resultado.json();
        })
        .then( datos => {
            console.log(`Datos del archivo ${archivo}`);
            // console.log(datos.empleados);

            // Crear la variable empleados con los datos
            const { empleados } = datos;
            // console.log(empleados);

            // Mostrar datos por consola con forEach
            empleados.forEach( empleado => {
                console.log(empleado.nombre);
                console.log(empleado);
                // Mostrar los datos en el HTML
                // document.querySelector('.contenido').textContent += empleado.nombre;
                
            })
        }) */
    // Async / Await
    // Si un await depende del otro bloquea el codigo hasta que se ejecuta el primero
    const resultado = await fetch(archivo);
    const datos = await resultado.json();
    console.log(datos);

};
obtenerEmpleados();