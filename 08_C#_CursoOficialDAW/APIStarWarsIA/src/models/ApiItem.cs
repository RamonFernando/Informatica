

namespace APIStarWarsIA
{
    public class ApiItem
    {
        [JsonPropertyName("id")]
        public int Id { get; set; }

        [JsonPropertyName("people")]
        public string? People { get; set; }

        [JsonPropertyName("region")]
        public string? Region { get; set; }

        [JsonPropertyName("planets")]
        public string? Planets { get; set; }

        [JsonPropertyName("vehicles")]
        public List<string>? Vehicles = new List<string>();
        
        [JsonPropertyName("starships")]
        public List<string>? Starships = new List<string>();
        
        // Propiedades adicionales
        [JsonPropertyName("name")]
        public string? Name { get; set; }

        [JsonPropertyName("height")]
        public int? Height { get; set; }
        
        [JsonPropertyName("mass")]
        public int? Mass { get; set; }
        
        [JsonPropertyName("gender")]
        public string? Gender { get; set; }
        
        [JsonPropertyName("species")]
        public string? Species { get; set; }

        [JsonPropertyName("homeworld")]
        public string? Homeworld { get; set; }
    }
}
