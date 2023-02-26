# Leer dos números y mostrar todos los enteros comprendidos entre ellos.

try:

    numero1 = int(input("Ingrese el primer valor numerico: "))
    numero2 = int(input("Ingrese el segundo valor numerico: "))

    for i in range(numero1, numero2 +1, 1):
        print (i)
    for i in range(numero2, numero1 +1, 1):
        print (i)

except ValueError:
    print("+++ERROR+++")