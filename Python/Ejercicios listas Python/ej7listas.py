'''. Leer 10 números enteros, almacenarlos en una lista y determinar en qué posiciones se 
encuentra el número mayor. '''

try:
    almacenamiento = []
    mayor = 0
    lista_pos = []
    
    
    for i in range(10):
        num = (int (input("Ingrese un valor numerico:  ")))
        almacenamiento.append(num)
    
    for j in range(0,len(almacenamiento)):
        valor = almacenamiento[j]

        if  valor > mayor:
            mayor = valor 
            pos = j

    for i in range(0,len(almacenamiento)):
        if almacenamiento [i] == mayor:
            lista_pos.append(i)

    print("El numero mayor es: ", mayor)
    print("Sus posiciones son: ",lista_pos )

    

except ValueError:
    print("Error")