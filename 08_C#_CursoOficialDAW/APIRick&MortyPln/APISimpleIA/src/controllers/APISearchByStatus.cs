using System.Net.Mail;

namespace APISimpleIA
{
    public class APISearchByStatus
    {
        public static async Task SearchByStatus()
        {
            Console.WriteLine($"\n=== BUSQUEDA DE {NAME_PROP.ToUpper()} POR ID ===");
            Console.Write($"Ingrese el estado del {NAME_PROP} que desea buscar (Alive, Dead, unknown): ");
            string? inputStatus = Console.ReadLine();
            ValidarInputString(inputStatus); // (null o "") IsNullOrWhiteSpace = Entrada no valida

            var json = await GetItemApiAsync($"{BASE_URL_CHARACTERS}/?status={inputStatus}");

            if(!ValidatorJsonNotNull(json, "Status", inputStatus)) return;
            JsonDocument jsonNotNull = json!; // ya validado no null

            // List<JsonElement> results = new();
            var results = ExtractResults(jsonNotNull);

            if(results.Count == 0)
            {
                Console.WriteLine($"{NAME_PROP} con Status '{inputStatus}' no encontrado.\n");
                PrintWaitForPressKey();
                return;
            }
            
            Console.WriteLine(resultSearch);
            for (int i = 0; i < results.Count; i++)
            {
                int currentId = results[i].TryGetProperty("id", out var IdProp)
                    ? IdProp.GetInt32()
                    : -1;

                string currentName = results[i].TryGetProperty("name", out var NameProp)
                    ? NameProp.GetString() ?? "unknown"
                    : "unknown";

                string currentStatus = results[i].TryGetProperty(NTP_STATUS, out var statusProp)
                    ? statusProp.GetString() ?? "unknown"
                    : "unknown";

                string currentSpecies = results[i].TryGetProperty(NTP_SPECIES, out var speciesProp)
                    ? speciesProp.GetString() ?? "unknown"
                    : "unknown";
                
                string currentGender = results[i].TryGetProperty(NTP_GENDER, out var genderProp)
                    ? genderProp.GetString() ?? "unknown"
                    : "unknown";

                PrintCharacter(
                    $"Resultado {i + 1}",
                    currentId,
                    currentName,
                    currentStatus,
                    currentSpecies,
                    currentGender
                );
            }
            Console.WriteLine($"Resultados encontrados: {results.Count}\n");
            PrintWaitForPressKey();
        }
    }
}