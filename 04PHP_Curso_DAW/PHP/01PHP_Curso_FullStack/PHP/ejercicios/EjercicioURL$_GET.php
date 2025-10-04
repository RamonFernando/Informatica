<?php
/*
    // 2 - Mostrar los numeros pares del 1 al 100
    echo "Mostrar los numeros pares del 1 al 100<br>";
    $contador = 1;
    for ($i = 1; $i <= 100; $i++) {
        if($i%2 == 0){
            echo "[" . $contador ."º :" . $i . "]\t";
            $contador++;
        }
    }
    echo "<br>Hay " . ($contador-1) . " numeros pares entre 1 y 100";
*/
/*
    // 3 - El cuadrado de un numero las 40 primeras veces.
    $a = 1;
    while ($a <= 40) {
        $b = $a*$a;
        echo "$a x ". ($a). " = " . $b . "<br>";
        $a++;
    }*/

    // 4 - Recoger dos numero por la url (Parametro GET) y hacer todas las operaciones basicas
    // Suma, Resta, Multiplicacion y Division
    /*echo "Ejercicio de Calculadora<br>";
    if(isset($_GET['numero1']) && isset($_GET['numero2'])){
        $numero1 = $_GET['numero1'];
        $numero2 = $_GET['numero2'];
        
        echo "Calculadora";
        echo "Suma: " . $numero1 . " + " . $numero2 . " = " . ($numero1 + $numero2) . "<br>";
        echo "Resta: " . $numero1 . " - " . $numero2 . " = " . ($numero1 - $numero2) . "<br>";
        echo "Multiplicacion: " . $numero1 . " * " . $numero2 . " = " . ($numero1 * $numero2) . "<br>";
        echo "Division: " . $numero1 . " / " . $numero2 . " = " . ($numero1 / $numero2) . "<br>";
    }else{
        echo "No se han introducido dos numeros por la URL";
    }
    */
    // 5 - Hacer un programa que muestre todos los numeros entre dos numeros que nos llegan por la URL($_GET)
    /* echo"<br><br> Mostrar todos los numeros entre dos numeros que nos llegan por la URL<br>";
    if(isset($_GET['numero1']) && isset($_GET['numero2'])){
        $numero1 = $_GET['numero1'];
        $numero2 = $_GET['numero2'];
        $contador = 1;
        if($numero1 < $numero2){
        // Mostrar Numeros introducidos por la URL($_GET)
        echo 'Primer numero: ' . $numero1 . "<br>";
        for ($i = ($numero1+1) ; $i < $numero2 ; $i++ ) {
            echo $i . "<br>";
            $contador++;
        }
        echo 'Segundo numero: ' . $numero2 . "<br>";
        echo "Hay " . ($contador-1) . " numeros entre " . $numero1 . " y " . $numero2;
        }else{
        echo "El primer numero tiene que ser menor que el segundo (" . $numero1 . ") < " . $numero2 . "<br>";
        }
    }else{
        echo "No se han introducido los dos numeros por la URL";
    }
*/
    
    
/*  
    // 6 - Mostrar una tabla de HTML con las tablas de multiplicar del 1 al 10  
    // Variables
    $numero = 20;
    $numeroContador = 20;
    $contador = 1;

    // Cabecera
    echo"Tablas de multiuplicar del 1 al $numero</p><hr>";
    echo "<table border=1>"; // Crea la tabla
    echo "<tr>"; // Crea la fila
    // Algoritmo
    for ($cabecera = 1; $cabecera <= $numero; $cabecera++) {
        echo "<td>Tabla del " . $cabecera . "</td>";
    }
    echo "</tr>";
    
    for ($i=1; $i <= $numero ; $i++) {
        echo "<td>";
        for ($j=1; $j <= $numeroContador ; $j++) {
            echo "$i x $j = " . ($i*$j) . "<br>";
            if($j == 10 && $contador <= $numero) {
                echo "<hr>";
            }
        }
        echo "</td>";
        $contador++;
    }
    echo "</table>";
*/
 // 7 - Mostrar todos los numeros impares que nos lleguen por la URL($_GET) entre dos numeros
    echo"<br><br> Mostrar todos los numeros impares que nos llegan por la URL<br>";
    if(isset($_GET['numero1']) && isset($_GET['numero2'])){
        $numero1 = $_GET['numero1'];
        $numero2 = $_GET['numero2'];
        $contador = 1;
        $contadorImpares = 1;
        if($numero1 < $numero2){
        // Mostrar Numeros introducidos por la URL($_GET)
        echo 'Primer numero: ' . $numero1 . "<br>";
        for ($i = ($numero1+1) ; $i < $numero2 ; $i++ ) {
            if($i%2 != 0){
                echo "Par: " .$i . "<br>";
                $contadorImpares++;
            }else{
                echo "<strong>Impar: ".$i . "</strong><br>";
            }
            $contador++;
        }
        // Mostrar Numeros introducidos por la URL($_GET)
        echo 'Segundo numero: ' . $numero2 . "<br>";
        echo "Hay " . ($contadorImpares-1) . " numeros impares entre " . $numero1 . " y " . $numero2 . "<br>";
        echo "Hay " . ($contador-1) . " numeros entre " . $numero1 . " y " . $numero2;
        }else{
        echo "El primer numero tiene que ser menor que el segundo (" . $numero1 . ") < " . $numero2 . "<br>";
        }
    }else{
        echo "No se han introducido los dos numeros por la URL";
    }

?>