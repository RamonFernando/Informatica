<?php
/** 
 * 
 */
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios</title>
    <style>
        body{
            text-align: center;
            font-family: 'Gill Sans MT'; 
            background-color: #7b7b7a; 
            padding: 20px";
        }
    </style>
</head>
<body>
    <h2>Ejercicios</h2>
    <p>...</p>
    <?php
    // Factorial(5) (1)5*1 = 5 (2)5*2 = 10 (3)10*3 = 30 (4)30*4 = 120
    // Factorial(4) (1)4*1 = 4 (2)4*2 = 8 (3)8*3 = 24
    // Factorial(3) (1)3*1 = 3 (2)3*2 = 6 (3)6*3 = 18
function factorial($numero) {
    if ($numero <= 1) {
        return 1;
    } else {
    // 5*4*3*2*1 = 120 5!= 4(5*4 = 20) 3(20*3 = 60) 2(60*2 = 120) 1(120*1 = 120)
        return $numero * factorial($numero - 1);
    }
}

echo "El resultado del factorial de 5 es: " . factorial(5);
?>
    <p>FIN</p>
</body>
</html>