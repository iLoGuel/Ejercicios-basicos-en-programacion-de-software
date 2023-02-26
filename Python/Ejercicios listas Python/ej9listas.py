"""Leer 10 números enteros, almacenarlos en una lista y determinar cuántas veces está 
repetido el mayor."""

try:
    almacenamiento = []
    mayor = 0
    cont = 0
    
    
    for i in range(10):
        num = (int (input("Ingrese un valor numerico:  ")))
        almacenamiento.append(num)
    
    for j in range(0,len(almacenamiento)):
        valor = almacenamiento[j]

        if  valor > mayor:
            mayor = valor 

    for i in range(0,len(almacenamiento)):
        if almacenamiento [i] == mayor:
            cont +=1

    print("El numero mayor es: ", mayor)
    print("El numero mayor està repetido: ",cont, "veces")

    

except ValueError:
    print("Error")