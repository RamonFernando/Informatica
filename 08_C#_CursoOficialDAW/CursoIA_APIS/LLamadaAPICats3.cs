using System;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;

namespace CursoIA_APIS
{

    internal class LLamadaAPICats3
    {
        // 1. Creamos el cliente (creamos un unico objeto de la clase HttpClient)
        private static readonly HttpClient client = new HttpClient();
        public class Cat
        {
            public string fact { get; set; }
            public int length { get; set; }
        }
        public static async Task GetCats()
        {
            // 2. Hacer una peticion GET a una API (catfacts)
            string url = "https://catfact.ninja/fact";

            // 3. Hacemos la peticion
            HttpResponseMessage respuesta = await client.GetAsync(url);
            
            try
            {
                // 4. Validamos la respuesta
                // devuelve true si la peticion es correcta o false si es un error (200-299)
                if (!respuesta.IsSuccessStatusCode) 
                { Console.WriteLine($"Error en la peticion {respuesta.StatusCode}"); return; }
                
                // 5. Leemos la respuesta y la almacenamos en el objeto json
                string json = await respuesta.Content.ReadAsStringAsync();

                // 6. Deserialzamos el objeto para hacerlo leible
                Cat cat = JsonSerializer.Deserialize<Cat>(json);

                // 7. Imprimimos la respuesta 
                Console.WriteLine($"Fact: {cat.fact}");
                Console.WriteLine($"Longitud: {cat.length}");

            }
            catch (Exception ex) { Console.WriteLine($"Error: {ex.Message}"); }
        }
    }
}
