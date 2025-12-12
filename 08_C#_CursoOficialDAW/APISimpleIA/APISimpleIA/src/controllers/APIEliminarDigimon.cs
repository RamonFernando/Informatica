using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.Services;
using static APISimpleIA.APISaveJson;

namespace APISimpleIA
{
    internal class APIEliminarDigimon
    {
        public static void EliminarDigimon()
        {
            Console.WriteLine("\n=== ELIMINAR DIGIMON ===");
            
            Console.Write("Escribe el Index del Digimon a Eliminar: ");
            string? input = Console.ReadLine();
            int index = ValidarInput(input);
            ValidarInputString(input); // -1 = Entrada no valida

            ListaVacia(MisDigimons);
            index = FueraDeRango(MisDigimons, index); // < 1 o > count
            if(index == -1) return;

            int indexList = index -1; // Igualamos el index a la posicion en la lista
            var digimon = MisDigimons[indexList];
            
            Console.Write($"¿Estas seguro de que quieres eliminar el Digimon '{digimon.Name}'? (s/n): ");
            string? confirmation = Console.ReadLine();
            ValidarString(confirmation);
            if (confirmation?.ToLower() != "s")
            {
                Console.WriteLine("Operacion cancelada.\n");
                PrintWaitForPressKey();
                return;
            }
            
            MisDigimons.RemoveAt(indexList);
            Console.WriteLine($"Digimon '{digimon}' eliminado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
        }
    }
}