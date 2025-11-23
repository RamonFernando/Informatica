using System;
using System.Collections.Generic;

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
    internal class Views
    {
        public static void ShowMenu()
        {
            Console.Clear();
            Console.WriteLine("**================================**");
            Console.WriteLine($"  Bienvenido a la API {ApiName()}");
            Console.WriteLine("====================================");
            Console.WriteLine("         MENU PRINCIPAL");
            Console.WriteLine("====================================");
            Console.WriteLine("1. Mostrar API (20 Personajes)");
            Console.WriteLine("2. Buscar API (Id)");
            Console.WriteLine("3. Buscar API (Nombre)");
            Console.WriteLine("4. Agregar a Lista API");
            Console.WriteLine("5. Eliminar de Lista API");
            Console.WriteLine("6. Mostrar Lista API");
            Console.WriteLine("7. Borrar toda la Lista API");
            Console.WriteLine("0. Salir");
            Console.WriteLine("**=================================**");
            PrintOptionMenu();
        }
        public static void ExitMenu()
        {
            Console.WriteLine("Saliendo del Programa...");
            Console.WriteLine("=====================================");
            Console.WriteLine($"Gracias por usar la API {ApiName()}");
            Console.WriteLine("=====================================");
            return;
        }
        // Metodos Solo de impresión
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("Presione cualquier tecla para continuar...");
            Console.ReadKey();
        }
        public static void PrintOptionMenu() => Console.Write("Seleccione una opcion: ");

        public static void PrintSearchById() => Console.Write("Ingresa el Id que desea buscar:");

        public static void PrintSearchByName() => Console.Write("Ingresa el Nombre que desea buscar:");

        public static void PrintResponseInvalidInput() => Console.WriteLine("Respuesta no valida.");

        public static void PrintInvalidOption() => Console.WriteLine("El valor ingresado no es valido.");

        public static void PrintCancelOperation() => Console.WriteLine("Operación cancelada.");

        public static void PrintSuccessOperation() => Console.WriteLine("Operación exitosa.");

        public static void PrintErrorOperation() => Console.WriteLine("Error. Operación fallida.");

        public static void PrintNoFavorites() => Console.WriteLine("No hay elementos en la lista de favoritos.");

        public static void PrintAskAddToFavoriteList() => Console.Write("Desea Agregar a la Lista API? (S/N)");

        public static void PrintAskRemoveToFavoriteList() => Console.Write("Desea Eliminar de la Lista API? (S/N)");

        public static void PrintAskClearFavoriteList() => Console.Write("Estas seguro que desea Borrar toda la Lista API? (S/N)");

        public static void PrintCancelAdd() => Console.WriteLine("No se agregado a la Lista API.");

        public static void PrintCancelRemove() => Console.WriteLine("No se ha eliminado de la Lista API.");

        public static void PrintDuplicateId(int id) => Console.WriteLine($"El id {id} ya se encuentra en la lista de favoritos.");

        public static void PrintNotFoundIdInList(int id) => Console.WriteLine($"El id {id} no se encuentra en la lista de favoritos.");

        public static void PrintNotFountId() => Console.WriteLine("Id no encontrado");
        public static void PrintAskId() => Console.Write("Ingrese el Id que desea Guardar: ");

        public static void PrintAskIdToRemove() => Console.Write("Ingrese el Id que desea Eliminar: ");

        // JSON
        // Imprimir Json
        public static void PrintJson(ClassAtributes pers) {
            
            Console.WriteLine(
                    $"Id: {pers.Id}" +
                    $"\nName: {pers.Name}" +
                    $"\nStatus: {pers.Status}" +
                    $"\nSpecies: {pers.Species}" +
                    $"\nType: {pers.Type}" +
                    $"\nGender: {pers.Gender}" +
                    $"\nOrigin: {pers.Origin.Name}" +
                    $"\nLocation: {pers.Location.Name}"
                    );
        }

        public static void PrintFormattedJson(ClassRoot objJson)
        {
            foreach (var pers in objJson.ResultsList)
            {
                PrintJson(pers);
                Console.WriteLine("--------------------------");
            }
        }
        // Save
        public static void PrintAddToFavoriteList(bool saved, int id) =>
            Console.WriteLine(saved ? $"Id: {id} Guardado con exito" : "No se agrego a la Lista API");
        public static void PrintSaveToJson(string filePath) => Console.WriteLine($"Favoritos guardados en: {filePath}");

        // Load
        public static void PrintNoFile() => Console.WriteLine("El archivo no existe.");

        // List
        public static void PrintList(List<FavoriteItemList> FavoriteList)
        {
            Console.WriteLine("Lista de favoritos");
            int count = 1;
            if (FavoriteList == null || FavoriteList.Count == 0)
            {
                PrintNoFavorites();
                PrintWaitForPressKey();
                return;
            }
            foreach (var pers in FavoriteList)
            {
                Console.WriteLine($"{count++}º Favorito:" +
                    $"\nId: {pers.Id}" +
                    $"\nName: {pers.Name}" +
                    $"\nStatus: {pers.Status}" +
                    $"\nSpecies: {pers.Species}" +
                    $"\nType: {pers.Type}" +
                    $"\nGender: {pers.Gender}" +
                    $"\nOrigin: {pers.Origin.Name}" +
                    $"\nLocation: {pers.Location.Name}"
                    );
            }
            PrintWaitForPressKey();
        }
    }
}
