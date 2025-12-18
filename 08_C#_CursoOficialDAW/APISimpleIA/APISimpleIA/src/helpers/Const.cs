namespace APISimpleIA
{
    internal static class Const
    {
        // URL base de la API // {BASE_URL}/name/{name}
        public static readonly string BASE_URL = "https://digimon-api.vercel.app/api/digimon";

        // Nombres de las propiedades (str globales)
        public const string NAME_PROP = "Digimon"; // Nombre de la API

        // Nombres de las propiedades (prop globales) (tantas como propiedades tenga la API)
        // Nombre de la propiedad que maneja la API
        public const string NAME_TYPE_PROP = "level";

        // Nombres de las propiedades (español) de la lista
        // Nombre de la propiedad en español para mostrar
        public static readonly string NAME_TYPE_PROP_ES = "Nivel";
        
    }
}