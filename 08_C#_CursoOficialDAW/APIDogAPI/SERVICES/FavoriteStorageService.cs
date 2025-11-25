using System;
using System.Collections.Generic;
using System.IO;
using Newtonsoft.Json;
using APIDogAPI.MODELS;

namespace APIDogAPI.SERVICES
{
    internal static class FavoriteStorageService
    {
        // Obtiene la ruta completa del archivo JSON donde se guardan los favoritos
        private static string GetFilePath()
        {
            string baseDir = AppDomain.CurrentDomain.BaseDirectory;
            return Path.Combine(baseDir, "dog_favorites.json");
        }

        // Guarda la lista de favoritos en un archivo JSON con formato indentado
        public static void SaveFavorites(List<FavoriteDog> favorites)
        {
            try
            {
                string filePath = GetFilePath();
                string json = JsonConvert.SerializeObject(favorites ?? new List<FavoriteDog>(), Formatting.Indented);
                File.WriteAllText(filePath, json);
            }
            catch
            {
                // Aquí podríamos loguear el error si fuera necesario
            }
        }

        // Carga la lista de favoritos desde el archivo JSON; si no existe, devuelve lista vacía
        public static List<FavoriteDog> LoadFavorites()
        {
            try
            {
                string filePath = GetFilePath();
                if (!File.Exists(filePath))
                    return new List<FavoriteDog>();

                string json = File.ReadAllText(filePath);
                var list = JsonConvert.DeserializeObject<List<FavoriteDog>>(json) ?? new List<FavoriteDog>();
                return list;
            }
            catch
            {
                // Si hay error al leer o deserializar, devolvemos lista vacía
                return new List<FavoriteDog>();
            }
        }
    }
}
