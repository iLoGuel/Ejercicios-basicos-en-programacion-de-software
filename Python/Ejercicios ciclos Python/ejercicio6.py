#  Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos.

try:
    numero = int(input("Ingrese el primer valor numerico: "))

    dig1 = numero %1000 //100
    dig2 = numero %100 //10
    dig3 = numero %10

    if numero >=100 and numero <= 999:
        print("los enteros comprendidos entre 1 y:", dig1)
        for i in range(1, dig1 +1, 1):
            resultado = i
            print(i)

        print("los enteros comprendidos entre 1 y:", dig2)
        for i in range(1, dig2 +1, 1):
            resultado = i
            print(i)

        print("los enteros comprendidos entre 1 y:", dig3)
        for i in range(1, dig3 +1, 1):
            resultado = i
            print(i)

    else:
        print("El valor ingresado no es de 3 digitos.")

except ValueError:
    print("+++ERROR+++")