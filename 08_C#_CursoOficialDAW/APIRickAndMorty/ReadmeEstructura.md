# 📘 README — Estructura y Métodos del Proyecto APIRickAndMorty

Este documento resume la **estructura del proyecto**, sus **carpetas lógicas**,
y **todos los métodos organizados por archivo**, para facilitar el mantenimiento,
estudio y mejora del código.

---

## 🧩 **Estructura General del Proyecto**

```C#

/APIRickAndMorty
│
├── Program.cs
│
├── /Controllers
│   ├── APIControllers.cs
│   ├── APIFavoriteListController.cs
│   ├── APIFiltersController.cs
│
├── /Views
│   └── Views.cs
│
├── /Services
│   ├── APISaveFavoriteListJson.cs
│   ├── APILoadFavoriteListFromJson.cs
│
├── /Models
│   └── Models.cs
│
└── /Helpers
    └── Helpers.cs
```

---

## 📁 **1. Program.cs**

## Métodos

- `Main()`

---

## 📁 **2. Views.cs** — UI consola

### Menú

- ShowMenu()
- ExitMenu()
- PrintOptionMenu()

### Mensajes

- PrintWaitForPressKey()
- PrintInvalidOption()
- PrintCancelOperation()
- PrintSuccessOperation()
- PrintErrorOperation()

### Solicitudes

- PrintSearchById()
- PrintSearchByName()
- PrintAskId()
- PrintAskIdToRemove()
- PrintAskAddToFavoriteList()
- PrintAskRemoveToFavoriteList()
- PrintAskClearFavoriteList()

### Impresión

- PrintJson()
- PrintFormattedJson()
- PrintList()
- PrintOnlyLane()
- PrintNoFavorites()

### Paginación

- PrintSelectOption()
- PrintCountPages()
- PrintCountPagesAll()

---

## 📁 **3. APIControllers.cs** — Controlador central

### GET

- ExecuteHttpRequest()
- GetUrl()
- GetHttpRequest()
- ValidatedHttpResponse()
- GetJson()
- GetAllPages()

## JSON

- FormattedJson()
- DeserializedJsonRoot()
- DeserializedJsonCharacter()

### Errores

- HandlerException()

---

## 📁 **4. APIFavoriteList.cs** — Favoritos

### Lista

- FavoriteList

### Operaciones

- RequestAddToFavoriteList()
- RequestRemoveToFavoriteList()
- RequestClearFavoriteList()

### Internas

- Add()
- Remove()
- FormattedJsonFavoriteList()
- DeserializedJsonFavoriteList()

---

## 📁 **5. APIFiltersControllers.cs** — Búsquedas

### Búsquedas

- SearchById()
- SearchByName()

### GET

- GetRequestById()
- GetHttpRequestByName()
- GetHttpRequestFilter()

### Validaciones

- IsValidAtribute()
- ValidateSearchById()

---

## 📁 **6. APISaveFavoriteListJson.cs**

- SaveFavoritesToJson()

---

## 📁 **7. APILoadFavoriteListFromJson.cs**

- LoadFavoritesFromJson()

---

## 📁 **8. Helpers.cs** — Utilidades

### Validaciones

- ValidateInput()
- ValidateIsNumberId()

### Lectura

- ReadInput()
- ReadInputUpper()

### Confirmación

- ConfirmOperationFavoriteList()

### Paginación

- PaginateListApi()

### API interna

- GetAllPagesList()

---

## 📁 **9. Models.cs** — Modelos + HttpClient

### Modelos

- ClassCharacter
- Info
- ClassRoot
- Origin
- Location
- FavoriteItemList

### HttpClient

- GetHttpClient.CreateHttpClient()
