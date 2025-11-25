using System;
using System.Collections.Generic;
using APIDogAPI.MODELS;

namespace APIDogAPI.VIEWS
{
    internal static class Views
    {
        // Muestra el menú principal del programa y explica qué hace cada opción
        public static void ShowMenu()
        {
            Console.Clear();
            Console.WriteLine("====================================");
            Console.WriteLine("          Dog API Console");
            Console.WriteLine("====================================");
            Console.WriteLine("              MENÚ PRINCIPAL");
            Console.WriteLine("====================================");
            Console.WriteLine("1. Mostrar todas las razas de perros");
            Console.WriteLine("2. Mostrar subrazas de una raza");
            Console.WriteLine("3. Mostrar imágenes aleatorias de una raza");
            Console.WriteLine("4. Buscar raza por nombre aproximado");
            Console.WriteLine("5. Agregar imagen aleatoria de una raza a favoritos ");
            Console.WriteLine("6. Eliminar un favorito por índice");
            Console.WriteLine("7. Mostrar lista de favoritos");
            Console.WriteLine("8. Borrar todos los favoritos");
            Console.WriteLine("0. Salir");
            Console.WriteLine("====================================");
            PrintOptionMenu();
        }

        // Muestra el mensaje de salida del programa
        public static void ExitMenu()
        {
            Console.WriteLine("Saliendo del programa...");
            Console.WriteLine("=====================================");
            Console.WriteLine("Gracias por usar Dog API Console");
            Console.WriteLine("=====================================");
        }

        // Muestra el texto para pedir una opción del menú
        public static void PrintOptionMenu() => Console.Write("Seleccione una opción: ");

        // Muestra un mensaje cuando la opción introducida no es válida
        public static void PrintInvalidOption() => Console.WriteLine("La opción ingresada no es válida.");

        // Muestra el mensaje de espera para que el usuario pulse una tecla
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("Presione cualquier tecla para continuar...");
            Console.ReadKey();
        }

        // Muestra un separador sencillo en consola
        public static void PrintOnlyLane() => Console.WriteLine("-----------------------------------");

        // Muestra un mensaje cuando no hay datos para mostrar
        public static void PrintNoData() => Console.WriteLine("No hay datos disponibles para mostrar.");

        // Muestra el texto con las opciones de paginación
        public static void PrintSelectOption()
        {
            Console.WriteLine("\n[B] Anterior <= | => [N] Siguiente | [Q] Salir");
            Console.Write("Opción: ");
        }

        // Muestra el indicador de página actual y total de páginas
        public static void PrintCountPagesAll(int currentPage, int totalPages)
        {
            Console.WriteLine($"Página {currentPage}/{totalPages}");
            Console.WriteLine("=====================================");
        }

        // Imprime una raza individual en una línea
        public static void PrintBreed(string breed)
        {
            Console.WriteLine($"- {breed}");
        }

        // Imprime una subraza indicando también la raza principal
        public static void PrintSubBreed(string breed, string subBreed)
        {
            Console.WriteLine($"- {breed} / {subBreed}");
        }

        // Imprime una URL de imagen de perro
        public static void PrintImageUrl(string url)
        {
            Console.WriteLine($"Imagen: {url}");
        }

        // Pide al usuario que introduzca una raza
        public static void PrintAskBreed() => Console.Write("Ingrese el nombre de la raza: ");

        // Pide al usuario que introduzca una subraza
        public static void PrintAskSubBreed() => Console.Write("Ingrese el nombre de la subraza (o deje vacío): ");

        // Muestra un mensaje cuando no se encuentra una raza
        public static void PrintNotFoundBreed() => Console.WriteLine("No se ha encontrado la raza especificada.");

        // Muestra un mensaje cuando no se encuentra un favorito
        public static void PrintNotFoundFavorite() => Console.WriteLine("No se ha encontrado el favorito especificado.");

        // Muestra la pregunta para confirmar añadido a favoritos
        public static void PrintAskAddFavorite() => Console.Write("¿Desea agregar esta imagen a favoritos? (S/N): ");

        // Muestra la pregunta para confirmar borrado de un favorito
        public static void PrintAskRemoveFavorite() => Console.Write("¿Desea eliminar este favorito? (S/N): ");

        // Muestra la pregunta para confirmar el borrado de todos los favoritos
        public static void PrintAskClearFavorites() => Console.Write("¿Está seguro de borrar todos los favoritos? (S/N): ");

        // Muestra un mensaje de operación cancelada
        public static void PrintCancelOperation() => Console.WriteLine("Operación cancelada.");

        // Muestra un mensaje de operación exitosa
        public static void PrintSuccessOperation() => Console.WriteLine("Operación exitosa.");

        // Imprime la lista completa de favoritos con sus datos
        public static void PrintFavoritesList(List<FavoriteDog> favorites)
        {
            Console.WriteLine("Lista de perros favoritos:");
            if (favorites == null || favorites.Count == 0)
            {
                Console.WriteLine("No hay favoritos todavía.");
                return;
            }

            int index = 1;
            foreach (var fav in favorites)
            {
                Console.WriteLine($"{index++}º Favorito:");
                Console.WriteLine($"  Raza: {fav.Breed}");
                Console.WriteLine($"  Subraza: {(string.IsNullOrWhiteSpace(fav.SubBreed) ? "-" : fav.SubBreed)}");
                Console.WriteLine($"  Imagen: {fav.ImageUrl}");
                PrintOnlyLane();
            }
        }

        // Imprime una lista de coincidencias aproximadas de razas con su puntuación de similitud
        public static void PrintApproximateMatches(List<(string Name, int Score)> matches)
        {
            Console.WriteLine("Resultados aproximados:");
            Console.WriteLine("=====================================");
            foreach (var item in matches)
                Console.WriteLine($"{item.Name}  (distancia: {item.Score})");
        }
    }
}
