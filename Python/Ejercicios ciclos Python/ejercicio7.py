# Mostrar en pantalla todos los enteros comprendidos entre 1 y 100.

try:

    for i in range (1, 100 +1,1):
        print(i)

except ValueError:
    print("+++ERROR+++")