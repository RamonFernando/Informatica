using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class LlamadaAPI_Advice1
    {
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
        public static async Task GetRequestDeserializable()
        {
            string url = "https://api.adviceslip.com/advice";
            Console.WriteLine("Llamada a api y deserializacion de datos.");
            try
            {
                HttpResponseMessage response = await client.GetAsync(url);
                if (response.IsSuccessStatusCode)
                {
                    string responseJson = await response.Content.ReadAsStringAsync();
                    Console.WriteLine(responseJson);

                    List<Advice> advices = JsonSerializer.Deserialize<List<Advice>>(responseJson);

                    foreach (var advice in advices)
                    {
                        Console.WriteLine(advice.ToString());
                    }

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
