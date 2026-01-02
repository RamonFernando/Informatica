

namespace APICountriesIA
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
                        await SearchByName();
                        break;
                    case 2:
                        await SearchByCapital();
                        break;
                    case 3:
                        //await SearchByRegion();
                        break;
                    case 4:
                        //await SearchByLanguages();
                        break;
                    case 5:
                        //await SearchByPopulation();
                        break;
                    case 6:
                        ListFavorites();
                        break;
                    case 7:
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
