'''3. Leer 10 enteros, almacenarlos en una lista y determinar en qué posición de la lista está 
el mayor número primo leído.'''

try:

    element = int(input("Ingrese el numero de elementos que almacenara la lista: "))

    lista = []
    lista_primos = []
    mayor = 0

    
    for i in range(element):
        num = int(input("Digite un valor numerico: "))
        lista.append(num)

    for i in range (len(lista)):
        cap = lista [i]
        cont3 = 0
        cont = 0
        for j in range(2, (cap // 2) +1):
            if cap % j == 0:
                cont +=1
        if cont > 0 or cap == 1:
            cont3 += 1
        else:
           lista_primos.append(cap)
    
    for i in range(len(lista_primos)):
        cap = lista_primos [i]
        if cap > mayor:
            pos = i
            mayor = cap

    print("La lista original es:", lista)
    print("La lista de numeros primos es:", lista_primos)
    print("La posicion del numero primo es:", pos)
    print("El mayor numero primo es:", mayor)

except ValueError:
    print("ERROR")