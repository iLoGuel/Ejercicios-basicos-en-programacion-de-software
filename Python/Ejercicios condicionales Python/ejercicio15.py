# Leer un numero entero de tres digitos y determinar la suma de sus digitos.

try:

    numero = int(input("Ingrese una valor numerico: "))

    if numero >=100 and numero <= 999:

        dig1 = numero %1000 //100
        dig2 = numero %100 //10
        dig3 = numero %10
        suma = dig1 + dig2 + dig3

    print("La suma de sus digitos es:", suma)



except ValueError:
    print("+++ERROR+++")