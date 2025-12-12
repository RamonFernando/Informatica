using static APISimpleIA.Services;
using static APISimpleIA.Helpers;
using static APISimpleIA.APIGetDigimonAsync;
using static APISimpleIA.Views;
using System.Text.Json;

namespace APISimpleIA
{
    internal class APIBuscarDigimonId
    {
        public static async Task BuscarDigimonId()
        {
            Console.Write("Ingrese el Id del Digimon que desea buscar: ");
            string? input = Console.ReadLine();
            int id = ValidarInput(input);
            if(id == -1) return;
            
            var json = await GetDigimonAsync(id.ToString()!); // no null
            
            if (json == null)
            {
                Console.WriteLine($"Digimon con Id '{id}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            JsonElement root;
            // Comprueba si el JSON es un array y si lo es, comprueba si está vacío
            if(json.RootElement.ValueKind == JsonValueKind.Array && json.RootElement.GetArrayLength() == 0)
            {
                Console.WriteLine($"Digimon con Id '{id}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            // Devuelve el primer elemento si es un array o si es un objeto lo devuelvemos
            root = (json.RootElement.ValueKind == JsonValueKind.Array)
                ? json.RootElement[0] : json.RootElement;
            
            int digimonId = root.GetProperty("id").GetInt32();
            string digimonName = root.GetProperty("name").GetString()!;
            string level = root.TryGetProperty("level", out var digimonLevel)
                ? digimonLevel.GetString() ?? "unknown"
                : "unknown";


            Console.WriteLine($"\n=== DIGIMON ENCONTRADO ===");
            Console.WriteLine($"Id: {digimonId}");
            Console.WriteLine($"Nombre: {digimonName}");
            Console.WriteLine($"Nivel: {level}");
            PrintWaitForPressKey();
            return;
        }
    }
}