using System;

enum EstadoPedido
{
    Pendiente,
    EnProceso,
    Enviado,
    Entregado
}

class Program
{
    static void Main()
    {
        EstadoPedido estado = EstadoPedido.Enviado;

        switch (estado)
        {
            case EstadoPedido.Pendiente:
                Console.WriteLine("El pedido aún no ha sido procesado.");
                break;
            case EstadoPedido.EnProceso:
                Console.WriteLine("El pedido está en preparación.");
                break;
            case EstadoPedido.Enviado:
                Console.WriteLine("El pedido ha sido enviado.");
                break;
            case EstadoPedido.Entregado:
                Console.WriteLine("El pedido ha sido entregado.");
                break;
        }
        Console.ReadKey();
    }
}
