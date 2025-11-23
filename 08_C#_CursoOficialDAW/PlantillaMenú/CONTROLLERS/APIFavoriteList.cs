using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

// Importar static
using static PlantillaMenú.APIControllers;
using static PlantillaMenú.APIFiltersControllers;
using static PlantillaMenú.Helpers;
using static PlantillaMenú.Models;
using static PlantillaMenú.APISaveFavoriteListJson;
using static PlantillaMenú.Views;

namespace PlantillaMenú
{
    internal class APIFavoriteList
    {
        public static List<FavoriteItemList> FavoriteList { get; set; } = new List<FavoriteItemList>();

        // Solicita un ID al usuario, realiza una petición GET a la API,
        // valida la respuesta, deserializa el JSON recibido y, si el usuario
        // confirma (S/N), agrega el resultado a la lista de favoritos.
        public static async Task RequestAddToFavoriteList()
        {
            PrintAskId();
            string input = ReadInput();
            
            int num = ValidateIsNumberId(input); // APIFiltersControllers

            if (num == -1) {
                PrintInvalidOption();
                return;
            }
            // APIControllers
            var response = await GetRequestById(input);
            if (!ValidatedHttpResponse(response)) return;

            // Extrae el JSON de la respuesta
            var json = await GetJson(response);
            var objectJson = DeserializedJson(json);

            // Valida que el JSON contenga un ID valido
            if (!ValidateSearchById(DeserializedJson(json))) return;

            PrintAskAddToFavoriteList();
            var confirm = ConfirmOperationFavoriteList(ReadInputUpper());
            if (!confirm)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            // Convierte el ID en un entero y agrega el JSON deserializado a la lista
            Add(num, DeserializedJson(json));

            PrintSuccessOperation();
            PrintWaitForPressKey();
        }

        // Solicita al usuario un ID, valida la entrada y, si es correcta,
        // elimina de la lista de favoritos el elemento que coincida con dicho ID.
        public static void RequestRemoveToFavoriteList()
        {
            PrintAskIdToRemove();
            string input = ReadInput();

            int num = ValidateIsNumberId(input); // APIFiltersControllers

            if (num == -1)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            PrintAskAddToFavoriteList();
            var confirm = ConfirmOperationFavoriteList(ReadInputUpper());
            if (!confirm)
            {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }
            Remove(num);

            PrintSuccessOperation();
            PrintWaitForPressKey();
        }
        public static bool Add(int id, NameClassContent objJson) {
            if (FavoriteList.Any(i => i.Id == id)) {
                PrintDuplicateId(id);
                return false;
            }
            FavoriteList.Add(new FavoriteItemList { Id = id, Content = objJson });
            return true;
        }
        public static void Remove(int id) {
            var item = FavoriteList.FirstOrDefault(i => i.Id == id);
            if (item == null) {
                PrintNotFoundIdInList(id);
                return;
            }            
            FavoriteList.Remove(item);
        }
        
        // Convierte la lista de favoritos a un string JSON con formato indentado.
        // Si la lista es null, devuelve un JSON de una lista vacía.
        public static string FormattedJsonFavoriteList(List<FavoriteItemList> favoriteList) =>
            JsonConvert.SerializeObject(favoriteList ?? new List<FavoriteItemList>(), Formatting.Indented);

        // Convierte un string JSON en una lista de FavoriteItemList.
        // Si el JSON es null o inválido, devuelve una lista vacía.
        public static List<FavoriteItemList> DeserializedJsonFavoriteList(string json) =>
            JsonConvert.DeserializeObject<List<FavoriteItemList>>(json) ?? new List<FavoriteItemList>();

        // Borra toda la lista de favoritos si el usuario confirma (S/N)
        public static void RequestClearFavoriteList()
        {
            PrintAskClearFavoriteList();
            string input = ReadInputUpper();

            // Validar entrada vacía o con espacios
            if (input == null || string.IsNullOrWhiteSpace(input)) {
                PrintResponseInvalidInput();
                return;
            }

            // Si no confirma con S cancelamos la operación
            if (input != "S") {
                PrintCancelOperation();
                PrintWaitForPressKey();
                return;
            }

            // Borrar lista
            FavoriteList.Clear();
            PrintSuccessOperation();

            // Guardar cambios en JSON
            SaveFavoritesToJson();

            PrintWaitForPressKey();
        }
    }
}
    

