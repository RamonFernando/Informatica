using System;
using System.Threading.Tasks;

namespace AdvideAPI_Simple
{
    internal class Program
    {
        static async Task Main(string[] args)
        {
            Console.WriteLine("API Adviceslip");
            await AdviceControlers.GetRequestMethod();
        }
    }
}
