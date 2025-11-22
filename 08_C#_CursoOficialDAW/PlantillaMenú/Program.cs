using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Http;

// Importar static
using static PlantillaMenú.MenuControllers;
using static PlantillaMenú.APIControllers;
using static PlantillaMenú.APIFiltersControllers;

namespace PlantillaMenú
{
    internal class Program
    {        
        static async Task Main(string[] args)
        {

            while (true)
            {
                try
                {
                    ShowMenu();
                    int? opc = ValidateInput(Console.ReadLine());
                    
                    switch (opc)
                        {
                            case 1:
                                Console.WriteLine("Mostramos consulta API");
                                await ExecuteHttpRequest(); // ApiControllers
                                
                                // Metodo
                                WaitForPressKey();
                                break;
                            case 2:
                                Console.WriteLine("Filtramos Id API");
                            // Metodo
                                await GetRequestWhitFilter();
                                WaitForPressKey();
                                break;
                            case 3:
                                Console.WriteLine("Agregamos nombres a la Lista API");
                                // Metodo
                                WaitForPressKey();
                                break;
                            case 4:
                                Console.WriteLine("Eliminamos nombres de la Lista API");
                                // Metodo
                                WaitForPressKey();
                                break;
                            case 0:
                                ExitMenu();
                                return;
                        }                   
                }
                catch (Exception ex)
                {
                    HandlerException(ex);
                }
            }
        }

        
    }
}
