namespace APIStarWarsIA
{
    internal static class Const
    {
        // URL base de la API // {BASE_URL}/name/{name}
        public static readonly string BASE_URL = "https://swapi.info/api/";
                
        // URLs específicas por tipo de recurso
        public static readonly string BASE_URL_FILMS = $"{BASE_URL}films/";
        public static readonly string BASE_URL_PEOPLE = $"{BASE_URL}people/";
        public static readonly string BASE_URL_PLANETS = $"{BASE_URL}planets/";
        public static readonly string BASE_URL_SPECIES = $"{BASE_URL}species/";
        public static readonly string BASE_URL_STARSHIPS = $"{BASE_URL}starships/";
        public static readonly string BASE_URL_VEHICLES = $"{BASE_URL}vehicles/";
        
        // Nombres de los recursos
        public const string FILTER_ID = "id/"; // Filtro por id
        public const string FILTER_NAME = "name/"; // Filtro por nombre
        public const string RESOURCE_PEOPLE = "people/";
        public const string RESOURCE_PLANETS = "planets/";
        public const string RESOURCE_SPECIES = "species/";
        public const string RESOURCE_STARSHIPS = "starships/";
        public const string RESOURCE_VEHICLES = "vehicles/";
        public const string RESOURCE_FILMS = "films/";
        
        
        // Nombres de las propiedades (str globales) que se muestran al usuario ESPAÑOL
        public const string NTP_API = "StarWars"; // Nombre de la API completa
        public const string NTP_ES_CHARACTER = "Personaje"; // Nombre de la API
        public const string NTP_ES_SPECIES = "Especie";
        public const string NTP_ES_PLANET = "Planeta";
        public const string NTP_ES_VEHICLE = "Vehículo";
        public const string NTP_ES_STARSHIP = "Nave Espacial";
        public const string NTP_ES_FILM = "Película";
        

        // Nombres de las propiedades (prop globales) (tantas como propiedades tenga la API)
        // Nombre de la propiedad que maneja la API: NAME_TYPE_PROP (NTP_)
        // public const string NTP_ID = "id"; // Id de la Propiedad
        public const string NTP_PEOPLE = "people"; // Nombre de la Propiedad
        public const string NTP_PLANETS = "planets";
        public const string NTP_SPECIES = "species";
        public const string NTP_VEHICLES = "vehicles";
        public const string NTP_STARSHIPS = "starships";
        public const string NTP_FILMS = "films";
        public const string NTP_HOMEWORLD = "homeworld";
        
        // Propiedades específicas de la API StarWars (Personajes)
        public const string NTP_NAME = "name";
        public const string NTP_HEIGHT = "height";
        public const string NTP_MASS = "mass";
        public const string NTP_GENDER = "gender";

        // Propiedades específicas de la API StarWars (Name Type Prop en Español NTP)
        public static readonly string NTP_ES_NOMBRE = "Nombre";
        public static readonly string NTP_ES_ALTURA = "Altura";
        public static readonly string NTP_ES_MASA = "Masa";
        public static readonly string NTP_ES_GENERO = "Género";

        public static readonly string NTP_ES_ESPECIE = "Especie";
        public static readonly string NTP_ES_VEHICULO = "Vehículo";
        public static readonly string NTP_ES_NAVE_ESPACIAL = "Nave Espacial";
        public static readonly string NTP_ES_PELICULA = "Película";
        public static readonly string NTP_ES_HOGAR = "Hogar";
    }
}