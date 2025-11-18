using System;
using System.Net.Http;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class Program
    {
        
        static async Task Main(string[] args)
        {   
            // Ejemplo completo
            // await EjemploCombinado.MetodoCombinado();

            // 1. LLamada a api y obtencion de datos en bruto.
            // await LlamadaApi_Advice.GetRequest();

            // 2. Llamada a api y deserializacion de datos.
            // await LlamadaAPI_Advice1.GetRequestDeserializable();

            // 3. Llamada a api y formateo de datos.
            // await LlamadaApi_advice2FormatearJSON.GetRequestFormatJson();

            // 4. Llamada a api y formateo de datos.
            await LlamadaApi_advice_FormatearJsonNewtonsoft.GetRequestFormatJsonNewtonsoft();
        }
    }
}
