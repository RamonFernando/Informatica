
namespace APISimpleIA
{
    public class APIGetItemAsync
    {
        /*
        Get:
        HttpResponseMessage response = await Client.GetAsync(url);
        var content = await response.Content.ReadAsStringAsync();
        return JsonDocument.Parse(content);
         */
        public static async Task<JsonDocument?> GetItemApiAsync(string url)
        {
            try
            {
                // var url = $"{BASE_URL_CHARACTERS}";
                HttpResponseMessage response = await Client.GetAsync(url);

                if (!response.IsSuccessStatusCode)
                {
                    if(response.StatusCode == HttpStatusCode.NotFound) return null;
                    if(response.StatusCode == HttpStatusCode.BadRequest)
                    {
                        Console.WriteLine(
                            $"Error (Solicitud incorrecta): " +
                            $"{response.StatusCode}");
                        PrintWaitForPressKey();
                        return null;
                    }
                    return null;
                }

                var content = await response.Content.ReadAsStringAsync();
                return JsonDocument.Parse(content);
            }
            catch (Exception ex)
            {
                Console.WriteLine("La API devolvió datos inválidos o no es JSON.\n");
                HandlerException(ex);
                return null;
            }
        }
    }
}
