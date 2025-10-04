Para crear un backend en PHP para la página de LA TOSCANA, te recomendaría implementar funcionalidades comunes 
para una pizzería, como:

Gestión de Menú: Permitir que los administradores agreguen, editen o eliminen elementos del menú.
Sistema de Pedidos: Crear un sistema donde los usuarios puedan hacer pedidos en línea.
Sistema de Reservas (opcional): Para reservar mesas si la pizzería tiene un área de comedor.
Panel de Administración: Un panel para gestionar pedidos, reservas y menú.
Autenticación de Usuario: Registro e inicio de sesión para clientes y administradores.
Integración de Pago: Si la pizzería quiere aceptar pagos en línea, integrar una pasarela de pago segura.

La función fetch_assoc() es un método de PHP que se usa con resultados de consultas a bases de datos MySQL 
para obtener las filas de un resultado como un arreglo asociativo. Esto significa que cada fila que recupera se 
convierte en un arreglo donde las claves son los nombres de las columnas de la base de datos.

Explicación
Sintaxis: $row = $result->fetch_assoc();
$result es el objeto de resultado de la consulta.
fetch_assoc() convierte cada fila de ese resultado en un arreglo asociativo.

$result = $conn->query($sql);

Desglose de cada elemento

$conn: Es la conexión activa a la base de datos, generalmente creada usando new mysqli(...). Este objeto contiene la información 
necesaria para interactuar con la base de datos.

->query($sql): Es un método del objeto de conexión ($conn). Toma una consulta SQL como argumento (en este caso, $sql) y la envía a 
la base de datos para que sea ejecutada.

$sql: Es la consulta SQL que deseas ejecutar. Puede ser una instrucción de selección (SELECT), inserción (INSERT), 
actualización (UPDATE), o eliminación (DELETE), entre otras.

$result: Es el resultado devuelto por la consulta. Este resultado puede ser:
Un conjunto de resultados, si la consulta fue un SELECT (es decir, un conjunto de filas que satisfacen la consulta).
TRUE o FALSE, si la consulta fue de otro tipo (INSERT, UPDATE, DELETE), para indicar si la operación fue exitosa o no.



