<!--
231 bola8.html:
Prepara un formulario con un caja de texto que realice  una pregunta al usuario.
231bola8.php: A partir del anterior, crea un programa que muestre la pregunta 
recibida y genere una respuesta de manera aleatoria entre un conjunto de respuestas 
predefinidas, almacenadas en un array: Si, no, quizás, claro que sí, por supuesto 
que no, no lo tengo claro, seguro, yo diría que sí, ni de coña, etc...
Este ejercicio se basa en el juego de la Bola 8 mágica.-->
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejer 231</title>
</head>
<body>  
        <h1>Ejercicio 1</h1>
        <h2>Realiza una pregunta</h2>
        <form action="" method="POST">
            <label for="pregunta">Pregunta</label>
            <input type="text" name="pregunta" placeholder="Pregunta">
            <input type="submit" value="Enviar">
        </form>
</body>
</html>

<?php
$respuestas = [
    "Sí",
    "No",
    "Quizás",
    "Claro que sí",
    "Por supuesto que no",
    "No lo tengo claro",
    "Seguro",
    "Yo diría que sí",
    "Ni de coña"
];
    // Comprueba la respuesta del servidor y devuelve una respuesta aleatortia
    if(!empty($_SERVER['REQUEST_METHOD']) && isset($_SERVER['REQUEST_METHOD'])){
        if($_SERVER['REQUEST_METHOD'] === 'POST'){
            $result = rand(0, count($respuestas)-1);
            
            if(!empty($_POST && isset($_POST))){
                $pregunta = $_POST['pregunta'];
                if($pregunta){
                    echo $respuestas[$result];
                }
            }
        }
    }
?>