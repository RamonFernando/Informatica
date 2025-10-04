const crearSaludo = (nombre, hora) => {
    if (hora < 12) return `¡Buenos días, ${nombre}!`;
    if (hora < 18) return `¡Buenas tardes, ${nombre}!`;
    return `¡Buenas noches, ${nombre}!`;
};

// Probar la función con diferentes horas
console.log(crearSaludo("Luis", 9)); // ¡Buenos días, Luis!
console.log(crearSaludo("María", 15)); // ¡Buenas tardes, María!
console.log(crearSaludo("Carlos", 20)); // ¡Buenas noches, Carlos!
