# 📘 README --- **APIRickAndMorty (C# Console App)**

Aplicación de consola en **C# (.NET)** que permite consultar la API
pública de **Rick and Morty**, administrar personajes, buscar por
filtros y gestionar una lista persistente de favoritos guardada en JSON.

------------------------------------------------------------------------

# 🚀 Funcionalidades Principales

✔ **Consultar 20 personajes** (página principal de la API)\
✔ **Buscar personaje por ID**\
✔ **Buscar personaje por nombre**\
✔ **Agregar personajes a favoritos**\
✔ **Eliminar personajes de favoritos**\
✔ **Listar favoritos**\
✔ **Borrar lista de favoritos completa**\
✔ **Cargar/guardar favoritos desde/ hacia JSON**\
✔ **Consultar toda la API con paginación**\
✔ **Paginación interna custom para listas obtenidas**\
✔ **Manejo de excepciones con mensajes claros**\
✔ **Validaciones y limpieza de entrada del usuario**\
✔ **Arquitectura modular (9 archivos)** siguiendo el estilo DAW
profesional

------------------------------------------------------------------------

# 🧩 Arquitectura del Proyecto

El proyecto está estructurado en **capas claras**, para cumplir buenas
prácticas de separación de responsabilidades.

------------------------------------------------------------------------

## 📁 1. **Program.cs** --- Núcleo del flujo

-   Inicializa la app.
-   Carga favoritos desde JSON.
-   Muestra el menú en bucle.
-   Interpreta la opción seleccionada.
-   Llama a controladores específicos.
-   Manejo global de excepciones (`HandlerException`).

------------------------------------------------------------------------

## 📁 2. **Views.cs** --- Interfaz (UI por consola)

Contiene **todos los métodos de impresión**, incluyendo:

-   Menú principal
-   Mensajes informativos
-   JSON formateados
-   Personaje completo
-   Lista de favoritos
-   Opciones de navegación (B/N/Q)
-   Confirmaciones S/N
-   Cabeceras y paginación

------------------------------------------------------------------------

## 📁 3. **APIControllers.cs** --- Controlador central GET

-   Método principal `ExecuteHttpRequest()`
-   Manejo de llamado GET:
    -   `GetHttpRequest()`
    -   `ValidatedHttpResponse()`
    -   `GetJson()`
-   Serialización:
    -   `DeserializedJsonRoot()`
    -   `DeserializedJsonCharacter()`
-   Paginación completa (`GetAllPages()`)
-   Formateo de JSON indentado
-   Manejo profesional de excepciones.

------------------------------------------------------------------------

## 📁 4. **APIFavoriteList.cs** --- Gestión de Favoritos

-   Lista en memoria:

``` csharp
public static List<FavoriteItemList> FavoriteList
```

-   Añadir personaje a favoritos\
-   Eliminar por ID\
-   Guardar JSON indentado\
-   Cargar JSON\
-   Limpiar lista completa

------------------------------------------------------------------------

## 📁 5. **APIFiltersControllers.cs** --- Busquedas personalizadas

-   `SearchById()`\
-   `SearchByName()`\
-   Validación\
-   Peticiones GET\
-   Manejo de múltiples resultados

------------------------------------------------------------------------

## 📁 6. **APISaveFavoriteListJson.cs** --- Guardar datos

-   Serializa `FavoriteList`
-   Guarda en `favorites.json`
-   Manejo de errores

------------------------------------------------------------------------

## 📁 7. **APILoadFavoriteListFromJson.cs**

-   Carga `favorites.json` al iniciar
-   Verifica si existe el archivo
-   Manejo de errores

------------------------------------------------------------------------

## 📁 8. **Helpers.cs** --- Utilidades generales

Incluye:

-   Validación de opciones
-   Validación de números
-   Lectura normalizada (`ReadInputUpper`)
-   Confirmación S/N
-   Paginación (`PaginateListApi`)
-   Obtener URL base
-   Obtener lista completa

------------------------------------------------------------------------

## 📁 9. **Models.cs** --- Modelos JSON + HttpClient

-   `ClassCharacter`
-   `ClassRoot`
-   `Info`
-   `Origin`
-   `Location`
-   `FavoriteItemList`
-   HttpClient singleton (`GetHttpClient`)

------------------------------------------------------------------------

# 🔧 Requisitos

-   .NET 6 o superior\
-   Paquetes NuGet:
    -   Newtonsoft.Json\
    -   System.Net.Http

------------------------------------------------------------------------

# ▶️ Ejecución

    dotnet run

------------------------------------------------------------------------

# 💾 Persistencia

Los datos se guardan en:

    favorites.json

------------------------------------------------------------------------

# 🎯 Mejoras Futuras

-   Filtros avanzados\
-   Exportación CSV/XML\
-   Interfaz GUI\
-   Ordenar resultados
