using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class EjemploCombinado
    {
        static readonly HttpClient client = new HttpClient();

        // Clases para trabajar con los datos
        public class Advice
        {
            public int id { get; set; }
            public string advice { get; set; }
        }

        public class AdviceContent
        {
            public Advice slip { get; set; }
        }

        public static async Task MetodoCombinado()
        {
            string url = "https://api.adviceslip.com/advice";

            try
            {
                HttpResponseMessage response = await client.GetAsync(url);
                if (!response.IsSuccessStatusCode)
                {
                    Console.WriteLine($"Error: {response.StatusCode}");
                    return;
                }

                // JSON en bruto (string)
                string responseJson = await response.Content.ReadAsStringAsync();


                /* ============================
                    1) JSON BONITO (JsonElement)
                   ============================ */

                JsonElement jsonElement = JsonSerializer.Deserialize<JsonElement>(responseJson);
                var options = new JsonSerializerOptions { WriteIndented = true };
                string prettyJson = JsonSerializer.Serialize(jsonElement, options);

                Console.WriteLine("=== JSON BONITO ===");
                Console.WriteLine(prettyJson);


                /* ============================
                    2) DATOS ÚTILES (POCO clases)
                   ============================ */

                AdviceContent data = JsonSerializer.Deserialize<AdviceContent>(responseJson);

                Console.WriteLine("\n=== DATOS DESERIALIZADOS ===");
                Console.WriteLine($"Id: {data.slip.id}");
                Console.WriteLine($"Advice: {data.slip.advice}");

            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }
}

