"""Leer 10 números enteros, almacenarlos en una lista y determinar en qué posiciones se 
encuentran los números terminados en 4."""

try:
    almacenamiento = []
    mayor = 0
    lista_pos = []
    
    
    for i in range(10):
        num = (int (input("Ingrese un valor numerico:  ")))
        almacenamiento.append(num)
    
            
    for i in range(0,len(almacenamiento)):
        if almacenamiento [i] % 10 == 4:
            lista_pos.append(i)

    print("El numero mayor es: ", mayor)
    print("Sus posiciones con el numero terminado en 4 son: ",lista_pos )

except ValueError:
    print("Error")