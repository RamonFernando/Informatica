namespace APICountriesIA
{
    internal static class Const
    {
        // URL base de la API // {BASE_URL}/name/{name}
        public static readonly string BASE_URL = "https://restcountries.com/v3.1";

        // URLs específicas por tipo de recurso
        public static readonly string BASE_URL_CHARACTERS = $"{BASE_URL}character/";
        public static readonly string BASE_URL_EPISODES = $"{BASE_URL}episode/";
        public static readonly string BASE_URL_LOCATIONS = $"{BASE_URL}location/";
        
        // Nombres de los recursos
        public const string FILTER_NAME = "name/"; // Filtro por nombre
        /*public const string FILTER_STATUS = "capital/"; // Filtro por estado
        public const string FILTER_SPECIES = "region/"; // Filtro por especie
        public const string FILTER_TYPE = "language/"; // Filtro por tipo
        public const string FILTER_GENDER = "population/"; // Filtro por género
        */

        
        // Nombres de las propiedades (str globales)
        public const string NAME_PROP_API = "Paises"; // Nombre de la API completa
        public const string NAME_PROP = "Pais"; // Nombre de la API
        

        // Nombres de las propiedades (prop globales) (tantas como propiedades tenga la API)
        // Nombre de la propiedad que maneja la API: NAME_TYPE_PROP (NTP_)
        // public const string NTP_ID = "id"; // Id de la Propiedad
        public const string NTP_NAME = "name"; // Nombre de la Propiedad
        public const string NTP_COMMON = "common";
        public const string NTP_OFFICIAL = "official";
        public const string NTP_CAPITAL = "capital";
        public const string NTP_REGION = "region";
        public const string NTP_LANGUAGE = "languages";
        public const string NTP_POPULATION = "population";
        
        
        // Nombres de las propiedades (español) de la lista
        // Nombre de la propiedad en español para mostrar
        public static readonly string NAME_TYPE_PROP_ID = "Id"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_COMUN = "Comun"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_NOMBRE = "Nombre"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_OFICIAL = "Oficial"; // Mostrar propiedad ESP
        public static readonly string NAME_TYPE_PROP_CAPITAL = "Capital";
        public static readonly string NAME_TYPE_PROP_REGION = "Región";
        public static readonly string NAME_TYPE_PROP_LENGUAJE = "Lenguaje";
        public static readonly string NAME_TYPE_PROP_POBLACION = "Población";

        
    }
}