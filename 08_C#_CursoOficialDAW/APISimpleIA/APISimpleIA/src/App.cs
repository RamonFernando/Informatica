
using static APISimpleIA.APIBuscarDigimon;
using static APISimpleIA.APIListarGuardados;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;

namespace APISimpleIA
{
    public static class App
    {
        public static string BASE_URL = "https://digimon-api.vercel.app/api/digimon";

        public static async Task Run()
        {
            while (true)
            {
                PrintMenu();

                string? input = Console.ReadLine();
                int opcion = ValidarOpcion(input, 0, 2);
                
                if(opcion == -1) // Numero entre 0 y 2
                {
                    Console.WriteLine("Entrada no valida o fuera de rango");
                    PrintWaitForPressKey();
                    continue;
                }

                switch (opcion)
                {
                    case 1:
                        await BuscarDigimon();
                        break;

                    case 2:
                        ListarGuardados();
                        break;

                    case 0:
                        Console.WriteLine("Saliendo...");
                        Environment.Exit(0);
                        break;

                    default:
                        Console.WriteLine("Opción no valida.\n");
                        break;
                }
            }
        }
    }
}
