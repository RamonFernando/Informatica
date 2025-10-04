<!-- 4.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la consola,
mediante un bucle while, y guardándolas en el array.
A continuación, muestra las diez notas. si al pedir las notas se le pasa un valor en negativo se para de pedir notas -->
<?php
    // Creamos un array vacio (posInicio(0-10), numElementos(10), valor inicial de cada elemento(0))
    $notas = array_fill(0, 10, 0);
    
    // Obtenemos la informacion del formulario (si la variable $_SERVER['REQUEST_METHOD'] existe y su valor es POST)
    if(isset($_SERVER['REQUEST_METHOD']) && $_SERVER['REQUEST_METHOD'] == 'POST'){
        
        // Comprobamos que el array notas[] exista, que no este vacio y que sea un array
        if(isset($_POST['notas']) && !empty($_POST['notas']) && is_array($_POST['notas'])){
            $notas = $_POST['notas']; // Guardamos el array en la variable $nota

            foreach ($notas as $nota) {
                number_format(floatval($nota), 2); // Redondeamos a 2 decimales
                // if($nota < 0) break;
            }
        }
    }
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios 04.4_PedirNotas</title>
    <style>
        body{
            text-align: center; font-size: 20px; font-family: 'Gill Sans MT';
            background-color: #7b7b7a; padding: 20px; }
    </style>
</head>
<body>
    <h2>Ejercicio 04.4_PedirNotas</h2>
    <form action="04.4_PedirNotas.php" method="post">
        <label for="notas[]">Nota:</label><br>
        <?php
        for ($i = 0; $i < 10; $i++) {
                echo "<input type='double' step='0.01' name='notas[]' placeholder='Nota " . ($i + 1) . "'><br><br>";
            }
        ?>
        <input type="submit" value="Enviar">
    </form>
    <?php
    // Comprobamos que el array notas[] exista, que no este vacio y que sea un array
    if(isset($notas) && !empty($notas) && is_array($notas)){
        $i = 0;
        if($notas[$i] != null){
            // Recorremos el array
            while( $i < count($notas)){
                
                //* Comprobamos si la nota es negativa
                if($notas[$i] < 0){
                    echo "<p>Se ha introducido una nota negativa o vacia, el programa parará de pedir notas...</p>";
                    break;
                }
                $i++;
            }
            echo "<p>Las notas introducidas son:</p>";
            
            // Mostramos las notas
            for ($i = 0; $i < count($notas); $i++) {
                if ($notas[$i] < 0) break;
                echo "<p>Nota " . ($i + 1) . ": " . $notas[$i] . "</p>";
            }
            echo "<p>FIN</p>";
        }else{
            echo "<p>No se han introducido notas.</p>";
        }
    }
    ?>
</body>
</html>