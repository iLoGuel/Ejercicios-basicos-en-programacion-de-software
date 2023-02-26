"""13. Leer 10 números enteros, almacenarlos en una lista y determinar si el promedio entero
de estos datos está almacenado en la lista. """

try:
    lista = []
    total = 0

    for i in range(10):
        num = int(input("Ingrese un valor numerico: "))
        lista.append(num)
    
    for i in range(len(lista)):
        total += lista[i]

    prom = total / 10

    for i in range(len(lista)):
        if lista[i] == prom:
            print("El numero", lista[i], "almacenado en la lista, es del promedio")
            break
        else:
            print("No hay numeros iguales al promedio almacenados en la lista")
            break

except ValueError:
    print("+++ERROR+++")