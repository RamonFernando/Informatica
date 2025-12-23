
namespace APISimpleIA
{
    internal class APISaveJson
    {
        public static void APISaveFavoriteList()
        {
            try
            {
                string filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "favoriteItems.json");

                var json = JsonSerializer.Serialize(MisFavorites, new JsonSerializerOptions { WriteIndented = true });

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