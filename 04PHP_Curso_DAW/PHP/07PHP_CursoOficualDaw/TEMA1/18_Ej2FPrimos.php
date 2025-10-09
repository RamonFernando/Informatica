<!-- 2.Comprobador de números primos

Escribe una función para comprobar si un número es primo o no.
Nota: Un número primo (o primo) es un número natural mayor que 1 que no 
tiene divisores positivos distintos de 1 y él mismo.-->
<?php
    echo "18_Ej2 Funciones Números Primos<br>";
    
    // Ejemplo 1 comprobacion directa
    function isPrimo($n){
        // Comprobaciones de numeros primos
        if($n < 2 ) return false;       // Los números menores que 2 no son primos
        if($n == 2) return true;
        if($n % 2 == 0) return false;   // Si es divisible por 2, no es primo (ya se manejó el caso de 2)

        // Iteramos solo sobre números impares hasta la mitad del número
        // ya que si un número tiene un divisor mayor a su mitad, también tendrá uno menor [3]
        for ($i=3; $i <= sqrt($n); $i+=2){ // sqrt()devuelve la raíz cuadrada de un número
            if($n % $i == 0) return false;}
        
        return true;
    }
    function showIsPrimo($n){
        
        if(isPrimo($n) == true)
            echo "<br>Es primo<br>";
        else
            echo "<br>No es primo<br>";
    }
        

    // Ejemplo 2 pasamos la funcion isPrimo($n) por parametro a la funcion showPrimo()
    function showIsPrimo1($n,$func){
        
            if($func($n) == true){
            echo "<br>El número $n Es primo<br>";
        }else{
            echo "<br>El número $n No es primo<br>";
            }
        }
        $n = 7;

        // Hacemos las llamadas a las funciones y comprobamos si es primo
        showIsPrimo($n); // Ejemplo1
        showIsPrimo1($n, 'isPrimo'); // Ejemplo2
?>