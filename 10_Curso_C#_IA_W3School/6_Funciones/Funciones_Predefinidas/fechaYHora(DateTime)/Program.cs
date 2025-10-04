using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fechaYHora_DateTime_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // 3.Funciones para trabajar con fechas y horas(DateTime)
            
            // a.Obtener la fecha y hora actual
            DateTime ahora = DateTime.Now;
            Console.WriteLine(ahora); // Ejemplo: "01/01/2025 10:00:00"
            
            // b.Formatear fechas
            DateTime fecha = DateTime.Now;
            Console.WriteLine(fecha.ToString("yyyy-MM-dd")); // "2025-01-01"
            Console.WriteLine(fecha.ToString("dd/MM/yyyy HH:mm:ss")); // "01/01/2025 10:00:00"
            
            // c.Operaciones con fechas
            DateTime hoy = DateTime.Today;
            DateTime mañana = hoy.AddDays(1);
            TimeSpan diferencia = mañana - hoy;
            Console.WriteLine(diferencia.TotalHours); // 24
        }
    }
}
