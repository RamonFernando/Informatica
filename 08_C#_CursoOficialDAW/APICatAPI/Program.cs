using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Threading.Tasks;
using static APICatAPI.APISaveJson;
using static APICatAPI.APILoadJson;
using static APICatAPI.Controllers;
using static APICatAPI.Models;


// Metodos
// 1. (29)  APILoadJson             : Cargar Json
// 2. (92)  RequestSearchByName()   : LLamar al metodo Buscar por Nombre y Add a Favoritos
// 3. (119) GetRequestDigimon()     : Mostrar API

namespace APICatAPI
{
    internal class Program
    {   
        public static readonly HttpClient  client = new HttpClient();
        public static string Url => "https://api.thecatapi.com/v1/breeds";
        public static List<FavoriteItemList> favoriteList = new List<FavoriteItemList>();

        static async Task Main(string[] args)
        {   
            // 1. Cargar Json
            APILoadFavoriteList();
            while (true)
            {
                try
                {
                    Console.Clear();
                    Console.WriteLine("**================================**");
                    Console.WriteLine($"  Bienvenido a la API de CatAPI");
                    Console.WriteLine("====================================");
                    Console.WriteLine("         MENU PRINCIPAL");
                    Console.WriteLine("====================================");
                    Console.WriteLine("1. Mostrar API");
                    Console.WriteLine("2. Buscar (Nombre y Add a Favoritos)");
                    Console.WriteLine("3. Borrar Digimon Favorito");
                    Console.WriteLine("4. Mostrar Lista API");
                    Console.WriteLine("0. Salir");
                    Console.WriteLine("**=================================**");
                    Console.Write("Introduce una opcion: ");
                    var input = ValidateInput(Console.ReadLine());
                    
                    if (input == -1 || input < 0 || input > 4)
                    {
                        Console.WriteLine("Entrada no valida");
                        PrintWaitForPressKey();
                        continue;
                    } 

                    switch (input)
                    {
                        case 1:
                            Console.WriteLine("Cargando API...");
                            await GetRequestAPI();
                            break;
                        case 2:
                            // Buscar por nombre
                            await RequestSearchByName();
                            break;
                        case 3:
                            RemoveFavoriteList();
                            break;
                        case 4:
                            // Mostrar la lista de favoritos
                            ShowFavoriteList();

                            break;
                        case 0:
                            Console.WriteLine("Saliendo del programa...");
                            Environment.Exit(0);
                            // PrintWaitForPressKey();
                            // return;
                            break;
                    }
                }
                catch (Exception ex)
                {
                    HandlerException(ex);
                }
            }
        } // main

        // Metodos 
        // 2. Buscar por Nombre
        public static async Task RequestSearchByName()
        {
            Console.Write("Introduce el Nombre: ");
            string name = Console.ReadLine();

            Console.WriteLine("Buscando...");
            var result = await SearchByName(name);
            // Console.WriteLine(result);
            if (result is null || result.Count == 0)
            {
                Console.WriteLine("Gato no encontrado");
                PrintWaitForPressKey();
                return;
            }
            var item = result[0];

            Console.WriteLine($"-------------------------\n" +
            $"Id: {item["id"]}\n" +
            $"Nombre: {item["name"]}\n" +
            $"Origen: {(item["origin"] == null ? "Unknown" : item["origin"])}\n" +
            $"Descripcion: {(item["description"] == null ? "Unknown" : item["description"])}\n");

            AddToFavoriteList(result.ToString());
            APISaveFavoriteList();
        } // RequestSearchByName

        // 3. Mostrar API
        // Hacemos la peticion a la API
        public static async Task GetRequestAPI()
        {
            // 1. Hacemos la consulta
            HttpResponseMessage response = await client.GetAsync(Url);

            // 3. Validamos
            if (!response.IsSuccessStatusCode)
            {
                Console.WriteLine($"Error: Codigo: {response.StatusCode}\n Info: {response.ReasonPhrase}");
                // PrintWaitForPressKey();
                return;
            }
            // 2. Obtenemos el contenido de la consulta
            string stringJson = await response.Content.ReadAsStringAsync();

            // 4. Mostramos el contenido
            // Console.WriteLine(contentJson);

            // 5. Deserializamos el JSON
            var json = JArray.Parse(stringJson);

            // 5.1. Mostramos el JSON
            Console.WriteLine(JsonConvert.SerializeObject(json, Formatting.Indented));
            PrintWaitForPressKey();

        } // GetRequest
    }
}
