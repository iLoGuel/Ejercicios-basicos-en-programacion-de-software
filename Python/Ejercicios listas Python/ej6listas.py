"""6. Leer dos números enteros y almacenar en una lista los 10 primeros números primos 
comprendidos entre el menor y el mayor. Luego mostrarlos en pantalla."""

try:

    num1 = int(input("Ingrese el primer valor numerico: "))
    num2 = int(input("Ingrese el segundo valor numerico: "))

    lista = []
    lista_primos = []
    contp = 0

    if num1 < num2:
        for i in range(num1, num2 +1):
            lista.append(i)

        for i in range (len(lista)):
            cap = lista [i]
            cont3 = 0
            cont = 0
            if contp == 10:
                break
            else:
                for j in range(2, (cap // 2) +1):
                    if cap % j == 0:
                        cont +=1
                if cont > 0 or cap == 1:
                    cont3 += 1
                else:
                    lista_primos.append(cap)
                    contp += 1
    else:
        for i in range(num2, num1 +1):
            lista.append(i)

        for i in range (len(lista)):
            cap = lista [i]
            cont3 = 0
            cont = 0
            if contp == 10:
                break
            else:
                for j in range(2, (cap // 2) +1):
                    if cap % j == 0:
                        cont +=1
                if cont > 0 or cap == 1:
                    cont3 += 1
                else:
                    lista_primos.append(cap)
                    contp += 1

    print("La lista de numeros primos es:", lista_primos)

except ValueError:
    print("ERROR")