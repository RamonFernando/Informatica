

namespace APICountriesIA
{
    public class ApiItem
    {
        [JsonPropertyName("id")]
        public int Id { get; set; }

        [JsonPropertyName("name")]
        public CountryName? Name { get; set; }

        [JsonPropertyName("capital")]
        public List <string>? Capital { get; set; } = new List<string>();

        [JsonPropertyName("region")]
        public string? Region { get; set; }

        [JsonPropertyName("languages")]
        public Dictionary<string, string>? Languages { get; set; } = new ();

        [JsonPropertyName("population")]
        public int? Population { get; set; }
    }

    public class CountryName
    {
        [JsonPropertyName("common")]
        public string? Common { get; set; }

        [JsonPropertyName("official")]
        public string? Official { get; set; }
    }

}
