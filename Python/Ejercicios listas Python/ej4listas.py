try:

    lista = []

    x = 0
    y = 1
    z = 0

    for i in range(0,10):
        z=x+y
        x=y
        y=z
        lista.append(z)    
    print(lista)

except ValueError:
    print("ERROR")