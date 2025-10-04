<!-- - Como leer desde un archivo php un fichero txt.
- Cuando consigas leerlo lo guardes en un array asociativo y que calcule la media y
que notas han superado el 5
6.- Exta bola: Continua con el ejercicio de las notas.txt Crea un formulario HTML que
permita añadir un nuevo alumno y nota, cuando se envíe, se debe guardar en el archivo
notas.txt, vuelve a calcular la media y mostrar quién aprueba/suspende y quien fue el
mejor y el peor. (Mas avanzado)-->
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            text-align: center;
            font-family: 'Gill Sans MT';
            background-color: #7b7b7a;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h1>Notas</h1>
    <?php
    // 1.-Conexion al archivo
    $nombre_archivo = 'Notas.txt';
    $manejadorLectura = fopen($nombre_archivo, 'r'); // Abrir el archivo en modo lectura ('r')
    $manejador = fopen($nombre_archivo, 'a'); // Abrir el archivo en modo escritura ('a')

    $datos_txt = array();
    $i = 1;
    // 2.-Leemos el archivo y mostramos el contenido
    if ($manejadorLectura) {
        
        // Iterar sobre cada línea del archivo hasta que no haya más
        while (!feof($manejadorLectura)) {      // comprueba si se ha llegado al final del archivo
            $linea = fgets($manejadorLectura);  // Leer una línea
            $linea = trim($linea);              // eliminar espacios al principio y al final
            if ($linea === '') continue;                // saltar líneas vacías

           $datos_txt[] = $linea;          // Añadir la linea al array
        }
        fclose($manejadorLectura); // cerramos el archivo en modo lectura

        // 3.-Procesamiento del formulario
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {    // Comprobamos si se ha enviado el formulario
            $alumno = trim($_POST['alumno']);   // Recuperamos los datos del formulario
            $nota = trim($_POST['nota']);

            // comprobamos que el alumno y la nota no esten vacios
            if (!empty($alumno) && !empty($nota)) {
                
                fwrite($manejador, $alumno . ";" . $nota . "\n"); // Escribir el alumno y la nota en el archivo
                // Añadimos el alumno y la nota al array
                $datos_txt[] = $alumno . ";" . $nota;
            } else {
                echo "El alumno y la nota no pueden estar vacios";
            }
        }

        // 4.-Recorremos el array y mostramos el número de alumnos
        echo "Alumnos: " . count($datos_txt);
        echo "<br><br>";

        ?>
        <!--Formulario para agregar un nuevo alumno y nota-->
        <form action="02_LeerTexto.php" method="post">
            <input type="text" name="alumno" placeholder="Introduce el nombre del alumno" required><br><br>
            <input type="float" name="nota" placeholder="Introduce la nota" required><br><br>
            <input type="submit" class="boton" value="Mostrar"><br><br>
        </form>

        <?php
        // Mostramos nuevamente el array
        for ($i = 0; $i < count($datos_txt); $i++) {
            echo $i+1 . " - " . $datos_txt[$i] . "<br>";
        }
        echo "<br>";
        // 5.- Realizamos las comprobaciones y mostramos los resultados
        // Mostramos los aprobados, suspensos y la media de notas
        $notaMedia = 0;
        foreach ($datos_txt as $nota) {
            $delimitador = explode(";", $nota, 2); // Divide la cadena por el delimitador ";"
            
            // Divide la cadena por el delimitador ";" pos: 0(nombre) y pos: 1(nota)
            $nombre = trim($delimitador[0]);
            $nota = trim($delimitador[1]);
            $nota = floatval($nota);
            $notaMayor = $delimitador[1];
            $notaMenor = $delimitador[1];

            $notaMedia += $nota; // Sumamos las notas para calcular la media

            // comprobamos que el alumno y la nota no esten vacios, si lo estan no se muestra y el bucle se repite
            if (empty($nombre) || empty($nota)) continue;
            if(count($delimitador) < 2) continue; // Comprobamos que el array tenga al menos dos elementos
            
            // buscamos la nota mayor
            if ($delimitador[1] > $notaMayor) $notaMayor = $delimitador[1];
            
            // buscamos la nota menor
            if ($delimitador[1] < $notaMenor) $notaMenor = $delimitador[1];
            
            

            if ($nota >= 5) {
                // Divide la cadena por el delimitador ";" pos: 0 (nombre) y 1 (nota)
                echo "El alumno " . strtoupper($nombre) . " ha superado el 5 con una nota de " . $nota . "<br>";
                echo "<br>";
            }else{
                echo "El alumno " . strtoupper($nombre) . " <strong>no</strong> ha superado el 5 con una nota de " . $nota . "<br>";
                echo "<br>";
            }
            
        }
        $notaMedia = $notaMedia/count($datos_txt);
        echo "<br>";
        echo "La media de notas del curso es: " . number_format($notaMedia, 2) . "<br>";
        echo "La nota mayor es: " . $notaMayor . "<br>";
        echo "La nota menor es: " . $notaMenor . "<br>";
        echo "<br>";

        fclose($manejador); // Cerrar el archivo en modo escritura
    } else {
        echo "Error al abrir el archivo";
    }
    ?>
</body>
</html>