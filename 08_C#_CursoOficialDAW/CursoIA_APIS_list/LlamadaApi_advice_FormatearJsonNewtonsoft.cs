using System;
using System.Net.Http;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace CursoIA_APIS_list
{
    // Peticion Get y formateo con Newtonsoft
    internal class LlamadaApi_advice_FormatearJsonNewtonsoft
    {   
        // 1. Peticion Get
        static readonly HttpClient client = new HttpClient();
        public static async Task GetRequestFormatJsonNewtonsoft()
        {   
            Console.WriteLine("=== Peticion Get y formateo con Newtonsoft ===");
            string url = "https://api.adviceslip.com/advice";
            try
            {   // 2. Hacer peticion GET a url y validamos
                HttpResponseMessage response = await client.GetAsync(url);
                if (!response.IsSuccessStatusCode)
                {
                    Console.WriteLine($"Error: {response.StatusCode}");
                    return;
                }
                // 3. Obtenemos el json como un string
                string responseJson = await response.Content.ReadAsStringAsync();

                // 4. Parseamos (para poder acceder a sus propiedades, recorrerlo o formarlo)
                JObject jsonObject = JObject.Parse(responseJson);

                // 5. Formateamos
                string formattedJson = jsonObject.ToString(Formatting.Indented);

                // 5. Imprimimos
                Console.WriteLine(formattedJson);
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }
}
