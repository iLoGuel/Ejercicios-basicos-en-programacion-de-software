'''. Leer 10 enteros, almacenarlos en una lista y determinar en qué posición de la lista está 
el mayor número leído. '''

try:
    almacenamiento = []
    mayor = 0
    
    
    for i in range(10):
        num = (int (input("Digite 10 numeros enteros: ")))
        almacenamiento.append(num)
    
    for j in range(0,len(almacenamiento)):
        valor = almacenamiento[j]

        if  valor > mayor:
            mayor = valor 
            pos = j + 1
    print("El numero mayor es: ", mayor)
    print("Su posicion es: ",pos )

        


except ValueError:
    print("Error")