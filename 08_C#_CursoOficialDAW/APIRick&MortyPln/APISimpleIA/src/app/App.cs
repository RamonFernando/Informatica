

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
                int opcion = ValidarOpcion(input, 0, 4); // Pos: min:0 a max:4 != -1
                
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
                        ListFavorites();
                        break;
                    case 4:
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
