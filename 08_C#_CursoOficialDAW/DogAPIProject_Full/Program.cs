using System;
using System.Threading.Tasks;
using APIDogAPI.CONTROLLERS;
using APIDogAPI.HELPERS;
using APIDogAPI.VIEWS;

namespace APIDogAPI
{
    internal class Program
    {
        // Punto de entrada del programa: muestra el menú y dirige el flujo principal
        static async Task Main(string[] args)
        {
            // Cargamos la lista de favoritos desde JSON al iniciar
            FavoritesController.LoadFavoritesFromJson();

            while (true)
            {
                try
                {
                    // Mostramos el menú principal (VISTA)
                    Views.ShowMenu();

                    // Leemos y validamos la opción del usuario (HELPER)
                    int? opc = Helpers.ValidateInput(Helpers.ReadInput());
                    if (opc is null)
                        continue;

                    // Enrutamos la opción al controlador correspondiente
                    switch (opc)
                    {
                        case 1:
                            // Opción 1: Mostrar todas las razas de perros
                            await DogApiController.ShowAllBreeds();
                            break;
                        case 2:
                            // Opción 2: Mostrar subrazas de una raza concreta
                            await DogApiController.ShowSubBreeds();
                            break;
                        case 3:
                            // Opción 3: Mostrar imágenes aleatorias de una raza
                            await DogApiController.ShowRandomImagesByBreed();
                            break;
                        case 4:
                            // Opción 4: Buscar raza por nombre aproximado
                            await SearchController.SearchBreedByApproximateName();
                            break;
                        case 5:
                            // Opción 5: Agregar imagen aleatoria de una raza a favoritos
                            await FavoritesController.AddFavoriteFromRandomImage();
                            break;
                        case 6:
                            // Opción 6: Eliminar un favorito por índice
                            FavoritesController.RemoveFavorite();
                            break;
                        case 7:
                            // Opción 7: Mostrar la lista de favoritos
                            FavoritesController.ShowFavorites();
                            break;
                        case 8:
                            // Opción 8: Borrar toda la lista de favoritos
                            FavoritesController.ClearFavorites();
                            break;
                        case 0:
                            // Opción 0: Salir del programa
                            Views.ExitMenu();
                            return;
                    }
                }
                catch (Exception ex)
                {
                    // Manejo global de excepciones: delegamos en el controlador de API
                    DogApiController.HandlerException(ex);
                }
            }
        }
    }
}