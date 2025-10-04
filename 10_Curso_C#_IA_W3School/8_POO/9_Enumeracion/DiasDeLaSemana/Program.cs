/*
    Un enumerador en C# (o enum) es un tipo especial que permite definir un conjunto de constantes con nombre. 
Se utiliza para representar valores discretos, como días de la semana, estados de un proceso, niveles 
de acceso, etc. Esto mejora la legibilidad del código y facilita su mantenimiento.
Características principales:
    Se declara con la palabra clave enum.
Los valores por defecto son enteros (int) comenzando desde 0 y pueden ser modificados.
Se puede asignar explícitamente valores específicos a los miembros.
Ayuda a evitar el uso de números mágicos y mejora la semántica del código.
    Ventajas de usar enumeradores:
Legibilidad: Los nombres de los valores son más claros que números o cadenas.
Mantenimiento: Facilita actualizar los valores disponibles.
Seguridad: Ayuda a prevenir errores, ya que solo se puede utilizar un valor definido en el enum.
Flexibilidad: Se pueden usar en estructuras de control, bases de datos, configuraciones, etc.
 */
using System;

enum DiasDeLaSemana
{
    Lunes,
    Martes,
    Miercoles,
    Jueves,
    Viernes,
    Sabado,
    Domingo
}

class Program
{
    static void Main()
    {
        DiasDeLaSemana dia = DiasDeLaSemana.Miercoles;

        Console.WriteLine($"El día seleccionado es: {dia}");
        Console.WriteLine($"Valor numérico asociado: {(int)dia}");
    }
}
