/*JavaScript puede "mostrar" datos de diferentes maneras:
Escribir en un elemento HTML, usando .innerHTML
Escribir en la salida HTML usando .document.write()
Escribir en un cuadro de alerta, usando .window.alert()
Escribir en la consola del navegador, usando .console.log()
*/
/*<!DOCTYPE>
<html lang="en">
<body>
<h1>My First Web Page</h1>
<p id="demo"></p>
<script>
document.getElementById("demo").innerHTML = 5 + 6;
</script>
</body>
</html>*/

/*Escribir en un elemento HTML, usando .innerHTML*/
document.getElementById("demo").innerHTML = "Hola Mundo!";

/*Escribir en la salida HTML usando .document.write()*/
document.write("Hola Mundo!");
// El uso de document.write() después de cargar un documento HTML, el navegador
// eliminará todo el HTML existente y insertarará el contenido de la variable.

/*Escribir en un cuadro de alerta, usando .window.alert()*/
window.alert("Hola Mundo!");

/*Escribir en la consola del navegador, usando .console.log()*/
console.log("Hola Mundo!");

// se puede usar print para imprimir el contenido de una ventana en el navegador
<button onclick="window.print()">Print this page</button>
