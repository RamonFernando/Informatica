/*
 Un enumerador en C# (o enum) es un tipo especial que permite definir un conjunto de constantes con nombre. 
Se utiliza para representar valores discretos, como días de la semana, estados de un proceso, niveles 
de acceso, etc. Esto mejora la legibilidad del código y facilita su mantenimiento.
 */
using System;

enum Meses
{
    Enero = 1,
    Febrero,
    Marzo,
    Abril,
    Mayo,
    Junio,
    Julio,
    Agosto,
    Septiembre,
    Octubre,
    Noviembre,
    Diciembre
}

class Program
{
    static void MostrarMes(Meses mes)
    {
        Console.WriteLine($"El mes seleccionado es: {mes}");
    }

    static void Main()
    {
        Meses mesActual = Meses.Diciembre;
        MostrarMes(mesActual); // Salida: El mes seleccionado es: Diciembre
    }
}
