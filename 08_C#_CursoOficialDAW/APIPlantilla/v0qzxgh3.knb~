using System;
using System.Net.Http;
using System.Threading.Tasks;
using System.Collections.Generic;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using static APIPlantilla.Models;
using static APIPlantilla.APISaveJson;
using static APIPlantilla.APILoadJson;
using static APIPlantilla.APIControllers;

// Nota para el profesor:
// Instalar en Nuget: Newtonsoft.Json (Proyecto -> Administrar paquetes NuGet... -> Examinar -> Buscar(Ctrl + L) -> Newtonsoft.Json)

/*
 * Metodo de empleo
 * * Importar las clases Models, APISaveJson, APILoadJson, APIControllers, Newtonsoft.Json.Linq, Newtonsoft.Json, System.Net.Http
 * 1. Cambiar la url de la API (31)
 * 2. Nombre de la Pripiedad (36) para que aparezca el nombre de la API
 * 3. Cambar el nombre de la vista del objeto a mostrar (123)
 */

/*
 * Index
 * 1. (34) APILoadFavoriteList()    -> Cargar Json
 * 2. (99) RequestSearchByName()    -> Buscar por nombre (LLama al metodo SearchByName)
 * 3. (128) GetRequestAPI()         -> Mostrar la API
 */


namespace APIPlantilla
{
    internal class Program
    {
        public static readonly HttpClient client = new HttpClient();
        
        public static string Url => "https://digimon-api.vercel.app/api/digimon"; // *cambiar url*

        public static List<FavoriteItemList> favoriteList = new List<FavoriteItemList>();

        public static string NameProperty => "nombreDeLaAPI";
        public static string NameApi => "name";

        static async Task Main(string[] args)
        {
            // 1. CARGAR Json
            APILoadFavoriteList();
            while (true)
            {
                try
                {
                    Console.Clear();
                    Console.WriteLine("**=======================================**");
                    Console.WriteLine($"  Bienvenido a la API de {NameApi}");
                    Console.WriteLine("===========================================");
                    Console.WriteLine("         MENU PRINCIPAL");
                    Console.WriteLine("===========================================");
                    Console.WriteLine("1. Mostrar API");
                    Console.WriteLine("2. Buscar (Nombre y Add a Favoritos)");
                    Console.WriteLine("3. Borrar Digimon Favorito");
                    Console.WriteLine("4. Mostrar Lista API");
                    Console.WriteLine("0. Salir");
                    Console.WriteLine("**=======================================**");
                    Console.Write("Introduce una opcion: ");
                    var input = ValidateInput(Console.ReadLine());

                    if (input == -1 || input < 0 || input > 4)
                    {
                        Console.WriteLine("\nEntrada no valida");
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
                            Console.WriteLine("\nSaliendo del programa...");
                            Environment.Exit(0);
                            // PrintWaitForPressKey();
                            // return;
                            break;
                        default:
                            Console.WriteLine("\nOpcion no valida");
                            break;
                    }
                }
                catch (Exception ex)
                {
                    HandlerException(ex);
                    PrintWaitForPressKey();
                }
            }
        } // main

        // 2. BUSCAR por nombre
        // Metodo que llama a SearchByName para buscar por personaje
        public static async Task RequestSearchByName()
        {
            Console.Write("Introduce el Nombre: ");
            string name = Console.ReadLine();

            Console.WriteLine("Buscando...");
            var result = await SearchByName(name);
            // Console.WriteLine(result);
            if (result is null || result.Count == 0) // Comprobamos que no este vacio
            {
                Console.WriteLine($"{NameProperty} no encontrado");
                PrintWaitForPressKey();
                return;
            }
            // *JObject item = result;* si es un objeto
            var item = result[0];

            // *ajustar el formato a la api Propiedades del objeto o array*
            Console.WriteLine($"-------------------------\n" +
            $"Nombre: {item["name"]}\n" +
            $"Tipo: {(item["type"] == null ? "Unknown" : item["type"])}\n" +
            $"Nivel: {item["level"]}\n");

            AddToFavoriteList(result.ToString());
            APISaveFavoriteList();
        } // RequestSearchByName

        // 3. MOSTRAR API
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
            var json = JArray.Parse(stringJson); // *Si es array JArray, si es objeto JObject*

            // 5.1. Mostramos el JSON
            Console.WriteLine(JsonConvert.SerializeObject(json, Formatting.Indented));
            PrintWaitForPressKey();

        } // GetRequest
    } // Program
}
