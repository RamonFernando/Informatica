<!-- 1.Suma triple si es igual

Escriba un programa PHP para calcular la suma de los dos valores enteros dados. 
Si los dos valores son iguales, entonces devuelve el triple de su suma.
Entrada de muestra
1, 2
3, 2
2, 2
Salida de muestra:
3
5
12-->
<?php
echo "<h1>Ejercicio 1 Algoritmos</h1><br>";
    $num1 = 1;
    $num2 = 2;

    // Funcion que suma 2 numeros y si son iguales lo multiplica por 3
    function sumar($num1, $num2){
        $result = 0;
        if($num1 == $num2)
            $result = ($num1 + $num2) * 3;
        else
            $result = $num1 + $num2;

        return $result;
    }

    echo "El resultado es: " . sumar($num1, $num2);
?>