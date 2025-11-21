using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ApiAdviceSlip
{
    internal class Program
    {   

        static async Task Main(string[] args) {
            await AdviceApi.GetRequestAsync();
        }
    }
}
