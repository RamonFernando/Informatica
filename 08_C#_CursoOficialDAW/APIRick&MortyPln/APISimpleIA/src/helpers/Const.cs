namespace APISimpleIA
{
    internal static class Const
    {
        // URL base de la API // {BASE_URL}/name/{name}
        public static readonly string BASE_URL = "https://rickandmortyapi.com/api/";

        // URLs específicas por tipo de recurso
        public static readonly string BASE_URL_CHARACTERS = $"{BASE_URL}character/";
        public static readonly string BASE_URL_EPISODES = $"{BASE_URL}episode/";
        public static readonly string BASE_URL_LOCATIONS = $"{BASE_URL}location/";
        
        // Nombres de los recursos
        public const string FILTER_NAME = "?name="; // Filtro por nombre
        public const string FILTER_STATUS = "?status="; // Filtro por estado
        public const string FILTER_SPECIES = "?species="; // Filtro por especie
        public const string FILTER_TYPE = "?type="; // Filtro por tipo
        public const string FILTER_GENDER = "?gender="; // Filtro por género
        public const string FILTER_ORIGIN = "?origin="; // Filtro por origen

        
        // Nombres de las propiedades (str globales)
        public const string NAME_PROP_API = "Rick & Morty"; // Nombre de la API completa
        public const string NAME_PROP = "Personaje"; // Nombre de la API
        

        // Nombres de las propiedades (prop globales) (tantas como propiedades tenga la API)
        // Nombre de la propiedad que maneja la API: NAME_TYPE_PROP (NTP_)
        public const string NTP_ID = "id"; // Id de la Propiedad
        public const string NTP_NAME = "name"; // Nombre de la Propiedad
        public const string NTP_STATUS = "status";
        public const string NTP_SPECIES = "species";
        public const string NTP_GENDER = "gender";
        public const string NTP_ORIGIN = "origin";
        
        
        // Nombres de las propiedades (español) de la lista
        // Nombre de la propiedad en español para mostrar
        public static readonly string NAME_TYPE_PROP_ID = "Id"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_NOMBRE = "Nombre"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_ESTADO = "Estado";
        public static readonly string NAME_TYPE_PROP_ESPECIE = "Especie";
        public static readonly string NAME_TYPE_PROP_GENERO = "Género";
        public static readonly string NAME_TYPE_PROP_ORIGEN = "Origen";

        
    }
}