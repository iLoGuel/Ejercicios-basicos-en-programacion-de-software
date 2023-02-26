"""Leer un entero y mostrar todos los múltiplos de 5 comprendidos entre 1 y el número
leído."""

try:
    numero = int(input("Ingrese el primer valor numerico: "))

    for i in range(1, numero+1,1):
        if i %5 == 0:
            print(i)

except ValueError:
    print("+++ERROR+++")