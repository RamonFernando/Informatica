using System.Text.Json;

using static APISimpleIA.Services;
using static APISimpleIA.App;
using System.Net;


namespace APISimpleIA
{
    public static class APIGetDigimonAsync
    {
        
        public static async Task<JsonDocument?> GetDigimonAsync(string name)
        {
            try
            {
                var url = $"{BASE_URL}/name/{name}";
                HttpResponseMessage response = await Client.GetAsync(url);

                if (!response.IsSuccessStatusCode)
                {
                    if(response.StatusCode == HttpStatusCode.NotFound) return null;
                    if(response.StatusCode == HttpStatusCode.BadRequest) return null;
                    return null;
                }

                var content = await response.Content.ReadAsStringAsync();
                return JsonDocument.Parse(content);
            }
            catch
            {
                Console.WriteLine("La API devolvió datos inválidos o no es JSON.\n");
                return null;
            }
        }
    }
}
