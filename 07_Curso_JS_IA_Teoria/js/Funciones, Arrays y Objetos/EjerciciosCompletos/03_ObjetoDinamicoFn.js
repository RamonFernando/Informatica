// 1. Crear un objeto vacío
let usuario = {};

// 2. Función para agregar información
function agregarInformacion(clave, valor) {
    usuario[clave] = valor;
}

// 3. Agregar información al objeto
agregarInformacion("nombre", "Carlos");
agregarInformacion("edad", 30);
agregarInformacion("ciudad", "Madrid");

// 4. Mostrar el objeto
console.log("Usuario:", usuario);
