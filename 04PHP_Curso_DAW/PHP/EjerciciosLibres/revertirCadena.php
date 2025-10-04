<?php
/**
 * Enunciado: Escribe un programa en PHP que revierta una cadena dada. 
 * La cadena debe ser ingresada por el usuario.
 */
?>
<?php
/** 
 * 
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT'; 
            background-color: #7b7b7a; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Cadena</h2>
    <p>Revertir cadena</p>

    <?php
    $cadena = "Hola Mundo"; // Puedes cambiar esta cadena o pedirla al usuario
    $cadenaRevertida = strrev($cadena); // revierte una cadena
    echo $cadena . "<br>";
    echo "La cadena revertida es: {$cadenaRevertida}";
?>
    <p>FIN</p>
</body>
</html>