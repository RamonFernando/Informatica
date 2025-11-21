using Newtonsoft.Json;

namespace AdvideAPI_Simple
{
    public class AdviceObject
    {
        [JsonProperty("id")]
        public int Id { get; set; }
        [JsonProperty("advice")]
        public string Advice { get; set; }
    }
    public class AdviceContent
    {
        [JsonProperty("slip")]
        public AdviceObject Slip { get; set; }
    }
}
