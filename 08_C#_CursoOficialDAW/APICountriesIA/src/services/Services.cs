

namespace APICountriesIA
{
    public static class Services
    {
        public static readonly HttpClient Client = new HttpClient();
        static Services() {
            Client.Timeout = TimeSpan.FromSeconds(10);
            // Client.BaseAddress = new Uri("http://localhost:4000/");
        }
        public static readonly List<ApiItem> MisFavorites = new List<ApiItem>();
    }
}
