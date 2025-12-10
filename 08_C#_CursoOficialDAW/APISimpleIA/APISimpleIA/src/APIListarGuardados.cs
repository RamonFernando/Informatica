
using static APISimpleIA.Services;
using static APISimpleIA.Views;

namespace APISimpleIA
{
    public static class APIListarGuardados
    {
        public static void ListarGuardados()
        {
            if (MisDigimons.Count == 0)
            {
                Console.WriteLine("\nNo tienes Digimon guardados.\n");
                return;
            }

            Console.WriteLine("\n=== MIS DIGIMON ===");
            foreach (var d in MisDigimons)
            {
                Console.WriteLine($"Nombre: {d.Name}, Nivel: {d.Level}.");
            }
            PrintWaitForPressKey();
            return;
        }
    }
}
