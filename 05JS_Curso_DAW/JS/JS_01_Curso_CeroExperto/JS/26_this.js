// This

// Concepto: La funcion this va a hacer referencia al objeto que se esta ejecutando
const recervacion = {
    nombre: "Ramon",
    apellido: "Perez",
    total: 5000,
    pagado: false,
    informacion: function(){
        // si el nombre no tiene la funcion this.nombre no se puede acceder
        // Tipo de error: Uncaught ReferenceError: nombre is not defined
        console.log(`El cliente ${this.nombre} reservó y su cantidad a pagar es de ${this.total}€`);
    }
}
recervacion.informacion();