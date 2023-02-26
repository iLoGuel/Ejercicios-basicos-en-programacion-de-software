'''Leer 10 números enteros, almacenarlos en una lista y determinar a cuánto es igual el 
promedio entero de los datos de la lista.'''
try:
    lista =[]
    total = 0


    for i in range(10):
        num = int(input("Digite un numero: "))
        lista.append(num)

    for i in range(len(lista)):
        total += lista [i]
    prom = (total / 10)

    print("El total de los valores ingresados es: ", total)
    print("El promedio de los valores ingresados es: ", prom)

except ValueError:
    print("+++ERROR+++")
