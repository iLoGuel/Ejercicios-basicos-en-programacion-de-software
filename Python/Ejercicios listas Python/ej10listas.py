'''Leer 10 números enteros, almacenarlos en una lista y determinar en qué posiciones se 
encuentran los números con más de 3 dígitos.'''

try:
    lista = []
    lista_pos = []


    
    for i in range (0,10):
        num = int(input("Digite un valor numerico: "))
        lista.append(num)

    
    for i in range(len(lista)):
        if lista[i] >99 and lista[i] <999:
            lista_pos.append(i+1)
 
    print("La posicion de los numeros de 3 digitos son: ",lista_pos )
    
 
except ValueError:
    print("Error")