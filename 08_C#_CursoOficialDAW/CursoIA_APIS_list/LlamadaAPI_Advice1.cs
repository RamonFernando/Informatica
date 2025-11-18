using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;


namespace CursoIA_APIS_list
{
    internal class LlamadaAPI_Advice1
    {
        // 1. Creamos un objeto HttpClient
        static readonly HttpClient client = new HttpClient();

        public class Advice
        {
            public int id { get; set; }
            public string advice { get; set; }

            public override string ToString()
            {
                return "\nId: " + id + "\nAdvice: " + advice;
            }
        }
        public class AdviceContent
        {
            public Advice slip { get; set; }
        }
        public static async Task GetRequestDeserializable()
        {
            string url = "https://api.adviceslip.com/advice";
            
            try
            {   // 2. Hacer una peticion GET a url
                HttpResponseMessage response = await client.GetAsync(url);
                
                // 3. Validamos la peticion
                if (response.IsSuccessStatusCode)
                {
                    // 4. Obtenemos el contenido de la peticion
                    string responseJson = await response.Content.ReadAsStringAsync();
                    Console.WriteLine(responseJson); // Imprimimos el contenido

                    // 5. Deserializamos el contenido en un objeto AdviceContent (JSON)
                    AdviceContent advices = JsonSerializer.Deserialize<AdviceContent>(responseJson);

                    // 6. Imprimimos el contenido con metodo ToString()
                    Console.WriteLine(advices.slip.ToString());

                }
                else
                {
                    Console.WriteLine($"Error: {response.StatusCode}");
                    return;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

    }
}
