using static APISimpleIA.Services;
using static APISimpleIA.Helpers;
using static APISimpleIA.APIGetItemAsync;
using static APISimpleIA.Views;
using System.Text.Json;
using static APISimpleIA.App;

namespace APISimpleIA
{
    internal class APIBuscarId
    {
        public static async Task BuscarId()
        {
            Console.Write($"Ingrese el Id del {NAME_PROP} que desea buscar: ");
            string? input = Console.ReadLine();
            int id = ValidarInput(input);
            if(id == -1) return;
            
            var json = await GetItemApiAsync(id.ToString()!); // no null
            
            if (json == null)
            {
                Console.WriteLine($"{NAME_PROP} con Id '{id}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            JsonElement root;
            // Comprueba si el JSON es un array y si lo es, comprueba si está vacío
            if(json.RootElement.ValueKind == JsonValueKind.Array && json.RootElement.GetArrayLength() == 0)
            {
                Console.WriteLine($"{NAME_PROP} con Id '{id}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            // Devuelve el primer elemento si es un array o si es un objeto lo devuelvemos
            root = (json.RootElement.ValueKind == JsonValueKind.Array)
                ? json.RootElement[0] : json.RootElement;
            
            int itemId = root.GetProperty("id").GetInt32();
            string itemName = root.GetProperty("name").GetString()!;
            string prop = root.TryGetProperty($"{NAME_TYPE_PROP}", out var itemProp)
                ? itemProp.GetString() ?? "unknown"
                : "unknown";


            Console.WriteLine($"\n=== {NAME_PROP.ToUpper()} ENCONTRADO ===");
            Console.WriteLine($"Id: {itemId}");
            Console.WriteLine($"Nombre: {itemName}");
            Console.WriteLine($"{NAME_TYPE_PROP_ES}: {prop}");
            PrintWaitForPressKey();
            return;
        }
    }
}