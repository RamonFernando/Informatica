using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Text.Json;
using Microsoft.SqlServer.Server;

namespace CursoIA_APIS
{
    internal class LLamadaApiCats2
    {
        public static void GetCats()
        {
            // Hacer una peticion GET a una API (catfacts)
            // https://catfact.ninja/fact

            Console.WriteLine("Peticion a API Cats Facts");

            // 1. Creamos el cliente
            HttpClient client = new HttpClient();

            // 2. Creamos la variable que almacena la url
            var url = "https://catfact.ninja/fact";

            // 3. Creamos la peticion HttpResponseMessage (var)
            var respuesta = client.GetAsync(url).Result;

            try
            {
                // 4. Validamos la respuesta
                if (respuesta == null) { Console.WriteLine("Error en la peticion"); return; }
                respuesta.EnsureSuccessStatusCode();
                
                // 5. Leemos la respuesta
                var objetoJson = respuesta.Content.ReadAsStringAsync().Result;

                // 6. Deserializamos el objeto para hacerlo leible
                Cat cat = JsonSerializer.Deserialize<Cat>(objetoJson);

                // 7. Imprimimos la respuesta
                Console.WriteLine($"Fact: {cat.fact}");
                Console.WriteLine($"Longitud: {cat.length}");
            
            } catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
    public class Cat
    {
        public string fact { get; set; }
        public int length { get; set; }
    }
}
