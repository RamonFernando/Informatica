using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using static APIPokeAPI.Views;
using static APIPokeAPI.HttpClientService;
using static APIPokeAPI.APIControllers;
using static APIPokeAPI.APIFavoriteListController;
using static APIPokeAPI.APIFiltersControllers;
using static APIPokeAPI.Helpers;
using static APIPokeAPI.Models;

namespace APIPokeAPI
{
    internal class Views
    {
        public static void ShowMenu()
        {
            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("      Bienvenido a la PokéAPI");
            Console.WriteLine("====================================");
            Console.WriteLine("             MENÚ PRINCIPAL");
            Console.WriteLine("====================================");
            Console.WriteLine("1. Mostrar lista (20 Pokémon)");
            Console.WriteLine("2. Buscar Pokémon por Id");
            Console.WriteLine("3. Buscar Pokémon por Nombre");
            Console.WriteLine("4. Agregar Pokémon a Favoritos (por Id)");
            Console.WriteLine("5. Eliminar Pokémon de Favoritos");
            Console.WriteLine("6. Mostrar Lista de Favoritos");
            Console.WriteLine("7. Borrar toda la Lista de Favoritos");
            Console.WriteLine("8. Mostrar PokéAPI completa (No recomendado)");
            Console.WriteLine("0. Salir");
            Console.WriteLine("====================================");
            PrintOptionMenu();
        }

        public static void ExitMenu()
        {
            Console.WriteLine("Saliendo del programa...");
            Console.WriteLine("=====================================");
            Console.WriteLine("Gracias por usar la PokéAPI");
            Console.WriteLine("=====================================");
        }

        public static void PrintOptionMenu() => Console.Write("Seleccione una opción: ");

        public static void PrintSearchById() => Console.Write("Ingresa el Id del Pokémon: ");

        public static void PrintSearchByName() => Console.Write("Ingresa el Nombre del Pokémon: ");

        public static void PrintResponseInvalidInput() => Console.WriteLine("Respuesta no válida.");

        public static void PrintInvalidOption() => Console.WriteLine("El valor ingresado no es válido.");

        public static void PrintCancelOperation() => Console.WriteLine("Operación cancelada.");

        public static void PrintSuccessOperation() => Console.WriteLine("Operación exitosa.");

        public static void PrintErrorOperation() => Console.WriteLine("Error. Operación fallida.");

        public static void PrintNoFavorites() => Console.WriteLine("No hay Pokémon en la lista de favoritos.");

        public static void PrintAskAddToFavoriteList() => Console.Write("¿Desea agregar a la lista de favoritos? (S/N): ");

        public static void PrintAskRemoveToFavoriteList() => Console.Write("¿Desea eliminar de la lista de favoritos? (S/N): ");

        public static void PrintAskClearFavoriteList() => Console.Write("¿Está seguro de borrar toda la lista de favoritos? (S/N): ");

        public static void PrintAskId() => Console.Write("Ingrese el Id que desea guardar: ");

        public static void PrintAskIdToRemove() => Console.Write("Ingrese el Id que desea eliminar: ");

        public static void PrintOnlyLane() => Console.WriteLine("-----------------------------------");

        public static void PrintNoData() => Console.WriteLine("No hay datos disponibles para mostrar.");

        public static void PrintSelectOption()
        {
            Console.WriteLine("\n[B] Anterior <= | => [N] Siguiente | [Q] Salir");
            Console.Write("Opción: ");
        }

        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("Presione cualquier tecla para continuar...");
            Console.ReadKey();
        }

        public static void PrintDuplicateId(int id) =>
            Console.WriteLine($"El Id {id} ya se encuentra en la lista de favoritos.");

        public static void PrintNotFoundIdInList(int id) =>
            Console.WriteLine($"El Id {id} no se encuentra en la lista de favoritos.");

        public static void PrintNotFound() => Console.WriteLine("No se ha encontrado el Pokémon.");

        public static void PrintCountPagesAll(int currentPage, int totalPages)
        {
            Console.WriteLine($"Página {currentPage}/{totalPages}");
            Console.WriteLine("=====================================");
        }

        public static void PrintPokemon(Pokemon pokemon)
        {
            Console.WriteLine(
                $"Id: {pokemon.Id}" +
                $"\nName: {pokemon.Name}" +
                $"\nHeight: {pokemon.Height}" +
                $"\nWeight: {pokemon.Weight}" +
                $"\nTypes: {string.Join(", ", pokemon.Types?.ConvertAll(t => t.Type.Name) ?? new System.Collections.Generic.List<string>())}" +
                $"\nSprite: {pokemon.Sprites?.FrontDefault}"
            );
        }

        public static void PrintPokemonListPage(PokemonListRoot data, int pageNumber = 1)
        {
            Console.Clear();
            Console.WriteLine($"Página {pageNumber} - Total Pokémon: {data.Count}");
            Console.WriteLine("=====================================");
            int index = 1;
            foreach (var item in data.Results)
            {
                Console.WriteLine($"{index++}. {item.Name}");
            }
        }

        public static void PrintFavoritesList(System.Collections.Generic.List<FavoriteItem> favorites)
        {
            Console.WriteLine("Lista de Pokémon favoritos:");
            if (favorites == null || favorites.Count == 0)
            {
                PrintNoFavorites();
                PrintWaitForPressKey();
                return;
            }

            int count = 1;
            foreach (var f in favorites)
            {
                Console.WriteLine($"{count++}º Favorito:" +
                    $"\nId: {f.Id}" +
                    $"\nName: {f.Name}" +
                    $"\nHeight: {f.Height}" +
                    $"\nWeight: {f.Weight}" +
                    $"\nTypes: {f.Types}" +
                    $"\nSprite: {f.SpriteUrl}"
                );
                PrintOnlyLane();
            }

            PrintWaitForPressKey();
        }
    }
}
