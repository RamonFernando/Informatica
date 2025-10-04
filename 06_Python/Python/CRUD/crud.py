# Lista para almacenar los datos (nombres)
nombres = []

# Función para mostrar el menú
def mostrar_menu():
    print("\n===== MENÚ CRUD =====")
    print("1. Crear (Agregar un nombre)")
    print("2. Leer (Mostrar todos los nombres)")
    print("3. Actualizar (Modificar un nombre)")
    print("4. Eliminar (Borrar un nombre)")
    print("5. Salir")
    print("======================")

# Función para Crear (Agregar) un nombre
def crear():
    nombre = input("Introduce el nombre que deseas agregar: ").strip()
    if nombre:
        nombres.append(nombre)
        print(f"Nombre '{nombre}' agregado correctamente.")
    else:
        print("El nombre no puede estar vacío.")

# Función para Leer (Mostrar) todos los nombres
def leer():
    if nombres:
        print("\n===== Lista de Nombres =====")
        for i, nombre in enumerate(nombres, start=1):
            print(f"{i}. {nombre}")
        print("=============================")
    else:
        print("\nLa lista está vacía.")

# Función para Actualizar (Modificar) un nombre
def actualizar():
    leer()  # Mostrar la lista actual
    if nombres:
        try:
            index = int(input("Introduce el número del nombre que deseas actualizar: "))
            if 1 <= index <= len(nombres):
                nuevo_nombre = input("Introduce el nuevo nombre: ").strip()
                if nuevo_nombre:
                    print(f"Nombre '{nombres[index - 1]}' actualizado a '{nuevo_nombre}'.")
                    nombres[index - 1] = nuevo_nombre
                else:
                    print("El nuevo nombre no puede estar vacío.")
            else:
                print("Número fuera de rango.")
        except ValueError:
            print("Por favor, introduce un número válido.")

# Función para Eliminar (Borrar) un nombre
def eliminar():
    leer()  # Mostrar la lista actual
    if nombres:
        try:
            index = int(input("Introduce el número del nombre que deseas eliminar: "))
            if 1 <= index <= len(nombres):
                eliminado = nombres.pop(index - 1)
                print(f"Nombre '{eliminado}' eliminado correctamente.")
            else:
                print("Número fuera de rango.")
        except ValueError:
            print("Por favor, introduce un número válido.")

# Función principal para ejecutar el CRUD
def main():
    while True:
        mostrar_menu()
        try:
            opcion = int(input("Selecciona una opción (1-5): "))
            if opcion == 1:
                crear()
            elif opcion == 2:
                leer()
            elif opcion == 3:
                actualizar()
            elif opcion == 4:
                eliminar()
            elif opcion == 5:
                print("Saliendo del programa... ¡Adiós!")
                break
            else:
                print("Por favor, selecciona una opción válida (1-5).")
        except ValueError:
            print("Por favor, introduce un número válido.")

# Ejecutar el programa principal
if __name__ == "__main__":
    main()
