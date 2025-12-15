using static APISimpleIA.Views;
using static APISimpleIA.Helpers;
using static APISimpleIA.Services;
using static APISimpleIA.APISaveJson;
using static APISimpleIA.App;

namespace APISimpleIA
{
    internal class APIEliminar
    {
        public static void Eliminar()
        {
            Console.WriteLine($"\n=== ELIMINAR {NAME_PROP.ToUpper()} ===");
            
            Console.Write($"Escribe el Index del {NAME_PROP} a Eliminar: ");
            string? input = Console.ReadLine();
            int index = ValidarInput(input);
            ValidarInputString(input); // -1 = Entrada no valida

            ListaVacia(MisFavorites); // Lista vacia
            index = FueraDeRango(MisFavorites, index); // < 1 o > count
            if(index == -1) return;

            int indexList = index -1; // Igualamos el index a la posicion en la lista
            var itemFavorite = MisFavorites[indexList];
            
            Console.Write($"¿Estas seguro de que quieres eliminar el {NAME_PROP} '{itemFavorite.Name}'? (s/n): ");
            string? confirmation = Console.ReadLine();
            ValidarString(confirmation);
            if (confirmation?.ToLower() != "s")
            {
                Console.WriteLine("Operacion cancelada.\n");
                PrintWaitForPressKey();
                return;
            }
            
            MisFavorites.RemoveAt(indexList);
            Console.WriteLine($"{NAME_PROP} '{itemFavorite.Name}' eliminado.\n");
            APISaveFavoriteList();
            PrintWaitForPressKey();
        }
    }
}