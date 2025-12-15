
using static APISimpleIA.Services;
using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.App;

namespace APISimpleIA
{
    public static class APIListarGuardados
    {
        public static void ListarGuardados()
        {
            ListaVacia(MisFavorites);
            if (MisFavorites.Count == 0) return;

            Console.WriteLine($"\n=== MIS {NAME_PROP.ToUpper()} ===");
            for (int i= 0; i < MisFavorites.Count; i++)
            {
                Console.WriteLine($"Index: {i+1}");
                Console.WriteLine("------------------------");
                Console.WriteLine($"Nombre: {MisFavorites[i].Name}\n{NAME_TYPE_PROP_ES}: {MisFavorites[i].Prop}.\n");
            }
            PrintWaitForPressKey();
            return;
        }
    }
}
