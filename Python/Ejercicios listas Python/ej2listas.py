'''. Leer 10 enteros, almacenarlos en una lista y determinar en qué posición de la lista está 
el mayor par leído. '''
try:
    lista = []
    mayor = 0
    
    
    for i in range (0,10):
        num = int(input("Digite un valor numerico: "))
        lista.append(num)

    
    for j in range(len(lista)):
        valor = lista[j]
        if valor %2 == 0:
            
            if valor > mayor:
                mayor = valor 
                pos = j + 1
    print("El numero mayor es el",mayor)
    print("Su posicion es la", pos)
    
    
 
except ValueError:
    print("Error")