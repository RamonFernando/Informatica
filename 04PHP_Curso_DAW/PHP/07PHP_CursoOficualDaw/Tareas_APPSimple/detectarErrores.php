<?php
    
/**
 * Maneja los errores lanzados por PDO y muestra mensajes descriptivos
 * según el código SQLSTATE detectado en el mensaje del error.
 *
 * Esta función interpreta los códigos SQLSTATE más comunes de MySQL
 * y traduce el error técnico en un mensaje claro y entendible.
 * Es útil para evitar mostrar información sensible o críptica
 * al usuario final en operaciones CRUD (create, read, update, delete).
 *
 * @param string $mensajeError  Mensaje original del error lanzado por PDO.
 * @param string $accion        Descripción de la acción realizada, por defecto "operación".
 * @return void                 No devuelve valor; solo imprime un mensaje informativo.
 */
function manejarErrorPDO(string $mensajeError, string $accion = "operación"): void {

    // [HY000] → Error general o fallo de conexión.
    // Puede deberse a servidor MySQL apagado, socket incorrecto o fallo interno.
    if (str_contains($mensajeError, 'SQLSTATE[HY000]')) {
        echo "❌ Error general o de conexión con la base de datos.\n";

    // [08001] → Error al establecer la conexión con el servidor MySQL.
    // Generalmente indica que el host o el puerto no son accesibles.
    } elseif (str_contains($mensajeError, 'SQLSTATE[08001]')) {
        echo "❌ No se pudo establecer conexión con el servidor MySQL.\n";

    // [28000] → Error de autenticación (usuario o contraseña incorrectos).
    // Suele aparecer cuando las credenciales del usuario MySQL son inválidas.
    } elseif (str_contains($mensajeError, 'SQLSTATE[28000]')) {
        echo "❌ Acceso denegado. Usuario o contraseña incorrectos.\n";

    // [23000] → Violación de restricción de integridad (clave duplicada o foreign key).
    // Ocurre al insertar un registro duplicado o violar una relación entre tablas.
    } elseif (str_contains($mensajeError, 'SQLSTATE[23000]')) {
        echo "❌ Error: Violación de restricción de integridad (clave duplicada o relación).\n";

    // [42S02] → La tabla o vista especificada no existe.
    // Suele deberse a errores tipográficos o a que la tabla aún no ha sido creada.
    } elseif (str_contains($mensajeError, 'SQLSTATE[42S02]')) {
        echo "❌ Error: La tabla o vista especificada no existe.\n";

    // [42S22] → La columna especificada no existe.
    // Puede aparecer si el nombre del campo es incorrecto o fue eliminado.
    } elseif (str_contains($mensajeError, 'SQLSTATE[42S22]')) {
        echo "❌ Error: La columna especificada no existe.\n";

    // [22007] → Error de formato en fecha o valor numérico.
    // Por ejemplo, insertar "2025-99-99" o un texto en una columna DATE.
    } elseif (str_contains($mensajeError, 'SQLSTATE[22007]')) {
        echo "❌ Error: Formato de fecha o valor inválido.\n";

    // [22001] → El valor excede el tamaño permitido por la columna.
    // Ejemplo: insertar un texto más largo que el límite VARCHAR.
    } elseif (str_contains($mensajeError, 'SQLSTATE[22001]')) {
        echo "❌ Error: El valor es demasiado largo para la columna.\n";

    // [HY093] → Error interno: número de parámetros incorrectos.
    // Sucede cuando los placeholders (?) no coinciden con los valores pasados en execute().
    } elseif (str_contains($mensajeError, 'SQLSTATE[HY093]')) {
        echo "❌ Error interno: Número de parámetros incorrectos en la consulta.\n";

    // [42000] → Error de sintaxis SQL o falta de permisos para ejecutar la consulta.
    // Indica que el comando SQL está mal formado o el usuario no tiene privilegios suficientes.
    } elseif (str_contains($mensajeError, 'SQLSTATE[42000]')) {
        echo "❌ Error de sintaxis SQL o falta de permisos para ejecutar la consulta.\n";

    // Cualquier otro error no contemplado específicamente.
    // Se muestra el detalle técnico del error completo.
    } else {
        echo "❌ No se pudo completar la $accion. Detalle técnico: $mensajeError\n";
    }
}
?>