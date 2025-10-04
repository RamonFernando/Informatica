let config = { tema: "oscuro", fuente: "Arial" };

// Object.freeze: Evita cualquier cambio en el objeto
Object.freeze(config);
config.tema = "claro"; // No se aplica
console.log(config); // { tema: "oscuro", fuente: "Arial" }

// Object.seal: Permite modificar propiedades, pero no agregar ni eliminar
let usuario = { nombre: "Laura", edad: 28 };
Object.seal(usuario);
usuario.edad = 29; // Se aplica
usuario.ciudad = "Madrid"; // No se aplica
console.log(usuario); // { nombre: "Laura", edad: 29 }

// Object.freeze: Bloquea completamente los cambios en el objeto.
// Object.seal: Permite modificar valores, pero no agregar ni eliminar propiedades.