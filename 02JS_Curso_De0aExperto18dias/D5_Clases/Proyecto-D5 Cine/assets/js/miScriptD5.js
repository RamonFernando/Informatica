// Globales
function recomendarPelicula(genero) {
    // obtiene el id del input edad
    let elementoEdad = document.getElementById("idEdad");
    // obtiene el id del input respuesta
    let elementoRespuesta = document.getElementById("idRespuesta");
    let varEdad = Number(elementoEdad.value);
    let varRespuesta = elementoRespuesta;
    switch (genero) {
        case "drama":
         if (varEdad >= 18) {
            varRespuesta.textContent = "El padrino";
        }else if(varEdad >= 16){
            varRespuesta.textContent = "El señor de los anillos";
        }else if(varEdad >= 12){
            varRespuesta.textContent = "Casablanca";
        }else{
            varRespuesta.textContent = "Debes tener mas de 12 años, No hay recomendación";
        }
            break;

        case "comedia":
            if (varEdad >= 18) {
                varRespuesta.textContent = "Bad Boys";
                
            }else if(varEdad >= 16){
                varRespuesta.textContent = "Cars";
    
            }else if(varEdad >= 12){
                varRespuesta.textContent = "Buscando a Nemo";
            }else{
                varRespuesta.textContent = "Debes tener mas de 12 años, No hay recomendación";
            }
            break;
        case "musica":
            if (varEdad >= 18) {
                varRespuesta.textContent = "La vida es bella";
            }else if(varEdad >= 16){
                varRespuesta.textContent = "Cancion de amor";
    
            }else if(varEdad >= 12){
                varRespuesta.textContent = "Hight school musical";
            }else{
                varRespuesta.textContent = "Debes tener mas de 12 años, No hay recomendación";
            }
            break;
        case "accion":
            if (varEdad >= 18) {
                varRespuesta.textContent = "Jhon Wick";
                
            }else if(varEdad >= 16){
                varRespuesta.textContent = "Fast and furious";
    
            }else if(varEdad >= 12){
                varRespuesta.textContent = "Vengadores";
            }else{
                varRespuesta.textContent = "Debes tener mas de 12 años, No hay recomendación";
            }
            break;
    }
}