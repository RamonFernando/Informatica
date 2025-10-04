<?php // Abrimos php
/**
* 1.- Queremos crear una aplicación que controle el acceso a un ordenador pidiendo una clave de acceso. 
* El programa pedirá una cadena de caracteres al usuario. La comparará con la cadena "java8" y si 
* son iguales, escribirá "Acceso permitido". En caso contrario escribirá "Acceso denegado". 
* Para guardar la clave "java8" utiliza una constante llamada CLAVE_REQUERIDA.
* [Ayuda: Recuerda que para comparar dos cadenas no podemos utilizar el símbolo == sino que hay 
* que usar variable.equals(cadena).]
* Pagina del servidor
* http://localhost/test/Ejercicio1Condicionales.php
* Para que funcione hay que tener XAMPP instalado y buscar la carpeta con la ruta siguiente:
* Ruta: discoLocal (C:) > xampp > htdocs > test
*/
// Definimos la clave de acceso
define("CLAVE_REQUERIDA", "java8");
    // Ejercicio 1
    
echo "<h1>Ejercicio 1 </h1>";
// cerramos php y abrimos html
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color:rgb(159, 148, 131);
            padding: 20px;
        }
    </style>
    </head>
    <body>
        <form action="Ejercicio1ClaveRequeridaMStrcmp().php" method="post">
            <input type="text" name="access" placeholder="Introduce la clave de acceso">
            <input type="submit" value="Enviar">
        </form>
    </body>
    
</html>
<?php
// comprueba si la variable access existe y no esta vacía
if(isset($_POST["access"]) && !empty($_POST["access"])) {

    //comprobación de que credencial introducida es correcta
    echo (strcmp($_POST["access"], CLAVE_REQUERIDA) === 0)
            ? "<p>Acceso permitido</p>" : "<p>Acceso denegado</p>";



    // Comprobamos si la clave es la correcta
    /*if (strcmp($_POST["access"], CLAVE_REQUERIDA) === 0){
        //($_POST["access"] === CLAVE_REQUERIDA) {
        echo "<p>Acceso permitido</p>";
    } else {
        echo "<p>Acceso denegado</p>";
    }*/
}
?>