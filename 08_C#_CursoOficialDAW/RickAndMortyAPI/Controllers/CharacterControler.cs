using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.ViewFeatures;
using RickAndMortyAPI.Models;
using System.Net.Http;

namespace RickAndMortyAPI.Controllers
{
    public class CharacterControler : Controller
    {
        static async void GetCharacters(int page)
        { 
            HttpClient client = new HttpClient();
            string utl = $"https://rickandmortyapi.com/api/character?page={page}";
            HttpResponseMessage response = await client.GetAsync(utl);

            response.EnsureSuccessStatusCode();
            Console.WriteLine((response.StatusCode == System.Net.HttpStatusCode.OK ? "OK" : "Error " + response.StatusCode));

            string content = await response.Content.ReadAsStringAsync();

            GetListCharacters(content);
            
        }
        private static List<Character> GetListCharacters(string content)
        {
            List<Character> characters = new List<Character>();
            return characters;
        }


    }
}
