
namespace APIStarWarsIA
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
                int opcion = ValidateOption(input, 0, 6); // Pos: min:0 a max:6 != -1
                
                PrintValidateInput(opcion, 0, 6); // -1 Entrada no valida

                switch (opcion)
                {
                    case 1:
                        await SearchByName();
                        break;
                    case 2:
                        await SearchByHeight();
                        break;
                    case 3:
                        await SearchByMass();
                        break;
                    case 4:
                        await SearchByGender();
                        break;
                    case 5:
                        ListFavorites();
                        break;
                    case 6:
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
