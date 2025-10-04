let arrayNotas = []; // Pongo la variable en window para que sea global
// Esta funcion pide los datos del alumno y los muestra en el HTML mientras que sean distintos de vacio o null
function mostrarDatosAlumno() {
  let nombre;
  do {
    nombre = prompt("Por favor, ingresa tu nombre: ");
    // Obtenemos el elemento donde vamos a mostrar el nombre en el HTML
    let elementoNombre = document.getElementById("idNombre"); // obtenemos el elemento donde vamos a mostrar el nombre en el HTML
    elementoNombre.textContent = nombre;// Se le asigna el valor de la variable nombre
    
  } while (nombre == "" || nombre == null); // Mientras que nombre sea igual a vacio o null se repite el prompt while(si es falso se repite)

  pedirNota();
}
// Pedimos las notas por consola, creamos un li para cada nota, 
// la guardamos en un array y la mostramos en el HTML
function pedirNota() {
    // Variables
    let nota;
    let contador = 1;
    // Pedimos las notas
    for (let i = 1; i <= 5; i++) {
        nota = prompt("Nota: " + contador + '\n' + "Por favor, ingresa una nota entre 0 y 10: " );
        while (nota < 0 || nota > 10 || nota == ""){ // Mientras que nota sea mayor a menor a 0 o mayor a 10 se repite el prompt while(si es falso se repite)
            nota = prompt("Nota: " + contador + '\n' + "Nota Incorrecta!, ingresa una nota entre 0 y 10: ");    
        };
        //arrayNotas.push(parseInt(nota));// parseInt convierte el string a un entero
        arrayNotas.push(Number(nota));// Crea un tipo tipo de dato numero a partir de un entero.
        
        contador++;
    }
    // Mostramos las notas en el HTML
    for (let i = 0; i < arrayNotas.length; i++) {
        let elementoNota = document.getElementById("ul-list");// obtenemos el elemento donde vamos a mostrar el nombre en el HTML
        let lista = document.createElement("li");// creamos el elemento li
        let mensaje = (i+1) + "º Nota: " + " = " + arrayNotas[i]; // Mensaje que se muestra en el HTML
        lista.innerText = mensaje; // Se muestra la lista asignandole el valor de la variable dentro del array arrayNotas[i] (el array va asignando la nota en cada pasada del bucle)
        elementoNota.appendChild(lista);// agregamos el elemento li a la lista ul-list
        // varNota.textContent = arrayNotas[i];// mostramos el nombre y lo agregamos al array
      }
}
// Calcula el promedio de las notas divide la suma de todas las notas por el numero de notas
function calcularPromedio(){
  // pedirNota();
  let promedio = 0; 
  for (let i = 0; i < arrayNotas.length; i++) {
      promedio = promedio + arrayNotas[i]; // Suma de todas las notas
    }
    promedio = promedio / arrayNotas.length;// Promedio / numero de notas totales
    document.getElementById("idPromedio").textContent = promedio; // Se le asigna al idPromedio el valor de la variable promedio
}
function notaMasAlta(){
    let notaMaxima;
    // metodo Math.max (Busca el valor maximo de un array)
    for (let i = 0; i < arrayNotas.length; i++) {
      notaMaxima = Math.max(...arrayNotas); // Busca la nota maxima disponible en el array
    }
    // Algoritmo de la nota mas alta
    /*for (let i = 0; i < arrayNotas.length; i++) {
      let nota;
      if (arrayNotas[nota] > notaMaxima) {
        notaMaxima = arrayNotas[nota];
      }
    }*/
    // Se le asigna al idNotaMasAlta el valor de la variable notaMaxima
    document.getElementById("idNotaMasAlta").textContent = notaMaxima; // Obtiene el id por el cual se mostrará el mensaje en el HTML 
}
// Recorre las notas y si hay una nota menor a la nota minima(suspenso) hace un break y corta el codigo mostrando el mensaje
function aPlazo(){
  let suspenso = 5; // Nota minima para aprobar
  let i = 0;
  let boolean = "No";
  let mensaje; // Variable que guardará el mensaje a mostrar en el HTML
  
  // Si el valor de la nota es menor a la nota minima(suspenso) se le asigna a la variable boolean el valor de 'Si'
  do { 
    if (arrayNotas[i] < suspenso) {
      boolean = "Si";
      mensaje = boolean + ", Tu nota es: " + arrayNotas[i];
      break; // Se corta el codigo
    }else{
      mensaje = boolean + ": Felicidades has aprobado todos los examenes!";
    }
    i++;
  } while (i < arrayNotas.length); // Mientras i sea menor que el tamaño del array seguira iterando.
  
   // Mensaje del HTML
  document.getElementById("idAPlazo").textContent = mensaje; // Obtiene el id por el cual se mostrará el mensaje en el HTML
}
