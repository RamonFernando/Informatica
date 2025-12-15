using static APISimpleIA.Views;
using static APISimpleIA.ManejoExcepciones;
using static APISimpleIA.Services;

using System.Text.Json;

namespace APISimpleIA
{
    internal class APILoadJson
    {
        public static void APILoadFavoriteList()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteItems.json");

                if (!File.Exists(filePath))
                {
                    Console.WriteLine("El archivo no existe. Se creara uno nuevo.");
                    File.WriteAllText(filePath, JsonSerializer.Serialize(new List<ApiItem>()));
                    PrintWaitForPressKey();
                    return;
                }

                var json = File.ReadAllText(filePath);
                var ls_MisItemsLoaded = JsonSerializer.Deserialize<List<ApiItem>>(json) ?? new List<ApiItem>();

                MisFavorites.Clear();
                MisFavorites.AddRange(ls_MisItemsLoaded);

            }
            catch (Exception ex)
            {
                HandlerException(ex);
                PrintWaitForPressKey();
            }
        }
    }
}