using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;


namespace APIDogAPI.SERVICES
{
    internal static class HttpClientService
    {
        // HttpClient compartido por toda la aplicación para reutilizar conexiones
        private static readonly HttpClient _client = new HttpClient();

        // Devuelve la instancia única de HttpClient configurada
        public static HttpClient GetHttpClient() => _client;
    }
}
