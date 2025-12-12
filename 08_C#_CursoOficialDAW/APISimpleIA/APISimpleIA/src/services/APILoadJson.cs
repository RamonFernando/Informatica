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
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteDigimons.json");

                if (!File.Exists(filePath))
                {
                    Console.WriteLine("El archivo no existe. Se creara uno nuevo.");
                    File.WriteAllText(filePath, JsonSerializer.Serialize(new List<Digimon>()));
                    PrintWaitForPressKey();
                    return;
                }

                var json = File.ReadAllText(filePath);
                var MisDigimonLoaded = JsonSerializer.Deserialize<List<Digimon>>(json) ?? new List<Digimon>();

                MisDigimons.Clear();
                MisDigimons.AddRange(MisDigimonLoaded);

            }
            catch (Exception ex)
            {
                HandlerException(ex);
                PrintWaitForPressKey();
            }
        }
    }
}