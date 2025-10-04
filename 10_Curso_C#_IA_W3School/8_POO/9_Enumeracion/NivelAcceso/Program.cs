using System;

enum NivelAcceso
{
    Invitado = 1,
    Usuario = 2,
    Administrador = 3
}

class Program
{
    static void Main()
    {
        NivelAcceso nivel = NivelAcceso.Administrador;

        Console.WriteLine($"Nivel seleccionado: {nivel}");
        Console.WriteLine($"Valor asociado: {(int)nivel}");
    }
}
