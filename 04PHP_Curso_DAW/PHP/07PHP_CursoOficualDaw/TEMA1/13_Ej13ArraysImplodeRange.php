<!-- 13.Mostrar números divisibles por 4 sin declaraciones de control

Escriba un script PHP que muestre todos los números entre 200 y 250
que sean divisibles por 4.
Nota: No utilice ninguna declaración de control PHP.
Salida esperada : 200,204,208,212,216,220,224,228,232,236,240,244,248 -->
<?php

    echo "13_Ej13Arrays Números divisible por 4<br>";
    
    // Ejemplo 1 (For que muestra los numeros entre 200 y 250 con incrementador + 4)
    for($i = 200; $i < 250; $i+= 4){
        echo $i . " ";
    }

    // Ejemplo 2 (usando un implode con la funcion range(start, end, num))
    // Mostrando el rango entre 200 y 250 divisibles por 4
    echo implode(", ", range(200, 250, 4));

?>