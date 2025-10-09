<!-- 9.Tablero de ajedrez que utiliza bucles anidados

Escriba un script PHP utilizando un bucle for anidado que cree un tablero de 
ajedrez como se muestra a continuación.
Utilice la tabla width="270px" y toma="30px" como altura y ancho de celda. -->

<table width='270px' height='30px' cellspacing=0 border="1px">
<?php
    echo "22_Ej9 Tablero de ajedrez que utiliza bucles anidados<br>";
    echo "<br>";
    
    // Generar el tablero con colores
    for ($i=0; $i < 8; $i++) {
        echo "<tr width='270px' height='30px'>";
        for ($j=0; $j < 8; $j++) {
            // Determinar el color de las casillas
            if(($i+$j ) % 2 == 0){
                echo "<td></td>";
            }else{
                echo "<td bgcolor='black'></td>";
            }
        }
        echo "</tr>";
    }
?>
</table>
