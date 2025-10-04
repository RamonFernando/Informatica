using System;
using System.Threading.Tasks;

// Ejemplo de una función que realiza operaciones asincrónicas.
class Ejemplo
{   
    // Función asíncrona
    static async Task MostrarMensajeAsync()
    {
        await Task.Delay(2000); // Simula una operación asíncrona
        Console.WriteLine("¡Mensaje mostrado después de 2 segundos!");
    }

    static async Task Main()
    {
        Console.WriteLine("Esperando...");
        await MostrarMensajeAsync();
        Console.ReadKey();
    }
}
