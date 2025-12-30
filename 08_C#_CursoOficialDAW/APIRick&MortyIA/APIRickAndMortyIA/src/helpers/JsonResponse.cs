namespace APIRickAndMortyIA
{
    public static class JsonResponse
    {
        public static List<JsonElement> ExtractResults(JsonDocument json)
        {
            List<JsonElement> results = new List<JsonElement>();

            if (json == null)
                return results;

            var root = json.RootElement; // abre el documento JSON

            // CASO 1: array en la raíz
            if (root.ValueKind == JsonValueKind.Array)
            {
                foreach (var item in root.EnumerateArray())
                    results.Add(item);

                return results;
            }

            // CASO 2: objeto con "results"
            if (root.ValueKind == JsonValueKind.Object &&
                root.TryGetProperty("results", out var resultsArray) &&
                resultsArray.ValueKind == JsonValueKind.Array)
            {
                foreach (var item in resultsArray.EnumerateArray())
                    results.Add(item);

                return results;
            }

            // CASO 3: objeto único
            if (root.ValueKind == JsonValueKind.Object)
            {
                results.Add(root);
            }

            return results;
        }
    }
}