

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
                int opcion = ValidarOpcion(input, 0, 9); // Pos: min:0 a max:9 != -1
                
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
                        await SearchBySpecies();
                        break;
                    case 5:
                        await SearchByGender();
                        break;
                    case 6:
                        await SearchByOrigin();
                        break;
                    case 7:
                        ListFavorites();
                        break;
                    case 8:
                        await SearchByOrigin();
                        break;
                    case 9:
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
