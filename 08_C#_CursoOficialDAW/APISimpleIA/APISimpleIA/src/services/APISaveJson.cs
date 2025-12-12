
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.ManejoExcepciones;
using static APISimpleIA.Services;
using System.Text.Json;
namespace APISimpleIA
{
    internal class APISaveJson
    {
        public static void APISaveFavoriteList()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteDigimons.json");

                var json = JsonSerializer.Serialize(MisDigimons, new JsonSerializerOptions { WriteIndented = true });

                File.WriteAllText(filePath, json);
                // Console.WriteLine("Operacion realizada con exito");
                // Console.WriteLine(json);

            }
            catch (Exception ex)
            {
                HandlerException(ex);
                PrintWaitForPressKey();
            }
        } // APISaveFavoriteList
    }
}