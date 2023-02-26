# Leer un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído

try:
    numero = int(input("Ingrese un valor numerico: "))

    for i in range (1, numero +1, 1):
        print(i)
except ValueError:
    print("+++ERROR+++")