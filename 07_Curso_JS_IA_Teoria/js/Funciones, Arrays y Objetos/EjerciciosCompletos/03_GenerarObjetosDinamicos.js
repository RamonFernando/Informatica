let estudiante = {
    nombre: "Ana",
    edad: 21,
    materias: ["Matemáticas", "Historia", "Programación"],
};

// Agregar una nueva propiedad
estudiante.graduado = false;

// Mostrar detalles del estudiante
console.log("Estudiante inicial:", estudiante);

// Cambiar la edad y agregar una materia
estudiante.edad = 22;
estudiante.materias.push("Inglés");

// Mostrar el objeto actualizado
console.log("Estudiante actualizado:", estudiante);
