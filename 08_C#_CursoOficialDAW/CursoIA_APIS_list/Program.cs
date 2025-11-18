using System;
using System.Net.Http;
using System.Threading.Tasks;

namespace CursoIA_APIS_list
{
    internal class Program
    {
        
        static async Task Main(string[] args)
        {   
            // 1. LLamada a api y obtencion de datos en bruto.
            // await LlamadaApi_Advice.GetRequest();

            // 2. Llamada a api y deserializacion de datos.
            await LlamadaAPI_Advice1.GetRequestDeserializable();
        }
    }
}
