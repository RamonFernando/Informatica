print ("Hello")

nombre = input("Introduce tu nombre: ")
print ("Hola", nombre)

sumar = 1 + 1
print (sumar)

num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))
print (num1 + num2)

if num1 > num2:
    print ("El número", num1, "es mayor que", num2)
else:
    print ("El número", num2, "es mayor que", num1)

#Bucles
for i in range (10):
    print (i)

i = 0
while i < 10:
    print (i)
    i += 1

#Funciones
def saludar():
    print ("Hola")

saludar()

def sumar(num1, num2):
    print (num1 + num2)

sumar(1, 2) #Argumentos llamas a la funcion 

def sumar2(num1, num2):
    return num1 + num2

print (sumar2(1, 2)) #Retorno haces un print de la funcion

#Listas
lista = ["Ramon", "Maite", "Nichi", "Peach"]
print (lista[0])
print (lista[1])
print (lista[2])
print (lista[3])

for nombre in lista:
    print (nombre)

for i in range (len(lista)):
    print (i, lista[i]) # i es el indice y muestra el valor de la lista

# resultado por consola 
# 0 Ramon
# 1 Maite
# 2 Nichi
# 3 Peach

# while
i = 0
while i < len(lista): # len(lista) es la longitud de la lista
    print (i, lista[i])
    i += 1

# resultado por consola 
# 0 Ramon
# 1 Maite
# 2 Nichi
# 3 Peach

# Mayor o menor de edad
edad = int(input("Introduce tu edad: "))
if edad >= 18:
    print ("Eres mayor de edad")
else:
    print ("Eres menor de edad")