using System;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;
using System.Collections.Generic;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using static APIStarWarsAPI.Models;
using static APIStarWarsAPI.Program;
using static APIStarWarsAPI.APISaveJson;

/*
 * Index
 * 1. (34) SearchByName(string name)            -> BUSCAR por nombre
 * 2. (75) AddToFavoriteList(string stringJson) -> AGREGAR a la lista de favoritos
 * 3. (114) ShowFavoriteList()                   -> MOSTRAR la lista de favoritos
 * 4. (140) RemoveFavoriteList()                -> BORRAR de la lista de favoritos
 * 5. (161) ValidateInput(string input)         -> VALIDAR Input
 * 6. (173) PrintWaitForPressKey()              -> PRINT (esperar tecla)
 * 7. (180) HandlerException(Exception ex)     -> Manejo de EXCEPCIONES
 */

/*
 * Metodo de empleo
 * 1. (37) cambiar la url con el parametro que se quiere buscar (name)
 * 2. (91) cambiar los nombres de los atributos de la clase FavoriteItemList (ADDFavoriteList)(atributes))
 * 3. (130) cambiar los nombres de los atributos de la clase FavoriteItemList (ShowFavoriteList (atributes))
 */

namespace APIStarWarsAPI
{
    internal class APIControllers
    {
        // 1. BUSCAR por nombre
        public static async Task<JObject> SearchByName(string name) 
        {

            var Url = $"https://swapi-api.hbtn.io/api/people/?search={name.ToLower()}"; // *cambiar url*

            var response = await client.GetAsync(Url);

            // Validamos la respuesta del servidor
            if (!response.IsSuccessStatusCode)
            {
                if (response.StatusCode == System.Net.HttpStatusCode.BadRequest) return null;

                Console.WriteLine($"Error: Codigo: {response.StatusCode}\n Info: {response.ReasonPhrase}");
                PrintWaitForPressKey();
                return null;
            }
            string stringJson = await response.Content.ReadAsStringAsync();

            // Valida que el Json no empiece con un [corchete] (demuestra que no se ha encontrado el digimon)
            /*if (!stringJson.TrimStart().StartsWith("["))
            {
                Console.WriteLine($"{NameProperty} no encontrado o error de formato");
                PrintWaitForPressKey();
                return null;
            }*/

            // Conviertimos el JSON en un array y luego creamos un nuevo array para almacenar los digimons
            JObject objectJson = JObject.Parse(stringJson);

            if ((int)objectJson["count"] == 0) return null; // Comprobamos si se ha encontrado el personaje

            // Convierte el JSON en un array
            JArray arrayResults = (JArray)objectJson["results"];

            // Convierte el primer elemento del array en un objeto
            JObject character = (JObject)arrayResults[0];

            return character;
        } // SearchByName

        // 2. AGREGAR a la lista de favoritos
        public static List<FavoriteItemList> AddToFavoriteList(string stringJson)
        {
            Console.WriteLine($"Desea agregar el {NameProperty} a la lista de favoritos S/N?");
            string inputAnswer = Console.ReadLine();

            if (inputAnswer != "S" && inputAnswer != "s")
            {
                Console.WriteLine($"{NameProperty} no agregado a la lista de favoritos");
                PrintWaitForPressKey();
                return favoriteList;

            }
            // Convierte el JSON en un array
            var character = JObject.Parse(stringJson); // Error examen

            // *Cambiar atributos de la clase FavoriteItemList*
            FavoriteItemList atributes = new FavoriteItemList()
            {
                Name = (string)character["name"],
                Height = int.TryParse((string)character["height"], out int height) ? height : 0,
                Mass = int.TryParse((string)character["mass"], out int mass) ? mass : 0,
                Gender = (string)character["gender"]

            };

            // Comprobamos si el digimon ya esta en la lista
            if (favoriteList.Any(d => d.Name == atributes.Name))
            {
                Console.WriteLine($"El {NameProperty} {atributes.Name} ya esta en la lista de favoritos");
                PrintWaitForPressKey();
                return favoriteList;
            }
            favoriteList.Add(atributes);
            
            Console.WriteLine($"\n{NameProperty} agregado a la lista de favoritos");
            PrintWaitForPressKey();
            return favoriteList;
        } // AddToFavoriteList

