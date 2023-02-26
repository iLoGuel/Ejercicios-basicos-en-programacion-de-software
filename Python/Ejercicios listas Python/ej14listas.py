"""Leer 10 números enteros, almacenarlos en una lista y determinar cuántas veces se repite
el promedio entero de los datos dentro de la lista. """

try:
    lista = []
    total = 0
    cont = 0

    for i in range(10):
        num = int(input("Ingrese un valor numerico: "))
        lista.append(num)

    for i in range(len(lista)):
        total += lista[i]

    prom = total / 10

    for i in range(len(lista)):
        cap = lista[i]
        if cap == prom:
            cont += 1
    print("El numero", cap, "que está almacenado en la lista, es del promedio")
    print("El promedio está almacenado", cont, "veces")



except ValueError:
    print("+++ERROR+++")