<!-- 5.Verifique todas las cadenas en minúsculas

Escriba una función PHP que verifique si una cadena está en minúsculas.-->
<?php
    echo "19_Ej3 Funciones, Verificar minúsculas<br>";
    $Montesquieu = "No hay peor dictadura que la que se ejerce a la sombra de las leyes y bajo el calor de la justicia";
    $mg = "";
    function checkLowercase($str){
        
        // Comprobamos que sea un string y no este vacio
        if(empty($str) || !is_string($str)) return "La variable debe ser una cadena (String)";
        
        // Variables
        $msg = "";

        // Comprueba que sean caracteres validos
        $onlyLetters = preg_replace('/[^a-zA-Záéíóúñü]/u', '', $str);
        $chek = ctype_lower($onlyLetters); // comprobar si los caracteres estan en minusculas
        
        if($chek){
            $msg = "Todos los caracteres estan en minusculas";
        }else{
            $msg = "Hay caracteres en mayusculas";
        }
        return $msg;
    }
    echo "$Montesquieu <br>";
    echo checkLowercase($Montesquieu);
?>