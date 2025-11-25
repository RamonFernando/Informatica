using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;
using Newtonsoft.Json;
using APIDogAPI.MODELS;
using APIDogAPI.SERVICES;
using APIDogAPI.VIEWS;
using APIDogAPI.HELPERS;

namespace APIDogAPI.CONTROLLERS
{
    internal static class DogApiController
    {
        // URL base de la Dog API
        private const string BaseUrl = "https://dog.ceo/api";

        // Obtiene la instancia compartida de HttpClient
        private static HttpClient GetClient() => HttpClientService.GetHttpClient();

        // Valida que la respuesta HTTP sea exitosa; si no, muestra el código y motivo
        public static bool ValidateHttpResponse(HttpResponseMessage response)
        {
            if (!response.IsSuccessStatusCode)
            {
                Console.WriteLine("Error en la petición HTTP:");
                Console.WriteLine($"Código: {response.StatusCode}");
                Console.WriteLine($"Info: {response.ReasonPhrase}");
                return false;
            }
            return true;
        }

        // Obtiene la lista completa de razas desde la API Dog
        public static async Task<BreedsListResponse> GetAllBreedsAsync()
        {
            string url = $"{BaseUrl}/breeds/list/all";
            HttpResponseMessage response = await GetClient().GetAsync(url);

            if (!ValidateHttpResponse(response))
                return null;

            string json = await response.Content.ReadAsStringAsync();
            var data = JsonConvert.DeserializeObject<BreedsListResponse>(json);
            return data;
        }

        // Muestra todas las razas paginadas en consola
        public static async Task ShowAllBreeds()
        {
            var data = await GetAllBreedsAsync();
            if (data?.Breeds == null || data.Breeds.Count == 0)
            {
                Views.Views.PrintNoData();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            List<string> breeds = data.Breeds.Keys.OrderBy(b => b).ToList();
            Helpers.Helpers.PaginateList(breeds, 20, Views.Views.PrintBreed);
            Views.Views.PrintWaitForPressKey();
        }

        // Muestra las subrazas de una raza específica
        public static async Task ShowSubBreeds()
        {
            Views.Views.PrintAskBreed();
            string breed = Helpers.Helpers.ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(breed))
            {
                Views.Views.PrintInvalidOption();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            var data = await GetAllBreedsAsync();
            if (data?.Breeds == null || !data.Breeds.ContainsKey(breed))
            {
                Views.Views.PrintNotFoundBreed();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            var subBreeds = data.Breeds[breed];
            if (subBreeds == null || subBreeds.Count == 0)
            {
                Console.WriteLine($"La raza '{breed}' no tiene subrazas.");
                Views.Views.PrintWaitForPressKey();
                return;
            }

            Console.Clear();
            Console.WriteLine($"Subrazas de '{breed}':");
            Console.WriteLine("=====================================");
            foreach (var sb in subBreeds)
                Views.Views.PrintSubBreed(breed, sb);

            Views.Views.PrintWaitForPressKey();
        }

        // Obtiene una lista de imágenes aleatorias para una raza concreta
        public static async Task<List<string>> GetRandomImagesByBreedAsync(string breed, int count)
        {
            string url = $"{BaseUrl}/breed/{breed}/images/random/{count}";
            HttpResponseMessage response = await GetClient().GetAsync(url);

            if (!ValidateHttpResponse(response))
                return new List<string>();

            string json = await response.Content.ReadAsStringAsync();
            var data = JsonConvert.DeserializeObject<ImagesListResponse>(json);

            return data?.Images ?? new List<string>();
        }

        // Muestra imágenes aleatorias de una raza concreta, sin guardarlas
        public static async Task ShowRandomImagesByBreed()
        {
            Views.Views.PrintAskBreed();
            string breed = Helpers.Helpers.ReadInput()?.Trim().ToLower();

            if (string.IsNullOrWhiteSpace(breed))
            {
                Views.Views.PrintInvalidOption();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            var images = await GetRandomImagesByBreedAsync(breed, 5);
            if (images.Count == 0)
            {
                Views.Views.PrintNoData();
                Views.Views.PrintWaitForPressKey();
                return;
            }

            Console.Clear();
            Console.WriteLine($"Imágenes aleatorias de la raza '{breed}':");
            Console.WriteLine("=====================================");
            foreach (var img in images)
                Views.Views.PrintImageUrl(img);

            Views.Views.PrintWaitForPressKey();
        }

        // Obtiene una única imagen aleatoria de una raza
        public static async Task<string> GetSingleRandomImageByBreedAsync(string breed)
        {
            string url = $"{BaseUrl}/breed/{breed}/images/random";
            HttpResponseMessage response = await GetClient().GetAsync(url);

            if (!ValidateHttpResponse(response))
                return null;

            string json = await response.Content.ReadAsStringAsync();
            var data = JsonConvert.DeserializeObject<SingleImageResponse>(json);

            return data?.ImageUrl;
        }

        // Maneja de forma centralizada las excepciones más comunes en llamadas HTTP y JSON
        public static void HandlerException(Exception ex)
        {
            if (ex is HttpRequestException httpEx)
            {
                Console.WriteLine("Error en la petición HTTP:");
                Console.WriteLine(httpEx.Message);
                Console.WriteLine(httpEx.HResult);
                return;
            }

            if (ex is JsonException jsonEx)
            {
                Console.WriteLine("Error al procesar JSON:");
                Console.WriteLine(jsonEx.Message);
                Console.WriteLine(jsonEx.HResult);
                return;
            }

            if (ex is TaskCanceledException taskEx)
            {
                Console.WriteLine("Petición cancelada (posible timeout):");
                Console.WriteLine(taskEx.Message);
                Console.WriteLine(taskEx.HResult);
                return;
            }

            if (ex is FormatException formatEx)
            {
                Console.WriteLine("Error de formato:");
                Console.WriteLine(formatEx.Message);
                Console.WriteLine(formatEx.HResult);
                return;
            }

            if (ex is ArgumentException argEx)
            {
                Console.WriteLine("Argumento inválido:");
                Console.WriteLine(argEx.Message);
                Console.WriteLine(argEx.HResult);
                return;
            }

            if (ex is NullReferenceException nullEx)
            {
                Console.WriteLine("Referencia nula:");
                Console.WriteLine(nullEx.Message);
                Console.WriteLine(nullEx.HResult);
                return;
            }

            Console.WriteLine("Error desconocido:");
            Console.WriteLine(ex.Message);
            Console.WriteLine(ex.HResult);
        }
    }
}