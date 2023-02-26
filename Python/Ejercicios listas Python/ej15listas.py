"""Leer 10 números enteros, almacenarlos en una lista y determinar cuántos datos
almacenados son múltiplos de 3."""

try:
    lista = []
    cont = 0

    for i in range(10):
        num = int(input("Ingrese un valor numerico: "))
        lista.append(num)
    for i in range(len(lista)):
        if lista[i] % 3 == 0:
            cont += 1
    print(cont, "valores ingresados son multiplos de 3")

except ValueError:
    print("+++ERROR+++")