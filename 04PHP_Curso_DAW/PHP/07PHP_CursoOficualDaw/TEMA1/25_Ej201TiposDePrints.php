<!-- 201tresfrases.php: Muestra 3 frases, cada una en un párrafo utilizando
las tres posibilidades que existen de mostrar contenido. Tras ello,
introduce dos comentarios, uno de bloque y otro de una línea. -->

<?php
    echo "25_Ej201 Mostrar por Pantalla<br>";
    
    $saludo = "<br>Buenos dias<br>";
    $num = 9.75;

    // Mostrando maneras de pintar por pantalla la info
    echo "Buenos dias<br>";
    print_r($saludo);
    var_dump($saludo);
    print "<br>Hello world<br>";
    printf($num, "%d",2);
?>