        // 3. MOSTRAR la lista de favoritos
        public static void ShowFavoriteList()
        {
            Console.WriteLine($"\nMostrando lista de favoritos de {NameProperty}");
            Console.WriteLine("===========================================");
            if (favoriteList.Count == 0)
            {
                Console.WriteLine("\nLa lista de favoritos esta vacia");
                PrintWaitForPressKey();
                return;
            }
            int count = 1;

            // *poner atributos de lista de favoritos (FavoriteItemList)*
            foreach (var item in favoriteList)
            {
                Console.WriteLine($"\n{count++}ºFavorite:" +
                    $"\n-------------------------" +
                    $"\nName: {item.Name}" +
                    $"\nHeight: {item.Height} cm" +
                    $"\nMass: {item.Mass} kg"+
                    $"\nGender: {(item.Gender == "" || item.Gender == null ? "Unknown" : item.Gender)}");
            }
            PrintWaitForPressKey();
        } // ShowFavoriteList

        // 4. BORRAR digimon de la lista de favoritos
        public static void RemoveFavoriteList()
        {
            Console.Write("\nIngrese el id de la Lista de favoritos que desea borrar: ");
            int index = ValidateInput(Console.ReadLine()) - 1;

            if (index < 0 || index >= favoriteList.Count)
            { // Comprobamos que el index sea valido
                Console.WriteLine("\nEl id ingresado no se encontro el la lista de favoritos o no es valido");
                PrintWaitForPressKey();
                return;
            }
            Console.Write($"\nDesea borrar el {NameProperty} {favoriteList[index].Name} de la lista de favoritos S/N?");
            string inputResp = Console.ReadLine();
            if (inputResp != "S" && inputResp != "s") return;

            favoriteList.RemoveAt(index);
            Console.WriteLine($"\n{NameProperty} borrado de la lista de favoritos");
            APISaveFavoriteList();
            PrintWaitForPressKey();
        } // RemoveFavoriteList

        // 5. VALIDAR Input
        public static int ValidateInput(string input)
        {
            if (!int.TryParse(input, out int num))
            {
                // Console.WriteLine("Opcion no valida");
                // PrintWaitForPressKey();
                return -1;
            }
            return num;
        }

        // 6. PRINT (esperar tecla)
        public static void PrintWaitForPressKey()
        {
            Console.WriteLine("\nPresiona cualquier tecla para continuar...");
            Console.ReadKey();
        }

        // 7. Manejo de EXCEPCIONES
        public static void HandlerException(Exception ex)
        {
            if (ex is HttpRequestException HttpEx)
            {
                Console.WriteLine($"\nError de Peticion HTTP: {HttpEx.Message}\n Info: {HttpEx.HResult}");
                return;
            }
            if (ex is JsonException JsonEx)
            {
                Console.WriteLine($"\nError de Lectura JSON: {JsonEx.Message}\n Info: {JsonEx.HResult}");
                return;
            }
            if (ex is TaskCanceledException TaskEx)
            {
                Console.WriteLine($"\nError de Tarea Cancelada: {TaskEx.Message}\n Info: {TaskEx.HResult}");
                return;
            }
            if (ex is OperationCanceledException OpEx)
            {
                Console.WriteLine($"\nError de Operacion Cancelada: {OpEx.Message}\n Info: {OpEx.HResult}");
                return;
            }
            if (ex is TimeoutException TimeEx)
            {
                Console.WriteLine($"\nError de Tiempo Excedido: {TimeEx.Message}\n Info: {TimeEx.HResult}");
                return;
            }
            if (ex is JsonReaderException JsonExReader)
            {
                Console.WriteLine($"\nError de Lectura JSON: {JsonExReader.Message}\n Info: {JsonExReader.HResult}");
                return;
            }
            if (ex is JsonWriterException JsonExWriter)
            {
                Console.WriteLine($"\nError de Escritura JSON: {JsonExWriter.Message}\n Info: {JsonExWriter.HResult}");
                return;
            }
            if (ex is ArgumentException ArgEx)
            {
                Console.WriteLine($"\nError de Argumento: {ArgEx.Message}\n Info: {ArgEx.HResult}");
                return;
            }
            if (ex is NullReferenceException NullEx)
            {
                Console.WriteLine($"\nError de Referencia Nula: {NullEx.Message}\n Info: {NullEx.HResult}");
                return;
            }
            Console.WriteLine($"\nError desconocido: {ex.Message}\n Info: {ex.HResult}");
        }
    }
}
