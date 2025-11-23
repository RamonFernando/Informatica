using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Importar static
using static APIRickAndMorty.Program;
using static APIRickAndMorty.Models;
using static APIRickAndMorty.APIControllers;
using static APIRickAndMorty.APIFavoriteList;
using static APIRickAndMorty.APIFiltersControllers;
using static APIRickAndMorty.APILoadFavoriteListFromJson;
using static APIRickAndMorty.APISaveFavoriteListJson;
using static APIRickAndMorty.Helpers;
using static APIRickAndMorty.Views;

namespace APIRickAndMorty
{
    internal class Program
    {
        static async Task Main(string[] args)
        {
            LoadFavoritesFromJson(); // Cargamos la lista de favoritos
            while (true)
            {
                try
                {
                    ShowMenu();

                    int? opc = ValidateInput(ReadInput());
                    if (opc is null) continue; // Si la entrada es null, salimos
                    switch (opc)
                    {
                        case 1:
                            Console.WriteLine("Mostramos consulta API");
                            await ExecuteHttpRequest(); // ApiControllers                                
                            break;
                        case 2:
                            Console.WriteLine("Filtramos Id API");
                            await SearchById(); // ApiFiltersControllers
                            SaveFavoritesToJson();
                            break;
                        case 3:
                            Console.WriteLine("Filtramos Nombre API");
                            await SearchByName(); // ApiFiltersControllers
                            SaveFavoritesToJson();
                            break;
                        case 4:
                            Console.WriteLine("Agregamos nombres a la Lista API");
                            Console.WriteLine("Prueba");
                            await RequestAddToFavoriteList(); // APIFavoriteList
                            SaveFavoritesToJson();
                            break;
                        case 5:
                            Console.WriteLine("Eliminamos nombres de la Lista API");
                            RequestRemoveToFavoriteList(); // APIFavoriteList
                            SaveFavoritesToJson();
                            break;
                        case 6:
                            Console.WriteLine("Mostramos Lista API");
                            PrintList(FavoriteList); // APIFavoriteList
                            break;
                        case 7:
                            Console.WriteLine("Borrar Lista API");
                            RequestClearFavoriteList(); // APIFavoriteList
                            
                            break;
                        case 0:
                            ExitMenu();
                            return;
                    }
                }
                catch (Exception ex)
                {
                    HandlerException(ex);
                }
            }
        }
    }
}
