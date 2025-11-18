using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class LlamadaApi_advice2FormatearJSON
    {
        static readonly HttpClient client = new HttpClient();

        // Peticion Get y formateo con System.Text.Json
        public static async Task GetRequestFormatJson()
        {
            Console.WriteLine("=== Peticion Get y formateo con System.Text.Json ===");
            string url = "https://api.adviceslip.com/advice";
            try
            {   // 1. Hacer peticion GET a url y validamos
                HttpResponseMessage response = await client.GetAsync(url);
                if (!response.IsSuccessStatusCode)
                {
                    Console.WriteLine($"Error: {response.StatusCode}");
                    return;
                }

                // 2. Obtenemos el contenido de la peticion como string
                string responseJson = await response.Content.ReadAsStringAsync();

                // 3. Deserializamos (para obtener un objeto JsonElement)
                JsonElement deserializedJson = JsonSerializer.Deserialize<JsonElement>(responseJson);

                // 4. Formateamos (System.Text.Json)
                var formatJson = new JsonSerializerOptions { WriteIndented = true };
                
                // 5. Serializamos (para imprimir)
                string printJson = JsonSerializer.Serialize(deserializedJson, formatJson);

                // 6. Imprimimos
                Console.WriteLine(printJson);

            }catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }
}
