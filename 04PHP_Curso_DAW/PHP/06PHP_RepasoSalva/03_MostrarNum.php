<?php
    // Ejercicios del 1 al 5 (Faciles)
    // 1.- Usa un for para mostrar los números del 1 al 10 (Fácil)
    echo "Mostrar los números del 1 al 10<br>";
    for ($i=1; $i <= 10 ; $i++) {
        echo $i . " ";
    }

    // 2.- Usa un while para mostrar solo los pares del 0 al 20 (Fácil)
    echo "<br><br>Mostrar solo los pares del 0 al 20<br>";
    $a = 0;
    while ($a <= 20) {
        echo $a . " ";
        $a = $a + 2;
    } // para los impares $a = 1;

    // 3.- Crea un array con 10 nombres, muestra el primer y el último nombre, 
    // recorre el array y muestra todos en lista numerada. (Fácil)
    echo "<br><br>Mostrar los nombres del array<br>";
    $arrayNombres = array("Jordi", "Xavi", "Sergi", "Pau", "Paco", "Leo", "Javi", "Sergio", "Pablo", "Pedro");
    
    echo $arrayNombres[0] . "<br>";
    echo $arrayNombres[9] . "<br><br>";

    echo "Mostrar los nombres del array en lista numerada<br>";
    for ($i = 0; $i < count($arrayNombres); $i++) {
        echo $i+1 . " - " . $arrayNombres[$i] . "<br>";
    }

    // 4.- Crea una función que reciba 2 números y devuelva el mayor,
    // pruébala con varios ejemplos. (Fácil)

    echo "<br><br>Función que devuelve el mayor<br>";
    $num1 = 2;
    $num2 = 5;
    echo "El mayor de " . $num1 . " y " . $num2 . " es " . mayor($num1, $num2);
    function mayor($num1, $num2){
        if($num1 > $num2)
            return $num1;
        else
            return $num2;
    }
    // con ternario
    echo "<br><br>Función que devuelve el mayor con operador ternario<br>";
    $num1 = 10;
    $num2 = 5;
    echo "El mayor de " . $num1 . " y " . $num2 . " es " . ($num1 > $num2 ? $num1 : $num2);

    // Funcion con ternario
    function mayorNum($num1, $num2){
        return $num1 > $num2 ? $num1 : $num2;
    }

    // 5.- Crea un array con 10 números aleatorios (rand(1,100)), Recorre el array y muestra: El mayor, El menor,
    //La media SIN USAR funciones tipo max, min etc (Intermedio)
    echo "<br><br>Mostrar el mayor, el menor y la media del array<br>";
    
    $arrayNumeros[9] = array();
    $media = 0; $mayor = 0; $menor = 0;

    // Rellenamos el array y calculamos la media
    for ($i = 0; $i < count($arrayNumeros); $i++) {
        $arrayNumeros[$i] = rand(-100, 100);
        $media += $arrayNumeros[$i];
    }
    //  Buscamos el número mayor
    for ($i = 0; $i < count($arrayNumeros); $i++) {
        echo $arrayNumeros[$i] . " ";
        if($arrayNumeros[$i] > $mayor)
            $mayor = $arrayNumeros[$i];
    }

    //* Buscamos el número menor
    $menor = $arrayNumeros[0];
    for ($i = 0; $i < count($arrayNumeros); $i++) {
        if($arrayNumeros[$i] < $menor)
            $menor = $arrayNumeros[$i];
    }
    echo "<br>El mayor es " . $mayor . "<br>";
    echo "El menor es " . $menor . "<br>";
    echo "La media es " . $media / count($arrayNumeros);
    
    
?>