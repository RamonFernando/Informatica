

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
                int opcion = ValidarOpcion(input, 0, 5); // Pos: min:0 a max:5 != -1
                
                PrintEntradaNoValida(opcion); // -1 Entrada no valida

                switch (opcion)
                {
                    case 1:
                        await SearchByName();
                        break;
                    case 2:
                        await SearchById();
                        break;
                    case 3:
                        await SearchByStatus();
                        break;
                    case 4:
                        ListFavorites();
                        break;
                    case 5:
                        Delete();
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
