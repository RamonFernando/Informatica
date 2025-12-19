using System.Net.Http;
using System.Text.Json;
HttpClient client = new HttpClient();
string url = "http://localhost:3001/paises";
var response = await client.GetAsync(url);
var content = await response.Content.ReadAsStringAsync();
var json = JsonDocument.Parse(content).RootElement;
foreach (var pais in json.EnumerateArray())
{
Console.WriteLine($"{pais.GetProperty("nombre").GetString()} - {pais.GetProperty("capital").GetString()}");
}

