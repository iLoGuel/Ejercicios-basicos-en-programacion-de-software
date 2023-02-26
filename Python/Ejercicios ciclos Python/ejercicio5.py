# Leer dos números y mostrar todos los números terminados en 4 comprendidos entre ellos.

try:
    numero1 = int(input("Ingrese el primer valor numerico: "))
    numero2 = int(input("Ingrese el segundo valor numerico: "))

    for i in range(numero1, numero2 +1, 1):
        rango = i
        if rango %10 == 4:
            print(i)
    for i in range(numero2, numero1 +1, 1):
        rango = i
        if rango %10 ==4:
            print(i)

except ValueError:
    print("+++ERROR+++")