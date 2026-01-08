# APIStarWarsIA

Proyecto en **C#/.NET** (aplicación de consola) incluido en el curso `08_C#_CursoOficialDAW`.

## Requisitos

- **.NET SDK 10** (el proyecto compila con `net10.0`)

Comprueba tu instalación:

```bash
dotnet --list-sdks
```

## Cómo ejecutar

### Opción 1: Desde la carpeta del proyecto (recomendado)

Colócate en la carpeta donde está `APICountriesIA.csproj` y ejecuta:

```bash
dotnet restore
dotnet run
```

### Opción 2: Desde la carpeta de la solución

Desde la carpeta donde está `APICountriesIA.sln`:

```bash
dotnet restore
dotnet run --project C:\Users\Ramon\Ramon Dropbox\Ramon Perez\PC\Desktop\Informatica\08_C#_CursoOficialDAW\APICountriesIA
```

## Abrir en Visual Studio / VS Code

- **Visual Studio**: abre `APICountriesIA.sln` y ejecuta el proyecto `APICountriesIA`.
- **VS Code**: abre la carpeta del proyecto y lanza los comandos anteriores en la terminal integrada.

## Notas

- Este proyecto es una **app de consola** (`OutputType=Exe`).
- Si el código consume servicios externos (por ejemplo, una API de IA), puede requerir configuración adicional (API keys, endpoints, etc.). Revisa el código de `MainAPI.cs` o archivos de configuración si existen.
