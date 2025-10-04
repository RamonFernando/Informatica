// Promises
// En los promise existen 3 valores posibles 
// Pending -> Pendiente de ejecución
// Fullfilled -> El promise se cumple
// Rejected -> El promise no se cumple o ha sido rechazado

const usuarioAutenticado = new Promise((resolve, reject) => {
    const auth = true;

    // Para comprobar si se cumple el promise
    if(auth){
        resolve('Usuario autenticado'); // El promise se cumple 
    }else{
        reject('No se pudo iniciar sesión'); // El promise no se cumple
    }
});

// Como se ve la funcion promise
console.log(usuarioAutenticado);

// console.log(usuarioAutenticado);
// Arrow function (promise)
usuarioAutenticado 
    .then(resultado => console.log(resultado))
    .catch( (error) => console.log(error));

// Para que se vea correctamente
/* usuarioAutenticado 
    .then( function(resultado){
    console.log(resultado); 

})  
    .catch( function(error){
    console.log(error);
});*/
    
    

