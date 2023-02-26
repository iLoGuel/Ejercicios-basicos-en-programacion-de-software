'''11. Leer 10 números enteros, almacenarlos en una lista y determinar cuántos números 
tienen, de los almacenados allí, menos de 3 dígitos.'''

try:
    lista = []
    cont = 0

    for i in range(10):
        num = int(input("Digite un valor numerico: "))
        lista.append(num)
    
    for i in range(len(lista)):
        if lista [i] >= -99 and lista [i] <=99:
            cont += 1

    print("La cantidad de numeros con menos de tres digitos son: ", cont)
except ValueError:
    print("ERROR")  