<?php
/** 
 *  17.- Calculadora. Crea un programa que pregunte dos números al usuario. A continuación mostrará 
 *  un menú similar a éste: 
 *  1) Suma 
 *  2) Resta 
 *  3) Multiplicación 
 *  4) División 
 *  El usuario escribirá el número correspondiente a la operación que desea. Entonces se mostrará el 
 *  resultado. Utiliza un swich.
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
            padding: 20px;
            color: #ffffff;
        }
        .boton{
            color: #7b7b7a;
            border-radius: 0.3em;
            padding: .5em 1em;
            border: none;
            background-color: #ffffff;
            cursor: pointer;
        }
        .menu{
            text-align: left;
            width: 20%;
            margin: auto;
            padding-left: 12%;
        }
        .container{
            margin: auto;
            width: 550px;
        }
        input{
            border-radius: 4px;
        }

    </style>
</head>
<body>
    <div class="container">
    <h2>Ejercicios</h2>
    <h4>Calculadora</h4>
    <div class="menu">
        <p>1) Suma</p> 
        <p>2) Resta</p>
        <p>3) Multiplicación</p>
        <p>4) División</p> 
    </div>
    <form action="Ejercicio17.php" method="post">
        <label for="num1">Número1:</label>
        <input type="number" name="num1" step="0.01" placeholder="Introduce un numero" required><br><br>
        <label for="num2">Número2:</label>
        <input type="number" name="num2" step="0.01" placeholder="Introduce un numero"  required><br><br>
        <label for="operacion">Operación</label>
        <input type="number" name="operacion" placeholder="Introduce una operacion" required><br><br>
        <input type="submit" class="boton" value="Enviar">
    </form>
    </div>
    
    <?php
        if(isset($_POST['num1']) && isset($_POST['num2'])) {
            if(isset($_POST['operacion']) && !empty($_POST['operacion'])){
            $operacion = intval($_POST['operacion']);
            $num1 = doubleval($_POST['num1']); // Convertimos la entrada a un número entero
            $num2 = ($_POST['num2']);
            $resultado = 0;
            
                if(($num1 != null && $num2 != null)){
                    switch($operacion) {
                        case 1:
                            $resultado = $num1 + $num2;
                            echo '<p>El resultado es: ' . $num1 . ' + ' . $num2 . ' = ' . $resultado . '</p>';
                            break;
                        case 2:
                            $resultado = $num1 - $num2;
                            echo '<p>El resultado es: ' . $num1 . ' - ' . $num2 . ' = ' . $resultado . '</p>';
                            break;
                        case 3:
                            $resultado = $num1 * $num2;
                            echo '<p>El resultado es: ' . $num1 . ' * ' . $num2 . ' = ' . $resultado . '</p>';
                            break;
                        case 4:
                            if($num2 <= 0){
                                echo "<p>No se puede dividir por cero</p>";
                            }else{
                                $resultado = $num1 / $num2;
                                echo '<p>El resultado es: ' . $num1 . ' / ' . $num2 . ' = ' . $resultado . '</p>';
                            }
                            break;
                        default:
                            echo '<p>Operacion no valida</p>';
                            break;
                    }
                }
            }
        }
    ?>
    <p>FIN</p>
</body>
</html>