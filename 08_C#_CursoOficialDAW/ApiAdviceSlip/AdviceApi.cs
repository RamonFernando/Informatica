using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Net.Http;
using System.Threading.Tasks;
namespace ApiAdviceSlip
{
    internal class AdviceApi
    {   
        // 1. Creamos el HttpClient
        static readonly HttpClient client = new HttpClient();

        public static async Task GetRequestAsync() {
                
            try {
                // 2. Obtenemos el JSON
                string stringJson = await GetApiJson(GetUrl());
                ValidationJsonString(stringJson);

                // 3. Formateamos el JSON
                FormattedJson(stringJson);
                 
                // 4. Creamos y validamos el objeto JSON de la clase AdviceContent para acceder a los valores
                AdviceContent objectJsonAdvice = ValidationObjectSlip(stringJson);

                // 5. Imprimimos los valores del JSON
                Print(objectJsonAdvice);
            }
            catch (Exception ex) {
                HandleException(ex);
            }
        }
        // CLASES
        public class AdviceContent {
            [JsonProperty("slip")]
            public AdviceObject Slip { get; set; }
        }
        public class AdviceObject {
            [JsonProperty("id")]
            public int Id { get; set; }
            [JsonProperty("advice")]
            public string Advice { get; set; }
        }
        
        // METODOS

        // Obtenemos la url
        public static string GetUrl() => "https://api.adviceslip.com/advice";
        
        // 2. Obtenemos el JSON
        public static async Task<string> GetApiJson(string url) {
            HttpResponseMessage response = await client.GetAsync(url);
            ValidationResponse(response);
            return await response.Content.ReadAsStringAsync();
        }
        // 2.1 Comprobamos la respuesta del servidor (!OK)
        public static void ValidationResponse(HttpResponseMessage response) {
            if (!response.IsSuccessStatusCode)
                throw new HttpRequestException($"Error: {response.StatusCode} {response.ReasonPhrase}");
        }
        // 2.2 Validamos el JSON (para formato)
        public static void ValidationJsonString(string stringJson) {
            if (string.IsNullOrWhiteSpace(stringJson) || !stringJson.Trim().StartsWith("{"))
                throw new JsonException($"JSON invalido o vacio. Detalles: {stringJson}");
        }
        // 3. Formateamos el JSON
        public static void FormattedJson(string stringJson) =>
            Console.WriteLine(JsonConvert.SerializeObject(JObject.Parse(stringJson), Formatting.Indented));

        // 4. Validamos el JSON (para acceder a los valores)
        public static AdviceContent ValidationObjectSlip(string stringJson) {
            AdviceContent result = JsonConvert.DeserializeObject<AdviceContent>(stringJson);
            if(result?.Slip == null)
                throw new JsonException($"Error al parsear el JSON. Detalles: {stringJson}");
            return result;
        }
        // 5. Imprimimos los valores del JSON (API) obteniendo los valores de la clase AdviceContent
        public static void Print(AdviceContent advice) {
            Console.WriteLine($"\nId: {advice.Slip.Id} \nAdvice: {advice.Slip.Advice}");
        }

        // Manejo de Excepciones
        public static void HandleException(Exception ex) {
            if (ex is HttpRequestException httpEx) {
                Console.WriteLine($"HTTP Error en la petición. Mensaje: {httpEx.Message}. Código interno: {httpEx.HResult}");
                return;
            }
            if (ex is JsonException jsonEx) {
                Console.WriteLine($"JSON Error al procesar la petición. Mensaje: {jsonEx.Message}. Código interno: {jsonEx.HResult}");
                return;
            }
            if (ex is TaskCanceledException timeoutEx) {
                Console.WriteLine($"Timeout la petición tardó demasiado. Detalles: {timeoutEx.Message}. Código interno: {timeoutEx.HResult}");
                return;
            }
            Console.WriteLine($"Error inesperado: {ex.Message}. Código interno: {ex.HResult}");
        }
    }
}
