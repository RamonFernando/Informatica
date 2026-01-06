using static APICountriesIA.Services;

namespace APICountriesIA
{
    public static class Messages
    {
        // Mensajes generales
        public static string resultSearchMsg = "\n=== RESULTADOS DE LA BUSQUEDA ===";
        public static string removeFavoriteMsg = "\n=== ELIMINAR {0} ===";
        
        public static string resultSearchCountMsg = "Resultados encontrados: {0}\n";
        
        public static string pressToContinueMsg = "\nPresione cualquier tecla para continuar...";
        
        public static string exitMessage = "Saliendo del programa...";

        public static string errorOptionMsg =
            "\nOpción no válida. Por favor, ingrese una opción válida.\n";

        public static string cancelOperationMsg = "Operación cancelada.\n";

        
        // Mensajes de confirmación
        public static string confirmationSaveFavoriteMsg = "\n¿Desea guardar el {0} '{1}' en su lista de favoritos? (s/n): ";

        public static string confirmationRemoveFavoriteMsg =
            "\n¿Estas seguro de que quieres eliminar el {0} '{1}' de la lista de favoritos? (s/n): ";
        
        
        // Mensajes de la lista de favoritos
        public static string emptyListMessage = "\nLa lista de {0}es favoritos está vacía.\n";
        public static string saveFavoriteExistsMsg = "\nEl {0} '{1}' ya existe en la lista de favoritos.\n";
        
        public static string favoriteSavedMsg = "\nEl {0} '{1}' ha sido guardado en la lista de favoritos.\n";
        public static string favoriteNotSavedMsg = "\nEl {0} '{1}' no se ha guardado en la lista de favoritos.\n";

        public static string favoriteRemovedMsg = "\nSe ha eliminado el {0} '{1}' de la lista de favoritos.\n";
        public static string saveFirstResultMsg =
            "\nSolo se guardará el primer resultado encontrado en la lista de favoritos.\n";
    
        // Mensaje de entrada
        public static string removeToIndexMsg = "\nEscriba el índice del {0} que desea eliminar: ";
        public static string inputOptionMsg = "\nSeleccione una opción: ";
        public static string inputInvalidMsg = "\nEntrada no válida o fuera de rango.\n";
        public static string inputStringInvalidMsg = "\nEntrada no válida.\n";
        public static string validarInputMsg = "Entrada no válida. Por favor, ingrese un número.\n";
        public static string validarOpcionMsg = "Entrada no válida. Por favor, ingrese un número entre {0} y {1}.\n";
        public static string validarStringMsg = "Entrada no válida. Por favor, ingrese un texto.\n";
        
        // *Controllers (Filters)* (id, Name, Status, Species, Gender, Origin)
        public static string filterMessage = "\n=== BUSCAR {0} POR {1} ===";
        public static string readOnlyMessage = "\nEscribe el {0} del {1} a buscar: ";
        
        // Validadores
        public static string outOfRangeMsg = "El Id '{0}' esta fuera de rango.\n";

        // Busqueda
        public static string notFoundMsg = "\nNo se ha encontrado el {0} con el/la {1}: '{2}'.\n";
        public static string notFoundMsg1 = "\nNo se ha encontrado el {0} con la {1}: '{2}'.\n";
        public static string apiErrorMsg = "\nError de JSON en la respuesta de la API. Por favor, intente nuevamente.\n";
    }
}