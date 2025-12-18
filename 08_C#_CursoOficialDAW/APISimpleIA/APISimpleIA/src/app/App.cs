

namespace APISimpleIA
{
    public static class App
    {
        

        public static async Task Run()
        {
            APILoadFavoriteList();
            while (true)
            {
                PrintMenu();

                string? input = Console.ReadLine();
                int opcion = ValidarOpcion(input, 0, 3); // Pos: min:0 a max:3 != -1
                
                PrintEntradaNoValida(opcion); // -1 Entrada no valida

                switch (opcion)
                {
                    case 1:
                        await Buscar();
                        break;
                    case 2:
                        ListarGuardados();
                        break;
                    case 3:
                        Eliminar();
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
