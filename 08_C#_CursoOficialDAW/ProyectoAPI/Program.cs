using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Http;
// using System.Text.Json;
// using Newtonsoft.Json.Linq;

namespace ProyectoAPI
{
    class Program
    {
        static async Task Main(string[] args)
        {
            // 1. Instanciar las librerias necesarias
            // 2. Crear la instancia del cliente HTTP
            // 3. Crear la URL del servidor al que se va a conectar
            // (Opcional) Limpiar el header (encabezado)
            // (Opcional) Agregar el encabezado de autorizacion
            // 4. Enviar la peticion al servidor
            // 5. Validar la respuesta del servidor (200)
            // 6. Obtenemos el contenido de la respuesta
            // 7. Leer el contenido de la respuesta
            // 8. Colocar un try catch para manejo de errores

            // 2. Creamos el cliente HTTP
            HttpClient client = new HttpClient();

            // 3 Creamos la URL
            string url = "https://restcountries.com\r\n";

            try
            {   // 4. Enviamos la peticion (GET)
                HttpResponseMessage response = await client.GetAsync(url);

                // 5. Validamos la respuesta
                response.EnsureSuccessStatusCode();
                Console.WriteLine((response.StatusCode == System.Net.HttpStatusCode.OK)
                    ? "Respuesta correcta" : $"Respuesta incorrecta {response.StatusCode}");

                // 6. Obtenemos el contenido de la respuesta
                string content = await response.Content.ReadAsStringAsync();

                // 6. Leemos el contenido de la respuesta
                Console.WriteLine(content);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
