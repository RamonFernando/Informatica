<?php
    function validarFecha(string $fecha): bool
    {
        $dt = DateTime::createFromFormat('Y-m-d', $fecha);

        if (!$dt || $dt->format('Y-m-d') !== $fecha) {
            return false;
        }

        return true;
    }

    function validarFormatoFecha(string $fecha): bool
    {
        if (preg_match('/^\d{4}-\d{2}-\d{2}$/', $fecha)) {
            return true;
        }
        return false;
    }
    function esEnter(string $input): bool {
        return $input === '';
    }

    function validarId(string $id): bool
    {
        if(empty($id)) return true; // Permitir id vacio para editarTarea
        return ctype_digit($id) && (int)$id > 0;
    }

?>