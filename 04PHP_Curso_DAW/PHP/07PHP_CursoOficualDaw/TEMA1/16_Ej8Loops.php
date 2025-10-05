<!-- Escriba un script PHP que cree la siguiente tabla usando bucles for.
Agregue cellpadding="3px" y cellspacing="0px" a la etiqueta de la tabla.
1*1=1	1*2=2	1*3=3	1*4=4	1*5=5
2*1=2	2*2=4	2*3=6	2*4=8	2*5=10
3*1=3	3*2=6	3*3=9	3*4=12	3*5=15
4*1=4	4*2=8	4*3=12	4*4=16	4*5=20
5*1=5	5*2=10	5*3=15	5*4=20	5*5=25
6*1=6	6*2=12	6*3=18	6*4=24	6*5=30 -->

<?php
echo "13_Ej8Loops Tabla de multiplicar con loops<br>";
    
    // Tabla de multiplicar
    for($i = 1; $i <= 6; $i++){
        echo "<hr>";
        echo "Tabla del $i <br>";
        for($k = 1; $k <= 5; $k++){
            echo "$i * $k = " . ($i*$k) . "<br>";
        }
    }

?>
