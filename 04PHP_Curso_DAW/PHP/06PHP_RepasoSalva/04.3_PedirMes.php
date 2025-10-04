<!-- 3.- Crea un programa que pida un número de mes entre 1 y 12. A continuación devolverá el
número de días de ese mes. Supón que no existen años bisiestos. -->
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 04.3_PedirMes</title>
    <style>
        body{
            text-align: center;
            font-size: 20px;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h2>Ejercicio 04.3_PedirMes</h2>
    <form action="04.3_PedirMes.php" method="post">
        <label for="mes">Mes:</label>
        <input type="number" name="mes" placeholder="Introduce el Mes" min="1" max="12" required>
        <input type="submit" value="Enviar"><br><br>
    </form>
    <?php
        if($_SERVER['REQUEST_METHOD'] === 'POST'){
            // Comprobamos si la variable mes existe, no esta vacia y es numerica
            if(isset ($_POST['mes']) && !empty($_POST['mes']) && is_numeric($_POST['mes'])){
                intval($mes = $_POST['mes']); // Convertimos la entrada a un número entero
                $anio = date('Y'); // Obtenemos el año actual
                if($mes >= 1 && $mes <= 12){
                    switch($mes){
                        case 1:
                            echo "Mes de Enero, 31 dias.";
                            break;
                        case 2:
                            echo "Mes de Febrero, 28 dias.";
                            // Verificamos si el año es bisiesto
                            if($anio % 4 === 0 && $anio % 100 !== 0 || $anio % 400 === 0) {
                                echo "Anio bisiesto, 29 dias.";
                            }
                            break;
                        case 3:
                            echo "Mes de Marzo, 31 dias.";
                            break;
                        case 4:
                            echo "Mes de Abril, 30 dias.";
                            break;
                        case 5:
                            echo "Mes de Mayo, 31 dias.";
                            break;
                        case 6:
                            echo "Mes de Junio, 30 dias.";
                            break;
                        case 7:
                            echo "Mes de Julio, 31 dias.";
                            break;
                        case 8:
                            echo "Mes de Agosto, 31 dias.";
                            break;
                        case 9:
                            echo "Mes de Septiembre, 30 dias.";
                            break;
                        case 10:
                            echo "Mes de Octubre, 31 dias.";
                            break;
                        case 11:
                            echo "Mes de Noviembre, 30 dias.";
                            break;
                        case 12:
                            echo "Mes de Diciembre, 31 dias.";
                            break;
                        default:
                            echo "Error, mes incorrecto.";
                            break;
                    }
                }
            }else {
                echo "Error, mes incorrecto.";
            }
        }
    ?>
</body>
</html>