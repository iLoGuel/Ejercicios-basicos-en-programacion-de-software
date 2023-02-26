# Leer un número entero y determinar a cuánto es igual la suma de todos los enteros comprendidos entre 1 y el número leído.

try:
    numero = int(input("Ingrese un valor numerico: "))
    resultado = 0

    for i in range(1, numero +1, 1):
        cap = i
        resultado +=cap
    print("El resultado de todos los enteros comprendido es:", resultado)

except ValueError:
    print("+++ERROR+++")