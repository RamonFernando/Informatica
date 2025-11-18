using System;
using System.Net.Http;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class LlamadaApi_Advice
    {
        static readonly HttpClient client = new HttpClient();
        public static async Task GetRequest()
        {
            // Hacer una peticion GET a url: https://api.adviceslip.com/advice
            var url = "https://api.adviceslip.com/advice";
            try
            {
                HttpResponseMessage response = await client.GetAsync(url);
                string respuestaJson = await response.Content.ReadAsStringAsync();
                if (response.IsSuccessStatusCode)
                    Console.WriteLine(respuestaJson);
                else
                    Console.WriteLine($"Error: {response.StatusCode}");
                    return;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }
}
