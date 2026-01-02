
namespace APICountriesIA
{
    public class APIGetItemAsync
    {
        /*
        Get:
        HttpResponseMessage response = await Client.GetAsync(url);
        var content = await response.Content.ReadAsStringAsync();
        return JsonDocument.Parse(content);
        */
        // <summary>
        /// Realiza una petición GET a la API y devuelve el JsonDocument resultante.
        /// Maneja errores de red y respuestas no exitosas.
        /// <param name="url">La URL de la API a la que se realiza la petición.</param>
        /// <returns>El JsonDocument resultante o null en caso de error.</returns>
        /// </summary>
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
