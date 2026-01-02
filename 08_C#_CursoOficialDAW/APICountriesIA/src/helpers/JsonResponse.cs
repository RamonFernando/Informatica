namespace APICountriesIA
{
    public static class JsonResponse
    {
        // summary>
        /// Extrae la lista de resultados del JsonDocument proporcionado.
        /// Maneja diferentes estructuras JSON:
        /// 1. Array en la raíz.
        /// 2. Objeto con propiedad "results" que es un array.
        /// 3. Objeto único.
        /// <param name="json">El JsonDocument a procesar.</param>
        /// <returns>Lista de JsonElement extraídos.</returns>
        /// </summary>
        public static List<JsonElement> ExtractResults(JsonDocument json)
        {
            List<JsonElement> results = new List<JsonElement>();

            if (json == null) return results;

            var root = json.RootElement; // abre el documento JSON

            // CASO 1: array en la raíz
            if (root.ValueKind == JsonValueKind.Array)
            {
                foreach (var item in root.EnumerateArray())
                    results.Add(item);

                return results;
            }

            // CASO 2: objeto con "results" o cualquier otra propiedad que sea array
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