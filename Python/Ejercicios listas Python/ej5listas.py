'''5. Almacenar en una lista de 10 posiciones los 10 primeros números primos comprendidos 
entre 100 y 300. Luego mostrarlos en pantalla.'''

try:

    lista = []
    lista_primos = []

    
    for i in range(100, 300+1):
        lista.append(i)

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

    print("La lista de numeros primos es:", lista_primos)

except ValueError:
    print("ERROR")