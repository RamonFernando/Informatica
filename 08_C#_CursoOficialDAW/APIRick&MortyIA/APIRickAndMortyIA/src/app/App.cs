

namespace APIRickAndMortyIA
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
                int opcion = ValidateOption(input, 0, 8); // Pos: min:0 a max:8 != -1
                
                PrintValidateInput(opcion, 0, 8); // -1 Entrada no valida

                switch (opcion)
                {
                    case 1:
                        await SearchById();
                        break;
                    case 2:
                        await SearchByName();
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
                        Delete();
                        break;
                    case 0:
                        Console.WriteLine(exitMessage);
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine(errorOptionMsg);
                        break;
                }
            }
        }
    }
}
