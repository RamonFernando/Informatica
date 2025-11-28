using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace APIPlantilla
{
    internal class Errores
    {
        // 
        /*
         Errores comunes y solucion

        Error de Lectura JSON: Error reading JArray from JsonReader. Current JsonReader item is not an array: StartObject. Path '', line 1, position 1.
        Info: -2146233088
        Solucion -> Cambiar el tipo, de JArray  a JObject

        Cs0029 No se puede comvertir de 'Newtonsoft.Json.Linq.JObject' a 'Newtonsoft.Json.Linq.JArray'
        Solucion -> cambiar el tipo de JArray a JObject
 
        
        Error de argumento: Se accedió a valores de JObject con un valor de clave no válido: 0. Se esperaba un nombre de propiedad de objeto.
        Información: -214702480
        Solucion -> convertir el JObject a JArray 
        Ej. // Conviertimos el JSON en un array y luego creamos un nuevo array para almacenar los digimons
            JObject objectJson = JObject.Parse(stringJson);

            if ((int)objectJson["count"] == 0) return null; // Comprobamos si se ha encontrado el personaje

            // Convierte el JSON en un array
            JArray results = (JArray)objectJson["results"];

            // Convierte el primer elemento del array en un objeto
            JObject person = (JObject)results[0];
         */
    }
}
