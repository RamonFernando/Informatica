
using static APISimpleIA.Services;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;

namespace APISimpleIA
{
    public static class APIListarGuardados
    {
        public static void ListarGuardados()
        {
            ListaVacia(MisDigimons);
            if (MisDigimons.Count == 0) return;

            Console.WriteLine("\n=== MIS DIGIMON ===");
            for (int i= 0; i < MisDigimons.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("------------------------");
                Console.WriteLine($"Nombre: {MisDigimons[i].Name}\nNivel: {MisDigimons[i].Level}.\n");
            }
            PrintWaitForPressKey();
            return;
        }
    }
}
