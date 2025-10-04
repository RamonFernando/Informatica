// Ejemplo 3: Llamar a una API usando fetch
async function obtenerUsuario(){
    const url = "https://jsonplaceholder.typicode.com/users/1"; // URL de la API

    try {const respuesta = await fetch(url);
        if(!respuesta.ok) throw new Error("Error en la solicitud: " + respuesta.statusText);
        const usuario = await respuesta.json();
        console.log(usuario);
    } catch (error) {
        console.error("Algo salio mal al obtener el usuario: ", error.message);
    }
}

obtenerUsuario();

/* 
fetch realiza una solicitud a la URL.
await espera que fetch y respuesta.json() se completen antes de continuar.
try...catch maneja posibles errores, como problemas de red.
*/