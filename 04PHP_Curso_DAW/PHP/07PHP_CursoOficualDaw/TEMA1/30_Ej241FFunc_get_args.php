<!-- 241parametrosVariables.php: Crea las siguientes funciones:
Una función que devuelva el mayor de todos los números recibidos como
parámetros: function mayor(): int. Utiliza las funciones func_get_args(),
etc... No puedes usar la función max().
Una función que concatene todos los parámetros recibidos separándolos
con un espacio: function concatenar(...$palabras) : string. Utiliza el operador .... -->
<?php
    echo "27_Ej241F Funciones func_get_args<br>";

    // Funcion que recive parametros indefinidos como argumentos y busca el numero mayor
    function mayor(): int{
        $numArgs = func_get_args();
        $mayor = 0;
        foreach($numArgs as $arg)
            if($arg > $mayor) $mayor = $arg;
        
        return $mayor;
    }
    echo "El número mayor es: " . mayor(2,9, 8, 5, 7, 6);

    // Funcion que concatena una cadena de parametros(strings) pasados como argumentos y forma
    // una unica cadena con los argumentos pasados a la funcion
    function concatenar(...$palabra): string{
        $cadena = implode(' ',$palabra);
        return $cadena;
    }
    echo "<br>Argumento: " . concatenar("Ramón", "Pérez", "Álvarez");
?>