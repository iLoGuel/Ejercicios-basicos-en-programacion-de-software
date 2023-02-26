# Leer un número entero y mostrar todos los divisores exactos del número comprendidos entre 1 y el número leído.

try:
    numero = int(input("Ingrese un valor numerico: "))

    for i in range (1,numero+1,1):
        if numero % i == 0:
            print(i)
            
except ValueError:
    print("+++ERROR+++")